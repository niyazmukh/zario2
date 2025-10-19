package n;

import java.util.HashMap;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n.1\a.smali */
public final class C0756a extends C0761f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8948e = new HashMap();

    @Override // n.C0761f
    public final C0758c f(Object obj) {
        return (C0758c) this.f8948e.get(obj);
    }

    @Override // n.C0761f
    public final Object g(Object obj, Object obj2) {
        C0758c c0758cF = f(obj);
        if (c0758cF != null) {
            return c0758cF.f8953b;
        }
        HashMap map = this.f8948e;
        C0758c c0758c = new C0758c(obj, obj2);
        this.f8962d++;
        C0758c c0758c2 = this.f8960b;
        if (c0758c2 == null) {
            this.f8959a = c0758c;
            this.f8960b = c0758c;
        } else {
            c0758c2.f8954c = c0758c;
            c0758c.f8955d = c0758c2;
            this.f8960b = c0758c;
        }
        map.put(obj, c0758c);
        return null;
    }

    @Override // n.C0761f
    public final Object h(Object obj) {
        Object objH = super.h(obj);
        this.f8948e.remove(obj);
        return objH;
    }
}
