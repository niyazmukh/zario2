package com.niyaz.zario;

import S2.u;
import a.AbstractC0183a;
import f4.C;
import o0.C0767B;
import o0.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\n.smali */
public final class n extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f6659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, MainActivity mainActivity, O3.d dVar) {
        super(2, dVar);
        this.f6660b = str;
        this.f6661c = mainActivity;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new n(this.f6660b, this.f6661c, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f6659a;
        MainActivity mainActivity = this.f6661c;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            if (this.f6660b.equals("feedback")) {
                u uVar = mainActivity.f6616H;
                if (uVar == null) {
                    kotlin.jvm.internal.i.i("evaluationRepository");
                    throw null;
                }
                this.f6659a = 1;
                obj = uVar.f(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            mainActivity.getIntent().removeExtra("navigate_to");
            return K3.k.f2288a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0183a.m0(obj);
        if (((Boolean) obj).booleanValue()) {
            C0767B c0767b = mainActivity.G;
            if (c0767b == null) {
                kotlin.jvm.internal.i.i("navController");
                throw null;
            }
            x xVarE = c0767b.e();
            Integer num = xVarE != null ? new Integer(xVarE.f9147l) : null;
            if (num == null || num.intValue() != 2131230939) {
                C0767B c0767b2 = mainActivity.G;
                if (c0767b2 == null) {
                    kotlin.jvm.internal.i.i("navController");
                    throw null;
                }
                c0767b2.h(2131231184, null);
            }
        }
        mainActivity.getIntent().removeExtra("navigate_to");
        return K3.k.f2288a;
    }
}
