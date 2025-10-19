package com.google.protobuf;

import j4.AbstractC0633c;
import java.util.Arrays;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\p.1.smali */
public abstract class AbstractC0417p {

    /* renamed from: a, reason: collision with root package name */
    public int f6562a;

    /* renamed from: b, reason: collision with root package name */
    public int f6563b = 100;

    /* renamed from: c, reason: collision with root package name */
    public Object f6564c;

    public static int h(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long i(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    public static C0411m m(byte[] bArr, int i, int i5, boolean z4) {
        C0411m c0411m = new C0411m(bArr, i, i5, z4);
        try {
            c0411m.o(i5);
            return c0411m;
        } catch (N e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract String C();

    public abstract String D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public abstract boolean H(int i);

    public void I() {
        int iE;
        do {
            iE = E();
            if (iE == 0) {
                return;
            }
            int i = this.f6562a;
            if (i >= this.f6563b) {
                throw new N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f6562a = i + 1;
            this.f6562a--;
        } while (H(iE));
    }

    public AbstractC0633c d() {
        AbstractC0633c abstractC0633cF;
        synchronized (this) {
            try {
                AbstractC0633c[] abstractC0633cArrG = (AbstractC0633c[]) this.f6564c;
                if (abstractC0633cArrG == null) {
                    abstractC0633cArrG = g();
                    this.f6564c = abstractC0633cArrG;
                } else if (this.f6562a >= abstractC0633cArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0633cArrG, abstractC0633cArrG.length * 2);
                    kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                    this.f6564c = (AbstractC0633c[]) objArrCopyOf;
                    abstractC0633cArrG = (AbstractC0633c[]) objArrCopyOf;
                }
                int i = this.f6563b;
                do {
                    abstractC0633cF = abstractC0633cArrG[i];
                    if (abstractC0633cF == null) {
                        abstractC0633cF = f();
                        abstractC0633cArrG[i] = abstractC0633cF;
                    }
                    i++;
                    if (i >= abstractC0633cArrG.length) {
                        i = 0;
                    }
                } while (!abstractC0633cF.a(this));
                this.f6563b = i;
                this.f6562a++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0633cF;
    }

    public abstract void e(int i);

    public abstract AbstractC0633c f();

    public abstract AbstractC0633c[] g();

    public void j(AbstractC0633c abstractC0633c) {
        int i;
        O3.d[] dVarArrB;
        synchronized (this) {
            try {
                int i5 = this.f6562a - 1;
                this.f6562a = i5;
                if (i5 == 0) {
                    this.f6563b = 0;
                }
                kotlin.jvm.internal.i.c(abstractC0633c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = abstractC0633c.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (O3.d dVar : dVarArrB) {
            if (dVar != null) {
                dVar.resumeWith(K3.k.f2288a);
            }
        }
    }

    public abstract int k();

    public abstract boolean l();

    public abstract void n(int i);

    public abstract int o(int i);

    public abstract boolean p();

    public abstract C0407k q();

    public abstract double r();

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract float v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
