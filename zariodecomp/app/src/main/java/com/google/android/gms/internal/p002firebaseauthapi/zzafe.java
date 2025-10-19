package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import G2.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import l2.f;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafe.smali */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final f zzd;
    private boolean zze;
    private String zzf;

    public zzafe(Context context, f fVar, String str) {
        this.zze = false;
        C.f(context);
        this.zza = context;
        C.f(fVar);
        this.zzd = fVar;
        this.zzc = AbstractC0854a.b("Android/Fallback/", str);
    }

    private static String zza(f fVar) {
        a.p(FirebaseAuth.getInstance(fVar).f6381p.get());
        return null;
    }

    private static String zzb(f fVar) {
        G2.f fVar2 = (G2.f) FirebaseAuth.getInstance(fVar).f6382q.get();
        if (fVar2 != null) {
            try {
                return (String) Tasks.await(((d) fVar2).a());
            } catch (InterruptedException | ExecutionException e5) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e5.getMessage());
            }
        }
        return null;
    }

    public final void zza(URLConnection uRLConnection) {
        String strK;
        if (this.zze) {
            strK = a.k(this.zzc, "/FirebaseUI-Android");
        } else {
            strK = a.k(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strK);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        f fVar = this.zzd;
        fVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", fVar.f8773c.f8784b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzafe(f fVar, String str) {
        this(fVar.f8771a, fVar, str);
        fVar.a();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
