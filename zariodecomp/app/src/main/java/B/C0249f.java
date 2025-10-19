package b;

import android.os.Bundle;
import c.InterfaceC0332a;
import g0.AbstractActivityC0570w;
import g0.C0569v;
import java.util.ArrayList;
import java.util.HashMap;
import l.C0708q;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\f.smali */
public final /* synthetic */ class C0249f implements InterfaceC0332a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0570w f4887b;

    public /* synthetic */ C0249f(AbstractActivityC0570w abstractActivityC0570w, int i) {
        this.f4886a = i;
        this.f4887b = abstractActivityC0570w;
    }

    @Override // c.InterfaceC0332a
    public final void a() {
        switch (this.f4886a) {
            case 0:
                AbstractActivityC0570w abstractActivityC0570w = this.f4887b;
                Bundle bundleC = ((C0708q) abstractActivityC0570w.f4906e.f88c).c("android:support:activity-result");
                if (bundleC != null) {
                    C0250g c0250g = abstractActivityC0570w.f4912o;
                    c0250g.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0250g.f4891d = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0250g.f4894g;
                        bundle2.putAll(bundle);
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            HashMap map = c0250g.f4889b;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = c0250g.f4888a;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            map2.put(num2, str2);
                            map.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                C0569v c0569v = (C0569v) this.f4887b.f7557w.f7641b;
                c0569v.f7554d.b(c0569v, c0569v, null);
                break;
        }
    }
}
