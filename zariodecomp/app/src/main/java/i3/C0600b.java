package i3;

import K3.k;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import f4.C;
import i4.I;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\b.smali */
public final class C0600b extends j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedbackFragment f7846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0600b(FeedbackFragment feedbackFragment, O3.d dVar) {
        super(2, dVar);
        this.f7846b = feedbackFragment;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new C0600b(this.f7846b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0600b) create((C) obj, (O3.d) obj2)).invokeSuspend(k.f2288a);
        return P3.a.f2678a;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        P3.a aVar = P3.a.f2678a;
        int i = this.f7845a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
            throw new B0.c();
        }
        AbstractC0183a.m0(obj);
        FeedbackFragment feedbackFragment = this.f7846b;
        C0605g c0605g = (C0605g) feedbackFragment.f6689g0.getValue();
        U2.a aVar2 = new U2.a(feedbackFragment, 3);
        this.f7845a = 1;
        ((I) c0605g.f7858d.f7964a).c(aVar2, this);
        return aVar;
    }
}
