package g0;

import java.util.ArrayList;

/* renamed from: g0.H, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\H.smali */
public final class C0540H implements InterfaceC0539G {

    /* renamed from: a, reason: collision with root package name */
    public final String f7310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0542J f7312c;

    public C0540H(C0542J c0542j, String str, int i) {
        this.f7312c = c0542j;
        this.f7310a = str;
        this.f7311b = i;
    }

    @Override // g0.InterfaceC0539G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7312c.f7350x;
        if (abstractComponentCallbacksC0567t == null || this.f7311b >= 0 || this.f7310a != null || !abstractComponentCallbacksC0567t.m().P(-1, 0)) {
            return this.f7312c.Q(arrayList, arrayList2, this.f7310a, this.f7311b, 1);
        }
        return false;
    }
}
