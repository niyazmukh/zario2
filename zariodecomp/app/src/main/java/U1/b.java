package U1;

import N2.AbstractC0156x;
import android.graphics.Typeface;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U1\b.smali */
public final class b extends C.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0156x f3295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f3296f;

    public b(d dVar, AbstractC0156x abstractC0156x) {
        this.f3296f = dVar;
        this.f3295e = abstractC0156x;
    }

    @Override // C.b
    public final void g(int i) {
        this.f3296f.f3311m = true;
        this.f3295e.S(i);
    }

    @Override // C.b
    public final void h(Typeface typeface) {
        d dVar = this.f3296f;
        dVar.f3312n = Typeface.create(typeface, dVar.f3303c);
        dVar.f3311m = true;
        this.f3295e.T(dVar.f3312n, false);
    }
}
