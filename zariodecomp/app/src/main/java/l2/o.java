package l2;

import N2.AbstractC0156x;
import X3.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\o.smali */
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final long f8792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8793b;

    public o(int i, long j5) {
        g.b(i, j5);
        this.f8792a = j5;
        this.f8793b = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o other) {
        kotlin.jvm.internal.i.e(other, "other");
        l[] lVarArr = {m.f8790b, n.f8791b};
        for (int i = 0; i < 2; i++) {
            l lVar = lVarArr[i];
            int iJ = AbstractC0156x.j((Comparable) lVar.invoke(this), (Comparable) lVar.invoke(other));
            if (iJ != 0) {
                return iJ;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && compareTo((o) obj) == 0);
    }

    public final int hashCode() {
        long j5 = this.f8792a;
        return (((((int) j5) * 1369) + ((int) (j5 >> 32))) * 37) + this.f8793b;
    }

    public final String toString() {
        return "Timestamp(seconds=" + this.f8792a + ", nanoseconds=" + this.f8793b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.i.e(dest, "dest");
        dest.writeLong(this.f8792a);
        dest.writeInt(this.f8793b);
    }

    public o(Date date) {
        K3.e eVar;
        kotlin.jvm.internal.i.e(date, "date");
        long j5 = 1000;
        long time = date.getTime() / j5;
        int time2 = (int) ((date.getTime() % j5) * 1000000);
        if (time2 < 0) {
            eVar = new K3.e(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000));
        } else {
            eVar = new K3.e(Long.valueOf(time), Integer.valueOf(time2));
        }
        long jLongValue = ((Number) eVar.f2277a).longValue();
        int iIntValue = ((Number) eVar.f2278b).intValue();
        g.b(iIntValue, jLongValue);
        this.f8792a = jLongValue;
        this.f8793b = iIntValue;
    }
}
