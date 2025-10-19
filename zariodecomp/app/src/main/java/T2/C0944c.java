package t2;

import K3.k;
import N2.AbstractC0156x;
import Q3.j;
import W.InterfaceC0167i;
import X3.l;
import X3.p;
import a.AbstractC0183a;
import f4.C;
import kotlin.jvm.internal.i;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\c.smali */
public final class C0944c extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0949h f10185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0944c(C0949h c0949h, l lVar, O3.d dVar) {
        super(2, dVar);
        this.f10185b = c0949h;
        this.f10186c = lVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0944c(this.f10185b, this.f10186c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0944c) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f10184a;
        C0949h c0949h = this.f10185b;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                Object obj2 = c0949h.f10201b.get();
                Boolean bool = Boolean.TRUE;
                if (i.a(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                c0949h.f10201b.set(bool);
                InterfaceC0167i interfaceC0167i = c0949h.f10202c;
                C0943b c0943b = new C0943b(this.f10186c, null);
                this.f10184a = 1;
                obj = AbstractC0156x.B(interfaceC0167i, c0943b, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            return (a0.b) obj;
        } finally {
            c0949h.f10201b.set(Boolean.FALSE);
        }
    }
}
