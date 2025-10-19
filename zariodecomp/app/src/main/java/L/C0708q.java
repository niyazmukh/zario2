package l;

import A2.C0009i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0233k;
import f.AbstractC0489a;
import g.C0532g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import n.C0757b;
import n.C0761f;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\q.1.smali */
public final class C0708q {

    /* renamed from: a, reason: collision with root package name */
    public Parcelable f8659a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8660b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8661c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8662d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8663e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8664f;

    public /* synthetic */ C0708q(TextView textView) {
        this.f8659a = null;
        this.f8660b = null;
        this.f8661c = false;
        this.f8662d = false;
        this.f8664f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f8664f;
        Drawable drawableA = Q.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f8661c || this.f8662d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f8661c) {
                    E.b.h(drawableMutate, (ColorStateList) this.f8659a);
                }
                if (this.f8662d) {
                    E.b.i(drawableMutate, (PorterDuff.Mode) this.f8660b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C0706p c0706p = (C0706p) this.f8664f;
        Drawable checkMarkDrawable = c0706p.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f8661c || this.f8662d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f8661c) {
                    E.b.h(drawableMutate, (ColorStateList) this.f8659a);
                }
                if (this.f8662d) {
                    E.b.i(drawableMutate, (PorterDuff.Mode) this.f8660b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0706p.getDrawableState());
                }
                c0706p.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f8662d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f8659a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f8659a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f8659a;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f8659a = null;
        }
        return bundle2;
    }

    public x0.c d() {
        String str;
        x0.c cVar;
        Iterator it = ((C0761f) this.f8664f).iterator();
        do {
            C0757b c0757b = (C0757b) it;
            if (!c0757b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c0757b.next();
            kotlin.jvm.internal.i.d(components, "components");
            str = (String) components.getKey();
            cVar = (x0.c) components.getValue();
        } while (!kotlin.jvm.internal.i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f8664f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0489a.f6972m;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        Context context2 = compoundButton.getContext();
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(compoundButton, context2, iArr, attributeSet, (TypedArray) c0009iY.f205c, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(r1.d.B(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(r1.d.B(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                Q.b.c(compoundButton, c0009iY.F(2));
            }
            if (typedArray.hasValue(3)) {
                Q.b.d(compoundButton, AbstractC0692h0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0009iY.e0();
        }
    }

    public void f(String str, x0.c provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        if (((x0.c) ((C0761f) this.f8664f).g(str, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.f8663e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0532g c0532g = (C0532g) this.f8660b;
        if (c0532g == null) {
            c0532g = new C0532g(this);
        }
        this.f8660b = c0532g;
        try {
            C0233k.class.getDeclaredConstructor(null);
            C0532g c0532g2 = (C0532g) this.f8660b;
            if (c0532g2 != null) {
                ((LinkedHashSet) c0532g2.f7203b).add(C0233k.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + C0233k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }

    public C0708q() {
        this.f8664f = new C0761f();
        this.f8663e = true;
    }
}
