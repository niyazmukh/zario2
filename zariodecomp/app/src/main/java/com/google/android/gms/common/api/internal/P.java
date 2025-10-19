package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\P.smali */
public final class P extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f5596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q5, Looper looper) {
        super(looper);
        this.f5596a = q5;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
            return;
        }
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) message.obj;
        synchronized (this.f5596a.f5598b) {
            try {
                Q q5 = this.f5596a.f5597a;
                com.google.android.gms.common.internal.C.f(q5);
                if (qVar == null) {
                    q5.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
