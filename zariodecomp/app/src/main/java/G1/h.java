package g1;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0346h;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import k1.C0657a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\h.smali */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0657a f7591a = new C0657a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.F(context).G();
        Set set = o.f5652a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0346h.a();
    }
}
