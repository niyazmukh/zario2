package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\y.1.smali */
public final class C0361y implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f5645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0362z f5646b;

    public C0361y(C0362z c0362z, BasePendingResult basePendingResult) {
        this.f5646b = c0362z;
        this.f5645a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        ((Map) this.f5646b.f5647a).remove(this.f5645a);
    }
}
