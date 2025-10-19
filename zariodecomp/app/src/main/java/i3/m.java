package I3;

import z3.AbstractC1080d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\m.smali */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1958a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1959b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1080d f1960c;

    public m(n nVar, AbstractC1080d abstractC1080d, int i) {
        this.f1958a = i;
        switch (i) {
            case 1:
                S0.f.g("success rate ejection config is null", nVar.f1965e != null);
                this.f1959b = nVar;
                this.f1960c = abstractC1080d;
                break;
            default:
                this.f1959b = nVar;
                this.f1960c = abstractC1080d;
                break;
        }
    }
}
