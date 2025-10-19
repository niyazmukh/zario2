package B1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B1\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0834k f288a = new C0834k();

    /* renamed from: b, reason: collision with root package name */
    public final C0834k f289b = new C0834k();

    public static c a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e5);
            return null;
        }
    }

    public static c b(ArrayList arrayList) {
        c cVar = new c();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cVar.f289b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f284b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f285c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f286d;
            }
            d dVar = new d();
            dVar.f293d = 0;
            dVar.f294e = 1;
            dVar.f290a = startDelay;
            dVar.f291b = duration;
            dVar.f292c = interpolator;
            dVar.f293d = objectAnimator.getRepeatCount();
            dVar.f294e = objectAnimator.getRepeatMode();
            cVar.f288a.put(propertyName, dVar);
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f288a.equals(((c) obj).f288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f288a.hashCode();
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f288a + "}\n";
    }
}
