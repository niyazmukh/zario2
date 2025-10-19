package p2;

import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import java.util.HashMap;
import java.util.Map;
import k1.C0657a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\l.smali */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0657a f9355a = new C0657a("GetTokenResultFactory", new String[0]);

    public static o2.p a(String str) {
        Map map;
        try {
            map = k.b(str);
        } catch (zzaao e5) {
            f9355a.b("Error parsing token claims", e5, new Object[0]);
            map = new HashMap();
        }
        o2.p pVar = new o2.p();
        pVar.f9220a = str;
        pVar.f9221b = map;
        return pVar;
    }
}
