package S0;

import A2.C0006f;
import A2.RunnableC0005e;
import A2.e0;
import E2.EnumC0105h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import b3.C0326u;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0542J;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import u0.AbstractC0967h;
import u0.C0955C;
import u0.C0964e;
import z2.C1071b;
import z3.C1077a;
import z3.C1078b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\e.smali */
public final class e implements e0, X2.a, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public Object f2851a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2852b;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f2851a = obj;
        this.f2852b = obj2;
    }

    public static int s(int i, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    public List A(String workSpecId) {
        List listU0;
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        synchronized (this.f2851a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2852b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.i.a(((j) entry.getKey()).f2862a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f2852b).remove((j) it.next());
                }
                listU0 = L3.j.u0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listU0;
    }

    public void B(C1077a c1077a, Object obj) {
        if (((IdentityHashMap) this.f2852b) == null) {
            this.f2852b = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f2852b).put(c1077a, obj);
    }

    public K0.l C(j jVar) {
        K0.l lVar;
        synchronized (this.f2851a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2852b;
                Object lVar2 = linkedHashMap.get(jVar);
                if (lVar2 == null) {
                    lVar2 = new K0.l(jVar);
                    linkedHashMap.put(jVar, lVar2);
                }
                lVar = (K0.l) lVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public C1078b a() {
        if (((IdentityHashMap) this.f2852b) != null) {
            for (Map.Entry entry : ((C1078b) this.f2851a).f11280a.entrySet()) {
                if (!((IdentityHashMap) this.f2852b).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f2852b).put((C1077a) entry.getKey(), entry.getValue());
                }
            }
            this.f2851a = new C1078b((IdentityHashMap) this.f2852b);
            this.f2852b = null;
        }
        return (C1078b) this.f2851a;
    }

    public boolean b(j jVar) {
        boolean zContainsKey;
        synchronized (this.f2851a) {
            zContainsKey = ((LinkedHashMap) this.f2852b).containsKey(jVar);
        }
        return zContainsKey;
    }

    public void c(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void d(boolean z4) {
        C0542J c0542j = (C0542J) this.f2852b;
        AbstractActivityC0570w abstractActivityC0570w = c0542j.f7347u.f7552b;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0542j.f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void e(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void f(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z4) {
        C0542J c0542j = (C0542J) this.f2852b;
        AbstractActivityC0570w abstractActivityC0570w = c0542j.f7347u.f7552b;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0542j.f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void m(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = GenericIdpActivity.f6388D;
        Intent intent = new Intent("android.intent.action.VIEW");
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f2851a;
        ResolveInfo resolveInfoResolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
        String str = (String) this.f2852b;
        if (resolveInfoResolveActivity == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent2.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            genericIdpActivity.startActivity(intent2);
            return;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            I.e.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent3.putExtras(bundle);
        }
        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent3.putExtras(new Bundle());
        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
        intent3.setData((Uri) task.getResult());
        B.l.startActivity(genericIdpActivity, intent3, null);
    }

    public void p(boolean z4) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((C0542J) this.f2852b).f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            abstractComponentCallbacksC0567t.p().f7339m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2851a).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public O0.i q(String str, List list) {
        StringBuilder sbB = t.h.b("\n        SELECT * FROM evaluation_history\n        WHERE userId IN (");
        int size = list.size();
        u0.o.a(size, sbB);
        sbB.append(")");
        sbB.append("\n");
        sbB.append("           OR (userEmail = ");
        sbB.append("?");
        sbB.append(" AND userId = '')");
        sbB.append("\n");
        sbB.append("        ORDER BY evaluationEndTime DESC");
        int i = 1;
        int i5 = size + 1;
        C0955C c0955cK = C0955C.k(i5, B.a.m(sbB, "\n", "        "));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                c0955cK.f(i);
            } else {
                c0955cK.c(i, str2);
            }
            i++;
        }
        if (str == null) {
            c0955cK.f(i5);
        } else {
            c0955cK.c(i5, str);
        }
        X2.b bVar = new X2.b(this, c0955cK, 1);
        return new O0.i(new C0964e((AppDatabase_Impl) this.f2851a, new String[]{"evaluation_history"}, bVar, null));
    }

    public Long r(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT long_value FROM Preference where `key`=?");
        c0955cK.c(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2851a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            Long lValueOf = null;
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    @Override // A2.e0
    public void start() {
        long j5 = C0006f.f186f;
        ((F2.f) this.f2851a).a(F2.e.f1702n, j5, new RunnableC0005e(this, 0));
    }

    public void t(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2851a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2852b).y(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public void u() {
        ((SparseIntArray) this.f2851a).clear();
    }

    public boolean v() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) this.f2851a).getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public Object w(List list, String str, C0326u c0326u) {
        StringBuilder sbB = t.h.b("\n        SELECT evaluationEndTime FROM evaluation_history\n        WHERE userId IN (");
        int size = list.size();
        u0.o.a(size, sbB);
        sbB.append(")");
        sbB.append("\n");
        sbB.append("           OR (userEmail = ");
        sbB.append("?");
        sbB.append(" AND userId = '')");
        sbB.append("\n");
        sbB.append("        ORDER BY evaluationEndTime DESC");
        sbB.append("\n");
        sbB.append("        LIMIT 1");
        sbB.append("\n");
        sbB.append("        ");
        int i = 1;
        int i5 = size + 1;
        C0955C c0955cK = C0955C.k(i5, sbB.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                c0955cK.f(i);
            } else {
                c0955cK.c(i, str2);
            }
            i++;
        }
        if (str == null) {
            c0955cK.f(i5);
        } else {
            c0955cK.c(i5, str);
        }
        return C1071b.e((AppDatabase_Impl) this.f2851a, false, new CancellationSignal(), new X2.b(this, c0955cK, 0), c0326u);
    }

    public void x(boolean z4) {
        synchronized (((ArrayList) this.f2852b)) {
            try {
                Iterator it = ((ArrayList) this.f2852b).iterator();
                while (it.hasNext()) {
                    ((F2.k) it.next()).a(z4 ? EnumC0105h.f1452b : EnumC0105h.f1451a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y() {
        p1.b.p(1, "AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (v()) {
            x(true);
        }
    }

    public K0.l z(j jVar) {
        K0.l lVar;
        synchronized (this.f2851a) {
            lVar = (K0.l) ((LinkedHashMap) this.f2852b).remove(jVar);
        }
        return lVar;
    }

    public e(int i) {
        switch (i) {
            case 11:
                this.f2851a = new SparseIntArray();
                this.f2852b = new SparseIntArray();
                break;
            default:
                this.f2851a = new Object();
                this.f2852b = new LinkedHashMap();
                break;
        }
    }

    public e(C1078b c1078b) {
        this.f2851a = c1078b;
    }
}
