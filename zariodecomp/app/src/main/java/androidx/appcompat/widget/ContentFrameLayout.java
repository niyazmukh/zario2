package androidx.appcompat.widget;

import M.X;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.y;
import k.l;
import l.C0685e;
import l.C0693i;
import l.InterfaceC0686e0;
import l.InterfaceC0688f0;
import l.f1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ContentFrameLayout.smali */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f4215a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f4216b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4217c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f4218d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f4219e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f4220f;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f4221k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0686e0 f4222l;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4221k = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4219e == null) {
            this.f4219e = new TypedValue();
        }
        return this.f4219e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4220f == null) {
            this.f4220f = new TypedValue();
        }
        return this.f4220f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4217c == null) {
            this.f4217c = new TypedValue();
        }
        return this.f4217c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4218d == null) {
            this.f4218d = new TypedValue();
        }
        return this.f4218d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4215a == null) {
            this.f4215a = new TypedValue();
        }
        return this.f4215a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4216b == null) {
            this.f4216b = new TypedValue();
        }
        return this.f4216b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0686e0 interfaceC0686e0 = this.f4222l;
        if (interfaceC0686e0 != null) {
            interfaceC0686e0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0693i c0693i;
        super.onDetachedFromWindow();
        K2.c cVar = this.f4222l;
        if (cVar != null) {
            y yVar = (y) cVar.b;
            InterfaceC0688f0 interfaceC0688f0 = yVar.f7294v;
            if (interfaceC0688f0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0688f0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((f1) actionBarOverlayLayout.f4182e).f8574a.f4287a;
                if (actionMenuView != null && (c0693i = actionMenuView.f4208x) != null) {
                    c0693i.f();
                    C0685e c0685e = c0693i.f8613x;
                    if (c0685e != null && c0685e.b()) {
                        c0685e.i.dismiss();
                    }
                }
            }
            if (yVar.f7251A != null) {
                yVar.f7288p.getDecorView().removeCallbacks(yVar.f7252B);
                if (yVar.f7251A.isShowing()) {
                    try {
                        yVar.f7251A.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                yVar.f7251A = null;
            }
            X x3 = yVar.f7253C;
            if (x3 != null) {
                x3.b();
            }
            l lVar = yVar.y(0).h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0686e0 interfaceC0686e0) {
        this.f4222l = interfaceC0686e0;
    }
}
