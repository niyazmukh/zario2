package z3;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z3.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\j.1.smali */
public final class C1086j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1086j f11319b = new C1086j(new C1084h(2), C1084h.f11313b);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11320a = new ConcurrentHashMap();

    public C1086j(InterfaceC1085i... interfaceC1085iArr) {
        for (InterfaceC1085i interfaceC1085i : interfaceC1085iArr) {
            this.f11320a.put(interfaceC1085i.d(), interfaceC1085i);
        }
    }
}
