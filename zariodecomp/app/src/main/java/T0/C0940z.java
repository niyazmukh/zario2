package t0;

import android.view.View;
import java.util.List;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\z.1.smali */
public final class C0940z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10170a;

    /* renamed from: b, reason: collision with root package name */
    public int f10171b;

    /* renamed from: c, reason: collision with root package name */
    public int f10172c;

    /* renamed from: d, reason: collision with root package name */
    public int f10173d;

    /* renamed from: e, reason: collision with root package name */
    public int f10174e;

    /* renamed from: f, reason: collision with root package name */
    public int f10175f;

    /* renamed from: g, reason: collision with root package name */
    public int f10176g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f10177j;

    /* renamed from: k, reason: collision with root package name */
    public List f10178k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10179l;

    public final void a(View view) {
        int iB;
        int size = this.f10178k.size();
        View view2 = null;
        int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((g0) this.f10178k.get(i5)).f10004a;
            C0911S c0911s = (C0911S) view3.getLayoutParams();
            if (view3 != view && !c0911s.f9927a.i() && (iB = (c0911s.f9927a.b() - this.f10173d) * this.f10174e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.f10173d = -1;
        } else {
            this.f10173d = ((C0911S) view2.getLayoutParams()).f9927a.b();
        }
    }

    public final View b(X x3) {
        List list = this.f10178k;
        if (list == null) {
            View view = x3.i(this.f10173d, Long.MAX_VALUE).f10004a;
            this.f10173d += this.f10174e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((g0) this.f10178k.get(i)).f10004a;
            C0911S c0911s = (C0911S) view2.getLayoutParams();
            if (!c0911s.f9927a.i() && this.f10173d == c0911s.f9927a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
