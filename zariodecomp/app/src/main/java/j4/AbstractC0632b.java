package j4;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\b.1.smali */
public abstract class AbstractC0632b {

    /* renamed from: a, reason: collision with root package name */
    public static final O3.d[] f8070a = new O3.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final h1.i f8071b = new h1.i("NULL", 18);

    /* renamed from: c, reason: collision with root package name */
    public static final h1.i f8072c = new h1.i("UNINITIALIZED", 18);

    public static final Object a(O3.i iVar, Object obj, Object obj2, X3.p pVar, O3.d frame) {
        Object objInvoke;
        Object objN = k4.a.n(iVar, obj2);
        try {
            D d5 = new D(frame, iVar);
            if (pVar instanceof Q3.a) {
                kotlin.jvm.internal.u.c(2, pVar);
                objInvoke = pVar.invoke(obj, d5);
            } else {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                O3.i context = d5.getContext();
                Object bVar = context == O3.j.f2661a ? new P3.b(d5) : new P3.c(d5, context);
                kotlin.jvm.internal.u.c(2, pVar);
                objInvoke = pVar.invoke(obj, bVar);
            }
            k4.a.i(iVar, objN);
            if (objInvoke == P3.a.f2678a) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            k4.a.i(iVar, objN);
            throw th;
        }
    }
}
