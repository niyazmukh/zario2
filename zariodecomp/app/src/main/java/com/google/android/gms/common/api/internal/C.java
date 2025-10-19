package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\C.smali */
public final class C implements InterfaceC0340b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5550a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5551b;

    public C(C0346h c0346h) {
        this.f5551b = c0346h;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0340b
    public final void a(boolean z4) {
        switch (this.f5550a) {
            case 0:
                zau zauVar = ((C0346h) this.f5551b).f5638n;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z4)));
                break;
            default:
                if (!z4) {
                    ((p2.q) this.f5551b).f9365c = false;
                    p2.q qVar = (p2.q) this.f5551b;
                    if (qVar.f9363a > 0 && !qVar.f9365c) {
                        ((p2.q) this.f5551b).f9364b.a();
                        break;
                    }
                } else {
                    ((p2.q) this.f5551b).f9365c = true;
                    p2.h hVar = ((p2.q) this.f5551b).f9364b;
                    hVar.f9352d.removeCallbacks(hVar.f9353e);
                    break;
                }
                break;
        }
    }

    public C(p2.q qVar) {
        Objects.requireNonNull(qVar);
        this.f5551b = qVar;
    }
}
