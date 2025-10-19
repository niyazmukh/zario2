package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\N.smali */
public final class N implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f5688a;

    public /* synthetic */ N(O o5) {
        Objects.requireNonNull(o5);
        this.f5688a = o5;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            O o5 = this.f5688a;
            synchronized (o5.f5689d) {
                try {
                    L l4 = (L) message.obj;
                    M m5 = (M) o5.f5689d.get(l4);
                    if (m5 != null && m5.f5681a.isEmpty()) {
                        if (m5.f5683c) {
                            L l5 = m5.f5685e;
                            O o6 = m5.f5687g;
                            o6.f5691f.removeMessages(1, l5);
                            o6.f5692g.a(o6.f5690e, m5);
                            m5.f5683c = false;
                            m5.f5682b = 2;
                        }
                        o5.f5689d.remove(l4);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        O o7 = this.f5688a;
        synchronized (o7.f5689d) {
            try {
                L l6 = (L) message.obj;
                M m6 = (M) o7.f5689d.get(l6);
                if (m6 != null && m6.f5682b == 3) {
                    String strValueOf = String.valueOf(l6);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = m6.f5686f;
                    if (componentName == null) {
                        l6.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = l6.f5679b;
                        C.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    m6.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
