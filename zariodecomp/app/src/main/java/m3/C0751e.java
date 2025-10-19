package m3;

import S2.u;
import android.content.Context;
import android.widget.TextView;
import com.niyaz.zario.databinding.FragmentInterventionBinding;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import i4.I;
import i4.InterfaceC0613h;
import java.util.Arrays;
import java.util.Locale;
import u0.AbstractC0967h;

/* renamed from: m3.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m3.1\e.smali */
public final class C0751e implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterventionFragment f8861b;

    public /* synthetic */ C0751e(InterventionFragment interventionFragment, int i) {
        this.f8860a = i;
        this.f8861b = interventionFragment;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        String str;
        switch (this.f8860a) {
            case 0:
                V2.m mVar = (V2.m) obj;
                InterventionFragment interventionFragment = this.f8861b;
                interventionFragment.getClass();
                boolean z4 = mVar instanceof V2.i;
                if (z4) {
                    str = ((V2.i) mVar).f3444a.f3437a.f3449c;
                } else {
                    u uVar = interventionFragment.f6719i0;
                    if (uVar == null) {
                        kotlin.jvm.internal.i.i("evaluationRepository");
                        throw null;
                    }
                    V2.n nVar = (V2.n) ((I) uVar.f3088f.f7964a).K();
                    str = nVar != null ? nVar.f3449c : null;
                }
                if (str == null) {
                    str = "Daily screen time";
                }
                FragmentInterventionBinding fragmentInterventionBinding = interventionFragment.f6716f0;
                kotlin.jvm.internal.i.b(fragmentInterventionBinding);
                fragmentInterventionBinding.tvSubtitle.setText(interventionFragment.s(2131886326, str));
                if (mVar instanceof V2.k) {
                    FragmentInterventionBinding fragmentInterventionBinding2 = interventionFragment.f6716f0;
                    kotlin.jvm.internal.i.b(fragmentInterventionBinding2);
                    fragmentInterventionBinding2.progressIndicator.setVisibility(8);
                    fragmentInterventionBinding2.tvCurrentUsage.setText(interventionFragment.r(2131886230));
                    fragmentInterventionBinding2.tvGoalTime.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding2.tvTimeRemaining.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding2.progressText.setText(interventionFragment.r(2131886231));
                } else if (mVar instanceof V2.l) {
                    FragmentInterventionBinding fragmentInterventionBinding3 = interventionFragment.f6716f0;
                    kotlin.jvm.internal.i.b(fragmentInterventionBinding3);
                    fragmentInterventionBinding3.progressIndicator.setVisibility(8);
                    fragmentInterventionBinding3.tvCurrentUsage.setText(interventionFragment.r(2131886231));
                    fragmentInterventionBinding3.tvGoalTime.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding3.tvTimeRemaining.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding3.progressText.setText(interventionFragment.r(2131886231));
                } else if (z4) {
                    V2.h hVar = ((V2.i) mVar).f3444a;
                    FragmentInterventionBinding fragmentInterventionBinding4 = interventionFragment.f6716f0;
                    kotlin.jvm.internal.i.b(fragmentInterventionBinding4);
                    fragmentInterventionBinding4.progressIndicator.setVisibility(0);
                    float f2 = hVar.f3443g;
                    fragmentInterventionBinding4.progressIndicator.setProgress((int) (f2 > 100.0f ? 100.0f : f2));
                    TextView textView = fragmentInterventionBinding4.tvCurrentUsage;
                    Context contextS = interventionFragment.S();
                    long j5 = hVar.f3438b;
                    textView.setText(interventionFragment.s(2131886194, AbstractC0967h.b(contextS, j5)));
                    TextView textView2 = fragmentInterventionBinding4.tvGoalTime;
                    Context contextS2 = interventionFragment.S();
                    V2.n nVar2 = hVar.f3437a;
                    textView2.setText(interventionFragment.s(2131886277, AbstractC0967h.b(contextS2, nVar2.f3447a)));
                    fragmentInterventionBinding4.tvTimeRemaining.setText(interventionFragment.s(2131886516, AbstractC0967h.b(interventionFragment.S(), hVar.f3440d)));
                    fragmentInterventionBinding4.progressText.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding4.progressIndicator.setIndicatorColor(f2 <= 110.0f ? B.l.getColor(interventionFragment.S(), 2131034220) : f2 <= 100.0f ? B.l.getColor(interventionFragment.S(), 2131034221) : B.l.getColor(interventionFragment.S(), 2131034219));
                    fragmentInterventionBinding4.progressIndicator.setContentDescription(interventionFragment.s(2131886483, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1)), AbstractC0967h.b(interventionFragment.S(), j5), AbstractC0967h.b(interventionFragment.S(), nVar2.f3447a)));
                } else if (mVar instanceof V2.j) {
                    V2.j jVar = (V2.j) mVar;
                    String str2 = jVar.f3445a;
                    FragmentInterventionBinding fragmentInterventionBinding5 = interventionFragment.f6716f0;
                    kotlin.jvm.internal.i.b(fragmentInterventionBinding5);
                    fragmentInterventionBinding5.progressIndicator.setVisibility(8);
                    fragmentInterventionBinding5.tvCurrentUsage.setText(interventionFragment.r(2131886227));
                    fragmentInterventionBinding5.tvGoalTime.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding5.tvTimeRemaining.setText(interventionFragment.r(2131886202));
                    fragmentInterventionBinding5.progressText.setText(jVar.f3446b ? interventionFragment.s(2131886229, str2) : interventionFragment.s(2131886228, str2));
                }
                return K3.k.f2288a;
            default:
                V2.o oVar = ((V2.p) obj).f3462b;
                int i = oVar != null ? oVar.f3457f : 100;
                InterventionFragment interventionFragment2 = this.f8861b;
                FragmentInterventionBinding fragmentInterventionBinding6 = interventionFragment2.f6716f0;
                kotlin.jvm.internal.i.b(fragmentInterventionBinding6);
                fragmentInterventionBinding6.tvTotalPoints.setText(interventionFragment2.s(2131886519, Integer.valueOf(i)));
                return K3.k.f2288a;
        }
    }
}
