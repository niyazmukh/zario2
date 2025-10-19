package D0;

import A2.RunnableC0005e;
import android.view.animation.Animation;
import androidx.lifecycle.a0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.niyaz.zario.databinding.FragmentInterventionBinding;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.E;
import m3.C0747a;
import m3.n;
import m3.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\f.smali */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f1306b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f1305a = i;
        this.f1306b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.f1305a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f1306b;
                if (!swipeRefreshLayout.f4818c) {
                    swipeRefreshLayout.l();
                    break;
                } else {
                    swipeRefreshLayout.f4806D.setAlpha(255);
                    swipeRefreshLayout.f4806D.start();
                    if (swipeRefreshLayout.f4810I && (jVar = swipeRefreshLayout.f4817b) != null) {
                        InterventionFragment interventionFragment = ((C0747a) jVar).f8856a;
                        q qVar = (q) interventionFragment.f6717g0.getValue();
                        qVar.getClass();
                        E.t(a0.h(qVar), null, null, new n(qVar, null), 3);
                        FragmentInterventionBinding fragmentInterventionBinding = interventionFragment.f6716f0;
                        kotlin.jvm.internal.i.b(fragmentInterventionBinding);
                        fragmentInterventionBinding.swipeRefreshLayout.postDelayed(new RunnableC0005e(interventionFragment, 27), 500L);
                    }
                    swipeRefreshLayout.f4829r = swipeRefreshLayout.f4835x.getTop();
                    break;
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f1306b;
                swipeRefreshLayout2.getClass();
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f4808F = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.f4835x;
                aVar.f1273a = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.f4835x.startAnimation(swipeRefreshLayout2.f4808F);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f1305a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f1305a;
    }
}
