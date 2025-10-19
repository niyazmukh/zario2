package p2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzcl;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\p.smali */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static p f9360c;

    /* renamed from: a, reason: collision with root package name */
    public final String f9361a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f9362b;

    public p(String str, zzmy zzmyVar) {
        this.f9361a = str;
        this.f9362b = zzmyVar;
    }

    public static p a(Context context, String str) {
        zzmy zzmyVarB;
        p pVar = f9360c;
        if (pVar == null || !Objects.equals(pVar.f9361a, str)) {
            try {
                zzcl.zza();
                zzmyVarB = b(context, str);
            } catch (IOException | GeneralSecurityException e5) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e5.getMessage());
                if (e5 instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto." + str, 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        zzmyVarB = b(context, str);
                    } catch (IOException | GeneralSecurityException e6) {
                        Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e6.getMessage());
                        zzmyVarB = null;
                        f9360c = new p(str, zzmyVarB);
                        return f9360c;
                    }
                } else {
                    zzmyVarB = null;
                }
                return f9360c;
            }
            f9360c = new p(str, zzmyVarB);
        }
        return f9360c;
    }

    public static zzmy b(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcv.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
    }
}
