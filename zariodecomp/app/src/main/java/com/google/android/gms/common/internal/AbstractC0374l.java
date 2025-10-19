package com.google.android.gms.common.internal;

import android.content.ServiceConnection;
import android.os.HandlerThread;
import h1.C0588a;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\l.1.smali */
public abstract class AbstractC0374l {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5729a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static O f5730b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f5731c;

    public abstract C0588a a(L l4, H h, String str, Executor executor);

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        L l4 = new L(str, str2, z4);
        O o5 = (O) this;
        C.g(serviceConnection, "ServiceConnection must not be null");
        HashMap map = o5.f5689d;
        synchronized (map) {
            try {
                M m5 = (M) map.get(l4);
                if (m5 == null) {
                    String string = l4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!m5.f5681a.containsKey(serviceConnection)) {
                    String string2 = l4.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                m5.f5681a.remove(serviceConnection);
                if (m5.f5681a.isEmpty()) {
                    o5.f5691f.sendMessageDelayed(o5.f5691f.obtainMessage(0, l4), o5.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
