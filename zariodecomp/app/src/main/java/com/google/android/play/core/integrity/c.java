package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\c.smali */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f6336a;

    /* renamed from: b, reason: collision with root package name */
    private byte f6337b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i) {
        this.f6337b = (byte) (this.f6337b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f6337b == 3) {
            return new e(this.f6336a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f6337b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f6337b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j5) {
        this.f6336a = j5;
        this.f6337b = (byte) (this.f6337b | 1);
        return this;
    }
}
