package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\Y.smali */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final B f6480b = new B(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f6481a;

    public Y(AbstractC0422s abstractC0422s) {
        L.a(abstractC0422s, "output");
        this.f6481a = abstractC0422s;
        abstractC0422s.f6580c = this;
    }

    public void a(AbstractC0409l abstractC0409l) {
        if (!abstractC0409l.o()) {
            if (!(abstractC0409l instanceof C0423s0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0409l.getClass());
            }
            C0423s0 c0423s0 = (C0423s0) abstractC0409l;
            a(c0423s0.f6583e);
            a(c0423s0.f6584f);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C0423s0.f6581m, abstractC0409l.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iX = C0423s0.x(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f6481a;
        if (arrayDeque.isEmpty() || ((AbstractC0409l) arrayDeque.peek()).size() >= iX) {
            arrayDeque.push(abstractC0409l);
            return;
        }
        int iX2 = C0423s0.x(iBinarySearch);
        AbstractC0409l c0423s02 = (AbstractC0409l) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC0409l) arrayDeque.peek()).size() < iX2) {
            c0423s02 = new C0423s0((AbstractC0409l) arrayDeque.pop(), c0423s02);
        }
        C0423s0 c0423s03 = new C0423s0(c0423s02, abstractC0409l);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C0423s0.f6581m, c0423s03.f6582d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0409l) arrayDeque.peek()).size() >= C0423s0.x(iBinarySearch2 + 1)) {
                break;
            } else {
                c0423s03 = new C0423s0((AbstractC0409l) arrayDeque.pop(), c0423s03);
            }
        }
        arrayDeque.push(c0423s03);
    }

    public void b(int i, boolean z4) {
        ((AbstractC0422s) this.f6481a).w0(i, z4);
    }

    public void c(int i, AbstractC0409l abstractC0409l) {
        ((AbstractC0422s) this.f6481a).y0(i, abstractC0409l);
    }

    public void d(int i, double d5) {
        AbstractC0422s abstractC0422s = (AbstractC0422s) this.f6481a;
        abstractC0422s.getClass();
        abstractC0422s.C0(i, Double.doubleToRawLongBits(d5));
    }

    public void e(int i, int i5) {
        ((AbstractC0422s) this.f6481a).E0(i, i5);
    }

    public void f(int i, int i5) {
        ((AbstractC0422s) this.f6481a).A0(i, i5);
    }

    public void g(int i, long j5) {
        ((AbstractC0422s) this.f6481a).C0(i, j5);
    }

    public void h(int i, float f2) {
        AbstractC0422s abstractC0422s = (AbstractC0422s) this.f6481a;
        abstractC0422s.getClass();
        abstractC0422s.A0(i, Float.floatToRawIntBits(f2));
    }

    public void i(int i, Object obj, InterfaceC0425t0 interfaceC0425t0) {
        AbstractC0422s abstractC0422s = (AbstractC0422s) this.f6481a;
        abstractC0422s.K0(i, 3);
        interfaceC0425t0.g((AbstractC0388a) obj, abstractC0422s.f6580c);
        abstractC0422s.K0(i, 4);
    }

    public void j(int i, int i5) {
        ((AbstractC0422s) this.f6481a).E0(i, i5);
    }

    public void k(int i, long j5) {
        ((AbstractC0422s) this.f6481a).N0(i, j5);
    }

    public void l(int i, Object obj, InterfaceC0425t0 interfaceC0425t0) {
        ((AbstractC0422s) this.f6481a).G0(i, (AbstractC0388a) obj, interfaceC0425t0);
    }

    public void m(int i, int i5) {
        ((AbstractC0422s) this.f6481a).A0(i, i5);
    }

    public void n(int i, long j5) {
        ((AbstractC0422s) this.f6481a).C0(i, j5);
    }

    public void o(int i, int i5) {
        AbstractC0422s abstractC0422s = (AbstractC0422s) this.f6481a;
        abstractC0422s.L0(i, (i5 >> 31) ^ (i5 << 1));
    }

    public void p(int i, long j5) {
        AbstractC0422s abstractC0422s = (AbstractC0422s) this.f6481a;
        abstractC0422s.N0(i, (j5 >> 63) ^ (j5 << 1));
    }

    public void q(int i, int i5) {
        ((AbstractC0422s) this.f6481a).L0(i, i5);
    }

    public void r(int i, long j5) {
        ((AbstractC0422s) this.f6481a).N0(i, j5);
    }

    public Y(int i) {
        InterfaceC0397e0 interfaceC0397e0;
        switch (i) {
            case 2:
                this.f6481a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC0397e0 = (InterfaceC0397e0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0397e0 = f6480b;
                }
                InterfaceC0397e0[] interfaceC0397e0Arr = {B.f6407b, interfaceC0397e0};
                X x3 = new X();
                x3.f6479a = interfaceC0397e0Arr;
                Charset charset = L.f6425a;
                this.f6481a = x3;
                break;
        }
    }
}
