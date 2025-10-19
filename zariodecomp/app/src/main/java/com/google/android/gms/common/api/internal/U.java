package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0590c;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\U.smali */
public final class U extends J {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0359w f5601b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f5602c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0358u f5603d;

    public U(int i, AbstractC0359w abstractC0359w, TaskCompletionSource taskCompletionSource, InterfaceC0358u interfaceC0358u) {
        super(i);
        this.f5602c = taskCompletionSource;
        this.f5601b = abstractC0359w;
        this.f5603d = interfaceC0358u;
        if (i == 2 && abstractC0359w.f5643b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a(Status status) {
        ((G2.e) this.f5603d).getClass();
        this.f5602c.trySetException(com.google.android.gms.common.internal.C.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void b(RuntimeException runtimeException) {
        this.f5602c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void c(D d5) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f5602c;
        try {
            AbstractC0359w abstractC0359w = this.f5601b;
            ((InterfaceC0357t) ((O) abstractC0359w).f5595d.f1683d).accept(d5.f5553b, taskCompletionSource);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            a(W.e(e6));
        } catch (RuntimeException e7) {
            taskCompletionSource.trySetException(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void d(C0362z c0362z, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) c0362z.f5648b;
        TaskCompletionSource taskCompletionSource = this.f5602c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new C0362z(c0362z, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.J
    public final boolean f(D d5) {
        return this.f5601b.f5643b;
    }

    @Override // com.google.android.gms.common.api.internal.J
    public final C0590c[] g(D d5) {
        return this.f5601b.f5642a;
    }
}
