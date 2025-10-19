package g0;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import l0.C0728c;

/* renamed from: g0.L, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\L.smali */
public final class C0544L implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7361a;

    @Override // androidx.lifecycle.i0
    public final f0 create(Class modelClass) {
        switch (this.f7361a) {
            case 0:
                return new C0545M(true);
            case 1:
                return new C0728c();
            default:
                kotlin.jvm.internal.i.e(modelClass, "modelClass");
                return new o0.r();
        }
    }
}
