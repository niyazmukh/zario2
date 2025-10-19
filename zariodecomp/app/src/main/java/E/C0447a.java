package e;

import B.l;
import K3.e;
import L3.t;
import L3.x;
import S0.f;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import d.C0435a;
import d.C0441h;
import g0.AbstractActivityC0570w;
import g1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e.1\a.smali */
public final class C0447a extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6820b;

    public /* synthetic */ C0447a(int i) {
        this.f6820b = i;
    }

    @Override // S0.f
    public i J(AbstractActivityC0570w abstractActivityC0570w, Object obj) {
        switch (this.f6820b) {
            case 0:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.i.e(input, "input");
                if (input.length == 0) {
                    return new i(t.f2352a, 15);
                }
                for (String str : input) {
                    if (l.checkSelfPermission(abstractActivityC0570w, str) != 0) {
                        return null;
                    }
                }
                int iA0 = x.a0(input.length);
                if (iA0 < 16) {
                    iA0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA0);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new i(linkedHashMap, 15);
            case 1:
                String input2 = (String) obj;
                kotlin.jvm.internal.i.e(input2, "input");
                if (l.checkSelfPermission(abstractActivityC0570w, input2) == 0) {
                    return new i(Boolean.TRUE, 15);
                }
                return null;
            default:
                return super.J(abstractActivityC0570w, obj);
        }
    }

    @Override // S0.f
    public final Object T(Intent intent, int i) {
        switch (this.f6820b) {
            case 0:
                t tVar = t.f2352a;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i5 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i5 == 0));
                        }
                        ArrayList arrayListV0 = L3.i.v0(stringArrayExtra);
                        Iterator it = arrayListV0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(L3.l.a0(arrayListV0), L3.l.a0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new e(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z4 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length) {
                                if (intArrayExtra2[i6] == 0) {
                                    z4 = true;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new C0435a(intent, i);
    }

    @Override // S0.f
    public final Intent x(AbstractActivityC0570w abstractActivityC0570w, Object obj) {
        Bundle bundleExtra;
        switch (this.f6820b) {
            case 0:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.i.e(input, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                kotlin.jvm.internal.i.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 1:
                String input2 = (String) obj;
                kotlin.jvm.internal.i.e(input2, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input2});
                kotlin.jvm.internal.i.d(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 2:
                Intent input3 = (Intent) obj;
                kotlin.jvm.internal.i.e(input3, "input");
                return input3;
            default:
                C0441h c0441h = (C0441h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0441h.f6780b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0441h = new C0441h(c0441h.f6779a, null, c0441h.f6781c, c0441h.f6782d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0441h);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }
}
