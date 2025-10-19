package g;

import M.S;
import M.W;
import M.X;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC0489a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.InterfaceC0681c;
import l.InterfaceC0690g0;
import l.f1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\H.smali */
public final class H extends p1.b implements InterfaceC0681c {

    /* renamed from: D, reason: collision with root package name */
    public static final AccelerateInterpolator f7131D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    public static final DecelerateInterpolator f7132E = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final F f7133A;

    /* renamed from: B, reason: collision with root package name */
    public final F f7134B;

    /* renamed from: C, reason: collision with root package name */
    public final K2.c f7135C;

    /* renamed from: f, reason: collision with root package name */
    public Context f7136f;

    /* renamed from: g, reason: collision with root package name */
    public Context f7137g;
    public ActionBarOverlayLayout h;
    public ActionBarContainer i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0690g0 f7138j;

    /* renamed from: k, reason: collision with root package name */
    public ActionBarContextView f7139k;

    /* renamed from: l, reason: collision with root package name */
    public final View f7140l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7141m;

    /* renamed from: n, reason: collision with root package name */
    public G f7142n;

    /* renamed from: o, reason: collision with root package name */
    public G f7143o;

    /* renamed from: p, reason: collision with root package name */
    public S0.v f7144p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7145q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7146r;

    /* renamed from: s, reason: collision with root package name */
    public int f7147s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7148t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7149u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7150v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7151w;

    /* renamed from: x, reason: collision with root package name */
    public j.k f7152x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7153y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7154z;

    public H(Activity activity, boolean z4) {
        new ArrayList();
        this.f7146r = new ArrayList();
        this.f7147s = 0;
        this.f7148t = true;
        this.f7151w = true;
        this.f7133A = new F(this, 0);
        this.f7134B = new F(this, 1);
        this.f7135C = new K2.c(this, 19);
        View decorView = activity.getWindow().getDecorView();
        Z(decorView);
        if (z4) {
            return;
        }
        this.f7140l = decorView.findViewById(R.id.content);
    }

    public final void X(boolean z4) {
        X xI;
        X xI2;
        if (z4) {
            if (!this.f7150v) {
                this.f7150v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                c0(false);
            }
        } else if (this.f7150v) {
            this.f7150v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            c0(false);
        }
        ActionBarContainer actionBarContainer = this.i;
        WeakHashMap weakHashMap = S.f2363a;
        if (!M.E.c(actionBarContainer)) {
            if (z4) {
                ((f1) this.f7138j).f8574a.setVisibility(4);
                this.f7139k.setVisibility(0);
                return;
            } else {
                ((f1) this.f7138j).f8574a.setVisibility(0);
                this.f7139k.setVisibility(8);
                return;
            }
        }
        if (z4) {
            f1 f1Var = (f1) this.f7138j;
            xI = S.a(f1Var.f8574a);
            xI.a(0.0f);
            xI.c(100L);
            xI.d(new j.j(f1Var, 4));
            xI2 = this.f7139k.i(0, 200L);
        } else {
            f1 f1Var2 = (f1) this.f7138j;
            X xA = S.a(f1Var2.f8574a);
            xA.a(1.0f);
            xA.c(200L);
            xA.d(new j.j(f1Var2, 0));
            xI = this.f7139k.i(8, 100L);
            xI2 = xA;
        }
        j.k kVar = new j.k();
        ArrayList arrayList = kVar.f8027a;
        arrayList.add(xI);
        View view = (View) xI.f2367a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) xI2.f2367a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(xI2);
        kVar.b();
    }

    public final Context Y() {
        if (this.f7137g == null) {
            TypedValue typedValue = new TypedValue();
            this.f7136f.getTheme().resolveAttribute(2130903051, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f7137g = new ContextThemeWrapper(this.f7136f, i);
            } else {
                this.f7137g = this.f7136f;
            }
        }
        return this.f7137g;
    }

    public final void Z(View view) {
        InterfaceC0690g0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131230896);
        this.h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(2131230769);
        if (callbackFindViewById instanceof InterfaceC0690g0) {
            wrapper = (InterfaceC0690g0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f7138j = wrapper;
        this.f7139k = (ActionBarContextView) view.findViewById(2131230777);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131230771);
        this.i = actionBarContainer;
        InterfaceC0690g0 interfaceC0690g0 = this.f7138j;
        if (interfaceC0690g0 == null || this.f7139k == null || actionBarContainer == null) {
            throw new IllegalStateException(H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((f1) interfaceC0690g0).f8574a.getContext();
        this.f7136f = context;
        if ((((f1) this.f7138j).f8575b & 4) != 0) {
            this.f7141m = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f7138j.getClass();
        b0(context.getResources().getBoolean(2130968576));
        TypedArray typedArrayObtainStyledAttributes = this.f7136f.obtainStyledAttributes(null, AbstractC0489a.f6962a, 2130903046, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
            if (!actionBarOverlayLayout2.f4185l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f7154z = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.i;
            WeakHashMap weakHashMap = S.f2363a;
            M.H.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a0(boolean z4) {
        if (this.f7141m) {
            return;
        }
        int i = z4 ? 4 : 0;
        f1 f1Var = (f1) this.f7138j;
        int i5 = f1Var.f8575b;
        this.f7141m = true;
        f1Var.a((i & 4) | (i5 & (-5)));
    }

    public final void b0(boolean z4) {
        if (z4) {
            this.i.setTabContainer(null);
            ((f1) this.f7138j).getClass();
        } else {
            ((f1) this.f7138j).getClass();
            this.i.setTabContainer(null);
        }
        this.f7138j.getClass();
        ((f1) this.f7138j).f8574a.setCollapsible(false);
        this.h.setHasNonEmbeddedTabs(false);
    }

    public final void c0(boolean z4) {
        boolean z5 = this.f7150v || !this.f7149u;
        View view = this.f7140l;
        K2.c cVar = this.f7135C;
        if (!z5) {
            if (this.f7151w) {
                this.f7151w = false;
                j.k kVar = this.f7152x;
                if (kVar != null) {
                    kVar.a();
                }
                int i = this.f7147s;
                F f2 = this.f7133A;
                if (i != 0 || (!this.f7153y && !z4)) {
                    f2.a();
                    return;
                }
                this.i.setAlpha(1.0f);
                this.i.setTransitioning(true);
                j.k kVar2 = new j.k();
                float f3 = -this.i.getHeight();
                if (z4) {
                    this.i.getLocationInWindow(new int[]{0, 0});
                    f3 -= r12[1];
                }
                X xA = S.a(this.i);
                xA.e(f3);
                View view2 = (View) xA.f2367a.get();
                if (view2 != null) {
                    W.a(view2.animate(), cVar != null ? new H1.b(cVar, view2) : null);
                }
                boolean z6 = kVar2.f8031e;
                ArrayList arrayList = kVar2.f8027a;
                if (!z6) {
                    arrayList.add(xA);
                }
                if (this.f7148t && view != null) {
                    X xA2 = S.a(view);
                    xA2.e(f3);
                    if (!kVar2.f8031e) {
                        arrayList.add(xA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f7131D;
                boolean z7 = kVar2.f8031e;
                if (!z7) {
                    kVar2.f8029c = accelerateInterpolator;
                }
                if (!z7) {
                    kVar2.f8028b = 250L;
                }
                if (!z7) {
                    kVar2.f8030d = f2;
                }
                this.f7152x = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f7151w) {
            return;
        }
        this.f7151w = true;
        j.k kVar3 = this.f7152x;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.i.setVisibility(0);
        int i5 = this.f7147s;
        F f5 = this.f7134B;
        if (i5 == 0 && (this.f7153y || z4)) {
            this.i.setTranslationY(0.0f);
            float f6 = -this.i.getHeight();
            if (z4) {
                this.i.getLocationInWindow(new int[]{0, 0});
                f6 -= r12[1];
            }
            this.i.setTranslationY(f6);
            j.k kVar4 = new j.k();
            X xA3 = S.a(this.i);
            xA3.e(0.0f);
            View view3 = (View) xA3.f2367a.get();
            if (view3 != null) {
                W.a(view3.animate(), cVar != null ? new H1.b(cVar, view3) : null);
            }
            boolean z8 = kVar4.f8031e;
            ArrayList arrayList2 = kVar4.f8027a;
            if (!z8) {
                arrayList2.add(xA3);
            }
            if (this.f7148t && view != null) {
                view.setTranslationY(f6);
                X xA4 = S.a(view);
                xA4.e(0.0f);
                if (!kVar4.f8031e) {
                    arrayList2.add(xA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f7132E;
            boolean z9 = kVar4.f8031e;
            if (!z9) {
                kVar4.f8029c = decelerateInterpolator;
            }
            if (!z9) {
                kVar4.f8028b = 250L;
            }
            if (!z9) {
                kVar4.f8030d = f5;
            }
            this.f7152x = kVar4;
            kVar4.b();
        } else {
            this.i.setAlpha(1.0f);
            this.i.setTranslationY(0.0f);
            if (this.f7148t && view != null) {
                view.setTranslationY(0.0f);
            }
            f5.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.h;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f2363a;
            M.F.c(actionBarOverlayLayout);
        }
    }

    public H(Dialog dialog) {
        new ArrayList();
        this.f7146r = new ArrayList();
        this.f7147s = 0;
        this.f7148t = true;
        this.f7151w = true;
        this.f7133A = new F(this, 0);
        this.f7134B = new F(this, 1);
        this.f7135C = new K2.c(this, 19);
        Z(dialog.getWindow().getDecorView());
    }
}
