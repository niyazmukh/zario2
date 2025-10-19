package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\n.smali */
public final class n implements F.a {

    /* renamed from: A, reason: collision with root package name */
    public o f8243A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f8244B;

    /* renamed from: a, reason: collision with root package name */
    public final int f8246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8248c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8249d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8250e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8251f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f8252g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f8253j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f8255l;

    /* renamed from: n, reason: collision with root package name */
    public final l f8257n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0641E f8258o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8259p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f8260q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f8261r;

    /* renamed from: y, reason: collision with root package name */
    public int f8268y;

    /* renamed from: z, reason: collision with root package name */
    public View f8269z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f8254k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f8256m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f8262s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f8263t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8264u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8265v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8266w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f8267x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8245C = false;

    public n(l lVar, int i, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f8257n = lVar;
        this.f8246a = i5;
        this.f8247b = i;
        this.f8248c = i6;
        this.f8249d = i7;
        this.f8250e = charSequence;
        this.f8268y = i8;
    }

    public static void c(StringBuilder sb, int i, int i5, String str) {
        if ((i & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // F.a
    public final F.a a(o oVar) {
        this.f8269z = null;
        this.f8243A = oVar;
        this.f8257n.p(true);
        o oVar2 = this.f8243A;
        if (oVar2 != null) {
            oVar2.f8272c = new g1.i(this, 19);
            oVar2.f8270a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // F.a
    public final o b() {
        return this.f8243A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8268y & 8) == 0) {
            return false;
        }
        if (this.f8269z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8244B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8257n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f8266w && (this.f8264u || this.f8265v)) {
            drawable = drawable.mutate();
            if (this.f8264u) {
                E.b.h(drawable, this.f8262s);
            }
            if (this.f8265v) {
                E.b.i(drawable, this.f8263t);
            }
            this.f8266w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f8268y & 8) == 0) {
            return false;
        }
        if (this.f8269z == null && (oVar = this.f8243A) != null) {
            this.f8269z = oVar.a(this);
        }
        return this.f8269z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8244B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8257n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f8267x & 32) == 32;
    }

    public final void g(boolean z4) {
        if (z4) {
            this.f8267x |= 32;
        } else {
            this.f8267x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8269z;
        if (view != null) {
            return view;
        }
        o oVar = this.f8243A;
        if (oVar == null) {
            return null;
        }
        View viewA = oVar.a(this);
        this.f8269z = viewA;
        return viewA;
    }

    @Override // F.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8254k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8253j;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8260q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8247b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8255l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f8256m;
        if (i == 0) {
            return null;
        }
        Drawable drawableB = r1.d.B(this.f8257n.f8218a, i);
        this.f8256m = 0;
        this.f8255l = drawableB;
        return d(drawableB);
    }

    @Override // F.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8262s;
    }

    @Override // F.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8263t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8252g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8246a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8248c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8258o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8250e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8251f;
        return charSequence != null ? charSequence : this.f8250e;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8261r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8258o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8245C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8267x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8267x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8267x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f8243A;
        return (oVar == null || !oVar.f8270a.overridesItemVisibility()) ? (this.f8267x & 8) == 0 : (this.f8267x & 8) == 0 && this.f8243A.f8270a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f8269z = view;
        this.f8243A = null;
        if (view != null && view.getId() == -1 && (i = this.f8246a) > 0) {
            view.setId(i);
        }
        l lVar = this.f8257n;
        lVar.f8226k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f8253j == c5) {
            return this;
        }
        this.f8253j = Character.toLowerCase(c5);
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i = this.f8267x;
        int i5 = (z4 ? 1 : 0) | (i & (-2));
        this.f8267x = i5;
        if (i != i5) {
            this.f8257n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i = this.f8267x;
        if ((i & 4) != 0) {
            l lVar = this.f8257n;
            lVar.getClass();
            ArrayList arrayList = lVar.f8223f;
            int size = arrayList.size();
            lVar.w();
            for (int i5 = 0; i5 < size; i5++) {
                n nVar = (n) arrayList.get(i5);
                if (nVar.f8247b == this.f8247b && (nVar.f8267x & 4) != 0 && nVar.isCheckable()) {
                    boolean z5 = nVar == this;
                    int i6 = nVar.f8267x;
                    int i7 = (z5 ? 2 : 0) | (i6 & (-3));
                    nVar.f8267x = i7;
                    if (i6 != i7) {
                        nVar.f8257n.p(false);
                    }
                }
            }
            lVar.v();
        } else {
            int i8 = (i & (-3)) | (z4 ? 2 : 0);
            this.f8267x = i8;
            if (i != i8) {
                this.f8257n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f8267x |= 16;
        } else {
            this.f8267x &= -17;
        }
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8256m = 0;
        this.f8255l = drawable;
        this.f8266w = true;
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8262s = colorStateList;
        this.f8264u = true;
        this.f8266w = true;
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8263t = mode;
        this.f8265v = true;
        this.f8266w = true;
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8252g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.h == c5) {
            return this;
        }
        this.h = c5;
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8244B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8259p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.h = c5;
        this.f8253j = Character.toLowerCase(c6);
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i5 = i & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8268y = i;
        l lVar = this.f8257n;
        lVar.f8226k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8250e = charSequence;
        this.f8257n.p(false);
        SubMenuC0641E subMenuC0641E = this.f8258o;
        if (subMenuC0641E != null) {
            subMenuC0641E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8251f = charSequence;
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i = this.f8267x;
        int i5 = (z4 ? 0 : 8) | (i & (-9));
        this.f8267x = i5;
        if (i != i5) {
            l lVar = this.f8257n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8250e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setContentDescription(CharSequence charSequence) {
        this.f8260q = charSequence;
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setTooltipText(CharSequence charSequence) {
        this.f8261r = charSequence;
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i) {
        if (this.f8253j == c5 && this.f8254k == i) {
            return this;
        }
        this.f8253j = Character.toLowerCase(c5);
        this.f8254k = KeyEvent.normalizeMetaState(i);
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i) {
        if (this.h == c5 && this.i == i) {
            return this;
        }
        this.h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f8257n.p(false);
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i, int i5) {
        this.h = c5;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f8253j = Character.toLowerCase(c6);
        this.f8254k = KeyEvent.normalizeMetaState(i5);
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f8255l = null;
        this.f8256m = i;
        this.f8266w = true;
        this.f8257n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f8257n.f8218a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i5;
        Context context = this.f8257n.f8218a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f8269z = viewInflate;
        this.f8243A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i5 = this.f8246a) > 0) {
            viewInflate.setId(i5);
        }
        l lVar = this.f8257n;
        lVar.f8226k = true;
        lVar.p(true);
        return this;
    }
}
