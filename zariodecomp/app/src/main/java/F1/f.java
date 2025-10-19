package F1;

import android.os.Parcel;
import android.os.Parcelable;
import b2.C0261B;
import l.R0;
import l.d1;
import t0.a0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\f.smali */
public final class f implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1674a;

    public /* synthetic */ f(int i) {
        this.f1674a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1674a) {
            case 0:
                return new g(parcel, classLoader);
            case 1:
                return new G1.b(parcel, classLoader);
            case 2:
                return new Q1.a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return U.b.f3263b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Y1.b(parcel, classLoader);
            case 5:
                return new C0261B(parcel, classLoader);
            case 6:
                return new R0(parcel, classLoader);
            case 7:
                return new d1(parcel, classLoader);
            case 8:
                return new a0(parcel, classLoader);
            default:
                return new y.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1674a) {
            case 0:
                return new g[i];
            case 1:
                return new G1.b[i];
            case 2:
                return new Q1.a[i];
            case 3:
                return new U.b[i];
            case 4:
                return new Y1.b[i];
            case 5:
                return new C0261B[i];
            case 6:
                return new R0[i];
            case 7:
                return new d1[i];
            case 8:
                return new a0[i];
            default:
                return new y.f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1674a) {
            case 0:
                return new g(parcel, (ClassLoader) null);
            case 1:
                return new G1.b(parcel, null);
            case 2:
                return new Q1.a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return U.b.f3263b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Y1.b(parcel, (ClassLoader) null);
            case 5:
                return new C0261B(parcel, null);
            case 6:
                return new R0(parcel, null);
            case 7:
                return new d1(parcel, null);
            case 8:
                return new a0(parcel, null);
            default:
                return new y.f(parcel, (ClassLoader) null);
        }
    }
}
