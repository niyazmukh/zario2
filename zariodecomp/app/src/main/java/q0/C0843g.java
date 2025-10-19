package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o0.x;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\g.smali */
public final class C0843g extends x {

    /* renamed from: o, reason: collision with root package name */
    public String f9447o;

    @Override // o0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0843g)) {
            return false;
        }
        return super.equals(obj) && kotlin.jvm.internal.i.a(this.f9447o, ((C0843g) obj).f9447o);
    }

    @Override // o0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f9447o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o0.x
    public final void j(Context context, AttributeSet attributeSet) {
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, n.f9465b);
        kotlin.jvm.internal.i.d(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f9447o = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // o0.x
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f9447o;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
