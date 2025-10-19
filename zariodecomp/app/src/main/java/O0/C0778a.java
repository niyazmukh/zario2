package o0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\a.1.smali */
public final class C0778a extends x {

    /* renamed from: o, reason: collision with root package name */
    public Intent f9041o;

    /* renamed from: p, reason: collision with root package name */
    public String f9042p;

    public static String k(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        kotlin.jvm.internal.i.d(packageName, "context.packageName");
        return e4.m.v0(str, "${applicationId}", packageName);
    }

    @Override // o0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0778a)) {
            return false;
        }
        if (super.equals(obj)) {
            Intent intent = this.f9041o;
            if ((intent != null ? intent.filterEquals(((C0778a) obj).f9041o) : ((C0778a) obj).f9041o == null) && kotlin.jvm.internal.i.a(this.f9042p, ((C0778a) obj).f9042p)) {
                return true;
            }
        }
        return false;
    }

    @Override // o0.x
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f9041o;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f9042p;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // o0.x
    public final void j(Context context, AttributeSet attributeSet) {
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, P.f9038a);
        kotlin.jvm.internal.i.d(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String strK = k(context, typedArrayObtainAttributes.getString(4));
        if (this.f9041o == null) {
            this.f9041o = new Intent();
        }
        Intent intent = this.f9041o;
        kotlin.jvm.internal.i.b(intent);
        intent.setPackage(strK);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f9041o == null) {
                this.f9041o = new Intent();
            }
            Intent intent2 = this.f9041o;
            kotlin.jvm.internal.i.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f9041o == null) {
            this.f9041o = new Intent();
        }
        Intent intent3 = this.f9041o;
        kotlin.jvm.internal.i.b(intent3);
        intent3.setAction(string2);
        String strK2 = k(context, typedArrayObtainAttributes.getString(2));
        if (strK2 != null) {
            Uri uri = Uri.parse(strK2);
            if (this.f9041o == null) {
                this.f9041o = new Intent();
            }
            Intent intent4 = this.f9041o;
            kotlin.jvm.internal.i.b(intent4);
            intent4.setData(uri);
        }
        this.f9042p = k(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // o0.x
    public final String toString() {
        Intent intent = this.f9041o;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f9041o;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
