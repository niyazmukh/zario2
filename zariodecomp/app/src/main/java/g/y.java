package g;

import A2.C0009i;
import M.S;
import M.X;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC0489a;
import j.AbstractC0616a;
import j.C0618d;
import j.C0622i;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0649h;
import l.C0685e;
import l.C0693i;
import l.InterfaceC0688f0;
import l.InterfaceC0690g0;
import l.a1;
import l.f1;
import l.j1;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\y.smali */
public final class y extends n implements k.j, LayoutInflater.Factory2 {

    /* renamed from: l0, reason: collision with root package name */
    public static final C0834k f7247l0 = new C0834k();

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f7248m0 = {R.attr.windowBackground};

    /* renamed from: n0, reason: collision with root package name */
    public static final boolean f7249n0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f7250o0 = true;

    /* renamed from: A, reason: collision with root package name */
    public PopupWindow f7251A;

    /* renamed from: B, reason: collision with root package name */
    public o f7252B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7254D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup f7255E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f7256F;
    public View G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7257H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7258I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f7259J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f7260K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f7261L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f7262M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f7263N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7264O;

    /* renamed from: P, reason: collision with root package name */
    public x[] f7265P;

    /* renamed from: Q, reason: collision with root package name */
    public x f7266Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f7267R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f7268S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f7269T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f7270U;

    /* renamed from: V, reason: collision with root package name */
    public Configuration f7271V;

    /* renamed from: W, reason: collision with root package name */
    public final int f7272W;
    public int X;

    /* renamed from: Y, reason: collision with root package name */
    public int f7273Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f7274Z;

    /* renamed from: a0, reason: collision with root package name */
    public u f7275a0;

    /* renamed from: b0, reason: collision with root package name */
    public u f7276b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f7277c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f7278d0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f7280f0;

    /* renamed from: g0, reason: collision with root package name */
    public Rect f7281g0;

    /* renamed from: h0, reason: collision with root package name */
    public Rect f7282h0;

    /* renamed from: i0, reason: collision with root package name */
    public B f7283i0;

    /* renamed from: j0, reason: collision with root package name */
    public OnBackInvokedDispatcher f7284j0;

    /* renamed from: k0, reason: collision with root package name */
    public OnBackInvokedCallback f7285k0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f7286n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f7287o;

    /* renamed from: p, reason: collision with root package name */
    public Window f7288p;

    /* renamed from: q, reason: collision with root package name */
    public t f7289q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f7290r;

    /* renamed from: s, reason: collision with root package name */
    public H f7291s;

    /* renamed from: t, reason: collision with root package name */
    public C0622i f7292t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f7293u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0688f0 f7294v;

    /* renamed from: w, reason: collision with root package name */
    public g1.i f7295w;

    /* renamed from: x, reason: collision with root package name */
    public p f7296x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC0616a f7297y;

    /* renamed from: z, reason: collision with root package name */
    public ActionBarContextView f7298z;

    /* renamed from: C, reason: collision with root package name */
    public X f7253C = null;

    /* renamed from: e0, reason: collision with root package name */
    public final o f7279e0 = new o(this, 0);

    public y(Context context, Window window, j jVar, Object obj) {
        i iVar;
        this.f7272W = -100;
        this.f7287o = context;
        this.f7286n = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    iVar = (i) context;
                    break;
                }
            }
            iVar = null;
            if (iVar != null) {
                this.f7272W = ((y) iVar.o()).f7272W;
            }
        }
        if (this.f7272W == -100) {
            C0834k c0834k = f7247l0;
            Integer num = (Integer) c0834k.getOrDefault(this.f7286n.getClass().getName(), null);
            if (num != null) {
                this.f7272W = num.intValue();
                c0834k.remove(this.f7286n.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        l.r.d();
    }

    public static I.k n(Context context) {
        I.k kVar;
        I.k kVar2;
        if (Build.VERSION.SDK_INT >= 33 || (kVar = n.f7210c) == null) {
            return null;
        }
        I.k kVarB = r.b(context.getApplicationContext().getResources().getConfiguration());
        if (kVar.b()) {
            kVar2 = I.k.f1917b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                I.l lVar = kVar.f1918a;
                if (i >= kVarB.f1918a.f1919a.size() + lVar.f1919a.size()) {
                    break;
                }
                Locale locale = i < lVar.f1919a.size() ? lVar.f1919a.get(i) : kVarB.f1918a.f1919a.get(i - lVar.f1919a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            kVar2 = new I.k(new I.l(I.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return kVar2.b() ? kVarB : kVar2;
    }

    public static Configuration s(Context context, int i, I.k kVar, Configuration configuration, boolean z4) {
        int i5 = i != 1 ? i != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (kVar != null) {
            r.d(configuration2, kVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f7278d0 = (1 << i) | this.f7278d0;
        if (this.f7277c0) {
            return;
        }
        View decorView = this.f7288p.getDecorView();
        o oVar = this.f7279e0;
        WeakHashMap weakHashMap = S.f2363a;
        M.B.m(decorView, oVar);
        this.f7277c0 = true;
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f7276b0 == null) {
                    this.f7276b0 = new u(this, context);
                }
                return this.f7276b0.f();
            }
        }
        return i;
    }

    public final boolean C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0690g0 interfaceC0690g0;
        a1 a1Var;
        boolean z4 = this.f7267R;
        this.f7267R = false;
        x xVarY = y(0);
        if (xVarY.f7243m) {
            if (!z4) {
                r(xVarY, true);
            }
            return true;
        }
        AbstractC0616a abstractC0616a = this.f7297y;
        if (abstractC0616a != null) {
            abstractC0616a.a();
            return true;
        }
        z();
        H h = this.f7291s;
        if (h == null || (interfaceC0690g0 = h.f7138j) == null || (a1Var = ((f1) interfaceC0690g0).f8574a.f4281P) == null || a1Var.f8551b == null) {
            return false;
        }
        a1 a1Var2 = ((f1) interfaceC0690g0).f8574a.f4281P;
        k.n nVar = a1Var2 == null ? null : a1Var2.f8551b;
        if (nVar != null) {
            nVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0172, code lost:
    
        if (r3.f8210f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(g.x r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.D(g.x, android.view.KeyEvent):void");
    }

    public final boolean E(x xVar, int i, KeyEvent keyEvent) {
        k.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((xVar.f7241k || F(xVar, keyEvent)) && (lVar = xVar.h) != null) {
            return lVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(x xVar, KeyEvent keyEvent) {
        InterfaceC0688f0 interfaceC0688f0;
        InterfaceC0688f0 interfaceC0688f02;
        Resources.Theme themeNewTheme;
        InterfaceC0688f0 interfaceC0688f03;
        InterfaceC0688f0 interfaceC0688f04;
        if (this.f7270U) {
            return false;
        }
        if (xVar.f7241k) {
            return true;
        }
        x xVar2 = this.f7266Q;
        if (xVar2 != null && xVar2 != xVar) {
            r(xVar2, false);
        }
        Window.Callback callback = this.f7288p.getCallback();
        int i = xVar.f7233a;
        if (callback != null) {
            xVar.f7239g = callback.onCreatePanelView(i);
        }
        boolean z4 = i == 0 || i == 108;
        if (z4 && (interfaceC0688f04 = this.f7294v) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0688f04;
            actionBarOverlayLayout.k();
            ((f1) actionBarOverlayLayout.f4182e).f8583l = true;
        }
        if (xVar.f7239g == null) {
            k.l lVar = xVar.h;
            if (lVar == null || xVar.f7245o) {
                if (lVar == null) {
                    Context context = this.f7287o;
                    if ((i == 0 || i == 108) && this.f7294v != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130903050, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(2130903051, typedValue, true);
                        } else {
                            theme.resolveAttribute(2130903051, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0618d c0618d = new C0618d(context, 0);
                            c0618d.getTheme().setTo(themeNewTheme);
                            context = c0618d;
                        }
                    }
                    k.l lVar2 = new k.l(context);
                    lVar2.f8222e = this;
                    k.l lVar3 = xVar.h;
                    if (lVar2 != lVar3) {
                        if (lVar3 != null) {
                            lVar3.r(xVar.i);
                        }
                        xVar.h = lVar2;
                        C0649h c0649h = xVar.i;
                        if (c0649h != null) {
                            lVar2.b(c0649h, lVar2.f8218a);
                        }
                    }
                    if (xVar.h == null) {
                        return false;
                    }
                }
                if (z4 && (interfaceC0688f02 = this.f7294v) != null) {
                    if (this.f7295w == null) {
                        this.f7295w = new g1.i(this, 16);
                    }
                    ((ActionBarOverlayLayout) interfaceC0688f02).l(xVar.h, this.f7295w);
                }
                xVar.h.w();
                if (!callback.onCreatePanelMenu(i, xVar.h)) {
                    k.l lVar4 = xVar.h;
                    if (lVar4 != null) {
                        if (lVar4 != null) {
                            lVar4.r(xVar.i);
                        }
                        xVar.h = null;
                    }
                    if (z4 && (interfaceC0688f0 = this.f7294v) != null) {
                        ((ActionBarOverlayLayout) interfaceC0688f0).l(null, this.f7295w);
                    }
                    return false;
                }
                xVar.f7245o = false;
            }
            xVar.h.w();
            Bundle bundle = xVar.f7246p;
            if (bundle != null) {
                xVar.h.s(bundle);
                xVar.f7246p = null;
            }
            if (!callback.onPreparePanel(0, xVar.f7239g, xVar.h)) {
                if (z4 && (interfaceC0688f03 = this.f7294v) != null) {
                    ((ActionBarOverlayLayout) interfaceC0688f03).l(null, this.f7295w);
                }
                xVar.h.v();
                return false;
            }
            xVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            xVar.h.v();
        }
        xVar.f7241k = true;
        xVar.f7242l = false;
        this.f7266Q = xVar;
        return true;
    }

    public final void G() {
        if (this.f7254D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f7284j0 != null && (y(0).f7243m || this.f7297y != null)) {
                z4 = true;
            }
            if (z4 && this.f7285k0 == null) {
                this.f7285k0 = s.b(this.f7284j0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f7285k0) == null) {
                    return;
                }
                s.c(this.f7284j0, onBackInvokedCallback);
            }
        }
    }

    @Override // g.n
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7287o);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof y) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.n
    public final void c() throws PackageManager.NameNotFoundException {
        String strC;
        this.f7268S = true;
        l(false, true);
        w();
        Object obj = this.f7286n;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = A.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                H h = this.f7291s;
                if (h == null) {
                    this.f7280f0 = true;
                } else {
                    h.a0(true);
                }
            }
            synchronized (n.f7215l) {
                n.e(this);
                n.f7214k.add(new WeakReference(this));
            }
        }
        this.f7271V = new Configuration(this.f7287o.getResources().getConfiguration());
        this.f7269T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // g.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7286n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = g.n.f7215l
            monitor-enter(r0)
            g.n.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f7277c0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f7288p
            android.view.View r0 = r0.getDecorView()
            g.o r1 = r3.f7279e0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f7270U = r0
            int r0 = r3.f7272W
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f7286n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            q.k r0 = g.y.f7247l0
            java.lang.Object r1 = r3.f7286n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f7272W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            q.k r0 = g.y.f7247l0
            java.lang.Object r1 = r3.f7286n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            g.u r0 = r3.f7275a0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            g.u r3 = r3.f7276b0
            if (r3 == 0) goto L6a
            r3.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.d():void");
    }

    @Override // k.j
    public final boolean f(k.l lVar, MenuItem menuItem) {
        x xVar;
        Window.Callback callback = this.f7288p.getCallback();
        if (callback != null && !this.f7270U) {
            k.l lVarK = lVar.k();
            x[] xVarArr = this.f7265P;
            int length = xVarArr != null ? xVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    xVar = xVarArr[i];
                    if (xVar != null && xVar.h == lVarK) {
                        break;
                    }
                    i++;
                } else {
                    xVar = null;
                    break;
                }
            }
            if (xVar != null) {
                return callback.onMenuItemSelected(xVar.f7233a, menuItem);
            }
        }
        return false;
    }

    @Override // g.n
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f7263N && i == 108) {
            return false;
        }
        if (this.f7259J && i == 1) {
            this.f7259J = false;
        }
        if (i == 1) {
            G();
            this.f7263N = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f7257H = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f7258I = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f7261L = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f7259J = true;
            return true;
        }
        if (i != 109) {
            return this.f7288p.requestFeature(i);
        }
        G();
        this.f7260K = true;
        return true;
    }

    @Override // g.n
    public final void h(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7255E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f7287o).inflate(i, viewGroup);
        this.f7289q.a(this.f7288p.getCallback());
    }

    @Override // g.n
    public final void i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7255E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f7289q.a(this.f7288p.getCallback());
    }

    @Override // g.n
    public final void j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7255E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f7289q.a(this.f7288p.getCallback());
    }

    @Override // g.n
    public final void k(CharSequence charSequence) {
        this.f7293u = charSequence;
        InterfaceC0688f0 interfaceC0688f0 = this.f7294v;
        if (interfaceC0688f0 != null) {
            interfaceC0688f0.setWindowTitle(charSequence);
            return;
        }
        H h = this.f7291s;
        if (h == null) {
            TextView textView = this.f7256F;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        f1 f1Var = (f1) h.f7138j;
        if (f1Var.f8580g) {
            return;
        }
        f1Var.h = charSequence;
        if ((f1Var.f8575b & 8) != 0) {
            Toolbar toolbar = f1Var.f8574a;
            toolbar.setTitle(charSequence);
            if (f1Var.f8580g) {
                S.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(boolean r12, boolean r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.l(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f7288p
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof g.t
            if (r2 != 0) goto L7a
            g.t r1 = new g.t
            r1.<init>(r7, r0)
            r7.f7289q = r1
            r8.setCallback(r1)
            int[] r0 = g.y.f7248m0
            android.content.Context r1 = r7.f7287o
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            l.r r4 = l.r.a()
            monitor-enter(r4)
            l.H0 r5 = r4.f8676a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.d(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f7288p = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f7284j0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f7285k0
            if (r0 == 0) goto L5f
            g.s.c(r8, r0)
            r7.f7285k0 = r2
        L5f:
            java.lang.Object r8 = r7.f7286n
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = g.s.a(r8)
            r7.f7284j0 = r8
            goto L76
        L74:
            r7.f7284j0 = r2
        L76:
            r7.H()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.m(android.view.Window):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // k.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(k.l r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.o(k.l):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i, x xVar, k.l lVar) {
        if (lVar == null) {
            if (xVar == null && i >= 0) {
                x[] xVarArr = this.f7265P;
                if (i < xVarArr.length) {
                    xVar = xVarArr[i];
                }
            }
            if (xVar != null) {
                lVar = xVar.h;
            }
        }
        if ((xVar == null || xVar.f7243m) && !this.f7270U) {
            t tVar = this.f7289q;
            Window.Callback callback = this.f7288p.getCallback();
            tVar.getClass();
            try {
                tVar.f7225d = true;
                callback.onPanelClosed(i, lVar);
            } finally {
                tVar.f7225d = false;
            }
        }
    }

    public final void q(k.l lVar) {
        C0693i c0693i;
        if (this.f7264O) {
            return;
        }
        this.f7264O = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7294v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((f1) actionBarOverlayLayout.f4182e).f8574a.f4287a;
        if (actionMenuView != null && (c0693i = actionMenuView.f4208x) != null) {
            c0693i.f();
            C0685e c0685e = c0693i.f8613x;
            if (c0685e != null && c0685e.b()) {
                c0685e.i.dismiss();
            }
        }
        Window.Callback callback = this.f7288p.getCallback();
        if (callback != null && !this.f7270U) {
            callback.onPanelClosed(108, lVar);
        }
        this.f7264O = false;
    }

    public final void r(x xVar, boolean z4) {
        w wVar;
        InterfaceC0688f0 interfaceC0688f0;
        C0693i c0693i;
        if (z4 && xVar.f7233a == 0 && (interfaceC0688f0 = this.f7294v) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0688f0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((f1) actionBarOverlayLayout.f4182e).f8574a.f4287a;
            if (actionMenuView != null && (c0693i = actionMenuView.f4208x) != null && c0693i.j()) {
                q(xVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f7287o.getSystemService("window");
        if (windowManager != null && xVar.f7243m && (wVar = xVar.f7237e) != null) {
            windowManager.removeView(wVar);
            if (z4) {
                p(xVar.f7233a, xVar, null);
            }
        }
        xVar.f7241k = false;
        xVar.f7242l = false;
        xVar.f7243m = false;
        xVar.f7238f = null;
        xVar.f7244n = true;
        if (this.f7266Q == xVar) {
            this.f7266Q = null;
        }
        if (xVar.f7233a == 0) {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.y.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i) {
        x xVarY = y(i);
        if (xVarY.h != null) {
            Bundle bundle = new Bundle();
            xVarY.h.t(bundle);
            if (bundle.size() > 0) {
                xVarY.f7246p = bundle;
            }
            xVarY.h.w();
            xVarY.h.clear();
        }
        xVarY.f7245o = true;
        xVarY.f7244n = true;
        if ((i == 108 || i == 0) && this.f7294v != null) {
            x xVarY2 = y(0);
            xVarY2.f7241k = false;
            F(xVarY2, null);
        }
    }

    public final void v() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.f7254D) {
            return;
        }
        int[] iArr = AbstractC0489a.f6969j;
        Context context = this.f7287o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f7262M = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.f7288p.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f7263N) {
            viewGroup = this.f7261L ? (ViewGroup) layoutInflaterFrom.inflate(2131427350, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131427349, (ViewGroup) null);
        } else if (this.f7262M) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131427340, (ViewGroup) null);
            this.f7260K = false;
            this.f7259J = false;
        } else if (this.f7259J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903050, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0618d(context, typedValue.resourceId) : context).inflate(2131427351, (ViewGroup) null);
            InterfaceC0688f0 interfaceC0688f0 = (InterfaceC0688f0) viewGroup.findViewById(2131230896);
            this.f7294v = interfaceC0688f0;
            interfaceC0688f0.setWindowCallback(this.f7288p.getCallback());
            if (this.f7260K) {
                ((ActionBarOverlayLayout) this.f7294v).j(109);
            }
            if (this.f7257H) {
                ((ActionBarOverlayLayout) this.f7294v).j(2);
            }
            if (this.f7258I) {
                ((ActionBarOverlayLayout) this.f7294v).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f7259J + ", windowActionBarOverlay: " + this.f7260K + ", android:windowIsFloating: " + this.f7262M + ", windowActionModeOverlay: " + this.f7261L + ", windowNoTitle: " + this.f7263N + " }");
        }
        p pVar = new p(this);
        WeakHashMap weakHashMap = S.f2363a;
        M.H.u(viewGroup, pVar);
        if (this.f7294v == null) {
            this.f7256F = (TextView) viewGroup.findViewById(2131231245);
        }
        Method method = j1.f8620a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131230770);
        ViewGroup viewGroup2 = (ViewGroup) this.f7288p.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f7288p.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new K2.c(this, 18));
        this.f7255E = viewGroup;
        Object obj = this.f7286n;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f7293u;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0688f0 interfaceC0688f02 = this.f7294v;
            if (interfaceC0688f02 != null) {
                interfaceC0688f02.setWindowTitle(title);
            } else {
                H h = this.f7291s;
                if (h != null) {
                    f1 f1Var = (f1) h.f7138j;
                    if (!f1Var.f8580g) {
                        f1Var.h = title;
                        if ((f1Var.f8575b & 8) != 0) {
                            Toolbar toolbar = f1Var.f8574a;
                            toolbar.setTitle(title);
                            if (f1Var.f8580g) {
                                S.i(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f7256F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f7255E.findViewById(R.id.content);
        View decorView = this.f7288p.getDecorView();
        contentFrameLayout2.f4221k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = S.f2363a;
        if (M.E.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f7254D = true;
        x xVarY = y(0);
        if (this.f7270U || xVarY.h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f7288p == null) {
            Object obj = this.f7286n;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f7288p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final v x(Context context) {
        if (this.f7275a0 == null) {
            if (C0009i.f202e == null) {
                Context applicationContext = context.getApplicationContext();
                C0009i.f202e = new C0009i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f7275a0 = new u(this, C0009i.f202e);
        }
        return this.f7275a0;
    }

    public final x y(int i) {
        x[] xVarArr = this.f7265P;
        if (xVarArr == null || xVarArr.length <= i) {
            x[] xVarArr2 = new x[i + 1];
            if (xVarArr != null) {
                System.arraycopy(xVarArr, 0, xVarArr2, 0, xVarArr.length);
            }
            this.f7265P = xVarArr2;
            xVarArr = xVarArr2;
        }
        x xVar = xVarArr[i];
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x();
        xVar2.f7233a = i;
        xVar2.f7244n = false;
        xVarArr[i] = xVar2;
        return xVar2;
    }

    public final void z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        if (this.f7259J && this.f7291s == null) {
            Object obj = this.f7286n;
            if (obj instanceof Activity) {
                this.f7291s = new H((Activity) obj, this.f7260K);
            } else if (obj instanceof Dialog) {
                this.f7291s = new H((Dialog) obj);
            }
            H h = this.f7291s;
            if (h != null) {
                h.a0(this.f7280f0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
