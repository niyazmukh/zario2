package d4;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d4\k.smali */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6814a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6815b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.j f6816c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e eVar, X3.l lVar, int i) {
        this.f6814a = i;
        switch (i) {
            case 1:
                this.f6815b = eVar;
                this.f6816c = (kotlin.jvm.internal.j) lVar;
                break;
            default:
                this.f6815b = eVar;
                this.f6816c = (kotlin.jvm.internal.j) lVar;
                break;
        }
    }

    @Override // d4.e
    public final Iterator iterator() {
        switch (this.f6814a) {
            case 0:
                return new c(this);
            case 1:
                return new l(this);
            default:
                return new d(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(i iVar, X3.l lVar) {
        this.f6814a = 2;
        this.f6815b = iVar;
        this.f6816c = (kotlin.jvm.internal.j) lVar;
    }
}
