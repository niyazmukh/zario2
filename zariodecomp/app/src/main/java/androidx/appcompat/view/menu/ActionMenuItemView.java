package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.AbstractC0489a;
import k.AbstractC0644c;
import k.C0643b;
import k.k;
import k.l;
import k.n;
import k.z;
import l.InterfaceC0695j;
import l.Y;
import l.g1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\view\menu\ActionMenuItemView.smali */
public class ActionMenuItemView extends Y implements z, View.OnClickListener, InterfaceC0695j {

    /* renamed from: k, reason: collision with root package name */
    public n f4113k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4114l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4115m;

    /* renamed from: n, reason: collision with root package name */
    public k f4116n;

    /* renamed from: o, reason: collision with root package name */
    public C0643b f4117o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0644c f4118p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4119q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4120r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4121s;

    /* renamed from: t, reason: collision with root package name */
    public int f4122t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4123u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4119q = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6964c, 0, 0);
        this.f4121s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4123u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4122t = -1;
        setSaveEnabled(false);
    }

    @Override // l.InterfaceC0695j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC0695j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f4113k.getIcon() == null;
    }

    @Override // k.z
    public final void c(n nVar) {
        this.f4113k = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f8246a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f4117o == null) {
            this.f4117o = new C0643b(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.z
    public n getItemData() {
        return this.f4113k;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f4114l);
        if (this.f4115m != null && ((this.f4113k.f8268y & 4) != 4 || (!this.f4119q && !this.f4120r))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f4114l : null);
        CharSequence charSequence = this.f4113k.f8260q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f4113k.f8250e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4113k.f8261r;
        if (TextUtils.isEmpty(charSequence2)) {
            g1.a(this, z6 ? null : this.f4113k.f8250e);
        } else {
            g1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f4116n;
        if (kVar != null) {
            kVar.a(this.f4113k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4119q = g();
        h();
    }

    @Override // l.Y, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i6 = this.f4122t) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i5);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f4121s;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (!zIsEmpty || this.f4115m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4115m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0643b c0643b;
        if (this.f4113k.hasSubMenu() && (c0643b = this.f4117o) != null && c0643b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f4120r != z4) {
            this.f4120r = z4;
            n nVar = this.f4113k;
            if (nVar != null) {
                l lVar = nVar.f8257n;
                lVar.f8226k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4115m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4123u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(k kVar) {
        this.f4116n = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i5, int i6, int i7) {
        this.f4122t = i;
        super.setPadding(i, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC0644c abstractC0644c) {
        this.f4118p = abstractC0644c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4114l = charSequence;
        h();
    }
}
