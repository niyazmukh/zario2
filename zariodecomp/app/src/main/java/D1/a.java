package D1;

import F0.n;
import G0.f;
import Q1.k;
import S1.c;
import S1.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import b2.C0272k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import d2.C0444a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D1\a.smali */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1315b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1314a = i;
        this.f1315b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1314a) {
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1315b;
                actionBarOverlayLayout.f4173A = null;
                actionBarOverlayLayout.f4188o = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1314a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f1315b).h = null;
                break;
            case 1:
                ((n) this.f1315b).m();
                animator.removeListener(this);
                break;
            case 2:
                f fVar = (f) this.f1315b;
                ArrayList arrayList = new ArrayList(fVar.f1755e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).a(fVar);
                }
                break;
            case 3:
            default:
                super.onAnimationEnd(animator);
                break;
            case 4:
                super.onAnimationEnd(animator);
                Z1.c cVar = (Z1.c) this.f1315b;
                K2.c cVarE = k.e(cVar);
                Iterator it = cVar.f3998o.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) cVarE.b).remove((C0444a) it.next());
                }
                break;
            case 5:
                C0272k c0272k = (C0272k) this.f1315b;
                c0272k.q();
                c0272k.f5026r.start();
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1315b;
                actionBarOverlayLayout.f4173A = null;
                actionBarOverlayLayout.f4188o = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f1314a) {
            case 3:
                super.onAnimationRepeat(animator);
                r rVar = (r) this.f1315b;
                rVar.f3011g = (rVar.f3011g + 1) % rVar.f3010f.f2955c.length;
                rVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1314a) {
            case 2:
                f fVar = (f) this.f1315b;
                ArrayList arrayList = new ArrayList(fVar.f1755e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).b(fVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
