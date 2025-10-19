package L;

import t.C0892c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L\e.smali */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2293b;

    /* renamed from: c, reason: collision with root package name */
    public int f2294c;

    public e(int i) {
        this.f2292a = 0;
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2293b = new Object[i];
    }

    public Object a() {
        switch (this.f2292a) {
            case 0:
                int i = this.f2294c;
                if (i <= 0) {
                    return null;
                }
                int i5 = i - 1;
                Object[] objArr = this.f2293b;
                Object obj = objArr[i5];
                objArr[i5] = null;
                this.f2294c = i - 1;
                return obj;
            default:
                int i6 = this.f2294c;
                if (i6 <= 0) {
                    return null;
                }
                int i7 = i6 - 1;
                Object[] objArr2 = this.f2293b;
                Object obj2 = objArr2[i7];
                objArr2[i7] = null;
                this.f2294c = i6 - 1;
                return obj2;
        }
    }

    public void b(C0892c c0892c) {
        int i = this.f2294c;
        Object[] objArr = this.f2293b;
        if (i < objArr.length) {
            objArr[i] = c0892c;
            this.f2294c = i + 1;
        }
    }

    public boolean c(Object obj) {
        int i = 0;
        while (true) {
            int i5 = this.f2294c;
            Object[] objArr = this.f2293b;
            if (i >= i5) {
                if (i5 >= objArr.length) {
                    return false;
                }
                objArr[i5] = obj;
                this.f2294c = i5 + 1;
                return true;
            }
            if (objArr[i] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }

    public e() {
        this.f2292a = 1;
        this.f2293b = new Object[256];
    }
}
