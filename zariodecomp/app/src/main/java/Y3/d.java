package y3;

import com.niyaz.zario.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y3.1\d.smali */
public final class d implements InterfaceC1060c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11166c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile i f11167a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11168b;

    public static InterfaceC1060c a(i iVar) {
        d dVar = new d();
        dVar.f11168b = f11166c;
        dVar.f11167a = iVar;
        return dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f11168b;
        if (obj != f11166c) {
            return obj;
        }
        i iVar = this.f11167a;
        if (iVar == null) {
            return this.f11168b;
        }
        Object obj2 = iVar.get();
        this.f11168b = obj2;
        this.f11167a = null;
        return obj2;
    }
}
