package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import k1.C0657a;
import l2.f;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaeq.smali */
public final class zzaeq extends AsyncTask<Void, Void, zzaep> {
    private static final C0657a zza = new C0657a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaes> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final f zzg;

    public zzaeq(String str, String str2, Intent intent, f fVar, zzaes zzaesVar) {
        C.d(str);
        this.zzb = str;
        C.f(fVar);
        this.zzg = fVar;
        C.d(str2);
        C.f(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        C.d(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzaesVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        C.f(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaesVar);
        this.zze = zzaesVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaep doInBackground(Void... voidArr) throws IOException {
        try {
            URL url = new URL(this.zzc);
            zzaes zzaesVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaesVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzafe(zzaesVar.zza(), this.zzg, zzafc.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c("Error getting project config. Failed with " + strZza + " " + responseCode, new Object[0]);
                return zzaep.zzb(strZza);
            }
            zzahq zzahqVar = new zzahq();
            zzahqVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzahqVar.zza().contains(this.zzf) ? zzaep.zzb("UNAUTHORIZED_DOMAIN") : zzaep.zza(this.zzf);
            }
            for (String str : zzahqVar.zza()) {
                if (zza(str)) {
                    return zzaep.zza(str);
                }
            }
            return null;
        } catch (zzacn e5) {
            zza.c(AbstractC0854a.b("ConversionException encountered: ", e5.getMessage()), new Object[0]);
            return null;
        } catch (IOException e6) {
            zza.c(AbstractC0854a.b("IOException occurred: ", e6.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e7) {
            zza.c(AbstractC0854a.b("Null pointer encountered: ", e7.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzaep zzaepVar) {
        onPostExecute((zzaep) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzaex.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e5) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e5)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaep zzaepVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzaes zzaesVar = this.zzd.get();
        if (zzaepVar != null) {
            strZza = zzaepVar.zza();
            strZzb = zzaepVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaesVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzaesVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f6381p);
        } else {
            zzaesVar.zza(this.zzb, S0.f.s0(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e5) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e5.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i5);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
