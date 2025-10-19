package androidx.lifecycle;

import a.AbstractC0183a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\X.smali */
public final class X {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f4620f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4621a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4622b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4623c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4624d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.c f4625e;

    public X(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4621a = linkedHashMap;
        this.f4622b = new LinkedHashMap();
        this.f4623c = new LinkedHashMap();
        this.f4624d = new LinkedHashMap();
        this.f4625e = new W(this, 0);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(X this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        Iterator it = L3.x.f0(this$0.f4622b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f4621a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return AbstractC0183a.j(new K3.e("keys", arrayList), new K3.e("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleA = ((x0.c) entry.getValue()).a();
            kotlin.jvm.internal.i.e(key, "key");
            if (bundleA != null) {
                Class[] clsArr = f4620f;
                for (int i = 0; i < 29; i++) {
                    Class cls = clsArr[i];
                    kotlin.jvm.internal.i.b(cls);
                    if (!cls.isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = this$0.f4623c.get(key);
            G g3 = obj instanceof G ? (G) obj : null;
            if (g3 != null) {
                g3.j(bundleA);
            } else {
                linkedHashMap.put(key, bundleA);
            }
            i4.w wVar = (i4.w) this$0.f4624d.get(key);
            if (wVar != null) {
                ((i4.I) wVar).L(bundleA);
            }
        }
    }

    public X() {
        this.f4621a = new LinkedHashMap();
        this.f4622b = new LinkedHashMap();
        this.f4623c = new LinkedHashMap();
        this.f4624d = new LinkedHashMap();
        this.f4625e = new W(this, 0);
    }
}
