package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\f.1.smali */
public final class HandlerC0344f extends zau {
    public final void a(com.google.android.gms.common.api.t tVar, com.google.android.gms.common.api.s sVar) {
        int i = BasePendingResult.zad;
        com.google.android.gms.common.internal.C.f(tVar);
        sendMessage(obtainMessage(1, new Pair(tVar, sVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5533l);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.first;
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.second;
        try {
            Q q5 = (Q) tVar;
            synchronized (q5.f5598b) {
                if (sVar.getStatus().c()) {
                } else {
                    q5.a(sVar.getStatus());
                }
            }
        } catch (RuntimeException e5) {
            BasePendingResult.zal(sVar);
            throw e5;
        }
    }
}
