package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\a.1.smali */
public final class C0642a implements F.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8157a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f8158b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f8159c;

    /* renamed from: d, reason: collision with root package name */
    public char f8160d;

    /* renamed from: e, reason: collision with root package name */
    public int f8161e;

    /* renamed from: f, reason: collision with root package name */
    public char f8162f;

    /* renamed from: g, reason: collision with root package name */
    public int f8163g;
    public Drawable h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f8164j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f8165k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8166l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f8167m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8168n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8169o;

    /* renamed from: p, reason: collision with root package name */
    public int f8170p;

    @Override // F.a
    public final F.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // F.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f8168n || this.f8169o) {
                this.h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.f8168n) {
                    E.b.h(drawableMutate, this.f8166l);
                }
                if (this.f8169o) {
                    E.b.i(this.h, this.f8167m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8163g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8162f;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8164j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // F.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8166l;
    }

    @Override // F.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8167m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8159c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // F.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8161e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8160d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8157a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8158b;
        return charSequence != null ? charSequence : this.f8157a;
    }

    @Override // F.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8165k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8170p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8170p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8170p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8170p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        this.f8162f = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f8170p = (z4 ? 1 : 0) | (this.f8170p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f8170p = (z4 ? 2 : 0) | (this.f8170p & (-3));
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setContentDescription(CharSequence charSequence) {
        this.f8164j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f8170p = (z4 ? 16 : 0) | (this.f8170p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8166l = colorStateList;
        this.f8168n = true;
        c();
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8167m = mode;
        this.f8169o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8159c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        this.f8160d = c5;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f8160d = c5;
        this.f8162f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8157a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8158b = charSequence;
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final F.a setTooltipText(CharSequence charSequence) {
        this.f8165k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f8170p = (this.f8170p & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i) {
        this.f8162f = Character.toLowerCase(c5);
        this.f8163g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8164j = charSequence;
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i) {
        this.f8160d = c5;
        this.f8161e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f8157a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8165k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = B.l.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // F.a, android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i, int i5) {
        this.f8160d = c5;
        this.f8161e = KeyEvent.normalizeMetaState(i);
        this.f8162f = Character.toLowerCase(c6);
        this.f8163g = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
