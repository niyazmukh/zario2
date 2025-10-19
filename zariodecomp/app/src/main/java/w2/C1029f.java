package w2;

import y2.C1053b;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\f.1.smali */
public final /* synthetic */ class C1029f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1053b f10926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.o f10927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.w f10928d;

    public /* synthetic */ C1029f(C1053b c1053b, y2.o oVar, y2.w wVar, int i) {
        this.f10925a = i;
        this.f10926b = c1053b;
        this.f10927c = oVar;
        this.f10928d = wVar;
    }

    public final void a() {
        switch (this.f10925a) {
            case 0:
                C1053b c1053b = this.f10926b;
                y2.o oVar = this.f10927c;
                y2.w wVar = this.f10928d;
                c1053b.f11080c = true;
                oVar.getClass();
                oVar.f11126d.b(new y2.n(oVar, wVar, 0));
                break;
            default:
                C1053b c1053b2 = this.f10926b;
                y2.o oVar2 = this.f10927c;
                y2.w wVar2 = this.f10928d;
                c1053b2.f11080c = true;
                oVar2.getClass();
                oVar2.f11126d.b(new y2.n(oVar2, wVar2, 0));
                break;
        }
    }
}
