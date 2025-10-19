package S1;

import A2.C0009i;
import N2.AbstractC0156x;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import b0.C0257b;
import b0.ChoreographerFrameCallbackC0256a;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\k.smali */
public final class k extends m {

    /* renamed from: u, reason: collision with root package name */
    public static final j f2977u = new j();

    /* renamed from: p, reason: collision with root package name */
    public final n f2978p;

    /* renamed from: q, reason: collision with root package name */
    public final b0.f f2979q;

    /* renamed from: r, reason: collision with root package name */
    public final b0.e f2980r;

    /* renamed from: s, reason: collision with root package name */
    public float f2981s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2982t;

    public k(Context context, e eVar, n nVar) {
        super(context, eVar);
        this.f2982t = false;
        this.f2978p = nVar;
        nVar.f2997b = this;
        b0.f fVar = new b0.f();
        this.f2979q = fVar;
        fVar.f4976b = 1.0f;
        fVar.f4977c = false;
        fVar.f4975a = Math.sqrt(50.0f);
        fVar.f4977c = false;
        b0.e eVar2 = new b0.e(this);
        this.f2980r = eVar2;
        eVar2.f4972k = fVar;
        if (this.f2993l != 1.0f) {
            this.f2993l = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            n nVar = this.f2978p;
            Rect bounds = getBounds();
            float fB = b();
            nVar.f2996a.a();
            nVar.a(canvas, bounds, fB);
            n nVar2 = this.f2978p;
            Paint paint = this.f2994m;
            nVar2.c(canvas, paint);
            this.f2978p.b(canvas, paint, 0.0f, this.f2981s, AbstractC0156x.k(this.f2987b.f2955c[0], this.f2995n));
            canvas.restore();
        }
    }

    @Override // S1.m
    public final boolean f(boolean z4, boolean z5, boolean z6) {
        boolean zF = super.f(z4, z5, z6);
        a aVar = this.f2988c;
        ContentResolver contentResolver = this.f2986a.getContentResolver();
        aVar.getClass();
        float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f2 == 0.0f) {
            this.f2982t = true;
        } else {
            this.f2982t = false;
            float f3 = 50.0f / f2;
            b0.f fVar = this.f2979q;
            fVar.getClass();
            if (f3 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.f4975a = Math.sqrt(f3);
            fVar.f4977c = false;
        }
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2978p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2978p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f2980r.b();
        this.f2981s = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z4 = this.f2982t;
        b0.e eVar = this.f2980r;
        if (z4) {
            eVar.b();
            this.f2981s = i / 10000.0f;
            invalidateSelf();
        } else {
            eVar.f4965b = this.f2981s * 10000.0f;
            eVar.f4966c = true;
            float f2 = i;
            if (eVar.f4969f) {
                eVar.f4973l = f2;
            } else {
                if (eVar.f4972k == null) {
                    eVar.f4972k = new b0.f(f2);
                }
                b0.f fVar = eVar.f4972k;
                double d5 = f2;
                fVar.i = d5;
                double d6 = (float) d5;
                if (d6 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d6 < -3.4028235E38f) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(eVar.h * 0.75f);
                fVar.f4978d = dAbs;
                fVar.f4979e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z5 = eVar.f4969f;
                if (!z5 && !z5) {
                    eVar.f4969f = true;
                    if (!eVar.f4966c) {
                        eVar.f4968e.getClass();
                        eVar.f4965b = eVar.f4967d.f2981s * 10000.0f;
                    }
                    float f3 = eVar.f4965b;
                    if (f3 > Float.MAX_VALUE || f3 < -3.4028235E38f) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal threadLocal = C0257b.f4950f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new C0257b());
                    }
                    C0257b c0257b = (C0257b) threadLocal.get();
                    ArrayList arrayList = c0257b.f4952b;
                    if (arrayList.size() == 0) {
                        if (c0257b.f4954d == null) {
                            c0257b.f4954d = new C0009i(c0257b.f4953c);
                        }
                        C0009i c0009i = c0257b.f4954d;
                        ((Choreographer) c0009i.f205c).postFrameCallback((ChoreographerFrameCallbackC0256a) c0009i.f206d);
                    }
                    if (!arrayList.contains(eVar)) {
                        arrayList.add(eVar);
                    }
                }
            }
        }
        return true;
    }
}
