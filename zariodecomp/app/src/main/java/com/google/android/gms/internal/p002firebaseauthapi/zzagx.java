package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.google.android.gms.common.internal.C;
import o2.C0798b;
import o2.C0800d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagx.smali */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final C0800d zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i = 2; i <= 7 && !Log.isLoggable(zza, i); i++) {
        }
    }

    public zzagx(C0800d c0800d, String str, String str2) {
        C.f(c0800d);
        this.zzd = c0800d;
        String str3 = c0800d.f9210a;
        C.d(str3);
        this.zzb = str3;
        String str4 = c0800d.f9212c;
        C.d(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        C0798b c0798b;
        String str = this.zzc;
        int i = C0798b.f9207c;
        C.d(str);
        try {
            c0798b = new C0798b(str);
        } catch (IllegalArgumentException unused) {
            c0798b = null;
        }
        String str2 = c0798b != null ? c0798b.f9208a : null;
        String str3 = c0798b != null ? c0798b.f9209b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajk.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0800d zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
