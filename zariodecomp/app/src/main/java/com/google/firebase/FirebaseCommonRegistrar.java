package com.google.firebase;

import A2.C0004d;
import A2.T;
import E2.n;
import G2.d;
import G2.e;
import G2.f;
import G2.g;
import K2.a;
import K2.b;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import m2.InterfaceC0744a;
import q2.C0849a;
import q2.i;
import q2.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\FirebaseCommonRegistrar.smali */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(b.class));
        for (Class cls : new Class[0]) {
            p1.b.k(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVar = new i(2, 0, a.class);
        if (hashSet.contains(iVar.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        arrayList.add(new C0849a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new n(2), hashSet3));
        q qVar = new q(InterfaceC0744a.class, Executor.class);
        T t4 = new T(d.class, new Class[]{f.class, g.class});
        t4.k(i.a(Context.class));
        t4.k(i.a(l2.f.class));
        t4.k(new i(2, 0, e.class));
        t4.k(new i(1, 1, b.class));
        t4.k(new i(qVar, 1, 0));
        t4.f137e = new C0004d(qVar, 5);
        arrayList.add(t4.m());
        arrayList.add(r1.d.r("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(r1.d.r("fire-core", "22.0.1"));
        arrayList.add(r1.d.r("device-name", a(Build.PRODUCT)));
        arrayList.add(r1.d.r("device-model", a(Build.DEVICE)));
        arrayList.add(r1.d.r("device-brand", a(Build.BRAND)));
        arrayList.add(r1.d.v("android-target-sdk", new n(5)));
        arrayList.add(r1.d.v("android-min-sdk", new n(6)));
        arrayList.add(r1.d.v("android-platform", new n(7)));
        arrayList.add(r1.d.v("android-installer", new n(8)));
        try {
            K3.b.f2274b.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(r1.d.r("kotlin", str));
        }
        return arrayList;
    }
}
