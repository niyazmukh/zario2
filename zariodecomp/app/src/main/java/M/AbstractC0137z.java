package M;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* renamed from: M.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\z.1.smali */
public abstract class AbstractC0137z {

    /* renamed from: a, reason: collision with root package name */
    public int f2433a;

    /* renamed from: b, reason: collision with root package name */
    public int f2434b;

    /* renamed from: c, reason: collision with root package name */
    public int f2435c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2436d;

    public AbstractC0137z() {
        if (J3.c.f2099a == null) {
            J3.c.f2099a = new J3.c();
        }
    }

    public int a(int i) {
        if (i < this.f2435c) {
            return ((ByteBuffer) this.f2436d).getShort(this.f2434b + i);
        }
        return 0;
    }

    public void b() {
        if (((M3.f) this.f2436d).f2516l != this.f2435c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f2433a;
            M3.f fVar = (M3.f) this.f2436d;
            if (i >= fVar.f2514f || fVar.f2511c[i] >= 0) {
                return;
            } else {
                this.f2433a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2434b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2434b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f2433a);
            if (!((Class) this.f2436d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            WeakHashMap weakHashMap = S.f2363a;
            View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
            C0118c c0118c = accessibilityDelegateA != null ? accessibilityDelegateA instanceof C0116a ? ((C0116a) accessibilityDelegateA).f2368a : new C0118c(accessibilityDelegateA) : null;
            if (c0118c == null) {
                c0118c = new C0118c();
            }
            S.h(view, c0118c);
            view.setTag(this.f2433a, obj);
            S.d(view, this.f2435c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2433a < ((M3.f) this.f2436d).f2514f;
    }

    public void remove() {
        b();
        if (this.f2434b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        M3.f fVar = (M3.f) this.f2436d;
        fVar.c();
        fVar.l(this.f2434b);
        this.f2434b = -1;
        this.f2435c = fVar.f2516l;
    }
}
