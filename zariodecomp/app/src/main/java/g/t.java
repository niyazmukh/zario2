package g;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\t.smali */
public final class t implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f7222a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7223b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7224c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f7226e;

    public t(y yVar, Window.Callback callback) {
        this.f7226e = yVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f7222a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f7223b = true;
            callback.onContentChanged();
        } finally {
            this.f7223b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f7222a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f7222a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.m.a(this.f7222a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7222a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f7224c;
        Window.Callback callback = this.f7222a;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.f7226e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            android.view.Window$Callback r0 = r5.f7222a
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r6.getKeyCode()
            g.y r5 = r5.f7226e
            r5.z()
            g.H r2 = r5.f7291s
            r3 = 0
            if (r2 == 0) goto L3d
            g.G r2 = r2.f7142n
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            k.l r2 = r2.f7127d
            if (r2 == 0) goto L1b
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r5 = r1
            goto L6b
        L3d:
            g.x r0 = r5.f7266Q
            if (r0 == 0) goto L52
            int r2 = r6.getKeyCode()
            boolean r0 = r5.E(r0, r2, r6)
            if (r0 == 0) goto L52
            g.x r5 = r5.f7266Q
            if (r5 == 0) goto L3b
            r5.f7242l = r1
            goto L3b
        L52:
            g.x r0 = r5.f7266Q
            if (r0 != 0) goto L6a
            g.x r0 = r5.y(r3)
            r5.F(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.E(r0, r2, r6)
            r0.f7241k = r3
            if (r5 == 0) goto L6a
            goto L3b
        L6a:
            r5 = r3
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r3
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.t.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7222a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7222a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7222a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f7222a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f7222a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f7222a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f7223b) {
            this.f7222a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof k.l)) {
            return this.f7222a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f7222a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f7222a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f7222a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i, menu);
        y yVar = this.f7226e;
        if (i == 108) {
            yVar.z();
            H h = yVar.f7291s;
            if (h != null && true != h.f7145q) {
                h.f7145q = true;
                ArrayList arrayList = h.f7146r;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            yVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f7225d) {
            this.f7222a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        y yVar = this.f7226e;
        if (i != 108) {
            if (i != 0) {
                yVar.getClass();
                return;
            }
            x xVarY = yVar.y(i);
            if (xVarY.f7243m) {
                yVar.r(xVarY, false);
                return;
            }
            return;
        }
        yVar.z();
        H h = yVar.f7291s;
        if (h == null || !h.f7145q) {
            return;
        }
        h.f7145q = false;
        ArrayList arrayList = h.f7146r;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        j.n.a(this.f7222a, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.l lVar = menu instanceof k.l ? (k.l) menu : null;
        if (i == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f8239x = true;
        }
        boolean zOnPreparePanel = this.f7222a.onPreparePanel(i, view, menu);
        if (lVar != null) {
            lVar.f8239x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        k.l lVar = this.f7226e.y(0).h;
        if (lVar != null) {
            d(list, lVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.l.a(this.f7222a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7222a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f7222a.onWindowFocusChanged(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r8, int r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.t.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f7222a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
