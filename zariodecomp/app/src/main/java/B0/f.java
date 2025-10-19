package b0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b0.1\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f4975a;

    /* renamed from: b, reason: collision with root package name */
    public double f4976b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4977c;

    /* renamed from: d, reason: collision with root package name */
    public double f4978d;

    /* renamed from: e, reason: collision with root package name */
    public double f4979e;

    /* renamed from: f, reason: collision with root package name */
    public double f4980f;

    /* renamed from: g, reason: collision with root package name */
    public double f4981g;
    public double h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final d f4982j;

    public f() {
        this.f4975a = Math.sqrt(1500.0d);
        this.f4976b = 0.5d;
        this.f4977c = false;
        this.i = Double.MAX_VALUE;
        this.f4982j = new d();
    }

    public final d a(double d5, double d6, long j5) {
        double dCos;
        double dPow;
        if (!this.f4977c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d7 = this.f4976b;
            if (d7 > 1.0d) {
                double d8 = this.f4975a;
                this.f4980f = (Math.sqrt((d7 * d7) - 1.0d) * d8) + ((-d7) * d8);
                double d9 = this.f4976b;
                double d10 = this.f4975a;
                this.f4981g = ((-d9) * d10) - (Math.sqrt((d9 * d9) - 1.0d) * d10);
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d7 * d7)) * this.f4975a;
            }
            this.f4977c = true;
        }
        double d11 = j5 / 1000.0d;
        double d12 = d5 - this.i;
        double d13 = this.f4976b;
        if (d13 > 1.0d) {
            double d14 = this.f4981g;
            double d15 = ((d14 * d12) - d6) / (d14 - this.f4980f);
            double d16 = d12 - d15;
            dPow = (Math.pow(2.718281828459045d, this.f4980f * d11) * d15) + (Math.pow(2.718281828459045d, d14 * d11) * d16);
            double d17 = this.f4981g;
            double dPow2 = Math.pow(2.718281828459045d, d17 * d11) * d16 * d17;
            double d18 = this.f4980f;
            dCos = (Math.pow(2.718281828459045d, d18 * d11) * d15 * d18) + dPow2;
        } else if (d13 == 1.0d) {
            double d19 = this.f4975a;
            double d20 = (d19 * d12) + d6;
            double d21 = (d20 * d11) + d12;
            double dPow3 = Math.pow(2.718281828459045d, (-d19) * d11) * d21;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f4975a) * d11) * d21;
            double d22 = -this.f4975a;
            dCos = (Math.pow(2.718281828459045d, d22 * d11) * d20) + (dPow4 * d22);
            dPow = dPow3;
        } else {
            double d23 = 1.0d / this.h;
            double d24 = this.f4975a;
            double d25 = ((d13 * d24 * d12) + d6) * d23;
            double dSin = ((Math.sin(this.h * d11) * d25) + (Math.cos(this.h * d11) * d12)) * Math.pow(2.718281828459045d, (-d13) * d24 * d11);
            double d26 = this.f4975a;
            double d27 = this.f4976b;
            double d28 = (-d26) * dSin * d27;
            double dPow5 = Math.pow(2.718281828459045d, (-d27) * d26 * d11);
            double d29 = this.h;
            double dSin2 = Math.sin(d29 * d11) * (-d29) * d12;
            double d30 = this.h;
            dCos = (((Math.cos(d30 * d11) * d25 * d30) + dSin2) * dPow5) + d28;
            dPow = dSin;
        }
        float f2 = (float) (dPow + this.i);
        d dVar = this.f4982j;
        dVar.f4956a = f2;
        dVar.f4957b = (float) dCos;
        return dVar;
    }

    public f(float f2) {
        this.f4975a = Math.sqrt(1500.0d);
        this.f4976b = 0.5d;
        this.f4977c = false;
        this.f4982j = new d();
        this.i = f2;
    }
}
