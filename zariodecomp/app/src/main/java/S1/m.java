package S1;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\m.smali */
public abstract class m extends Drawable implements Animatable {

    /* renamed from: o, reason: collision with root package name */
    public static final F0.c f2985o = new F0.c(Float.class, "growFraction", 9);

    /* renamed from: a, reason: collision with root package name */
    public final Context f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2987b;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f2989d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f2990e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2991f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2992k;

    /* renamed from: l, reason: collision with root package name */
    public float f2993l;

    /* renamed from: n, reason: collision with root package name */
    public int f2995n;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f2994m = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public a f2988c = new a();

    public m(Context context, e eVar) {
        this.f2986a = context;
        this.f2987b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f2987b;
        if (eVar.f2957e == 0 && eVar.f2958f == 0) {
            return 1.0f;
        }
        return this.f2993l;
    }

    public final boolean c() {
        ObjectAnimator objectAnimator = this.f2990e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean d() {
        ObjectAnimator objectAnimator = this.f2989d;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean e(boolean z4, boolean z5, boolean z6) {
        a aVar = this.f2988c;
        ContentResolver contentResolver = this.f2986a.getContentResolver();
        aVar.getClass();
        return f(z4, z5, z6 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean f(boolean z4, boolean z5, boolean z6) {
        int i = 1;
        int i5 = 0;
        ObjectAnimator objectAnimator = this.f2989d;
        F0.c cVar = f2985o;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, cVar, 0.0f, 1.0f);
            this.f2989d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f2989d.setInterpolator(B1.a.f284b);
            ObjectAnimator objectAnimator2 = this.f2989d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f2989d = objectAnimator2;
            objectAnimator2.addListener(new l(this, i5));
        }
        if (this.f2990e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, cVar, 1.0f, 0.0f);
            this.f2990e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f2990e.setInterpolator(B1.a.f284b);
            ObjectAnimator objectAnimator3 = this.f2990e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f2990e = objectAnimator3;
            objectAnimator3.addListener(new l(this, i));
        }
        if (!isVisible() && !z4) {
            return false;
        }
        ObjectAnimator objectAnimator4 = z4 ? this.f2989d : this.f2990e;
        ObjectAnimator objectAnimator5 = z4 ? this.f2990e : this.f2989d;
        if (!z6) {
            if (objectAnimator5.isRunning()) {
                boolean z7 = this.f2992k;
                this.f2992k = true;
                new ValueAnimator[]{objectAnimator5}[0].cancel();
                this.f2992k = z7;
            }
            if (objectAnimator4.isRunning()) {
                objectAnimator4.end();
            } else {
                boolean z8 = this.f2992k;
                this.f2992k = true;
                new ValueAnimator[]{objectAnimator4}[0].end();
                this.f2992k = z8;
            }
            return super.setVisible(z4, false);
        }
        if (z6 && objectAnimator4.isRunning()) {
            return false;
        }
        boolean z9 = !z4 || super.setVisible(z4, false);
        e eVar = this.f2987b;
        if (!z4 ? eVar.f2958f != 0 : eVar.f2957e != 0) {
            boolean z10 = this.f2992k;
            this.f2992k = true;
            new ValueAnimator[]{objectAnimator4}[0].end();
            this.f2992k = z10;
            return z9;
        }
        if (z5 || !objectAnimator4.isPaused()) {
            objectAnimator4.start();
        } else {
            objectAnimator4.resume();
        }
        return z9;
    }

    public final void g(c cVar) {
        ArrayList arrayList = this.f2991f;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f2991f.remove(cVar);
        if (this.f2991f.isEmpty()) {
            this.f2991f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2995n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return d() || c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2995n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2994m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        return e(z4, z5, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
