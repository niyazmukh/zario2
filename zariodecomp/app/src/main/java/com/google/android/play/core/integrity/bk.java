package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bk.smali */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6312c;

    /* renamed from: d, reason: collision with root package name */
    private final C0477z f6313d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j5) {
        super(bnVar, taskCompletionSource);
        this.f6312c = bnVar;
        this.f6313d = new C0477z("OnRequestIntegrityTokenCallback");
        this.f6314e = j5;
    }

    @Override // com.google.android.play.core.integrity.bi, e2.InterfaceC0470r
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f6313d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f6312c.f6323f.a(bundle);
        if (jVarA != null) {
            this.f6309a.trySetException(jVarA);
            return;
        }
        bj bjVar = new bj(this, this.f6312c.f6320c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6309a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
