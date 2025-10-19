package h1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.S;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q1.BinderC0847b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\m.smali */
public abstract class m extends zzb implements S {

    /* renamed from: a, reason: collision with root package name */
    public final int f7650a;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C.b(bArr.length == 25);
        this.f7650a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public abstract byte[] a();

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        try {
            S s4 = (S) obj;
            if (((m) s4).f7650a != this.f7650a) {
                return false;
            }
            return Arrays.equals(a(), (byte[]) BinderC0847b.b(new BinderC0847b(((m) s4).a())));
        } catch (RemoteException e5) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            return false;
        }
    }

    public final int hashCode() {
        return this.f7650a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i == 1) {
            BinderC0847b binderC0847b = new BinderC0847b(a());
            parcel2.writeNoException();
            zzc.zze(parcel2, binderC0847b);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f7650a);
        }
        return true;
    }
}
