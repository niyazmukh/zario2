package androidx.appcompat.view.menu;

import A2.C0009i;
import M.B;
import M.S;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import f.AbstractC0489a;
import java.util.WeakHashMap;
import k.n;
import k.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\view\menu\ListMenuItemView.smali */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public n f4126a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f4127b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f4128c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f4129d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f4130e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4131f;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f4132k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f4133l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f4134m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f4135n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4136o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f4137p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4138q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f4139r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4140s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f4141t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4142u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0009i c0009iY = C0009i.Y(getContext(), attributeSet, AbstractC0489a.f6977r, 2130903725);
        this.f4135n = c0009iY.I(5);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        this.f4136o = typedArray.getResourceId(1, -1);
        this.f4138q = typedArray.getBoolean(7, false);
        this.f4137p = context;
        this.f4139r = c0009iY.I(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130903432, 0);
        this.f4140s = typedArrayObtainStyledAttributes.hasValue(0);
        c0009iY.e0();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4141t == null) {
            this.f4141t = LayoutInflater.from(getContext());
        }
        return this.f4141t;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f4132k;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4133l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4133l.getLayoutParams();
        rect.top = this.f4133l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // k.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k.n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(k.n):void");
    }

    @Override // k.z
    public n getItemData() {
        return this.f4126a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = S.f2363a;
        B.q(this, this.f4135n);
        TextView textView = (TextView) findViewById(2131231245);
        this.f4129d = textView;
        int i = this.f4136o;
        if (i != -1) {
            textView.setTextAppearance(this.f4137p, i);
        }
        this.f4131f = (TextView) findViewById(2131231166);
        ImageView imageView = (ImageView) findViewById(2131231203);
        this.f4132k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4139r);
        }
        this.f4133l = (ImageView) findViewById(2131230961);
        this.f4134m = (LinearLayout) findViewById(2131230882);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        if (this.f4127b != null && this.f4138q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4127b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f4128c == null && this.f4130e == null) {
            return;
        }
        if ((this.f4126a.f8267x & 4) != 0) {
            if (this.f4128c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.f4128c = radioButton;
                LinearLayout linearLayout = this.f4134m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4128c;
            view = this.f4130e;
        } else {
            if (this.f4130e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.f4130e = checkBox;
                LinearLayout linearLayout2 = this.f4134m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4130e;
            view = this.f4128c;
        }
        if (z4) {
            compoundButton.setChecked(this.f4126a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4130e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4128c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f4126a.f8267x & 4) != 0) {
            if (this.f4128c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131427345, (ViewGroup) this, false);
                this.f4128c = radioButton;
                LinearLayout linearLayout = this.f4134m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4128c;
        } else {
            if (this.f4130e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131427342, (ViewGroup) this, false);
                this.f4130e = checkBox;
                LinearLayout linearLayout2 = this.f4134m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4130e;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f4142u = z4;
        this.f4138q = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f4133l;
        if (imageView != null) {
            imageView.setVisibility((this.f4140s || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4126a.f8257n.getClass();
        boolean z4 = this.f4142u;
        if (z4 || this.f4138q) {
            ImageView imageView = this.f4127b;
            if (imageView == null && drawable == null && !this.f4138q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131427343, (ViewGroup) this, false);
                this.f4127b = imageView2;
                LinearLayout linearLayout = this.f4134m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4138q) {
                this.f4127b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4127b;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4127b.getVisibility() != 0) {
                this.f4127b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4129d.getVisibility() != 8) {
                this.f4129d.setVisibility(8);
            }
        } else {
            this.f4129d.setText(charSequence);
            if (this.f4129d.getVisibility() != 0) {
                this.f4129d.setVisibility(0);
            }
        }
    }
}
