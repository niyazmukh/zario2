package Q1;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\i.smali */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f2798c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2800e;

    /* renamed from: f, reason: collision with root package name */
    public U1.d f2801f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2796a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final K1.b f2797b = new K1.b(this, 1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2799d = true;

    public i(h hVar) {
        this.f2800e = new WeakReference(null);
        this.f2800e = new WeakReference(hVar);
    }

    public final float a(String str) {
        if (!this.f2799d) {
            return this.f2798c;
        }
        TextPaint textPaint = this.f2796a;
        this.f2798c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f2799d = false;
        return this.f2798c;
    }

    public final void b(U1.d dVar, Context context) {
        if (this.f2801f != dVar) {
            this.f2801f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f2796a;
                K1.b bVar = this.f2797b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) this.f2800e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f2799d = true;
            }
            h hVar2 = (h) this.f2800e.get();
            if (hVar2 != null) {
                hVar2.a();
                hVar2.onStateChange(hVar2.getState());
            }
        }
    }
}
