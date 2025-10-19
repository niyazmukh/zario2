package c0;

import android.util.SparseArray;
import d0.C0442a;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f5373a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f5374b;

    /* renamed from: c, reason: collision with root package name */
    public r f5375c;

    /* renamed from: d, reason: collision with root package name */
    public r f5376d;

    /* renamed from: e, reason: collision with root package name */
    public int f5377e;

    /* renamed from: f, reason: collision with root package name */
    public int f5378f;

    public o(r rVar) {
        this.f5374b = rVar;
        this.f5375c = rVar;
    }

    public final int a(int i) {
        SparseArray sparseArray = this.f5375c.f5387a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i);
        int i5 = 1;
        int i6 = 2;
        if (this.f5373a == 2) {
            if (rVar != null) {
                this.f5375c = rVar;
                this.f5378f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                r rVar2 = this.f5375c;
                if (rVar2.f5388b != null) {
                    i6 = 3;
                    if (this.f5378f != 1) {
                        this.f5376d = rVar2;
                        b();
                    } else if (c()) {
                        this.f5376d = this.f5375c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i5 = i6;
        } else if (rVar == null) {
            b();
        } else {
            this.f5373a = 2;
            this.f5375c = rVar;
            this.f5378f = 1;
            i5 = i6;
        }
        this.f5377e = i;
        return i5;
    }

    public final void b() {
        this.f5373a = 1;
        this.f5375c = this.f5374b;
        this.f5378f = 0;
    }

    public final boolean c() {
        C0442a c0442aC = this.f5375c.f5388b.c();
        int iA = c0442aC.a(6);
        return !(iA == 0 || ((ByteBuffer) c0442aC.f2436d).get(iA + c0442aC.f2433a) == 0) || this.f5377e == 65039;
    }
}
