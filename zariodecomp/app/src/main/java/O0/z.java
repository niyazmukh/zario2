package o0;

import A2.C0009i;
import L3.C0112a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import p0.AbstractC0819a;
import q.C0835l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\z.smali */
public final class z extends x implements Iterable, Y3.a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f9152r = 0;

    /* renamed from: o, reason: collision with root package name */
    public final C0835l f9153o;

    /* renamed from: p, reason: collision with root package name */
    public int f9154p;

    /* renamed from: q, reason: collision with root package name */
    public String f9155q;

    public z(C0766A c0766a) {
        super(c0766a);
        this.f9153o = new C0835l();
    }

    @Override // o0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        if (super.equals(obj)) {
            C0835l c0835l = this.f9153o;
            int iF = c0835l.f();
            z zVar = (z) obj;
            C0835l c0835l2 = zVar.f9153o;
            if (iF == c0835l2.f() && this.f9154p == zVar.f9154p) {
                for (x xVar : d4.g.k0(new C0112a(c0835l, 2))) {
                    if (!xVar.equals(c0835l2.c(xVar.f9147l, null))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // o0.x
    public final int hashCode() {
        int iD = this.f9154p;
        C0835l c0835l = this.f9153o;
        int iF = c0835l.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + c0835l.d(i)) * 31) + ((x) c0835l.g(i)).hashCode();
        }
        return iD;
    }

    @Override // o0.x
    public final w i(C0009i c0009i) {
        w wVarI = super.i(c0009i);
        ArrayList arrayList = new ArrayList();
        y yVar = new y(this);
        while (yVar.hasNext()) {
            w wVarI2 = ((x) yVar.next()).i(c0009i);
            if (wVarI2 != null) {
                arrayList.add(wVarI2);
            }
        }
        return (w) L3.j.k0(L3.i.v0(new w[]{wVarI, (w) L3.j.k0(arrayList)}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // o0.x
    public final void j(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        String strValueOf;
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0819a.f9310d);
        kotlin.jvm.internal.i.d(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f9147l) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f9154p = resourceId;
        this.f9155q = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            kotlin.jvm.internal.i.d(strValueOf, "try {\n                co….toString()\n            }");
        }
        this.f9155q = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void k(x node) {
        kotlin.jvm.internal.i.e(node, "node");
        int i = node.f9147l;
        String str = node.f9148m;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f9148m;
        if (str2 != null && kotlin.jvm.internal.i.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f9147l) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        C0835l c0835l = this.f9153o;
        x xVar = (x) c0835l.c(i, null);
        if (xVar == node) {
            return;
        }
        if (node.f9141b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (xVar != null) {
            xVar.f9141b = null;
        }
        node.f9141b = this;
        c0835l.e(node.f9147l, node);
    }

    public final x l(int i, boolean z4) {
        z zVar;
        x xVar = (x) this.f9153o.c(i, null);
        if (xVar != null) {
            return xVar;
        }
        if (!z4 || (zVar = this.f9141b) == null) {
            return null;
        }
        return zVar.l(i, true);
    }

    @Override // o0.x
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        x xVarL = l(this.f9154p, true);
        sb.append(" startDestination=");
        if (xVarL == null) {
            String str = this.f9155q;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f9154p));
            }
        } else {
            sb.append("{");
            sb.append(xVarL.toString());
            sb.append("}");
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
