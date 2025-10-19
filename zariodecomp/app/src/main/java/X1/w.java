package X1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\w.smali */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f3811a;

    /* renamed from: b, reason: collision with root package name */
    public float f3812b;

    /* renamed from: c, reason: collision with root package name */
    public float f3813c;

    /* renamed from: d, reason: collision with root package name */
    public float f3814d;

    /* renamed from: e, reason: collision with root package name */
    public float f3815e;

    /* renamed from: f, reason: collision with root package name */
    public float f3816f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3817g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public w() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f3815e;
        if (f3 == f2) {
            return;
        }
        float f5 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f3813c;
        float f7 = this.f3814d;
        s sVar = new s(f6, f7, f6, f7);
        sVar.f3804f = this.f3815e;
        sVar.f3805g = f5;
        this.h.add(new q(sVar));
        this.f3815e = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3817g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        t tVar = new t();
        tVar.f3806b = f2;
        tVar.f3807c = f3;
        this.f3817g.add(tVar);
        r rVar = new r(tVar, this.f3813c, this.f3814d);
        float fB = rVar.b() + 270.0f;
        float fB2 = rVar.b() + 270.0f;
        a(fB);
        this.h.add(rVar);
        this.f3815e = fB2;
        this.f3813c = f2;
        this.f3814d = f3;
    }

    public final void d(float f2, float f3, float f5, float f6) {
        this.f3811a = f2;
        this.f3812b = f3;
        this.f3813c = f2;
        this.f3814d = f3;
        this.f3815e = f5;
        this.f3816f = (f5 + f6) % 360.0f;
        this.f3817g.clear();
        this.h.clear();
    }
}
