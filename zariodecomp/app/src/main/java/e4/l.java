package e4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\l.smali */
public final class l extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(1);
        this.f6959a = i;
        this.f6960b = str;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f6959a) {
            case 0:
                b4.f it = (b4.f) obj;
                kotlin.jvm.internal.i.e(it, "it");
                String str = this.f6960b;
                kotlin.jvm.internal.i.e(str, "<this>");
                return str.subSequence(((b4.d) it).a, ((b4.d) it).b + 1).toString();
            case 1:
                return Boolean.valueOf(kotlin.jvm.internal.i.a((String) obj, this.f6960b));
            default:
                K3.e it2 = (K3.e) obj;
                kotlin.jvm.internal.i.e(it2, "it");
                return Boolean.valueOf(kotlin.jvm.internal.i.a(it2.f2277a, this.f6960b));
        }
    }
}
