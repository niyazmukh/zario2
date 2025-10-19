package H0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H0\b.smali */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1878d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1879e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1881g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1882j;

    /* renamed from: k, reason: collision with root package name */
    public int f1883k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.b(), new q.b(), new q.b());
    }

    @Override // H0.a
    public final b a() {
        Parcel parcel = this.f1879e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f1882j;
        if (i == this.f1880f) {
            i = this.f1881g;
        }
        return new b(parcel, iDataPosition, i, B.a.m(new StringBuilder(), this.h, "  "), this.f1875a, this.f1876b, this.f1877c);
    }

    @Override // H0.a
    public final boolean e(int i) {
        while (this.f1882j < this.f1881g) {
            int i5 = this.f1883k;
            if (i5 == i) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f1882j;
            Parcel parcel = this.f1879e;
            parcel.setDataPosition(i6);
            int i7 = parcel.readInt();
            this.f1883k = parcel.readInt();
            this.f1882j += i7;
        }
        return this.f1883k == i;
    }

    @Override // H0.a
    public final void h(int i) {
        int i5 = this.i;
        SparseIntArray sparseIntArray = this.f1878d;
        Parcel parcel = this.f1879e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i5, String str, q.b bVar, q.b bVar2, q.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1878d = new SparseIntArray();
        this.i = -1;
        this.f1883k = -1;
        this.f1879e = parcel;
        this.f1880f = i;
        this.f1881g = i5;
        this.f1882j = i;
        this.h = str;
    }
}
