package f4;

/* renamed from: f4.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\y.1.smali */
public final /* synthetic */ class C0525y implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7109a;

    public /* synthetic */ C0525y(int i) {
        this.f7109a = i;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7109a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((O3.i) obj).plus((O3.g) obj2);
            case 2:
                return ((O3.i) obj).plus((O3.g) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                O3.g gVar = (O3.g) obj2;
                if (!(gVar instanceof k4.v)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 5:
                k4.v vVar = (k4.v) obj;
                O3.g gVar2 = (O3.g) obj2;
                if (vVar != null) {
                    return vVar;
                }
                if (gVar2 instanceof k4.v) {
                    return (k4.v) gVar2;
                }
                return null;
            case 6:
                k4.y yVar = (k4.y) obj;
                O3.g gVar3 = (O3.g) obj2;
                if (gVar3 instanceof k4.v) {
                    k4.v vVar2 = (k4.v) gVar3;
                    Object objB = vVar2.b(yVar.f8417a);
                    int i = yVar.f8420d;
                    yVar.f8418b[i] = objB;
                    yVar.f8420d = i + 1;
                    yVar.f8419c[i] = vVar2;
                }
                return yVar;
            default:
                Long old = (Long) obj;
                Long l4 = (Long) obj2;
                kotlin.jvm.internal.i.e(old, "old");
                kotlin.jvm.internal.i.e(l4, "new");
                return Long.valueOf(l4.longValue() + old.longValue());
        }
    }
}
