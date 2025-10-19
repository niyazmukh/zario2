package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import f0.AbstractC0490a;
import h0.C0585a;
import h0.C0587c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\z.smali */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0542J f7568a;

    public z(C0542J c0542j) {
        this.f7568a = c0542j;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0548P c0548pF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        C0542J c0542j = this.f7568a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, c0542j);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0490a.f6986a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC0567t.class.isAssignableFrom(C0536D.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tB = resourceId != -1 ? c0542j.B(resourceId) : null;
                if (abstractComponentCallbacksC0567tB == null && string != null) {
                    abstractComponentCallbacksC0567tB = c0542j.C(string);
                }
                if (abstractComponentCallbacksC0567tB == null && id != -1) {
                    abstractComponentCallbacksC0567tB = c0542j.B(id);
                }
                if (abstractComponentCallbacksC0567tB == null) {
                    C0536D c0536dE = c0542j.E();
                    context.getClassLoader();
                    abstractComponentCallbacksC0567tB = c0536dE.a(attributeValue);
                    abstractComponentCallbacksC0567tB.f7540r = true;
                    abstractComponentCallbacksC0567tB.f7504A = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC0567tB.f7505B = id;
                    abstractComponentCallbacksC0567tB.f7506C = string;
                    abstractComponentCallbacksC0567tB.f7541s = true;
                    abstractComponentCallbacksC0567tB.f7545w = c0542j;
                    C0569v c0569v = c0542j.f7347u;
                    abstractComponentCallbacksC0567tB.f7546x = c0569v;
                    abstractComponentCallbacksC0567tB.J(c0569v.f7552b, attributeSet, abstractComponentCallbacksC0567tB.f7528b);
                    c0548pF = c0542j.a(abstractComponentCallbacksC0567tB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0567tB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (abstractComponentCallbacksC0567tB.f7541s) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC0567tB.f7541s = true;
                    abstractComponentCallbacksC0567tB.f7545w = c0542j;
                    C0569v c0569v2 = c0542j.f7347u;
                    abstractComponentCallbacksC0567tB.f7546x = c0569v2;
                    abstractComponentCallbacksC0567tB.J(c0569v2.f7552b, attributeSet, abstractComponentCallbacksC0567tB.f7528b);
                    c0548pF = c0542j.f(abstractComponentCallbacksC0567tB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0567tB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0587c c0587c = h0.d.f7618a;
                h0.d.b(new C0585a(abstractComponentCallbacksC0567tB, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0567tB + " to container " + viewGroup));
                h0.d.a(abstractComponentCallbacksC0567tB).getClass();
                abstractComponentCallbacksC0567tB.f7511I = viewGroup;
                c0548pF.k();
                c0548pF.j();
                View view2 = abstractComponentCallbacksC0567tB.f7512J;
                if (view2 == null) {
                    throw new IllegalStateException(B.a.l("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC0567tB.f7512J.getTag() == null) {
                    abstractComponentCallbacksC0567tB.f7512J.setTag(string);
                }
                abstractComponentCallbacksC0567tB.f7512J.addOnAttachStateChangeListener(new y(this, c0548pF));
                return abstractComponentCallbacksC0567tB.f7512J;
            }
        }
        return null;
    }
}
