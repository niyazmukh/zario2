package M;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: M.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\n.1.smali */
public final class C0128n {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2404a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2405b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2406c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2407d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2408e;

    public C0128n(ViewGroup viewGroup) {
        this.f2406c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z4) {
        ViewParent viewParentE;
        if (!this.f2407d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return V.a(viewParentE, this.f2406c, f2, f3, z4);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent viewParentE;
        if (!this.f2407d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return V.b(viewParentE, this.f2406c, f2, f3);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public final boolean c(int i, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f2407d || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2406c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            int i9 = iArr2[0];
            i8 = iArr2[1];
            i7 = i9;
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f2408e == null) {
                this.f2408e = new int[2];
            }
            iArr3 = this.f2408e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0129o) {
            ((InterfaceC0129o) viewParentE).c(viewGroup, i, i5, iArr3, i6);
        } else if (i6 == 0) {
            try {
                V.c(viewParentE, viewGroup, i, i5, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f2407d || (viewParentE = e(i8)) == null) {
            return false;
        }
        if (i == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f2406c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f2408e == null) {
                this.f2408e = new int[2];
            }
            int[] iArr4 = this.f2408e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0130p) {
            ((InterfaceC0130p) viewParentE).d(viewGroup, i, i5, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (viewParentE instanceof InterfaceC0129o) {
                ((InterfaceC0129o) viewParentE).e(viewGroup, i, i5, i6, i7, i8);
            } else if (i8 == 0) {
                try {
                    V.d(viewParentE, viewGroup, i, i5, i6, i7);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e5);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f2404a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2405b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i5) {
        boolean zF;
        if (f(i5)) {
            return true;
        }
        if (this.f2407d) {
            ViewGroup viewGroup = this.f2406c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof InterfaceC0129o;
                if (z4) {
                    zF = ((InterfaceC0129o) parent).f(view, viewGroup, i, i5);
                } else if (i5 == 0) {
                    try {
                        zF = V.f(parent, view, viewGroup, i);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i5 == 0) {
                        this.f2404a = parent;
                    } else if (i5 == 1) {
                        this.f2405b = parent;
                    }
                    if (z4) {
                        ((InterfaceC0129o) parent).a(view, viewGroup, i, i5);
                    } else if (i5 == 0) {
                        try {
                            V.e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z4 = viewParentE instanceof InterfaceC0129o;
            ViewGroup viewGroup = this.f2406c;
            if (z4) {
                ((InterfaceC0129o) viewParentE).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    V.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                this.f2404a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2405b = null;
            }
        }
    }
}
