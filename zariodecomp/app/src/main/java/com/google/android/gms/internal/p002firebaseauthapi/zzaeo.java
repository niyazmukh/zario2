package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.C;
import java.util.concurrent.ScheduledExecutorService;
import k1.C0657a;
import l2.f;
import o2.E;
import o2.s;
import o2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaeo.smali */
public final class zzaeo {
    private static final C0657a zza = new C0657a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    public zzaeo(f fVar, ScheduledExecutorService scheduledExecutorService) {
        C.f(fVar);
        fVar.a();
        Context context = fVar.f8771a;
        C.f(context);
        this.zzb = new zzaar(new zzafb(fVar, zzafc.zza()));
        this.zzc = new zzagc(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        C.f(zzaicVar);
        C.d(zzaicVar.zzb());
        C.f(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, zzaem zzaemVar) {
        C.f(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(zzahm zzahmVar, zzaem zzaemVar) {
        C.f(zzahmVar);
        C.d(zzahmVar.zzc());
        C.f(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        C.f(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        C.d(str);
        C.f(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(s sVar, String str, String str2, String str3, zzaem zzaemVar) {
        C.f(sVar);
        throw null;
    }

    public final void zza(String str, s sVar, String str2, zzaem zzaemVar) {
        C.d(str);
        C.f(sVar);
        throw null;
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        C.f(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        C.f(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaem zzaemVar) {
        C.d(str);
        C.d(str2);
        C.d(str3);
        C.f(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        C.d(str);
        C.f(zzajbVar);
        C.f(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        C.f(zzaemVar);
        C.f(zzahzVar);
        String strZzb = zzahzVar.zzb();
        C.d(strZzb);
        this.zzb.zza(strZzb, zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        C.f(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahm zzahmVar, zzaem zzaemVar) {
        C.f(zzahmVar);
        C.d(zzahmVar.zzd());
        C.f(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        C.f(zzaemVar);
        C.f(zzaijVar);
        String strZzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strZzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(strZzd);
            } else {
                this.zzc.zzb(zzaelVar, strZzd);
                return;
            }
        }
        long jZzb = zzaijVar.zzb();
        boolean zZzf = zzaijVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzaelVar, jZzb, zZzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, strZzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        C.f(zzainVar);
        C.f(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        C.f(zzajbVar);
        C.f(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        C.f(zzajcVar);
        C.f(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        C.f(zzaemVar);
        C.f(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        C.f(zzaemVar);
        C.f(zzaanVar);
        u uVarZza = zzaanVar.zza();
        C.f(uVarZza);
        this.zzb.zza(zzafw.zza(uVarZza), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j5, boolean z4, boolean z5, String str4, String str5, String str6, boolean z6, zzaem zzaemVar) {
        C.e(str, "idToken should not be empty.");
        C.f(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z4) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zzaisVarZza = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j5, z6)) {
            zzaisVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j5, z6);
        this.zzb.zza(zzaisVarZza, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        C.f(zzaaqVar);
        C.f(zzaemVar);
        String str = zzaaqVar.zzb().f9233d;
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(str);
            } else {
                this.zzc.zzb(zzaelVar, str);
                return;
            }
        }
        long jZza = zzaaqVar.zza();
        boolean zZzi = zzaaqVar.zzi();
        zzaiq zzaiqVarZza = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().f9230a, zzaaqVar.zzb().f9233d, zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(jZza, zZzi)) {
            zzaiqVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzaelVar, jZza, zZzi);
        this.zzb.zza(zzaiqVarZza, this.zzc.zza(zzaelVar, str));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        C.f(zzaemVar);
        this.zzb.zza(zzaiuVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzaem zzaemVar) {
        C.e(str, "cachedTokenState should not be empty.");
        C.e(str2, "uid should not be empty.");
        C.f(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, E e5, zzaem zzaemVar) {
        C.d(str);
        C.f(e5);
        C.f(zzaemVar);
        this.zzb.zza(str, e5, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j5, boolean z4) {
        if (j5 > 0 && z4) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
