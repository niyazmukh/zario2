package o0;

import N2.AbstractC0156x;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p0.AbstractC0819a;
import q.C0835l;
import q.C0836m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\x.smali */
public abstract class x {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9139n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f9140a;

    /* renamed from: b, reason: collision with root package name */
    public z f9141b;

    /* renamed from: c, reason: collision with root package name */
    public String f9142c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f9143d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9144e;

    /* renamed from: f, reason: collision with root package name */
    public final C0835l f9145f;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f9146k;

    /* renamed from: l, reason: collision with root package name */
    public int f9147l;

    /* renamed from: m, reason: collision with root package name */
    public String f9148m;

    static {
        new LinkedHashMap();
    }

    public x(N n5) {
        LinkedHashMap linkedHashMap = O.f9036b;
        this.f9140a = AbstractC0156x.L(n5.getClass());
        this.f9144e = new ArrayList();
        this.f9145f = new C0835l();
        this.f9146k = new LinkedHashMap();
    }

    public boolean equals(Object obj) {
        boolean z4;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        boolean zA = kotlin.jvm.internal.i.a(this.f9144e, xVar.f9144e);
        C0835l c0835l = this.f9145f;
        int iF = c0835l.f();
        C0835l c0835l2 = xVar.f9145f;
        if (iF != c0835l2.f()) {
            z4 = false;
            break;
        }
        Iterator it = d4.g.k0(new C0836m(c0835l)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!kotlin.jvm.internal.i.a(c0835l.c(iIntValue, null), c0835l2.c(iIntValue, null))) {
                z4 = false;
                break;
            }
        }
        z4 = true;
        LinkedHashMap linkedHashMap = this.f9146k;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = xVar.f9146k;
        if (size != linkedHashMap2.size()) {
            z5 = false;
            break;
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        kotlin.jvm.internal.i.e(setEntrySet, "<this>");
        for (Map.Entry entry : setEntrySet) {
            if (!linkedHashMap2.containsKey(entry.getKey()) || !kotlin.jvm.internal.i.a(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                z5 = false;
                break;
            }
        }
        z5 = true;
        return this.f9147l == xVar.f9147l && kotlin.jvm.internal.i.a(this.f9148m, xVar.f9148m) && zA && z4 && z5;
    }

    public final void f(v vVar) {
        ArrayList arrayListP = r1.d.P(this.f9146k, new J0.m(vVar, 4));
        if (arrayListP.isEmpty()) {
            this.f9144e.add(vVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + vVar.f9119a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListP).toString());
    }

    public final Bundle g(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f9146k;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C0783f c0783f = (C0783f) entry.getValue();
            c0783f.getClass();
            kotlin.jvm.internal.i.e(name, "name");
            if (c0783f.f9061c) {
                c0783f.f9059a.e(bundle2, name, c0783f.f9062d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C0783f c0783f2 = (C0783f) entry2.getValue();
                c0783f2.getClass();
                kotlin.jvm.internal.i.e(name2, "name");
                AbstractC0777L abstractC0777L = c0783f2.f9059a;
                if (c0783f2.f9060b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        abstractC0777L.a(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbO = B.a.o("Wrong argument type for '", name2, "' in argument bundle. ");
                sbO.append(abstractC0777L.b());
                sbO.append(" expected.");
                throw new IllegalArgumentException(sbO.toString().toString());
            }
        }
        return bundle2;
    }

    public final C0782e h(int i) {
        C0835l c0835l = this.f9145f;
        C0782e c0782e = c0835l.f() == 0 ? null : (C0782e) c0835l.c(i, null);
        if (c0782e != null) {
            return c0782e;
        }
        z zVar = this.f9141b;
        if (zVar != null) {
            return zVar.h(i);
        }
        return null;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f9147l * 31;
        String str = this.f9148m;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.f9144e.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            int i5 = iHashCode * 31;
            String str2 = vVar.f9119a;
            int iHashCode2 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = vVar.f9120b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = vVar.f9121c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C0835l c0835l = this.f9145f;
        if (c0835l == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(kotlin.jvm.internal.i.g("receiver$0"));
            kotlin.jvm.internal.i.h(illegalArgumentException, kotlin.jvm.internal.i.class.getName());
            throw illegalArgumentException;
        }
        int i6 = 0;
        while (true) {
            if (!(i6 < c0835l.f())) {
                break;
            }
            int i7 = i6 + 1;
            C0782e c0782e = (C0782e) c0835l.g(i6);
            int i8 = ((iHashCode * 31) + c0782e.f9056a) * 31;
            C0769D c0769d = c0782e.f9057b;
            iHashCode = i8 + (c0769d != null ? c0769d.hashCode() : 0);
            Bundle bundle = c0782e.f9058c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i9 = iHashCode * 31;
                    Bundle bundle2 = c0782e.f9058c;
                    kotlin.jvm.internal.i.b(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i9 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i6 = i7;
        }
        LinkedHashMap linkedHashMap = this.f9146k;
        for (String str6 : linkedHashMap.keySet()) {
            int iF = B.a.f(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iF + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4 A[PHI: r9
  0x00f4: PHI (r9v2 android.os.Bundle) = 
  (r9v1 android.os.Bundle)
  (r9v1 android.os.Bundle)
  (r9v1 android.os.Bundle)
  (r9v1 android.os.Bundle)
  (r9v22 android.os.Bundle)
  (r9v1 android.os.Bundle)
 binds: [B:9:0x0027, B:14:0x0043, B:17:0x004b, B:20:0x0058, B:48:0x00f2, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o0.v] */
    /* JADX WARN: Type inference failed for: r12v12, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0.w i(A2.C0009i r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.x.i(A2.i):o0.w");
    }

    public void j(Context context, AttributeSet attributeSet) {
        Object next;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0819a.f9311e);
        kotlin.jvm.internal.i.d(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.f9147l = 0;
            this.f9142c = null;
        } else {
            if (e4.m.q0(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            this.f9147l = strConcat.hashCode();
            this.f9142c = null;
            f(new v(strConcat, null, null));
        }
        ArrayList arrayList = this.f9144e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = ((v) next).f9119a;
            String str2 = this.f9148m;
            if (kotlin.jvm.internal.i.a(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : "")) {
                break;
            }
        }
        kotlin.jvm.internal.u.a(arrayList);
        arrayList.remove(next);
        this.f9148m = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f9147l = resourceId;
            this.f9142c = null;
            this.f9142c = AbstractC0156x.J(context, resourceId);
        }
        this.f9143d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f9142c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f9147l));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f9148m;
        if (str2 != null && !e4.m.q0(str2)) {
            sb.append(" route=");
            sb.append(this.f9148m);
        }
        if (this.f9143d != null) {
            sb.append(" label=");
            sb.append(this.f9143d);
        }
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }
}
