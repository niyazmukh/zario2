package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractRunnableC0449A;
import e2.C0458f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bm.smali */
abstract class bm extends AbstractRunnableC0449A {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f6317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f6317f = bnVar;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void a(Exception exc) {
        if (!(exc instanceof C0458f)) {
            super.a(exc);
        } else if (bn.k(this.f6317f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
