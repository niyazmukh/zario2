package b;

import android.os.Bundle;
import g0.AbstractActivityC0570w;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\e.smali */
public final /* synthetic */ class C0248e implements x0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0570w f4885b;

    public /* synthetic */ C0248e(AbstractActivityC0570w abstractActivityC0570w, int i) {
        this.f4884a = i;
        this.f4885b = abstractActivityC0570w;
    }

    public final Bundle a() {
        switch (this.f4884a) {
            case 0:
                AbstractActivityC0570w abstractActivityC0570w = this.f4885b;
                Bundle bundle = new Bundle();
                C0250g c0250g = abstractActivityC0570w.f4912o;
                c0250g.getClass();
                HashMap map = c0250g.f4889b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0250g.f4891d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0250g.f4894g.clone());
                return bundle;
            default:
                AbstractActivityC0570w abstractActivityC0570w2 = this.f4885b;
                while (AbstractActivityC0570w.n(abstractActivityC0570w2.m())) {
                }
                abstractActivityC0570w2.f7558x.d(androidx.lifecycle.n.ON_STOP);
                return new Bundle();
        }
    }
}
