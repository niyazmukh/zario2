package l;

import B.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q.AbstractC0827d;
import q.C0828e;
import q.C0835l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\H0.smali */
public final class H0 {

    /* renamed from: g, reason: collision with root package name */
    public static H0 f8451g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f8452a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f8453b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f8454c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8455d;

    /* renamed from: e, reason: collision with root package name */
    public E2.G f8456e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f8450f = PorterDuff.Mode.SRC_IN;
    public static final G0 h = new G0(6);

    public static synchronized H0 b() {
        try {
            if (f8451g == null) {
                f8451g = new H0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8451g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        G0 g02 = h;
        g02.getClass();
        int i5 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) g02.get(Integer.valueOf(mode.hashCode() + i5));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f8454c == null) {
            this.f8454c = new TypedValue();
        }
        TypedValue typedValue = this.f8454c;
        context.getResources().getValue(i, typedValue, true);
        long j5 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0828e c0828e = (C0828e) this.f8453b.get(context);
            drawableNewDrawable = null;
            if (c0828e != null && (weakReference = (WeakReference) c0828e.c(j5, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = AbstractC0827d.b(c0828e.f9407b, c0828e.f9409d, j5);
                    if (iB >= 0) {
                        Object[] objArr = c0828e.f9408c;
                        Object obj = objArr[iB];
                        Object obj2 = C0828e.f9405e;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            c0828e.f9406a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableL = null;
        if (this.f8456e != null) {
            if (i == 2131165241) {
                layerDrawableL = new LayerDrawable(new Drawable[]{c(context, 2131165240), c(context, 2131165242)});
            } else if (i == 2131165276) {
                layerDrawableL = E2.G.l(this, context, 2131099707);
            } else if (i == 2131165275) {
                layerDrawableL = E2.G.l(this, context, 2131099708);
            } else if (i == 2131165277) {
                layerDrawableL = E2.G.l(this, context, 2131099709);
            }
        }
        if (layerDrawableL != null) {
            layerDrawableL.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawableL.getConstantState();
                    if (constantState2 != null) {
                        C0828e c0828e2 = (C0828e) this.f8453b.get(context);
                        if (c0828e2 == null) {
                            c0828e2 = new C0828e();
                            this.f8453b.put(context, c0828e2);
                        }
                        c0828e2.e(new WeakReference(constantState2), j5);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawableL;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z4) {
        Drawable drawableA;
        try {
            if (!this.f8455d) {
                this.f8455d = true;
                Drawable drawableC = c(context, 2131165303);
                if (drawableC == null || (!(drawableC instanceof G0.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f8455d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = l.getDrawable(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z4, drawableA);
            }
            if (drawableA != null) {
                AbstractC0692h0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        C0835l c0835l;
        WeakHashMap weakHashMap = this.f8452a;
        ColorStateList colorStateListM = null;
        colorStateList = (weakHashMap == null || (c0835l = (C0835l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0835l.c(i, null);
        if (colorStateList == null) {
            E2.G g3 = this.f8456e;
            if (g3 != null) {
                colorStateListM = g3.m(context, i);
            }
            if (colorStateListM != null) {
                if (this.f8452a == null) {
                    this.f8452a = new WeakHashMap();
                }
                C0835l c0835l2 = (C0835l) this.f8452a.get(context);
                if (c0835l2 == null) {
                    c0835l2 = new C0835l();
                    this.f8452a.put(context, c0835l2);
                }
                c0835l2.a(i, colorStateListM);
            }
            colorStateList = colorStateListM;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.H0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
