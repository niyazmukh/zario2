package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.internal.common.zzg;
import h1.C0588a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\F.smali */
public final class F extends zzg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368f f5667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC0368f abstractC0368f, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC0368f);
        this.f5667a = abstractC0368f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        A a5;
        AbstractC0368f abstractC0368f = this.f5667a;
        if (abstractC0368f.zzd.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (a5 = (A) message.obj) != null) {
                synchronized (a5) {
                    a5.f5655a = null;
                }
                AbstractC0368f abstractC0368f2 = a5.f5657c;
                synchronized (abstractC0368f2.zzj()) {
                    abstractC0368f2.zzj().remove(a5);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if ((i5 == 1 || i5 == 7 || ((i5 == 4 && !abstractC0368f.enableLocalFallback()) || message.what == 5)) && !abstractC0368f.isConnecting()) {
            A a6 = (A) message.obj;
            if (a6 != null) {
                synchronized (a6) {
                    a6.f5655a = null;
                }
                AbstractC0368f abstractC0368f3 = a6.f5657c;
                synchronized (abstractC0368f3.zzj()) {
                    abstractC0368f3.zzj().remove(a6);
                }
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            abstractC0368f.zzn(new C0588a(message.arg2));
            if (abstractC0368f.zzg() && !abstractC0368f.zzo()) {
                abstractC0368f.zzd(3, null);
                return;
            }
            C0588a c0588aZzm = abstractC0368f.zzm() != null ? abstractC0368f.zzm() : new C0588a(8);
            abstractC0368f.zzc.a(c0588aZzm);
            abstractC0368f.onConnectionFailed(c0588aZzm);
            return;
        }
        if (i6 == 5) {
            C0588a c0588aZzm2 = abstractC0368f.zzm() != null ? abstractC0368f.zzm() : new C0588a(8);
            abstractC0368f.zzc.a(c0588aZzm2);
            abstractC0368f.onConnectionFailed(c0588aZzm2);
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            C0588a c0588a = new C0588a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC0368f.zzc.a(c0588a);
            abstractC0368f.onConnectionFailed(c0588a);
            return;
        }
        if (i6 == 6) {
            abstractC0368f.zzd(5, null);
            if (abstractC0368f.zzk() != null) {
                ((InterfaceC0345g) ((r) abstractC0368f.zzk()).f5746a).b(message.arg2);
            }
            abstractC0368f.onConnectionSuspended(message.arg2);
            abstractC0368f.zze(5, 1, null);
            return;
        }
        if (i6 == 2 && !abstractC0368f.isConnected()) {
            A a7 = (A) message.obj;
            if (a7 != null) {
                synchronized (a7) {
                    a7.f5655a = null;
                }
                AbstractC0368f abstractC0368f4 = a7.f5657c;
                synchronized (abstractC0368f4.zzj()) {
                    abstractC0368f4.zzj().remove(a7);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i7);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        A a8 = (A) message.obj;
        synchronized (a8) {
            try {
                bool = a8.f5655a;
                if (a8.f5656b) {
                    String string = a8.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } finally {
            }
        }
        if (bool != null) {
            AbstractC0368f abstractC0368f5 = a8.f5660f;
            int i8 = a8.f5658d;
            if (i8 != 0) {
                abstractC0368f5.zzd(1, null);
                Bundle bundle = a8.f5659e;
                a8.b(new C0588a(i8, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0368f.KEY_PENDING_INTENT) : null));
            } else if (!a8.a()) {
                abstractC0368f5.zzd(1, null);
                a8.b(new C0588a(8, null));
            }
        }
        synchronized (a8) {
            a8.f5656b = true;
        }
        synchronized (a8) {
            a8.f5655a = null;
        }
        AbstractC0368f abstractC0368f6 = a8.f5657c;
        synchronized (abstractC0368f6.zzj()) {
            abstractC0368f6.zzj().remove(a8);
        }
    }
}
