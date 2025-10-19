package a2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\d.smali */
public final class RunnableC0189d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0193h f4065b;

    public /* synthetic */ RunnableC0189d(AbstractC0193h abstractC0193h, int i) {
        this.f4064a = i;
        this.f4065b = abstractC0193h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        AbstractC0193h abstractC0193h = this.f4065b;
        switch (this.f4064a) {
            case 0:
                if (abstractC0193h.i != null && (context = abstractC0193h.h) != null) {
                    int i = Q1.k.f2805d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    AbstractC0192g abstractC0192g = abstractC0193h.i;
                    abstractC0192g.getLocationInWindow(iArr);
                    int height = (iHeight - (abstractC0192g.getHeight() + iArr[1])) + ((int) abstractC0193h.i.getTranslationY());
                    int i5 = abstractC0193h.f4098p;
                    if (height < i5) {
                        ViewGroup.LayoutParams layoutParams = abstractC0193h.i.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(AbstractC0193h.f4084z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i6 = abstractC0193h.f4098p;
                            abstractC0193h.f4099q = i6;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i6 - height) + marginLayoutParams.bottomMargin;
                            abstractC0193h.i.requestLayout();
                            break;
                        }
                    } else {
                        abstractC0193h.f4099q = i5;
                        break;
                    }
                }
                break;
            case 1:
                abstractC0193h.b();
                break;
            default:
                AbstractC0192g abstractC0192g2 = abstractC0193h.i;
                if (abstractC0192g2 != null) {
                    ViewParent parent = abstractC0192g2.getParent();
                    AbstractC0192g abstractC0192g3 = abstractC0193h.i;
                    if (parent != null) {
                        abstractC0192g3.setVisibility(0);
                    }
                    if (abstractC0192g3.getAnimationMode() != 1) {
                        int height2 = abstractC0192g3.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = abstractC0192g3.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        abstractC0192g3.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(abstractC0193h.f4089e);
                        valueAnimator.setDuration(abstractC0193h.f4087c);
                        valueAnimator.addListener(new C0186a(abstractC0193h, 1));
                        valueAnimator.addUpdateListener(new C0187b(abstractC0193h, height2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(abstractC0193h.f4088d);
                        valueAnimatorOfFloat.addUpdateListener(new C0187b(abstractC0193h, 0, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(abstractC0193h.f4090f);
                        valueAnimatorOfFloat2.addUpdateListener(new C0187b(abstractC0193h, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(abstractC0193h.f4085a);
                        animatorSet.addListener(new C0186a(abstractC0193h, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
