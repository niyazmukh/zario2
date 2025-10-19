package S1;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\p.smali */
public final class p extends m {

    /* renamed from: p, reason: collision with root package name */
    public final n f3001p;

    /* renamed from: q, reason: collision with root package name */
    public o f3002q;

    public p(Context context, e eVar, n nVar, o oVar) {
        super(context, eVar);
        this.f3001p = nVar;
        nVar.f2997b = this;
        this.f3002q = oVar;
        oVar.f2998a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        n nVar = this.f3001p;
        Rect bounds = getBounds();
        float fB = b();
        nVar.f2996a.a();
        nVar.a(canvas, bounds, fB);
        n nVar2 = this.f3001p;
        Paint paint = this.f2994m;
        nVar2.c(canvas, paint);
        int i = 0;
        while (true) {
            o oVar = this.f3002q;
            int[] iArr = (int[]) oVar.f3000c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            n nVar3 = this.f3001p;
            float[] fArr = (float[]) oVar.f2999b;
            int i5 = i * 2;
            nVar3.b(canvas, paint, fArr[i5], fArr[i5 + 1], iArr[i]);
            i++;
        }
    }

    @Override // S1.m
    public final boolean f(boolean z4, boolean z5, boolean z6) {
        boolean zF = super.f(z4, z5, z6);
        if (!isRunning()) {
            this.f3002q.b();
        }
        a aVar = this.f2988c;
        ContentResolver contentResolver = this.f2986a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z4 && z6) {
            this.f3002q.s();
        }
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3001p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3001p.e();
    }
}
