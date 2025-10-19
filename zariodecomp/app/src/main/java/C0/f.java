package c0;

import android.graphics.Rect;
import android.view.View;
import t0.AbstractC0910Q;
import t0.C0899F;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\f.smali */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5354b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5355c;

    public f(AbstractC0910Q abstractC0910Q) {
        this.f5353a = Integer.MIN_VALUE;
        this.f5355c = new Rect();
        this.f5354b = abstractC0910Q;
    }

    public static f a(AbstractC0910Q abstractC0910Q, int i) {
        if (i == 0) {
            return new C0899F(abstractC0910Q, 0);
        }
        if (i == 1) {
            return new C0899F(abstractC0910Q, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f5353a) {
            return 0;
        }
        return l() - this.f5353a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public f(h hVar) {
        this.f5353a = 0;
        this.f5355c = new c();
        this.f5354b = hVar;
    }
}
