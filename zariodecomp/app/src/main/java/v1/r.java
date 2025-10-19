package v1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\r.smali */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new Y(4);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f10643a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC0978a interfaceC0978a) {
        this.f10643a = (Enum) interfaceC0978a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r b(int i) throws C0993q {
        G g3;
        if (i == -262) {
            g3 = G.RS1;
        } else {
            G[] gArrValues = G.values();
            int length = gArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    for (EnumC0994s enumC0994s : EnumC0994s.values()) {
                        if (enumC0994s.f10645a == i) {
                            g3 = enumC0994s;
                        }
                    }
                    throw new C0993q(B.a.i("Algorithm with COSE value ", i, " not supported"));
                }
                G g5 = gArrValues[i5];
                if (g5.f10577a == i) {
                    g3 = g5;
                    break;
                }
                i5++;
            }
        }
        return new r(g3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, v1.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v1.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f10643a.a() == ((r) obj).f10643a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10643a});
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, v1.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10643a.a());
    }
}
