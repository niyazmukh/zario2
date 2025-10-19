package i3;

import K3.k;
import Q3.j;
import S2.u;
import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import f4.C;
import kotlin.jvm.internal.i;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\d.smali */
public final class C0602d extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedbackFragment f7850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0602d(FeedbackFragment feedbackFragment, O3.d dVar) {
        super(2, dVar);
        this.f7850b = feedbackFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0602d(this.f7850b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0602d) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7849a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            u uVar = this.f7850b.f6690h0;
            if (uVar == null) {
                i.i("evaluationRepository");
                throw null;
            }
            this.f7849a = 1;
            if (uVar.i(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return k.f2288a;
    }
}
