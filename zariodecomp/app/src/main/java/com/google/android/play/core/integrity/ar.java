package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ar.smali */
final class ar extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f6272a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f6272a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f6272a.f6273a.trySetResult(3);
        } else if (i == 2) {
            this.f6272a.f6273a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f6272a.f6273a.trySetResult(1);
        }
    }
}
