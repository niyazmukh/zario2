package s3;

import java.util.function.BiFunction;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\o.smali */
public final /* synthetic */ class o implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9793a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f9793a) {
            case 0:
                return (Integer) s.f9795a.invoke(obj, obj2);
            case 1:
                return (Integer) t.f9796a.invoke(obj, obj2);
            case 2:
                return (Integer) u.f9797a.invoke(obj, obj2);
            default:
                return (Integer) v.f9798a.invoke(obj, obj2);
        }
    }
}
