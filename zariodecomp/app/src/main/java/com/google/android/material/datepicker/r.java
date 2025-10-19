package com.google.android.material.datepicker;

import M.H;
import M.S;
import M.Z;
import M.a0;
import M.v0;
import M.w0;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b2.ViewOnClickListenerC0262a;
import com.google.android.material.internal.CheckableImageButton;
import g0.C0542J;
import g0.C0549a;
import g0.DialogInterfaceOnCancelListenerC0561m;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\r.smali */
public final class r<S> extends DialogInterfaceOnCancelListenerC0561m {

    /* renamed from: A0, reason: collision with root package name */
    public CharSequence f5989A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f5990B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f5991C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f5992D0;
    public CharSequence E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f5993F0;

    /* renamed from: G0, reason: collision with root package name */
    public CharSequence f5994G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f5995H0;
    public CharSequence I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f5996J0;

    /* renamed from: K0, reason: collision with root package name */
    public CharSequence f5997K0;

    /* renamed from: L0, reason: collision with root package name */
    public TextView f5998L0;

    /* renamed from: M0, reason: collision with root package name */
    public TextView f5999M0;

    /* renamed from: N0, reason: collision with root package name */
    public CheckableImageButton f6000N0;

    /* renamed from: O0, reason: collision with root package name */
    public X1.h f6001O0;

    /* renamed from: P0, reason: collision with root package name */
    public Button f6002P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f6003Q0;

    /* renamed from: R0, reason: collision with root package name */
    public CharSequence f6004R0;

    /* renamed from: S0, reason: collision with root package name */
    public CharSequence f6005S0;

    /* renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet f6006q0 = new LinkedHashSet();

    /* renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet f6007r0 = new LinkedHashSet();

    /* renamed from: s0, reason: collision with root package name */
    public final LinkedHashSet f6008s0 = new LinkedHashSet();

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f6009t0 = new LinkedHashSet();

    /* renamed from: u0, reason: collision with root package name */
    public int f6010u0;

    /* renamed from: v0, reason: collision with root package name */
    public A f6011v0;

    /* renamed from: w0, reason: collision with root package name */
    public y f6012w0;

    /* renamed from: x0, reason: collision with root package name */
    public C0383c f6013x0;

    /* renamed from: y0, reason: collision with root package name */
    public o f6014y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f6015z0;

    public static int e0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131100289);
        Calendar calendarD = D.d();
        calendarD.set(5, 1);
        Calendar calendarC = D.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131100295) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131100309)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean g0(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p1.b.Q(context, 2130903763, o.class.getCanonicalName()).data, new int[]{i});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) throws Resources.NotFoundException {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f7532f;
        }
        this.f6010u0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f6011v0 = (A) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6013x0 = (C0383c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6015z0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5989A0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f5991C0 = bundle.getInt("INPUT_MODE_KEY");
        this.f5992D0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5993F0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5994G0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5995H0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5996J0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5997K0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f5989A0;
        if (text == null) {
            text = S().getResources().getText(this.f6015z0);
        }
        this.f6004R0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f6005S0 = text;
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f5990B0 ? 2131427434 : 2131427433, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f5990B0) {
            viewInflate.findViewById(2131231047).setLayoutParams(new LinearLayout.LayoutParams(e0(context), -2));
        } else {
            viewInflate.findViewById(2131231048).setLayoutParams(new LinearLayout.LayoutParams(e0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(2131231059);
        this.f5999M0 = textView;
        WeakHashMap weakHashMap = S.f2363a;
        M.E.f(textView, 1);
        this.f6000N0 = (CheckableImageButton) viewInflate.findViewById(2131231061);
        this.f5998L0 = (TextView) viewInflate.findViewById(2131231065);
        this.f6000N0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f6000N0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, r1.d.B(context, 2131165382));
        stateListDrawable.addState(new int[0], r1.d.B(context, 2131165384));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f6000N0.setChecked(this.f5991C0 != 0);
        S.h(this.f6000N0, null);
        j0(this.f6000N0);
        this.f6000N0.setOnClickListener(new ViewOnClickListenerC0262a(this, 3));
        this.f6002P0 = (Button) viewInflate.findViewById(2131230880);
        if (c0().e()) {
            this.f6002P0.setEnabled(true);
        } else {
            this.f6002P0.setEnabled(false);
        }
        this.f6002P0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.E0;
        if (charSequence != null) {
            this.f6002P0.setText(charSequence);
        } else {
            int i = this.f5992D0;
            if (i != 0) {
                this.f6002P0.setText(i);
            }
        }
        CharSequence charSequence2 = this.f5994G0;
        if (charSequence2 != null) {
            this.f6002P0.setContentDescription(charSequence2);
        } else if (this.f5993F0 != 0) {
            this.f6002P0.setContentDescription(n().getResources().getText(this.f5993F0));
        }
        this.f6002P0.setOnClickListener(new p(this, 0));
        Button button = (Button) viewInflate.findViewById(2131230854);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.I0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i5 = this.f5995H0;
            if (i5 != 0) {
                button.setText(i5);
            }
        }
        CharSequence charSequence4 = this.f5997K0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f5996J0 != 0) {
            button.setContentDescription(n().getResources().getText(this.f5996J0));
        }
        button.setOnClickListener(new p(this, 1));
        return viewInflate;
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, g0.AbstractComponentCallbacksC0567t
    public final void L(Bundle bundle) {
        super.L(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6010u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6011v0);
        C0383c c0383c = this.f6013x0;
        C0381a c0381a = new C0381a();
        c0381a.f5937a = C0381a.f5935f;
        c0381a.f5938b = C0381a.f5936g;
        c0381a.f5941e = new h(Long.MIN_VALUE);
        c0381a.f5937a = c0383c.f5942a.f6024f;
        c0381a.f5938b = c0383c.f5943b.f6024f;
        c0381a.f5939c = Long.valueOf(c0383c.f5945d.f6024f);
        c0381a.f5940d = c0383c.f5946e;
        c0381a.f5941e = c0383c.f5944c;
        o oVar = this.f6014y0;
        t tVar = oVar == null ? null : oVar.f5976e0;
        if (tVar != null) {
            c0381a.f5939c = Long.valueOf(tVar.f6024f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0381a.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6015z0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5989A0);
        bundle.putInt("INPUT_MODE_KEY", this.f5991C0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f5992D0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5993F0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5994G0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5995H0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5996J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5997K0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g0.DialogInterfaceOnCancelListenerC0561m, g0.AbstractComponentCallbacksC0567t
    public final void M() throws Resources.NotFoundException {
        v0 v0Var;
        v0 v0Var2;
        super.M();
        Window window = a0().getWindow();
        if (this.f5990B0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f6001O0);
            if (!this.f6003Q0) {
                View viewFindViewById = T().findViewById(2131230955);
                Drawable background = viewFindViewById.getBackground();
                ColorStateList colorStateListValueOf = background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
                Integer numValueOf = colorStateListValueOf != null ? Integer.valueOf(colorStateListValueOf.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z4 = numValueOf == null || numValueOf.intValue() == 0;
                int iG = AbstractC0156x.G(window.getContext(), R.attr.colorBackground, -16777216);
                if (z4) {
                    numValueOf = Integer.valueOf(iG);
                }
                if (i >= 30) {
                    a0.a(window, false);
                } else {
                    Z.a(window, false);
                }
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z5 = AbstractC0156x.O(0) || AbstractC0156x.O(numValueOf.intValue());
                G2.e eVar = new G2.e(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    w0 w0Var = new w0(window.getInsetsController(), eVar);
                    w0Var.f2430b = window;
                    v0Var = w0Var;
                } else {
                    v0Var = new v0(window, eVar);
                }
                v0Var.f0(z5);
                boolean z6 = AbstractC0156x.O(0) || AbstractC0156x.O(iG);
                G2.e eVar2 = new G2.e(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    w0 w0Var2 = new w0(window.getInsetsController(), eVar2);
                    w0Var2.f2430b = window;
                    v0Var2 = w0Var2;
                } else {
                    v0Var2 = new v0(window, eVar2);
                }
                v0Var2.e0(z6);
                C1.b bVar = new C1.b(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = S.f2363a;
                H.u(viewFindViewById, bVar);
                this.f6003Q0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(2131100297);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f6001O0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new M1.a(a0(), rect));
        }
        h0();
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, g0.AbstractComponentCallbacksC0567t
    public final void N() {
        this.f6012w0.f6041a0.clear();
        super.N();
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m
    public final Dialog Z() {
        Dialog dialog = new Dialog(S(), f0(S()));
        Context context = dialog.getContext();
        this.f5990B0 = g0(context, R.attr.windowFullscreen);
        this.f6001O0 = new X1.h(context, null, 2130903763, 2131952662);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, A1.a.f56q, 2130903763, 2131952662);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6001O0.j(context);
        this.f6001O0.m(ColorStateList.valueOf(color));
        X1.h hVar = this.f6001O0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = S.f2363a;
        hVar.l(H.i(decorView));
        return dialog;
    }

    public final A c0() {
        if (this.f6011v0 == null) {
            this.f6011v0 = (A) this.f7532f.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f6011v0;
    }

    public final String d0() {
        A aC0 = c0();
        Context contextN = n();
        aC0.getClass();
        Resources resources = contextN.getResources();
        Long l4 = aC0.f5924b;
        if (l4 == null && aC0.f5925c == null) {
            return resources.getString(2131886413);
        }
        Long l5 = aC0.f5925c;
        if (l5 == null) {
            return resources.getString(2131886410, AbstractC0183a.C(l4.longValue()));
        }
        if (l4 == null) {
            return resources.getString(2131886409, AbstractC0183a.C(l5.longValue()));
        }
        L.c cVarB = AbstractC0183a.B(l4, l5);
        return resources.getString(2131886411, cVarB.a, cVarB.b);
    }

    public final int f0(Context context) {
        int i = this.f6010u0;
        if (i != 0) {
            return i;
        }
        c0().getClass();
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return p1.b.Q(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(2131100308) ? 2130903764 : 2130903753, r.class.getCanonicalName()).data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.material.datepicker.s, g0.t] */
    public final void h0() {
        int iF0 = f0(S());
        A aC0 = c0();
        C0383c c0383c = this.f6013x0;
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iF0);
        bundle.putParcelable("GRID_SELECTOR_KEY", aC0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0383c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0383c.f5945d);
        oVar.W(bundle);
        this.f6014y0 = oVar;
        if (this.f5991C0 == 1) {
            A aC02 = c0();
            C0383c c0383c2 = this.f6013x0;
            ?? sVar = new s();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iF0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", aC02);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0383c2);
            sVar.W(bundle2);
            oVar = sVar;
        }
        this.f6012w0 = oVar;
        this.f5998L0.setText((this.f5991C0 == 1 && q().getConfiguration().orientation == 2) ? this.f6005S0 : this.f6004R0);
        i0(d0());
        C0542J c0542jM = m();
        c0542jM.getClass();
        C0549a c0549a = new C0549a(c0542jM);
        c0549a.e(2131231047, this.f6012w0, null, 2);
        if (c0549a.f7420g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0549a.h = false;
        c0549a.f7428q.y(c0549a, false);
        this.f6012w0.Y(new q(0, this));
    }

    public final void i0(String str) {
        TextView textView = this.f5999M0;
        A aC0 = c0();
        Context contextS = S();
        aC0.getClass();
        Resources resources = contextS.getResources();
        L.c cVarB = AbstractC0183a.B(aC0.f5924b, aC0.f5925c);
        Object obj = cVarB.a;
        String string = obj == null ? resources.getString(2131886394) : (String) obj;
        Object obj2 = cVarB.b;
        textView.setContentDescription(resources.getString(2131886392, string, obj2 == null ? resources.getString(2131886394) : (String) obj2));
        this.f5999M0.setText(str);
    }

    public final void j0(CheckableImageButton checkableImageButton) {
        this.f6000N0.setContentDescription(this.f5991C0 == 1 ? checkableImageButton.getContext().getString(2131886423) : checkableImageButton.getContext().getString(2131886425));
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6008s0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // g0.DialogInterfaceOnCancelListenerC0561m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6009t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f7512J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
