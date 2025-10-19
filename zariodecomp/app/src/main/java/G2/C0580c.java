package g2;

import kotlin.jvm.internal.i;
import y0.InterfaceC1045d;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g2.1\c.smali */
public final class C0580c implements y0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7601b;

    public C0580c(String query, int i) {
        this.f7600a = i;
        switch (i) {
            case 1:
                i.e(query, "query");
                this.f7601b = query;
                break;
            case 2:
                this.f7601b = query;
                break;
            default:
                query.getClass();
                this.f7601b = query;
                break;
        }
    }

    @Override // y0.e
    public void a(InterfaceC1045d interfaceC1045d) {
    }

    @Override // y0.e
    public String e() {
        return this.f7601b;
    }

    public String toString() {
        switch (this.f7600a) {
            case 2:
                return this.f7601b;
            default:
                return super.toString();
        }
    }
}
