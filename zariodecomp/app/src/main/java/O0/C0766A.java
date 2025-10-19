package o0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@M("navigation")
/* renamed from: o0.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\A.smali */
public class C0766A extends N {

    /* renamed from: c, reason: collision with root package name */
    public final O f8975c;

    public C0766A(O o5) {
        this.f8975c = o5;
    }

    @Override // o0.N
    public final x a() {
        return new z(this);
    }

    @Override // o0.N
    public final void d(List list, C0769D c0769d) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0787j c0787j = (C0787j) it.next();
            x xVar = c0787j.f9069b;
            kotlin.jvm.internal.i.c(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            z zVar = (z) xVar;
            Bundle bundleC = c0787j.c();
            int i = zVar.f9154p;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i5 = zVar.f9147l;
                if (i5 != 0) {
                    strValueOf = zVar.f9142c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i5);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            x xVarL = zVar.l(i, false);
            if (xVarL == null) {
                if (zVar.f9155q == null) {
                    zVar.f9155q = String.valueOf(zVar.f9154p);
                }
                String str = zVar.f9155q;
                kotlin.jvm.internal.i.b(str);
                throw new IllegalArgumentException(B.a.l("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            N nB = this.f8975c.b(xVarL.f9140a);
            C0790m c0790mB = b();
            Bundle bundleG = xVarL.g(bundleC);
            C0767B c0767b = c0790mB.h;
            nB.d(p1.b.B(J3.c.a(c0767b.f8979a, xVarL, bundleG, c0767b.f(), c0767b.f8991o)), c0769d);
        }
    }
}
