package U1;

import N2.AbstractC0156x;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U1\c.smali */
public final class c extends AbstractC0156x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f3297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0156x f3299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f3300g;

    public c(d dVar, Context context, TextPaint textPaint, AbstractC0156x abstractC0156x) {
        this.f3300g = dVar;
        this.f3297d = context;
        this.f3298e = textPaint;
        this.f3299f = abstractC0156x;
    }

    @Override // N2.AbstractC0156x
    public final void S(int i) {
        this.f3299f.S(i);
    }

    @Override // N2.AbstractC0156x
    public final void T(Typeface typeface, boolean z4) {
        this.f3300g.g(this.f3297d, this.f3298e, typeface);
        this.f3299f.T(typeface, z4);
    }
}
