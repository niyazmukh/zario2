package l0;

import androidx.lifecycle.f0;
import g0.C0544L;
import g1.C0575d;
import q.C0835l;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l0.1\c.smali */
public final class C0728c extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0544L f8751c = new C0544L(1);

    /* renamed from: a, reason: collision with root package name */
    public final C0835l f8752a = new C0835l();

    /* renamed from: b, reason: collision with root package name */
    public boolean f8753b = false;

    @Override // androidx.lifecycle.f0
    public final void onCleared() {
        C0835l c0835l = this.f8752a;
        int iF = c0835l.f();
        for (int i = 0; i < iF; i++) {
            C0726a c0726a = (C0726a) c0835l.g(i);
            C0575d c0575d = c0726a.f8746l;
            c0575d.a();
            c0575d.f7581c = true;
            C0727b c0727b = c0726a.f8748n;
            if (c0727b != null) {
                c0726a.i(c0727b);
            }
            C0726a c0726a2 = c0575d.f7579a;
            if (c0726a2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c0726a2 != c0726a) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c0575d.f7579a = null;
            if (c0727b != null) {
                boolean z4 = c0727b.f8750b;
            }
            c0575d.f7582d = true;
            c0575d.f7580b = false;
            c0575d.f7581c = false;
            c0575d.f7583e = false;
        }
        int i5 = c0835l.f9433d;
        Object[] objArr = c0835l.f9432c;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        c0835l.f9433d = 0;
        c0835l.f9430a = false;
    }
}
