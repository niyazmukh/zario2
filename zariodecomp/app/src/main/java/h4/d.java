package h4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\d.smali */
public final /* synthetic */ class d extends kotlin.jvm.internal.h implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i5, int i6) {
        super(i, obj, cls, str, str2, i5);
        this.f7776a = i6;
    }

    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f7776a) {
            case 0:
                X3.l lVar = ((g) this.receiver).f7793b;
                kotlin.jvm.internal.i.b(lVar);
                k4.a.a(lVar, obj2, (O3.i) obj3);
                break;
            default:
                Object obj4 = ((n) obj2).f7817a;
                O3.i iVar = (O3.i) obj3;
                X3.l lVar2 = ((g) this.receiver).f7793b;
                kotlin.jvm.internal.i.b(lVar2);
                if (obj4 instanceof m) {
                    obj4 = null;
                }
                kotlin.jvm.internal.i.b(obj4);
                k4.a.a(lVar2, obj4, iVar);
                break;
        }
        return K3.k.f2288a;
    }
}
