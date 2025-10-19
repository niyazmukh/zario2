package g;

import M.I;
import M.S;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\f.1.smali */
public final class DialogInterfaceC0531f extends b.m implements DialogInterface, j {

    /* renamed from: d, reason: collision with root package name */
    public y f7199d;

    /* renamed from: e, reason: collision with root package name */
    public final z f7200e;

    /* renamed from: f, reason: collision with root package name */
    public final C0530e f7201f;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceC0531f(ContextThemeWrapper contextThemeWrapper, int i) {
        int i5;
        int iH = h(contextThemeWrapper, i);
        if (iH == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130903405, typedValue, true);
            i5 = typedValue.resourceId;
        } else {
            i5 = iH;
        }
        super(contextThemeWrapper, i5);
        this.f7200e = new z(this);
        n nVarE = e();
        if (iH == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(2130903405, typedValue2, true);
            iH = typedValue2.resourceId;
        }
        ((y) nVarE).X = iH;
        nVarE.c();
        this.f7201f = new C0530e(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130903085, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) e();
        yVar.v();
        ((ViewGroup) yVar.f7255E.findViewById(R.id.content)).addView(view, layoutParams);
        yVar.f7289q.a(yVar.f7288p.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface
    public final void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        e().d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        z zVar = this.f7200e;
        if (zVar == null) {
            return false;
        }
        return super/*android.app.Dialog*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n e() {
        if (this.f7199d == null) {
            T0.m mVar = n.f7208a;
            this.f7199d = new y(getContext(), getWindow(), this, this);
        }
        return this.f7199d;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) e();
        yVar.v();
        return yVar.f7288p.findViewById(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(CharSequence charSequence) {
        super/*android.app.Dialog*/.setTitle(charSequence);
        e().k(charSequence);
    }

    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y yVar = (y) e();
        if (yVar.f7291s != null) {
            yVar.z();
            yVar.f7291s.getClass();
            yVar.A(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        C0530e c0530e = this.f7201f;
        c0530e.f7176b.setContentView(c0530e.f7196x);
        Window window = c0530e.f7177c;
        View viewFindViewById2 = window.findViewById(2131231107);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131231250);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131230883);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131230852);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131230890);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(2131231250);
        View viewFindViewById7 = viewGroup.findViewById(2131230883);
        View viewFindViewById8 = viewGroup.findViewById(2131230852);
        ViewGroup viewGroupA = C0530e.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C0530e.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C0530e.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131231151);
        c0530e.f7188p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0530e.f7188p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(R.id.message);
        c0530e.f7192t = textView;
        if (textView != null) {
            CharSequence charSequence = c0530e.f7179e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0530e.f7188p.removeView(c0530e.f7192t);
                if (c0530e.f7180f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0530e.f7188p.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0530e.f7188p);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0530e.f7180f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupA2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupA3.findViewById(R.id.button1);
        c0530e.f7181g = button;
        com.google.android.material.datepicker.n nVar = c0530e.f7174D;
        button.setOnClickListener(nVar);
        if (TextUtils.isEmpty(c0530e.h)) {
            c0530e.f7181g.setVisibility(8);
            i = 0;
        } else {
            c0530e.f7181g.setText(c0530e.h);
            c0530e.f7181g.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(R.id.button2);
        c0530e.f7182j = button2;
        button2.setOnClickListener(nVar);
        if (TextUtils.isEmpty(c0530e.f7183k)) {
            c0530e.f7182j.setVisibility(8);
        } else {
            c0530e.f7182j.setText(c0530e.f7183k);
            c0530e.f7182j.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(R.id.button3);
        c0530e.f7185m = button3;
        button3.setOnClickListener(nVar);
        if (TextUtils.isEmpty(c0530e.f7186n)) {
            c0530e.f7185m.setVisibility(8);
        } else {
            c0530e.f7185m.setText(c0530e.f7186n);
            c0530e.f7185m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0530e.f7175a.getTheme().resolveAttribute(2130903083, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0530e.f7181g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0530e.f7182j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0530e.f7185m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c0530e.f7193u != null) {
            viewGroupA.addView(c0530e.f7193u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131231247).setVisibility(8);
        } else {
            c0530e.f7190r = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c0530e.f7178d) || !c0530e.f7172B) {
                window.findViewById(2131231247).setVisibility(8);
                c0530e.f7190r.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131230816);
                c0530e.f7191s = textView2;
                textView2.setText(c0530e.f7178d);
                Drawable drawable = c0530e.f7189q;
                if (drawable != null) {
                    c0530e.f7190r.setImageDrawable(drawable);
                } else {
                    c0530e.f7191s.setPadding(c0530e.f7190r.getPaddingLeft(), c0530e.f7190r.getPaddingTop(), c0530e.f7190r.getPaddingRight(), c0530e.f7190r.getPaddingBottom());
                    c0530e.f7190r.setVisibility(8);
                }
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z5 = viewGroupA3.getVisibility() != 8;
        if (!z5 && (viewFindViewById = viewGroupA2.findViewById(2131231224)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c0530e.f7188p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0530e.f7179e == null && c0530e.f7180f == null) ? null : viewGroupA.findViewById(2131231246);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(2131231225);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0530e.f7180f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z5 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4111a, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4112b);
            }
        }
        if (!z4) {
            View view = c0530e.f7180f;
            if (view == null) {
                view = c0530e.f7188p;
            }
            if (view != null) {
                int i6 = (z5 ? 2 : 0) | i5;
                View viewFindViewById11 = window.findViewById(2131231150);
                View viewFindViewById12 = window.findViewById(2131231149);
                WeakHashMap weakHashMap = S.f2363a;
                I.d(view, i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0530e.f7180f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0530e.f7194v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = c0530e.f7195w;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7201f.f7188p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super/*android.app.Dialog*/.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7201f.f7188p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super/*android.app.Dialog*/.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        y yVar = (y) e();
        yVar.z();
        H h = yVar.f7291s;
        if (h != null) {
            h.f7153y = false;
            j.k kVar = h.f7152x;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public final void setContentView(int i) {
        e().h(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(int i) {
        super/*android.app.Dialog*/.setTitle(i);
        e().k(getContext().getString(i));
    }

    public final void setContentView(View view) {
        e().i(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().j(view, layoutParams);
    }

    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        C0530e c0530e = this.f7201f;
        c0530e.f7178d = charSequence;
        TextView textView = c0530e.f7191s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
