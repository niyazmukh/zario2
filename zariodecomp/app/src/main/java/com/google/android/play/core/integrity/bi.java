package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractBinderC0469q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bi.smali */
class bi extends AbstractBinderC0469q {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f6309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f6310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f6310b = bnVar;
        this.f6309a = taskCompletionSource;
    }

    @Override // e2.InterfaceC0470r
    public final void b(Bundle bundle) {
        this.f6310b.f6318a.d(this.f6309a);
    }

    @Override // e2.InterfaceC0470r
    public void c(Bundle bundle) {
        this.f6310b.f6318a.d(this.f6309a);
    }

    @Override // e2.InterfaceC0470r
    public final void d(Bundle bundle) {
        this.f6310b.f6318a.d(this.f6309a);
    }

    @Override // e2.InterfaceC0470r
    public void e(Bundle bundle) {
        this.f6310b.f6318a.d(this.f6309a);
    }
}
