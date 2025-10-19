package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\az.smali */
final class az implements StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final bn f6286a;

    /* renamed from: b, reason: collision with root package name */
    private final bt f6287b;

    public az(bn bnVar, bt btVar) {
        this.f6286a = bnVar;
        this.f6287b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l4) {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l4.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f6287b;
        final int i = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f6332b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f6333c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f6331a.a(this.f6332b, this.f6333c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f6286a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f6284a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
