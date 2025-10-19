package j;

import M.AbstractC0127m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.o;
import k.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\h.smali */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f7988A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f7989B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0622i f7992E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f7993a;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f8000j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f8001k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f8002l;

    /* renamed from: m, reason: collision with root package name */
    public int f8003m;

    /* renamed from: n, reason: collision with root package name */
    public char f8004n;

    /* renamed from: o, reason: collision with root package name */
    public int f8005o;

    /* renamed from: p, reason: collision with root package name */
    public char f8006p;

    /* renamed from: q, reason: collision with root package name */
    public int f8007q;

    /* renamed from: r, reason: collision with root package name */
    public int f8008r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8009s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8010t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8011u;

    /* renamed from: v, reason: collision with root package name */
    public int f8012v;

    /* renamed from: w, reason: collision with root package name */
    public int f8013w;

    /* renamed from: x, reason: collision with root package name */
    public String f8014x;

    /* renamed from: y, reason: collision with root package name */
    public String f8015y;

    /* renamed from: z, reason: collision with root package name */
    public o f8016z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f7990C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f7991D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f7994b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7995c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7996d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7997e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7998f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7999g = true;

    public h(C0622i c0622i, Menu menu) {
        this.f7992E = c0622i;
        this.f7993a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7992E.f8021c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z4 = false;
        menuItem.setChecked(this.f8009s).setVisible(this.f8010t).setEnabled(this.f8011u).setCheckable(this.f8008r >= 1).setTitleCondensed(this.f8002l).setIcon(this.f8003m);
        int i = this.f8012v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f8015y;
        C0622i c0622i = this.f7992E;
        if (str != null) {
            if (c0622i.f8021c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0622i.f8022d == null) {
                c0622i.f8022d = C0622i.a(c0622i.f8021c);
            }
            Object obj = c0622i.f8022d;
            String str2 = this.f8015y;
            MenuItemOnMenuItemClickListenerC0621g menuItemOnMenuItemClickListenerC0621g = new MenuItemOnMenuItemClickListenerC0621g();
            menuItemOnMenuItemClickListenerC0621g.f7986a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0621g.f7987b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0621g.f7985c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0621g);
            } catch (Exception e5) {
                StringBuilder sbO = B.a.o("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbO.append(cls.getName());
                InflateException inflateException = new InflateException(sbO.toString());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f8008r >= 2) {
            if (menuItem instanceof k.n) {
                k.n nVar = (k.n) menuItem;
                nVar.f8267x = (nVar.f8267x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f8279d;
                    F.a aVar = sVar.f8278c;
                    if (method == null) {
                        sVar.f8279d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f8279d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str3 = this.f8014x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0622i.f8017e, c0622i.f8019a));
            z4 = true;
        }
        int i5 = this.f8013w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        o oVar = this.f8016z;
        if (oVar != null) {
            if (menuItem instanceof F.a) {
                ((F.a) menuItem).a(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f7988A;
        boolean z5 = menuItem instanceof F.a;
        if (z5) {
            ((F.a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0127m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f7989B;
        if (z5) {
            ((F.a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0127m.m(menuItem, charSequence2);
        }
        char c5 = this.f8004n;
        int i6 = this.f8005o;
        if (z5) {
            ((F.a) menuItem).setAlphabeticShortcut(c5, i6);
        } else {
            AbstractC0127m.g(menuItem, c5, i6);
        }
        char c6 = this.f8006p;
        int i7 = this.f8007q;
        if (z5) {
            ((F.a) menuItem).setNumericShortcut(c6, i7);
        } else {
            AbstractC0127m.k(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.f7991D;
        if (mode != null) {
            if (z5) {
                ((F.a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0127m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f7990C;
        if (colorStateList != null) {
            if (z5) {
                ((F.a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0127m.i(menuItem, colorStateList);
            }
        }
    }
}
