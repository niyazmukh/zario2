package p3;

import o3.C0811e;
import t0.AbstractC0917b;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p3.1\b.smali */
public final class C0823b extends AbstractC0917b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0823b f9386d = new C0823b();

    @Override // t0.AbstractC0917b
    public final boolean a(Object obj, Object obj2) {
        return ((C0811e) obj).equals((C0811e) obj2);
    }

    @Override // t0.AbstractC0917b
    public final boolean b(Object obj, Object obj2) {
        return ((C0811e) obj).f9240a == ((C0811e) obj2).f9240a;
    }
}
