package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import o2.C0797a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahm.smali */
public final class zzahm implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C0797a zze;
    private String zzf;
    private String zzg;

    public zzahm(int i) {
        this.zza = zza(i);
    }

    public static zzahm zza(C0797a c0797a, String str, String str2) {
        C.d(str);
        C.d(str2);
        C.f(c0797a);
        return new zzahm(7, c0797a, null, str2, str, null, null);
    }

    public final C0797a zzb() {
        return this.zze;
    }

    public final zzahm zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        C.d(str);
        this.zzd = str;
        return this;
    }

    public final zzahm zzb(String str) {
        C.d(str);
        this.zzb = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahm(int i, C0797a c0797a, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        C.f(c0797a);
        this.zze = c0797a;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahm zza(C0797a c0797a) {
        C.f(c0797a);
        this.zze = c0797a;
        return this;
    }

    public final zzahm zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i) {
        if (i == 1) {
            return "PASSWORD_RESET";
        }
        if (i == 4) {
            return "VERIFY_EMAIL";
        }
        if (i == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        int i;
        i = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i = 7;
                break;
            case "EMAIL_SIGNIN":
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        jSONObject.put("requestType", i);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C0797a c0797a = this.zze;
        if (c0797a != null) {
            jSONObject.put("androidInstallApp", c0797a.f9200e);
            jSONObject.put("canHandleCodeInApp", this.zze.f9202k);
            String str5 = this.zze.f9196a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f9197b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f9198c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f9199d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f9201f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f9205n;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f9206o;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzajk.zza(jSONObject, "captchaResp", str13);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
