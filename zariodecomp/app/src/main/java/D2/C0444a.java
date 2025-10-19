package d2;

import Q1.i;
import U1.d;
import X1.f;
import X1.h;
import X1.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d2.1\a.smali */
public final class C0444a extends h implements Q1.h {

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f6783B;

    /* renamed from: C, reason: collision with root package name */
    public final Context f6784C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint.FontMetrics f6785D;

    /* renamed from: E, reason: collision with root package name */
    public final i f6786E;

    /* renamed from: F, reason: collision with root package name */
    public final E1.a f6787F;
    public final Rect G;

    /* renamed from: H, reason: collision with root package name */
    public int f6788H;

    /* renamed from: I, reason: collision with root package name */
    public int f6789I;

    /* renamed from: J, reason: collision with root package name */
    public int f6790J;

    /* renamed from: K, reason: collision with root package name */
    public int f6791K;

    /* renamed from: L, reason: collision with root package name */
    public int f6792L;

    /* renamed from: M, reason: collision with root package name */
    public int f6793M;

    /* renamed from: N, reason: collision with root package name */
    public float f6794N;

    /* renamed from: O, reason: collision with root package name */
    public float f6795O;

    /* renamed from: P, reason: collision with root package name */
    public float f6796P;

    /* renamed from: Q, reason: collision with root package name */
    public float f6797Q;

    public C0444a(Context context, int i) {
        super(context, null, 0, i);
        this.f6785D = new Paint.FontMetrics();
        i iVar = new i(this);
        this.f6786E = iVar;
        this.f6787F = new E1.a(this, 1);
        this.G = new Rect();
        this.f6794N = 1.0f;
        this.f6795O = 1.0f;
        this.f6796P = 0.5f;
        this.f6797Q = 1.0f;
        this.f6784C = context;
        TextPaint textPaint = iVar.f2796a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fU = u();
        float f2 = (float) (-((Math.sqrt(2.0d) * this.f6792L) - this.f6792L));
        canvas.scale(this.f6794N, this.f6795O, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f6796P) + getBounds().top);
        canvas.translate(fU, f2);
        super.draw(canvas);
        if (this.f6783B != null) {
            float fCenterY = getBounds().centerY();
            i iVar = this.f6786E;
            TextPaint textPaint = iVar.f2796a;
            Paint.FontMetrics fontMetrics = this.f6785D;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d dVar = iVar.f2801f;
            TextPaint textPaint2 = iVar.f2796a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f2801f.e(this.f6784C, textPaint2, iVar.f2797b);
                textPaint2.setAlpha((int) (this.f6797Q * 255.0f));
            }
            CharSequence charSequence = this.f6783B;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f6786E.f2796a.getTextSize(), this.f6790J);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2 = this.f6788H * 2;
        CharSequence charSequence = this.f6783B;
        return (int) Math.max(f2 + (charSequence == null ? 0.0f : this.f6786E.a(charSequence.toString())), this.f6789I);
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        l lVarE = this.f3738a.f3722a.e();
        lVarE.f3771k = v();
        setShapeAppearanceModel(lVarE.a());
    }

    public final float u() {
        int i;
        Rect rect = this.G;
        if (((rect.right - getBounds().right) - this.f6793M) - this.f6791K < 0) {
            i = ((rect.right - getBounds().right) - this.f6793M) - this.f6791K;
        } else {
            if (((rect.left - getBounds().left) - this.f6793M) + this.f6791K <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f6793M) + this.f6791K;
        }
        return i;
    }

    public final X1.i v() {
        float f2 = -u();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f6792L))) / 2.0f;
        return new X1.i(new f(this.f6792L), Math.min(Math.max(f2, -fWidth), fWidth));
    }
}
