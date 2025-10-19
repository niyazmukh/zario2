package b;

import A.AbstractC0000a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.InterfaceC0239t;
import d.C0435a;
import d.C0439f;
import d.C0440g;
import d.C0441h;
import d.InterfaceC0436b;
import g0.AbstractActivityC0570w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\g.smali */
public final class C0250g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4888a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4889b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4890c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4891d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f4892e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4893f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4894g = new Bundle();
    public final /* synthetic */ AbstractActivityC0570w h;

    public C0250g(AbstractActivityC0570w abstractActivityC0570w) {
        this.h = abstractActivityC0570w;
    }

    public final boolean a(int i, int i5, Intent intent) {
        String str = (String) this.f4888a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0439f c0439f = (C0439f) this.f4892e.get(str);
        if (c0439f != null) {
            InterfaceC0436b interfaceC0436b = c0439f.f6775a;
            if (this.f4891d.contains(str)) {
                interfaceC0436b.j(c0439f.f6776b.T(intent, i5));
                this.f4891d.remove(str);
                return true;
            }
        }
        this.f4893f.remove(str);
        this.f4894g.putParcelable(str, new C0435a(intent, i5));
        return true;
    }

    public final void b(int i, S0.f fVar, Object obj) {
        Bundle bundle;
        AbstractActivityC0570w abstractActivityC0570w = this.h;
        g1.i iVarJ = fVar.J(abstractActivityC0570w, obj);
        if (iVarJ != null) {
            new Handler(Looper.getMainLooper()).post(new F1.b(this, i, iVarJ, 3));
            return;
        }
        Intent intentX = fVar.x(abstractActivityC0570w, obj);
        if (intentX.getExtras() != null && intentX.getExtras().getClassLoader() == null) {
            intentX.setExtrasClassLoader(abstractActivityC0570w.getClassLoader());
        }
        if (intentX.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentX.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentX.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentX.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentX.getAction())) {
                AbstractC0000a.b(abstractActivityC0570w, intentX, i, bundle);
                return;
            }
            C0441h c0441h = (C0441h) intentX.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC0000a.c(abstractActivityC0570w, c0441h.f6779a, i, c0441h.f6780b, c0441h.f6781c, c0441h.f6782d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new F1.b(this, i, e5, 4));
                return;
            }
        }
        String[] stringArrayExtra = intentX.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
            if (TextUtils.isEmpty(stringArrayExtra[i5])) {
                throw new IllegalArgumentException(B.a.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i5], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr[i6] = stringArrayExtra[i7];
                    i6++;
                }
            }
        }
        A.b.b(abstractActivityC0570w, stringArrayExtra, i);
    }

    public final d.e c(String str, S0.f fVar, InterfaceC0436b interfaceC0436b) {
        d(str);
        this.f4892e.put(str, new C0439f(interfaceC0436b, fVar));
        HashMap map = this.f4893f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0436b.j(obj);
        }
        Bundle bundle = this.f4894g;
        C0435a c0435a = (C0435a) bundle.getParcelable(str);
        if (c0435a != null) {
            bundle.remove(str);
            interfaceC0436b.j(fVar.T(c0435a.f6766b, c0435a.f6765a));
        }
        return new d.e(this, str, fVar, 1);
    }

    public final void d(String str) {
        HashMap map = this.f4889b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        Z3.e.f4014a.getClass();
        int iB = Z3.e.f4015b.b(2147418112);
        while (true) {
            int i = iB + 65536;
            HashMap map2 = this.f4888a;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                Z3.e.f4014a.getClass();
                iB = Z3.e.f4015b.b(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f4891d.contains(str) && (num = (Integer) this.f4889b.remove(str)) != null) {
            this.f4888a.remove(num);
        }
        this.f4892e.remove(str);
        HashMap map = this.f4893f;
        if (map.containsKey(str)) {
            StringBuilder sbO = B.a.o("Dropping pending result for request ", str, ": ");
            sbO.append(map.get(str));
            Log.w("ActivityResultRegistry", sbO.toString());
            map.remove(str);
        }
        Bundle bundle = this.f4894g;
        if (bundle.containsKey(str)) {
            StringBuilder sbO2 = B.a.o("Dropping pending result for request ", str, ": ");
            sbO2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbO2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f4890c;
        C0440g c0440g = (C0440g) map2.get(str);
        if (c0440g != null) {
            ArrayList arrayList = c0440g.f6778b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0440g.f6777a.f((InterfaceC0239t) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
