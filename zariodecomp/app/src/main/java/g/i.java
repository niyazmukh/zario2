package g;

import A.AbstractC0000a;
import N2.AbstractC0156x;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a0;
import g0.AbstractActivityC0570w;
import j.C0618d;
import j.C0622i;
import java.lang.reflect.InvocationTargetException;
import l.H0;
import l.f1;
import l.h1;
import q.C0828e;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\i.smali */
public abstract class i extends AbstractActivityC0570w implements j {

    /* renamed from: B, reason: collision with root package name */
    public y f7205B;

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        p();
        y yVar = (y) o();
        yVar.v();
        ((ViewGroup) yVar.f7255E.findViewById(R.id.content)).addView(view, layoutParams);
        yVar.f7289q.a(yVar.f7288p.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        y yVar = (y) o();
        yVar.f7268S = true;
        int i = yVar.f7272W;
        if (i == -100) {
            i = n.f7209b;
        }
        int iB = yVar.B(context, i);
        if (n.b(context) && n.b(context)) {
            if (!I.b.a()) {
                synchronized (n.f7216m) {
                    try {
                        I.k kVar = n.f7210c;
                        if (kVar == null) {
                            if (n.f7211d == null) {
                                n.f7211d = I.k.a(AbstractC0156x.Z(context));
                            }
                            if (!n.f7211d.b()) {
                                n.f7210c = n.f7211d;
                            }
                        } else if (!kVar.equals(n.f7211d)) {
                            I.k kVar2 = n.f7210c;
                            n.f7211d = kVar2;
                            AbstractC0156x.U(context, kVar2.f1918a.f1919a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!n.f7213f) {
                n.f7208a.execute(new k(context, 0));
            }
        }
        I.k kVarN = y.n(context);
        Configuration configuration = null;
        if (y.f7250o0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(y.s(context, iB, kVarN, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C0618d) {
            try {
                ((C0618d) context).a(y.s(context, iB, kVarN, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (y.f7249n0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i5 = configuration3.mcc;
                    int i6 = configuration4.mcc;
                    if (i5 != i6) {
                        configuration.mcc = i6;
                    }
                    int i7 = configuration3.mnc;
                    int i8 = configuration4.mnc;
                    if (i7 != i8) {
                        configuration.mnc = i8;
                    }
                    r.a(configuration3, configuration4, configuration);
                    int i9 = configuration3.touchscreen;
                    int i10 = configuration4.touchscreen;
                    if (i9 != i10) {
                        configuration.touchscreen = i10;
                    }
                    int i11 = configuration3.keyboard;
                    int i12 = configuration4.keyboard;
                    if (i11 != i12) {
                        configuration.keyboard = i12;
                    }
                    int i13 = configuration3.keyboardHidden;
                    int i14 = configuration4.keyboardHidden;
                    if (i13 != i14) {
                        configuration.keyboardHidden = i14;
                    }
                    int i15 = configuration3.navigation;
                    int i16 = configuration4.navigation;
                    if (i15 != i16) {
                        configuration.navigation = i16;
                    }
                    int i17 = configuration3.navigationHidden;
                    int i18 = configuration4.navigationHidden;
                    if (i17 != i18) {
                        configuration.navigationHidden = i18;
                    }
                    int i19 = configuration3.orientation;
                    int i20 = configuration4.orientation;
                    if (i19 != i20) {
                        configuration.orientation = i20;
                    }
                    int i21 = configuration3.screenLayout & 15;
                    int i22 = configuration4.screenLayout & 15;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 192;
                    int i24 = configuration4.screenLayout & 192;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 48;
                    int i26 = configuration4.screenLayout & 48;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.screenLayout & 768;
                    int i28 = configuration4.screenLayout & 768;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.colorMode & 3;
                    int i30 = configuration4.colorMode & 3;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.colorMode & 12;
                    int i32 = configuration4.colorMode & 12;
                    if (i31 != i32) {
                        configuration.colorMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 15;
                    int i34 = configuration4.uiMode & 15;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.uiMode & 48;
                    int i36 = configuration4.uiMode & 48;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.screenWidthDp;
                    int i38 = configuration4.screenWidthDp;
                    if (i37 != i38) {
                        configuration.screenWidthDp = i38;
                    }
                    int i39 = configuration3.screenHeightDp;
                    int i40 = configuration4.screenHeightDp;
                    if (i39 != i40) {
                        configuration.screenHeightDp = i40;
                    }
                    int i41 = configuration3.smallestScreenWidthDp;
                    int i42 = configuration4.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration.smallestScreenWidthDp = i42;
                    }
                    int i43 = configuration3.densityDpi;
                    int i44 = configuration4.densityDpi;
                    if (i43 != i44) {
                        configuration.densityDpi = i44;
                    }
                }
            }
            Configuration configurationS = y.s(context, iB, kVarN, configuration, true);
            C0618d c0618d = new C0618d(context, 2131952152);
            c0618d.a(configurationS);
            try {
                if (context.getTheme() != null) {
                    C.n.a(c0618d.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c0618d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((y) o()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        ((y) o()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) o();
        yVar.v();
        return yVar.f7288p.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) o();
        if (yVar.f7292t == null) {
            yVar.z();
            H h = yVar.f7291s;
            yVar.f7292t = new C0622i(h != null ? h.Y() : yVar.f7287o);
        }
        return yVar.f7292t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = h1.f8592a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) o();
        if (yVar.f7291s != null) {
            yVar.z();
            yVar.f7291s.getClass();
            yVar.A(0);
        }
    }

    public final n o() {
        if (this.f7205B == null) {
            T0.m mVar = n.f7208a;
            this.f7205B = new y(this, null, this, this);
        }
        return this.f7205B;
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        y yVar = (y) o();
        if (yVar.f7259J && yVar.f7254D) {
            yVar.z();
            H h = yVar.f7291s;
            if (h != null) {
                h.b0(h.f7136f.getResources().getBoolean(2130968576));
            }
        }
        l.r rVarA = l.r.a();
        Context context = yVar.f7287o;
        synchronized (rVarA) {
            H0 h02 = rVarA.f8676a;
            synchronized (h02) {
                C0828e c0828e = (C0828e) h02.f8453b.get(context);
                if (c0828e != null) {
                    c0828e.a();
                }
            }
        }
        yVar.f7271V = new Configuration(yVar.f7287o.getResources().getConfiguration());
        yVar.l(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o().d();
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentB;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        y yVar = (y) o();
        yVar.z();
        H h = yVar.f7291s;
        if (menuItem.getItemId() == 16908332 && h != null && (((f1) h.f7138j).f8575b & 4) != 0 && (intentB = A.c.b(this)) != null) {
            if (!A.h.c(this, intentB)) {
                A.h.b(this, intentB);
                return true;
            }
            A.A a5 = new A.A(this);
            Intent intentB2 = A.c.b(this);
            if (intentB2 == null) {
                intentB2 = A.c.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(a5.f1b.getPackageManager());
                }
                a5.f(component);
                a5.f0a.add(intentB2);
            }
            a5.g();
            try {
                AbstractC0000a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((y) o()).v();
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        y yVar = (y) o();
        yVar.z();
        H h = yVar.f7291s;
        if (h != null) {
            h.f7153y = true;
        }
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((y) o()).l(true, false);
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        y yVar = (y) o();
        yVar.z();
        H h = yVar.f7291s;
        if (h != null) {
            h.f7153y = false;
            j.k kVar = h.f7152x;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        o().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((y) o()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        a0.k(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView, "<this>");
        decorView.setTag(2131231338, this);
        C1071b.j(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView2, "<this>");
        decorView2.setTag(2131231336, this);
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void setContentView(int i) {
        p();
        o().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((y) o()).X = i;
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public void setContentView(View view) {
        p();
        o().i(view);
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        o().j(view, layoutParams);
    }
}
