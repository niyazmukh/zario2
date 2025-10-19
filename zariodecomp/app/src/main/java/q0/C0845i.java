package q0;

import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0240u;
import androidx.lifecycle.InterfaceC0241v;
import g0.AbstractComponentCallbacksC0567t;
import g0.S;
import java.util.ArrayList;
import java.util.Iterator;
import o0.C0787j;

/* renamed from: q0.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\i.smali */
public final class C0845i extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f9451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0567t f9452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0787j f9453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0845i(m mVar, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, C0787j c0787j) {
        super(1);
        this.f9451a = mVar;
        this.f9452b = abstractComponentCallbacksC0567t;
        this.f9453c = c0787j;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        InterfaceC0241v interfaceC0241v = (InterfaceC0241v) obj;
        m mVar = this.f9451a;
        ArrayList arrayList = mVar.f9463g;
        boolean z4 = false;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f9452b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.i.a(((K3.e) it.next()).f2277a, abstractComponentCallbacksC0567t.f7506C)) {
                    z4 = true;
                    break;
                }
            }
        }
        if (interfaceC0241v != null && !z4) {
            S sT = abstractComponentCallbacksC0567t.t();
            sT.d();
            C0242x c0242x = sT.f7399e;
            if (c0242x.f4672d.compareTo(EnumC0236o.f4660c) >= 0) {
                c0242x.a((InterfaceC0240u) mVar.i.invoke(this.f9453c));
            }
        }
        return K3.k.f2288a;
    }
}
