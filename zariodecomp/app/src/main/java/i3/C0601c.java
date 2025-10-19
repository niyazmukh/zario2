package i3;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import androidx.lifecycle.a0;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import f4.C;
import g0.S;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\c.smali */
public final class C0601c extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedbackFragment f7848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0601c(FeedbackFragment feedbackFragment, O3.d dVar) {
        super(2, dVar);
        this.f7848b = feedbackFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0601c(this.f7848b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0601c) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7847a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            FeedbackFragment feedbackFragment = this.f7848b;
            S sT = feedbackFragment.t();
            C0600b c0600b = new C0600b(feedbackFragment, null);
            this.f7847a = 1;
            if (a0.j(sT, c0600b, this) == aVar) {
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
