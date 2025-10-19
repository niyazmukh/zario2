package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractBinderC0474v;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ai.smali */
final class ai extends AbstractBinderC0474v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f6252a;

    /* renamed from: b, reason: collision with root package name */
    private final C0477z f6253b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f6254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f6252a = ajVar;
        this.f6253b = new C0477z("OnRequestIntegrityTokenCallback");
        this.f6254c = taskCompletionSource;
    }

    @Override // e2.InterfaceC0475w
    public final void b(Bundle bundle) {
        this.f6252a.f6255a.d(this.f6254c);
        this.f6253b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f6252a.f6259e.a(bundle);
        if (jVarA != null) {
            this.f6254c.trySetException(jVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f6254c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f6252a.f6257c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6254c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
