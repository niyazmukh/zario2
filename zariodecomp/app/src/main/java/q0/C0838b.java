package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o0.InterfaceC0781d;
import o0.x;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\b.smali */
public final class C0838b extends x implements InterfaceC0781d {

    /* renamed from: o, reason: collision with root package name */
    public String f9437o;

    @Override // o0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0838b)) {
            return false;
        }
        return super.equals(obj) && kotlin.jvm.internal.i.a(this.f9437o, ((C0838b) obj).f9437o);
    }

    @Override // o0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f9437o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o0.x
    public final void j(Context context, AttributeSet attributeSet) {
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, n.f9464a);
        kotlin.jvm.internal.i.d(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.f9437o = string;
        }
        typedArrayObtainAttributes.recycle();
    }
}
