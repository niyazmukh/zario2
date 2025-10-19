package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bl.smali */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6315c;

    /* renamed from: d, reason: collision with root package name */
    private final C0477z f6316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f6315c = bnVar;
        this.f6316d = new C0477z("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, e2.InterfaceC0470r
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f6316d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f6315c.f6323f.a(bundle);
        if (jVarA != null) {
            this.f6309a.trySetException(jVarA);
        } else {
            this.f6309a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
