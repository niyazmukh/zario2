package M;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\W.smali */
public abstract class W {
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
