package g0;

import com.niyaz.zario.ui.feedback.FeedbackFragment;
import com.niyaz.zario.ui.history.HistoryFragment;
import o0.C0767B;

/* renamed from: g0.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\B.smali */
public final class C0535B extends b.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0535B(int i, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        super(true);
        this.f7302d = i;
        this.f7303e = abstractComponentCallbacksC0567t;
    }

    @Override // b.n
    public final void a() {
        switch (this.f7302d) {
            case 0:
                C0542J c0542j = (C0542J) this.f7303e;
                c0542j.x(true);
                if (!c0542j.h.f4920a) {
                    c0542j.f7335g.b();
                    break;
                } else {
                    c0542j.O();
                    break;
                }
            case 1:
                FeedbackFragment feedbackFragment = (FeedbackFragment) this.f7303e;
                if (feedbackFragment.w()) {
                    S0.f.z(feedbackFragment).h(2131230779, null);
                    break;
                }
                break;
            case 2:
                C0767B c0767bZ = S0.f.z((HistoryFragment) this.f7303e);
                if (!c0767bZ.f8985g.isEmpty()) {
                    o0.x xVarE = c0767bZ.e();
                    kotlin.jvm.internal.i.b(xVarE);
                    if (c0767bZ.j(xVarE.f9147l, true, false)) {
                        c0767bZ.b();
                        break;
                    }
                }
                break;
            default:
                C0767B c0767b = (C0767B) this.f7303e;
                if (!c0767b.f8985g.isEmpty()) {
                    o0.x xVarE2 = c0767b.e();
                    kotlin.jvm.internal.i.b(xVarE2);
                    if (c0767b.j(xVarE2.f9147l, true, false)) {
                        c0767b.b();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0535B(Object obj, int i) {
        super(false);
        this.f7302d = i;
        this.f7303e = obj;
    }
}
