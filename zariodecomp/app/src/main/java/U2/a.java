package U2;

import A2.RunnableC0012l;
import V2.p;
import W.O;
import W.Z;
import a2.C0194i;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.niyaz.zario.databinding.FragmentFeedbackBinding;
import com.niyaz.zario.databinding.FragmentFlexstakesBinding;
import com.niyaz.zario.databinding.FragmentHistoryBinding;
import com.niyaz.zario.databinding.FragmentProfileBinding;
import com.niyaz.zario.databinding.FragmentTargetBinding;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import com.niyaz.zario.ui.history.HistoryFragment;
import com.niyaz.zario.ui.profile.ProfileFragment;
import com.niyaz.zario.ui.target.TargetFragment;
import e3.o;
import e4.m;
import i3.C0599a;
import i4.InterfaceC0613h;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import k3.C0667h;
import k3.C0671l;
import k3.u;
import l3.C0730b;
import l3.C0733f;
import o3.AbstractC0807a;
import o3.C0813g;
import p3.C0824c;
import u0.AbstractC0967h;
import u3.EnumC0971a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U2\a.smali */
public final class a implements InterfaceC0613h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3314b;

    public /* synthetic */ a(Object obj, int i) {
        this.f3313a = i;
        this.f3314b = obj;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) throws Exception {
        Object objD;
        String strY;
        K3.k kVar = K3.k.f2288a;
        Object obj2 = this.f3314b;
        switch (this.f3313a) {
            case 0:
                u3.d dVar2 = (u3.h) obj;
                l lVar = (l) obj2;
                if (dVar2 instanceof u3.e) {
                    u3.e eVar = (u3.e) dVar2;
                    if (eVar.f10497e == EnumC0971a.f10480a) {
                        lVar.f3382f.L(eVar.f10495c);
                    }
                } else if (dVar2 instanceof u3.d) {
                    lVar.f3382f.L(dVar2.c);
                }
                return kVar;
            case 1:
                O o5 = (O) obj2;
                return ((o5.f3534l.s() instanceof Z) || (objD = O.d(o5, true, dVar)) != P3.a.f2678a) ? kVar : objD;
            case 2:
                ((o) obj2).f6944e.L((p) obj);
                return kVar;
            case 3:
                C0599a c0599a = (C0599a) obj;
                FeedbackFragment feedbackFragment = (FeedbackFragment) obj2;
                feedbackFragment.getClass();
                if (!c0599a.f7844e) {
                    FragmentFeedbackBinding fragmentFeedbackBinding = feedbackFragment.f6688f0;
                    kotlin.jvm.internal.i.b(fragmentFeedbackBinding);
                    TextView textView = fragmentFeedbackBinding.tvGoalStatus;
                    boolean z4 = c0599a.f7840a;
                    textView.setText(z4 ? feedbackFragment.r(2131886241) : feedbackFragment.r(2131886242));
                    fragmentFeedbackBinding.tvGoalStatus.setTextColor(z4 ? feedbackFragment.S().getColor(2131034222) : feedbackFragment.S().getColor(2131034219));
                    TextView tvGoalStatus = fragmentFeedbackBinding.tvGoalStatus;
                    kotlin.jvm.internal.i.d(tvGoalStatus, "tvGoalStatus");
                    tvGoalStatus.setScaleX(0.0f);
                    tvGoalStatus.setScaleY(0.0f);
                    tvGoalStatus.setAlpha(0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tvGoalStatus, "scaleX", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tvGoalStatus, "scaleY", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tvGoalStatus, "alpha", 0.0f, 1.0f);
                    OvershootInterpolator overshootInterpolator = new OvershootInterpolator(z4 ? 2.0f : 1.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    animatorSet.setDuration(600L);
                    animatorSet.setInterpolator(overshootInterpolator);
                    animatorSet.setStartDelay(100L);
                    animatorSet.start();
                    TextView textView2 = fragmentFeedbackBinding.tvPointsChange;
                    int i = c0599a.f7841b;
                    textView2.setText(i >= 0 ? feedbackFragment.s(2131886245, Integer.valueOf(i)) : feedbackFragment.s(2131886246, Integer.valueOf(Math.abs(i))));
                    fragmentFeedbackBinding.tvPointsChange.setTextColor(i >= 0 ? feedbackFragment.S().getColor(2131034222) : feedbackFragment.S().getColor(2131034219));
                    TextView tvPointsChange = fragmentFeedbackBinding.tvPointsChange;
                    kotlin.jvm.internal.i.d(tvPointsChange, "tvPointsChange");
                    boolean z5 = i >= 0;
                    tvPointsChange.setScaleX(0.0f);
                    tvPointsChange.setScaleY(0.0f);
                    tvPointsChange.setAlpha(0.0f);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tvPointsChange, "scaleX", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tvPointsChange, "scaleY", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tvPointsChange, "alpha", 0.0f, 1.0f);
                    float f2 = z5 ? 1.5f : 0.5f;
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                    animatorSet2.setDuration(500L);
                    animatorSet2.setInterpolator(new OvershootInterpolator(f2));
                    animatorSet2.setStartDelay(300L);
                    animatorSet2.start();
                    TextView textView3 = fragmentFeedbackBinding.tvGoalStreak;
                    int i5 = c0599a.f7842c;
                    textView3.setText(i5 > 0 ? feedbackFragment.s(2131886243, Integer.valueOf(i5)) : feedbackFragment.r(2131886244));
                    if (i5 > 0) {
                        TextView tvGoalStreak = fragmentFeedbackBinding.tvGoalStreak;
                        kotlin.jvm.internal.i.d(tvGoalStreak, "tvGoalStreak");
                        tvGoalStreak.setScaleX(0.0f);
                        tvGoalStreak.setScaleY(0.0f);
                        tvGoalStreak.setAlpha(0.0f);
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tvGoalStreak, "scaleX", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(tvGoalStreak, "scaleY", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(tvGoalStreak, "alpha", 0.0f, 1.0f);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
                        animatorSet3.setDuration(450L);
                        animatorSet3.setInterpolator(new OvershootInterpolator(1.2f));
                        animatorSet3.setStartDelay(500L);
                        animatorSet3.start();
                    }
                }
                return kVar;
            case 4:
                j3.j jVar = (j3.j) obj;
                FlexStakesFragment flexStakesFragment = (FlexStakesFragment) obj2;
                if (jVar instanceof j3.g) {
                    FlexStakesFragment.Y(flexStakesFragment, false);
                } else if (jVar instanceof j3.h) {
                    FlexStakesFragment.Y(flexStakesFragment, true);
                } else if (jVar instanceof j3.i) {
                    FlexStakesFragment.Y(flexStakesFragment, false);
                    if (flexStakesFragment.w()) {
                        S0.f.z(flexStakesFragment).h(2131230780, null);
                    }
                } else {
                    if (!(jVar instanceof j3.f)) {
                        throw new B0.c();
                    }
                    FlexStakesFragment.Y(flexStakesFragment, false);
                    FragmentFlexstakesBinding fragmentFlexstakesBinding = flexStakesFragment.f6697f0;
                    kotlin.jvm.internal.i.b(fragmentFlexstakesBinding);
                    C0194i.f(fragmentFlexstakesBinding.getRoot(), ((j3.f) jVar).f8049a, 0).g();
                }
                return kVar;
            case 5:
                C0671l c0671l = (C0671l) obj;
                HistoryFragment historyFragment = (HistoryFragment) obj2;
                historyFragment.f6708j0 = c0671l;
                C0733f c0733f = historyFragment.f6706h0;
                if (c0733f == null) {
                    kotlin.jvm.internal.i.i("todayUsageAdapter");
                    throw null;
                }
                c0733f.f9896c.b(c0671l.f8327b, new RunnableC0012l(18, historyFragment, c0671l));
                FragmentHistoryBinding fragmentHistoryBinding = historyFragment.f6704f0;
                kotlin.jvm.internal.i.b(fragmentHistoryBinding);
                fragmentHistoryBinding.tvDateRange.setText(c0671l.f8331f);
                CircularProgressIndicator progressLoading = fragmentHistoryBinding.progressLoading;
                kotlin.jvm.internal.i.d(progressLoading, "progressLoading");
                boolean z6 = c0671l.f8326a;
                progressLoading.setVisibility(z6 ? 0 : 8);
                TextView tvLoading = fragmentHistoryBinding.tvLoading;
                kotlin.jvm.internal.i.d(tvLoading, "tvLoading");
                tvLoading.setVisibility(z6 ? 0 : 8);
                if (!z6) {
                    fragmentHistoryBinding.tvTotalUsage.setText(historyFragment.s(2131886322, AbstractC0967h.b(historyFragment.S(), c0671l.f8333j)));
                }
                TextView tvTotalUsage = fragmentHistoryBinding.tvTotalUsage;
                kotlin.jvm.internal.i.d(tvTotalUsage, "tvTotalUsage");
                tvTotalUsage.setVisibility(!z6 ? 0 : 8);
                if (!z6) {
                    C0730b c0730b = historyFragment.f6707i0;
                    if (c0730b == null) {
                        kotlin.jvm.internal.i.i("hourlyUsageAdapter");
                        throw null;
                    }
                    List list = c0671l.f8328c;
                    ArrayList arrayList = c0730b.f8799f;
                    arrayList.clear();
                    arrayList.addAll(list);
                    c0730b.f8800g = c0671l.h;
                    c0730b.f9901a.b();
                }
                RecyclerView recyclerHourlyChart = fragmentHistoryBinding.recyclerHourlyChart;
                kotlin.jvm.internal.i.d(recyclerHourlyChart, "recyclerHourlyChart");
                boolean z7 = c0671l.f8332g;
                recyclerHourlyChart.setVisibility((z6 || z7) ? 8 : 0);
                TextView tvChartEmpty = fragmentHistoryBinding.tvChartEmpty;
                kotlin.jvm.internal.i.d(tvChartEmpty, "tvChartEmpty");
                tvChartEmpty.setVisibility((z6 || !z7) ? 8 : 0);
                boolean zIsEmpty = c0671l.f8327b.isEmpty();
                RecyclerView recyclerHistory = fragmentHistoryBinding.recyclerHistory;
                kotlin.jvm.internal.i.d(recyclerHistory, "recyclerHistory");
                recyclerHistory.setVisibility((z6 || zIsEmpty) ? 8 : 0);
                LinearLayout layoutEmpty = fragmentHistoryBinding.layoutEmpty;
                kotlin.jvm.internal.i.d(layoutEmpty, "layoutEmpty");
                layoutEmpty.setVisibility((z6 || !zIsEmpty) ? 8 : 0);
                return kVar;
            case 6:
                Object objB = u.b((u) obj2, (C0667h) obj, dVar);
                return objB == P3.a.f2678a ? objB : kVar;
            case 7:
                C0813g c0813g = (C0813g) obj;
                ProfileFragment profileFragment = (ProfileFragment) obj2;
                profileFragment.getClass();
                boolean zQ0 = m.q0(c0813g.f9248b);
                List list2 = c0813g.f9253g;
                boolean zIsEmpty2 = list2.isEmpty();
                FragmentProfileBinding fragmentProfileBinding = profileFragment.f6735f0;
                kotlin.jvm.internal.i.b(fragmentProfileBinding);
                CircularProgressIndicator progressLoading2 = fragmentProfileBinding.progressLoading;
                kotlin.jvm.internal.i.d(progressLoading2, "progressLoading");
                boolean z8 = c0813g.f9247a;
                progressLoading2.setVisibility(z8 ? 0 : 8);
                FragmentProfileBinding fragmentProfileBinding2 = profileFragment.f6735f0;
                kotlin.jvm.internal.i.b(fragmentProfileBinding2);
                LinearLayout cardSummary = fragmentProfileBinding2.cardSummary;
                kotlin.jvm.internal.i.d(cardSummary, "cardSummary");
                cardSummary.setVisibility((zQ0 || z8) ? 8 : 0);
                FragmentProfileBinding fragmentProfileBinding3 = profileFragment.f6735f0;
                kotlin.jvm.internal.i.b(fragmentProfileBinding3);
                TextView tvCycleListTitle = fragmentProfileBinding3.tvCycleListTitle;
                kotlin.jvm.internal.i.d(tvCycleListTitle, "tvCycleListTitle");
                tvCycleListTitle.setVisibility((zQ0 || z8) ? 8 : 0);
                if (z8 || zQ0) {
                    FragmentProfileBinding fragmentProfileBinding4 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding4);
                    fragmentProfileBinding4.tvCycleListTitle.setText(profileFragment.r(2131886466));
                } else {
                    FragmentProfileBinding fragmentProfileBinding5 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding5);
                    fragmentProfileBinding5.tvEmail.setText(c0813g.f9248b);
                    FragmentProfileBinding fragmentProfileBinding6 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding6);
                    TextView textView4 = fragmentProfileBinding6.tvDaysSinceSignup;
                    Integer numValueOf = Integer.valueOf(c0813g.f9249c);
                    NumberFormat numberFormat = profileFragment.f6738i0;
                    textView4.setText(numberFormat.format(numValueOf));
                    FragmentProfileBinding fragmentProfileBinding7 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding7);
                    TextView textView5 = fragmentProfileBinding7.tvCyclesMet;
                    String str = numberFormat.format(Integer.valueOf(c0813g.f9250d));
                    int i6 = c0813g.f9251e;
                    textView5.setText(profileFragment.s(2131886472, str, numberFormat.format(Integer.valueOf(i6))));
                    FragmentProfileBinding fragmentProfileBinding8 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding8);
                    fragmentProfileBinding8.tvTotalPoints.setText(numberFormat.format(Integer.valueOf(c0813g.f9252f)));
                    FragmentProfileBinding fragmentProfileBinding9 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding9);
                    fragmentProfileBinding9.tvCycleListTitle.setText(profileFragment.s(2131886467, numberFormat.format(Integer.valueOf(i6))));
                    V2.f fVar = c0813g.h;
                    int i7 = fVar == null ? -1 : AbstractC0807a.f9235a[fVar.ordinal()];
                    if (i7 != -1) {
                        if (i7 == 1) {
                            strY = profileFragment.Y(2131886185, 20, 10);
                        } else if (i7 == 2) {
                            strY = profileFragment.Y(2131886186, 30, 30);
                        } else {
                            if (i7 != 3) {
                                throw new B0.c();
                            }
                            Integer num = c0813g.i;
                            int iIntValue = num != null ? num.intValue() : 5;
                            Integer num2 = c0813g.f9254j;
                            strY = profileFragment.Y(2131886187, iIntValue, num2 != null ? num2.intValue() : 20);
                        }
                    } else {
                        strY = null;
                    }
                    FragmentProfileBinding fragmentProfileBinding10 = profileFragment.f6735f0;
                    kotlin.jvm.internal.i.b(fragmentProfileBinding10);
                    TextView tvConditionPoints = fragmentProfileBinding10.tvConditionPoints;
                    kotlin.jvm.internal.i.d(tvConditionPoints, "tvConditionPoints");
                    tvConditionPoints.setVisibility(strY != null ? 0 : 8);
                    if (strY != null) {
                        FragmentProfileBinding fragmentProfileBinding11 = profileFragment.f6735f0;
                        kotlin.jvm.internal.i.b(fragmentProfileBinding11);
                        fragmentProfileBinding11.tvConditionPoints.setText(strY);
                    }
                }
                FragmentProfileBinding fragmentProfileBinding12 = profileFragment.f6735f0;
                kotlin.jvm.internal.i.b(fragmentProfileBinding12);
                RecyclerView recyclerCycles = fragmentProfileBinding12.recyclerCycles;
                kotlin.jvm.internal.i.d(recyclerCycles, "recyclerCycles");
                recyclerCycles.setVisibility((zQ0 || z8 || zIsEmpty2) ? 8 : 0);
                FragmentProfileBinding fragmentProfileBinding13 = profileFragment.f6735f0;
                kotlin.jvm.internal.i.b(fragmentProfileBinding13);
                TextView tvEmptyCycles = fragmentProfileBinding13.tvEmptyCycles;
                kotlin.jvm.internal.i.d(tvEmptyCycles, "tvEmptyCycles");
                tvEmptyCycles.setVisibility((zQ0 || z8 || !zIsEmpty2) ? 8 : 0);
                C0824c c0824c = profileFragment.f6737h0;
                if (c0824c != null) {
                    c0824c.f9896c.b(list2, null);
                    return kVar;
                }
                kotlin.jvm.internal.i.i("cyclesAdapter");
                throw null;
            default:
                r3.k kVar2 = (r3.k) obj;
                TargetFragment targetFragment = (TargetFragment) obj2;
                targetFragment.getClass();
                if (kVar2 instanceof r3.i) {
                    FragmentTargetBinding fragmentTargetBinding = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding);
                    fragmentTargetBinding.progressBar.setVisibility(0);
                    fragmentTargetBinding.textViewLoading.setVisibility(0);
                    fragmentTargetBinding.textViewError.setVisibility(8);
                    fragmentTargetBinding.buttonRetry.setVisibility(8);
                    fragmentTargetBinding.buttonGrantPermission.setVisibility(8);
                    fragmentTargetBinding.cardGoalSummary.setVisibility(8);
                    FragmentTargetBinding fragmentTargetBinding2 = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding2);
                    fragmentTargetBinding2.btnConfirmTarget.setEnabled(false);
                } else if (kVar2 instanceof r3.j) {
                    FragmentTargetBinding fragmentTargetBinding3 = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding3);
                    fragmentTargetBinding3.progressBar.setVisibility(8);
                    fragmentTargetBinding3.textViewLoading.setVisibility(8);
                    fragmentTargetBinding3.cardGoalSummary.setVisibility(8);
                    fragmentTargetBinding3.textViewError.setVisibility(0);
                    fragmentTargetBinding3.textViewError.setText(targetFragment.r(2131886526));
                    fragmentTargetBinding3.buttonRetry.setVisibility(8);
                    fragmentTargetBinding3.buttonGrantPermission.setVisibility(0);
                    FragmentTargetBinding fragmentTargetBinding4 = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding4);
                    fragmentTargetBinding4.btnConfirmTarget.setEnabled(false);
                } else if (kVar2 instanceof r3.g) {
                    r3.g gVar = (r3.g) kVar2;
                    long j5 = gVar.f9649a;
                    FragmentTargetBinding fragmentTargetBinding5 = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding5);
                    fragmentTargetBinding5.progressBar.setVisibility(8);
                    fragmentTargetBinding5.textViewLoading.setVisibility(8);
                    fragmentTargetBinding5.textViewError.setVisibility(8);
                    fragmentTargetBinding5.buttonRetry.setVisibility(8);
                    fragmentTargetBinding5.buttonGrantPermission.setVisibility(8);
                    fragmentTargetBinding5.cardGoalSummary.setVisibility(0);
                    String strC = AbstractC0967h.c(targetFragment.S(), j5);
                    String strC2 = AbstractC0967h.c(targetFragment.S(), gVar.f9651c);
                    if (Double.isNaN(19.999999999999996d)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    int iRound = (int) Math.round(19.999999999999996d);
                    fragmentTargetBinding5.tvCurrentUsage.setText(targetFragment.s(2131886276, strC));
                    fragmentTargetBinding5.tvGoalUsage.setText(targetFragment.s(2131886274, strC2));
                    long j6 = gVar.f9650b;
                    if (j6 > 0) {
                        fragmentTargetBinding5.tvTodayUsage.setVisibility(0);
                        fragmentTargetBinding5.tvTodayUsage.setText(targetFragment.s(2131886275, AbstractC0967h.c(targetFragment.S(), j6)));
                    } else {
                        fragmentTargetBinding5.tvTodayUsage.setVisibility(8);
                    }
                    fragmentTargetBinding5.tvReductionInfo.setText(gVar.f9652d ? targetFragment.r(2131886273) : targetFragment.s(2131886270, Integer.valueOf(iRound)));
                    FragmentTargetBinding fragmentTargetBinding6 = targetFragment.f6752f0;
                    kotlin.jvm.internal.i.b(fragmentTargetBinding6);
                    fragmentTargetBinding6.btnConfirmTarget.setEnabled(true);
                } else {
                    if (!(kVar2 instanceof r3.h)) {
                        throw new B0.c();
                    }
                    targetFragment.b0(((r3.h) kVar2).f9653a);
                }
                return kVar;
        }
    }
}
