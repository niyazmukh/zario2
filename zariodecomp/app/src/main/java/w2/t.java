package w2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\t.smali */
public final class t implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final double f10968a;

    /* renamed from: b, reason: collision with root package name */
    public final double f10969b;

    public t(double d5, double d6) {
        if (Double.isNaN(d5) || d5 < -90.0d || d5 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d6) || d6 < -180.0d || d6 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f10968a = d5;
        this.f10969b = d6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t tVar = (t) obj;
        double d5 = tVar.f10968a;
        E2.n nVar = F2.s.f1736a;
        int iB = S0.f.B(this.f10968a, d5);
        return iB == 0 ? S0.f.B(this.f10969b, tVar.f10969b) : iB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f10968a == tVar.f10968a && this.f10969b == tVar.f10969b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f10968a);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f10969b);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.f10968a + ", longitude=" + this.f10969b + " }";
    }
}
