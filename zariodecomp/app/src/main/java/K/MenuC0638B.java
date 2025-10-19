package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import q.C0834k;

/* renamed from: k.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\B.smali */
public class MenuC0638B extends g.v implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final l f8135c;

    public MenuC0638B(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f8135c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f8135c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f8135c.addIntentOptions(i, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = g(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f8135c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0834k c0834k = (C0834k) this.f7231b;
        if (c0834k != null) {
            c0834k.clear();
        }
        this.f8135c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f8135c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f8135c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f8135c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f8135c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f8135c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i5) {
        return this.f8135c.performIdentifierAction(i, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i5) {
        return this.f8135c.performShortcut(i, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C0834k) this.f7231b) != null) {
            int i5 = 0;
            while (true) {
                C0834k c0834k = (C0834k) this.f7231b;
                if (i5 >= c0834k.f9428c) {
                    break;
                }
                if (((F.a) c0834k.h(i5)).getGroupId() == i) {
                    ((C0834k) this.f7231b).i(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.f8135c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C0834k) this.f7231b) != null) {
            int i5 = 0;
            while (true) {
                C0834k c0834k = (C0834k) this.f7231b;
                if (i5 >= c0834k.f9428c) {
                    break;
                }
                if (((F.a) c0834k.h(i5)).getItemId() == i) {
                    ((C0834k) this.f7231b).i(i5);
                    break;
                }
                i5++;
            }
        }
        this.f8135c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z5) {
        this.f8135c.setGroupCheckable(i, z4, z5);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        this.f8135c.setGroupEnabled(i, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        this.f8135c.setGroupVisible(i, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f8135c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8135c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f8135c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f8135c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, CharSequence charSequence) {
        return this.f8135c.addSubMenu(i, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, CharSequence charSequence) {
        return g(this.f8135c.a(i, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, int i7) {
        return this.f8135c.addSubMenu(i, i5, i6, i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, int i7) {
        return g(this.f8135c.add(i, i5, i6, i7));
    }
}
