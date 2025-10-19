package com.google.android.gms.internal.p002firebaseauthapi;

import B.l;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.C0657a;
import o2.u;
import p1.c;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagc.smali */
final class zzagc {
    private static final C0657a zza = new C0657a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzagj> zzd = new HashMap<>();

    public zzagc(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        if (!zzagjVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final String zzb() throws NoSuchAlgorithmException {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, ((Context) c.a(this.zzb).b).getPackageManager().getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners()[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null || zzagjVar.zzh || zzac.zzc(zzagjVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzagjVar.zzd);
        }
        zzagjVar.zzi = true;
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzael zza(zzael zzaelVar, String str) {
        return new zzagh(this, zzaelVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) throws NoSuchAlgorithmException {
        String strC = AbstractC0854a.c(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strC.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e5) {
            zza.c(AbstractC0854a.b("NoSuchAlgorithm: ", e5.getMessage()), new Object[0]);
            return null;
        }
    }

    public static void zzb(zzagc zzagcVar, String str) {
        zzagj zzagjVar = zzagcVar.zzd.get(str);
        if (zzagjVar == null || zzac.zzc(zzagjVar.zzd) || zzac.zzc(zzagjVar.zze) || zzagjVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(new u(zzagjVar.zzd, zzagjVar.zze, null, null, true));
        }
        zzagjVar.zzh = true;
    }

    public final void zzb(zzael zzaelVar, String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        zzagjVar.zzb.add(zzaelVar);
        if (zzagjVar.zzg) {
            zzaelVar.zzb(zzagjVar.zzd);
        }
        if (zzagjVar.zzh) {
            zzaelVar.zza(new u(zzagjVar.zzd, zzagjVar.zze, null, null, true));
        }
        if (zzagjVar.zzi) {
            zzaelVar.zza(zzagjVar.zzd);
        }
    }

    public final void zza(final String str, zzael zzaelVar, long j5, boolean z4) {
        this.zzd.put(str, new zzagj(j5, z4));
        zzb(zzaelVar, str);
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagjVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzagf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(str);
            }
        }, zzagjVar.zza, TimeUnit.SECONDS);
        if (!zzagjVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagg zzaggVar = new zzagg(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        l.registerReceiver(this.zzb.getApplicationContext(), zzaggVar, intentFilter, 2);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzage(this));
    }

    public final void zzb(String str) {
        zzagj zzagjVar = this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzagjVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzagjVar.zzf.cancel(false);
        }
        zzagjVar.zzb.clear();
        this.zzd.remove(str);
    }
}
