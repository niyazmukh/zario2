package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.InterfaceC0355q;
import h1.C0588a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\r.smali */
public final class r implements InterfaceC0366d, InterfaceC0364b, InterfaceC0365c {

    /* renamed from: b, reason: collision with root package name */
    public static r f5744b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0380s f5745c = new C0380s(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f5746a;

    public /* synthetic */ r(Object obj) {
        this.f5746a = obj;
    }

    public static synchronized r b() {
        try {
            if (f5744b == null) {
                f5744b = new r();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5744b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0366d
    public void a(C0588a c0588a) {
        boolean z4 = c0588a.f7621b == 0;
        AbstractC0368f abstractC0368f = (AbstractC0368f) this.f5746a;
        if (z4) {
            abstractC0368f.getRemoteService(null, abstractC0368f.getScopes());
        } else if (abstractC0368f.zzl() != null) {
            ((InterfaceC0355q) ((r) abstractC0368f.zzl()).f5746a).a(c0588a);
        }
    }

    public r(AbstractC0368f abstractC0368f) {
        Objects.requireNonNull(abstractC0368f);
        this.f5746a = abstractC0368f;
    }
}
