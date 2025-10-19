package a2;

import M.B;
import M.E;
import M.H;
import M.S;
import N2.AbstractC0156x;
import S0.n;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import j0.C0623a;
import java.util.List;
import java.util.WeakHashMap;
import y.C1041d;

/* renamed from: a2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\h.smali */
public abstract class AbstractC0193h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4087c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f4088d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f4089e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f4090f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f4091g;
    public final Context h;
    public final AbstractC0192g i;

    /* renamed from: j, reason: collision with root package name */
    public final SnackbarContentLayout f4092j;

    /* renamed from: k, reason: collision with root package name */
    public int f4093k;

    /* renamed from: m, reason: collision with root package name */
    public int f4095m;

    /* renamed from: n, reason: collision with root package name */
    public int f4096n;

    /* renamed from: o, reason: collision with root package name */
    public int f4097o;

    /* renamed from: p, reason: collision with root package name */
    public int f4098p;

    /* renamed from: q, reason: collision with root package name */
    public int f4099q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4100r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f4101s;

    /* renamed from: u, reason: collision with root package name */
    public static final C0623a f4079u = B1.a.f284b;

    /* renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f4080v = B1.a.f283a;

    /* renamed from: w, reason: collision with root package name */
    public static final C0623a f4081w = B1.a.f286d;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4083y = {2130903993};

    /* renamed from: z, reason: collision with root package name */
    public static final String f4084z = AbstractC0193h.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    public static final Handler f4082x = new Handler(Looper.getMainLooper(), new C0188c());

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0189d f4094l = new RunnableC0189d(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final C0190e f4102t = new C0190e(this);

    public AbstractC0193h(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f4091g = viewGroup;
        this.f4092j = snackbarContentLayout2;
        this.h = context;
        Q1.k.c(context, Q1.k.f2802a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f4083y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0192g abstractC0192g = (AbstractC0192g) layoutInflaterFrom.inflate(resourceId != -1 ? 2131427429 : 2131427362, viewGroup, false);
        this.i = abstractC0192g;
        abstractC0192g.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = abstractC0192g.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f6111b.setTextColor(AbstractC0156x.Q(AbstractC0156x.I(snackbarContentLayout, 2130903314), snackbarContentLayout.f6111b.getCurrentTextColor(), actionTextColorAlpha));
        }
        snackbarContentLayout.setMaxInlineActionWidth(abstractC0192g.getMaxInlineActionWidth());
        abstractC0192g.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = S.f2363a;
        E.f(abstractC0192g, 1);
        B.s(abstractC0192g, 1);
        abstractC0192g.setFitsSystemWindows(true);
        H.u(abstractC0192g, new K2.c(this, 14));
        S.h(abstractC0192g, new G1.e(this, 3));
        this.f4101s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f4087c = AbstractC0156x.d0(context, 2130903821, 250);
        this.f4085a = AbstractC0156x.d0(context, 2130903821, 150);
        this.f4086b = AbstractC0156x.d0(context, 2130903824, 75);
        this.f4088d = AbstractC0156x.e0(context, 2130903837, f4080v);
        this.f4090f = AbstractC0156x.e0(context, 2130903837, f4081w);
        this.f4089e = AbstractC0156x.e0(context, 2130903837, f4079u);
    }

    public final void a(int i) {
        n nVarI = n.i();
        C0190e c0190e = this.f4102t;
        synchronized (nVarI.f2872a) {
            try {
                if (nVarI.j(c0190e)) {
                    nVarI.b((C0196k) nVarI.f2874c, i);
                } else {
                    C0196k c0196k = (C0196k) nVarI.f2875d;
                    if (c0196k != null && c0196k.f4106a.get() == c0190e) {
                        nVarI.b((C0196k) nVarI.f2875d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        n nVarI = n.i();
        C0190e c0190e = this.f4102t;
        synchronized (nVarI.f2872a) {
            try {
                if (nVarI.j(c0190e)) {
                    nVarI.f2874c = null;
                    if (((C0196k) nVarI.f2875d) != null) {
                        nVarI.s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        n nVarI = n.i();
        C0190e c0190e = this.f4102t;
        synchronized (nVarI.f2872a) {
            try {
                if (nVarI.j(c0190e)) {
                    nVarI.q((C0196k) nVarI.f2874c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z4 = true;
        AccessibilityManager accessibilityManager = this.f4101s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z4 = false;
        }
        AbstractC0192g abstractC0192g = this.i;
        if (z4) {
            abstractC0192g.post(new RunnableC0189d(this, 2));
            return;
        }
        if (abstractC0192g.getParent() != null) {
            abstractC0192g.setVisibility(0);
        }
        c();
    }

    public final void e() {
        AbstractC0192g abstractC0192g = this.i;
        ViewGroup.LayoutParams layoutParams = abstractC0192g.getLayoutParams();
        boolean z4 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f4084z;
        if (!z4) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (abstractC0192g.f4077n == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (abstractC0192g.getParent() == null) {
            return;
        }
        int i = this.f4095m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = abstractC0192g.f4077n;
        int i5 = rect.bottom + i;
        int i6 = rect.left + this.f4096n;
        int i7 = rect.right + this.f4097o;
        int i8 = rect.top;
        boolean z5 = (marginLayoutParams.bottomMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7 && marginLayoutParams.topMargin == i8) ? false : true;
        if (z5) {
            marginLayoutParams.bottomMargin = i5;
            marginLayoutParams.leftMargin = i6;
            marginLayoutParams.rightMargin = i7;
            marginLayoutParams.topMargin = i8;
            abstractC0192g.requestLayout();
        }
        if ((z5 || this.f4099q != this.f4098p) && this.f4098p > 0) {
            ViewGroup.LayoutParams layoutParams2 = abstractC0192g.getLayoutParams();
            if ((layoutParams2 instanceof C1041d) && (((C1041d) layoutParams2).f11027a instanceof SwipeDismissBehavior)) {
                RunnableC0189d runnableC0189d = this.f4094l;
                abstractC0192g.removeCallbacks(runnableC0189d);
                abstractC0192g.post(runnableC0189d);
            }
        }
    }
}
