package B3;

import java.util.Random;

/* renamed from: B3.c0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\c0.1.smali */
public final class C0032c0 {

    /* renamed from: a, reason: collision with root package name */
    public Random f766a;

    /* renamed from: b, reason: collision with root package name */
    public long f767b;

    /* renamed from: c, reason: collision with root package name */
    public double f768c;

    /* renamed from: d, reason: collision with root package name */
    public double f769d;

    /* renamed from: e, reason: collision with root package name */
    public long f770e;

    public final long a() {
        long j5 = this.f770e;
        double d5 = j5;
        this.f770e = Math.min((long) (this.f768c * d5), this.f767b);
        double d6 = this.f769d;
        double d7 = (-d6) * d5;
        double d8 = d6 * d5;
        S0.f.h(d8 >= d7);
        return j5 + ((long) ((this.f766a.nextDouble() * (d8 - d7)) + d7));
    }
}
