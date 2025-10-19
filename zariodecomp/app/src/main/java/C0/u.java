package c0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import d0.C0442a;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\u.smali */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final n f5394b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f5393a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f5395c = 1.0f;

    public u(n nVar) {
        r1.d.m(nVar, "metadata cannot be null");
        this.f5394b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i5, float f2, int i6, int i7, int i8, Paint paint) {
        i.a().getClass();
        n nVar = this.f5394b;
        S0.i iVar = nVar.f5371b;
        Typeface typeface = (Typeface) iVar.f2861d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) iVar.f2859b, nVar.f5370a * 2, 2, f2, i7, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5393a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f5394b;
        this.f5395c = fAbs / (nVar.c().a(14) != 0 ? ((ByteBuffer) r8.f2436d).getShort(r1 + r8.f2433a) : (short) 0);
        C0442a c0442aC = nVar.c();
        int iA = c0442aC.a(14);
        if (iA != 0) {
            ((ByteBuffer) c0442aC.f2436d).getShort(iA + c0442aC.f2433a);
        }
        short s4 = (short) ((nVar.c().a(12) != 0 ? ((ByteBuffer) r5.f2436d).getShort(r7 + r5.f2433a) : (short) 0) * this.f5395c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }
}
