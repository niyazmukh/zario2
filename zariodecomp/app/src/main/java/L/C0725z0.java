package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import f.AbstractC0489a;
import java.util.WeakHashMap;
import k.InterfaceC0639C;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\z0.1.smali */
public class C0725z0 implements InterfaceC0639C {

    /* renamed from: B, reason: collision with root package name */
    public Rect f8721B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8722C;

    /* renamed from: D, reason: collision with root package name */
    public final C0722y f8723D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8724a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f8725b;

    /* renamed from: c, reason: collision with root package name */
    public C0703n0 f8726c;

    /* renamed from: f, reason: collision with root package name */
    public int f8729f;

    /* renamed from: k, reason: collision with root package name */
    public int f8730k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8732m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8733n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8734o;

    /* renamed from: r, reason: collision with root package name */
    public T.b f8737r;

    /* renamed from: s, reason: collision with root package name */
    public View f8738s;

    /* renamed from: t, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8739t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f8740u;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f8745z;

    /* renamed from: d, reason: collision with root package name */
    public final int f8727d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f8728e = -2;

    /* renamed from: l, reason: collision with root package name */
    public final int f8731l = 1002;

    /* renamed from: p, reason: collision with root package name */
    public int f8735p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final int f8736q = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0719w0 f8741v = new RunnableC0719w0(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final ViewOnTouchListenerC0723y0 f8742w = new ViewOnTouchListenerC0723y0(this);

    /* renamed from: x, reason: collision with root package name */
    public final C0721x0 f8743x = new C0721x0(this);

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0719w0 f8744y = new RunnableC0719w0(this, 0);

    /* renamed from: A, reason: collision with root package name */
    public final Rect f8720A = new Rect();

    public C0725z0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f8724a = context;
        this.f8745z = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6974o, i, 0);
        this.f8729f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8730k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8732m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0722y c0722y = new C0722y(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6978s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            Q.n.c(c0722y, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0722y.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : r1.d.B(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f8723D = c0722y;
        c0722y.setInputMethodMode(1);
    }

    public final void a(int i) {
        this.f8729f = i;
    }

    @Override // k.InterfaceC0639C
    public final boolean b() {
        return this.f8723D.isShowing();
    }

    public final int d() {
        return this.f8729f;
    }

    @Override // k.InterfaceC0639C
    public final void dismiss() {
        C0722y c0722y = this.f8723D;
        c0722y.dismiss();
        c0722y.setContentView(null);
        this.f8726c = null;
        this.f8745z.removeCallbacks(this.f8741v);
    }

    @Override // k.InterfaceC0639C
    public final void f() {
        int i;
        int paddingBottom;
        C0703n0 c0703n0;
        C0703n0 c0703n02 = this.f8726c;
        C0722y c0722y = this.f8723D;
        Context context = this.f8724a;
        if (c0703n02 == null) {
            C0703n0 c0703n0Q = q(context, !this.f8722C);
            this.f8726c = c0703n0Q;
            c0703n0Q.setAdapter(this.f8725b);
            this.f8726c.setOnItemClickListener(this.f8739t);
            this.f8726c.setFocusable(true);
            this.f8726c.setFocusableInTouchMode(true);
            this.f8726c.setOnItemSelectedListener(new C0714t0(this, 0));
            this.f8726c.setOnScrollListener(this.f8743x);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8740u;
            if (onItemSelectedListener != null) {
                this.f8726c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0722y.setContentView(this.f8726c);
        }
        Drawable background = c0722y.getBackground();
        Rect rect = this.f8720A;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f8732m) {
                this.f8730k = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = AbstractC0715u0.a(c0722y, this.f8738s, this.f8730k, c0722y.getInputMethodMode() == 2);
        int i6 = this.f8727d;
        if (i6 == -1) {
            paddingBottom = iA + i;
        } else {
            int i7 = this.f8728e;
            int iA2 = this.f8726c.a(i7 != -2 ? i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f8726c.getPaddingBottom() + this.f8726c.getPaddingTop() + i : 0);
        }
        boolean z4 = this.f8723D.getInputMethodMode() == 2;
        Q.n.d(c0722y, this.f8731l);
        if (c0722y.isShowing()) {
            View view = this.f8738s;
            WeakHashMap weakHashMap = M.S.f2363a;
            if (M.E.b(view)) {
                int width = this.f8728e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8738s.getWidth();
                }
                if (i6 == -1) {
                    i6 = z4 ? paddingBottom : -1;
                    if (z4) {
                        c0722y.setWidth(this.f8728e == -1 ? -1 : 0);
                        c0722y.setHeight(0);
                    } else {
                        c0722y.setWidth(this.f8728e == -1 ? -1 : 0);
                        c0722y.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                c0722y.setOutsideTouchable(true);
                c0722y.update(this.f8738s, this.f8729f, this.f8730k, width < 0 ? -1 : width, i6 < 0 ? -1 : i6);
                return;
            }
            return;
        }
        int width2 = this.f8728e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8738s.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        c0722y.setWidth(width2);
        c0722y.setHeight(i6);
        AbstractC0717v0.b(c0722y, true);
        c0722y.setOutsideTouchable(true);
        c0722y.setTouchInterceptor(this.f8742w);
        if (this.f8734o) {
            Q.n.c(c0722y, this.f8733n);
        }
        AbstractC0717v0.a(c0722y, this.f8721B);
        Q.m.a(c0722y, this.f8738s, this.f8729f, this.f8730k, this.f8735p);
        this.f8726c.setSelection(-1);
        if ((!this.f8722C || this.f8726c.isInTouchMode()) && (c0703n0 = this.f8726c) != null) {
            c0703n0.setListSelectionHidden(true);
            c0703n0.requestLayout();
        }
        if (this.f8722C) {
            return;
        }
        this.f8745z.post(this.f8744y);
    }

    public final int g() {
        if (this.f8732m) {
            return this.f8730k;
        }
        return 0;
    }

    public final Drawable h() {
        return this.f8723D.getBackground();
    }

    @Override // k.InterfaceC0639C
    public final C0703n0 j() {
        return this.f8726c;
    }

    public final void l(Drawable drawable) {
        this.f8723D.setBackgroundDrawable(drawable);
    }

    public final void m(int i) {
        this.f8730k = i;
        this.f8732m = true;
    }

    public void o(ListAdapter listAdapter) {
        T.b bVar = this.f8737r;
        if (bVar == null) {
            this.f8737r = new T.b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f8725b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f8725b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8737r);
        }
        C0703n0 c0703n0 = this.f8726c;
        if (c0703n0 != null) {
            c0703n0.setAdapter(this.f8725b);
        }
    }

    public C0703n0 q(Context context, boolean z4) {
        return new C0703n0(context, z4);
    }

    public final void r(int i) {
        Drawable background = this.f8723D.getBackground();
        if (background == null) {
            this.f8728e = i;
            return;
        }
        Rect rect = this.f8720A;
        background.getPadding(rect);
        this.f8728e = rect.left + rect.right + i;
    }
}
