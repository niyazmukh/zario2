package S1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\l.smali */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2984b;

    public /* synthetic */ l(m mVar, int i) {
        this.f2983a = i;
        this.f2984b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2983a) {
            case 1:
                super.onAnimationEnd(animator);
                m mVar = this.f2984b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = mVar.f2991f;
                if (arrayList != null && !mVar.f2992k) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(mVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2983a) {
            case 0:
                super.onAnimationStart(animator);
                m mVar = this.f2984b;
                ArrayList arrayList = mVar.f2991f;
                if (arrayList != null && !mVar.f2992k) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).b(mVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
