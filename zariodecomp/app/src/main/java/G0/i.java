package G0;

import android.graphics.Paint;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\i.smali */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public C.d f1758d;

    /* renamed from: e, reason: collision with root package name */
    public float f1759e;

    /* renamed from: f, reason: collision with root package name */
    public C.d f1760f;

    /* renamed from: g, reason: collision with root package name */
    public float f1761g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1762j;

    /* renamed from: k, reason: collision with root package name */
    public float f1763k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f1764l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f1765m;

    /* renamed from: n, reason: collision with root package name */
    public float f1766n;

    @Override // G0.k
    public final boolean a() {
        return this.f1760f.d() || this.f1758d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // G0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r6) {
        /*
            r5 = this;
            C.d r0 = r5.f1760f
            boolean r1 = r0.d()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1048d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.f1046b
            if (r1 == r4) goto L1e
            r0.f1046b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            C.d r5 = r5.f1758d
            boolean r1 = r5.d()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.f1048d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.f1046b
            if (r6 == r1) goto L3a
            r5.f1046b = r6
            r2 = r3
        L3a:
            r5 = r0 | r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f1760f.f1046b;
    }

    public float getStrokeAlpha() {
        return this.f1761g;
    }

    public int getStrokeColor() {
        return this.f1758d.f1046b;
    }

    public float getStrokeWidth() {
        return this.f1759e;
    }

    public float getTrimPathEnd() {
        return this.f1762j;
    }

    public float getTrimPathOffset() {
        return this.f1763k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f1760f.f1046b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f1761g = f2;
    }

    public void setStrokeColor(int i) {
        this.f1758d.f1046b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f1759e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f1762j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f1763k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
