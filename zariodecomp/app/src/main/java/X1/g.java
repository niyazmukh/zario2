package X1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\g.smali */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f3722a;

    /* renamed from: b, reason: collision with root package name */
    public O1.a f3723b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3724c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f3725d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3726e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3727f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f3728g;
    public final float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3729j;

    /* renamed from: k, reason: collision with root package name */
    public int f3730k;

    /* renamed from: l, reason: collision with root package name */
    public float f3731l;

    /* renamed from: m, reason: collision with root package name */
    public float f3732m;

    /* renamed from: n, reason: collision with root package name */
    public int f3733n;

    /* renamed from: o, reason: collision with root package name */
    public int f3734o;

    /* renamed from: p, reason: collision with root package name */
    public int f3735p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f3736q;

    public g(m mVar) {
        this.f3724c = null;
        this.f3725d = null;
        this.f3726e = null;
        this.f3727f = PorterDuff.Mode.SRC_IN;
        this.f3728g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f3730k = 255;
        this.f3731l = 0.0f;
        this.f3732m = 0.0f;
        this.f3733n = 0;
        this.f3734o = 0;
        this.f3735p = 0;
        this.f3736q = Paint.Style.FILL_AND_STROKE;
        this.f3722a = mVar;
        this.f3723b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f3742e = true;
        return hVar;
    }

    public g(g gVar) {
        this.f3724c = null;
        this.f3725d = null;
        this.f3726e = null;
        this.f3727f = PorterDuff.Mode.SRC_IN;
        this.f3728g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f3730k = 255;
        this.f3731l = 0.0f;
        this.f3732m = 0.0f;
        this.f3733n = 0;
        this.f3734o = 0;
        this.f3735p = 0;
        this.f3736q = Paint.Style.FILL_AND_STROKE;
        this.f3722a = gVar.f3722a;
        this.f3723b = gVar.f3723b;
        this.f3729j = gVar.f3729j;
        this.f3724c = gVar.f3724c;
        this.f3725d = gVar.f3725d;
        this.f3727f = gVar.f3727f;
        this.f3726e = gVar.f3726e;
        this.f3730k = gVar.f3730k;
        this.h = gVar.h;
        this.f3735p = gVar.f3735p;
        this.f3733n = gVar.f3733n;
        this.i = gVar.i;
        this.f3731l = gVar.f3731l;
        this.f3732m = gVar.f3732m;
        this.f3734o = gVar.f3734o;
        this.f3736q = gVar.f3736q;
        if (gVar.f3728g != null) {
            this.f3728g = new Rect(gVar.f3728g);
        }
    }
}
