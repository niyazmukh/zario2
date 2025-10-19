package p2;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbc;
import com.google.android.gms.internal.p002firebaseauthapi.zzbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzby;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzlh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\w.smali */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static w f9371c;

    /* renamed from: a, reason: collision with root package name */
    public final String f9372a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f9373b;

    public w(Context context, String str) {
        zzmy zzmyVarZza;
        this.f9372a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlh.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e5.getMessage());
            zzmyVarZza = null;
        }
        this.f9373b = zzmyVarZza;
    }

    public static w c(Context context, String str) {
        w wVar = f9371c;
        if (wVar == null || !Objects.equals(wVar.f9372a, str)) {
            f9371c = new w(context, str);
        }
        return f9371c;
    }

    public final String a() {
        if (this.f9373b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zzbyVarZza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f9373b) {
                this.f9373b.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e5.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f9373b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f9373b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e5.getMessage());
            return null;
        }
    }
}
