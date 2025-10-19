package K0;

import A2.RunnableC0012l;
import L3.x;
import S0.v;
import androidx.work.impl.WorkDatabase;
import b3.C0283G;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import w2.B;
import y2.C1049B;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\e.smali */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2134d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f2131a = i;
        this.f2132b = obj;
        this.f2133c = obj2;
        this.f2134d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2131a) {
            case 0:
                WorkDatabase workDatabase = ((f) this.f2132b).f2140e;
                v vVarW = workDatabase.w();
                String str = (String) this.f2134d;
                ((ArrayList) this.f2133c).addAll(vVarW.d(str));
                return workDatabase.v().k(str);
            case 1:
                r2.f fVar = (r2.f) this.f2132b;
                fVar.getClass();
                return fVar.f9631a.submit(new RunnableC0012l(23, (Callable) this.f2133c, (g1.i) this.f2134d));
            default:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f2132b;
                firebaseFirestore.getClass();
                v vVar = new v((C1049B) this.f2134d, firebaseFirestore);
                C0283G c0283g = (C0283G) this.f2133c;
                Map mapB0 = x.b0(new K3.e("pointsBalance", Integer.valueOf(c0283g.f5137b)));
                B b5 = B.f10913b;
                vVar.j(c0283g.f5136a, mapB0, b5);
                vVar.j(c0283g.f5138c, (Map) c0283g.f5139d, b5);
                return vVar;
        }
    }
}
