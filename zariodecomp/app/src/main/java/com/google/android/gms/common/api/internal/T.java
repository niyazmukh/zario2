package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\T.smali */
public final class T extends W {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0342d f5600b;

    public T(int i, AbstractC0342d abstractC0342d) {
        super(i);
        com.google.android.gms.common.internal.C.g(abstractC0342d, "Null methods are not runnable.");
        this.f5600b = abstractC0342d;
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a(Status status) {
        try {
            this.f5600b.setFailedResult(status);
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void b(RuntimeException runtimeException) {
        try {
            this.f5600b.setFailedResult(new Status(10, AbstractC0854a.c(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void c(D d5) throws DeadObjectException {
        try {
            this.f5600b.run(d5.f5553b);
        } catch (RuntimeException e5) {
            b(e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void d(C0362z c0362z, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) c0362z.f5647a;
        AbstractC0342d abstractC0342d = this.f5600b;
        map.put(abstractC0342d, boolValueOf);
        abstractC0342d.addStatusListener(new C0361y(c0362z, abstractC0342d));
    }
}
