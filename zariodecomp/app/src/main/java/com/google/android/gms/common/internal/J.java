package com.google.android.gms.common.internal;

import android.os.Bundle;
import h1.C0588a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\J.smali */
public final class J extends A {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368f f5673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0368f abstractC0368f, int i, Bundle bundle) {
        super(abstractC0368f, i, bundle);
        Objects.requireNonNull(abstractC0368f);
        this.f5673g = abstractC0368f;
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean a() {
        this.f5673g.zzc.a(C0588a.f7619e);
        return true;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void b(C0588a c0588a) {
        AbstractC0368f abstractC0368f = this.f5673g;
        if (abstractC0368f.enableLocalFallback() && abstractC0368f.zzg()) {
            abstractC0368f.zzf(16);
        } else {
            abstractC0368f.zzc.a(c0588a);
            abstractC0368f.onConnectionFailed(c0588a);
        }
    }
}
