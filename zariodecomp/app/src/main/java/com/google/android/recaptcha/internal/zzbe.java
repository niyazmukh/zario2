package com.google.android.recaptcha.internal;

import K3.e;
import L3.u;
import L3.x;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbe.smali */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return u.f2353a;
        }
    }

    private static final Map zzb() {
        e[] eVarArr = {new e(0, zzqi.NET_CAPABILITY_MMS), new e(1, zzqi.NET_CAPABILITY_SUPL), new e(2, zzqi.NET_CAPABILITY_DUN), new e(3, zzqi.NET_CAPABILITY_FOTA), new e(4, zzqi.NET_CAPABILITY_IMS), new e(5, zzqi.NET_CAPABILITY_CBS), new e(6, zzqi.NET_CAPABILITY_WIFI_P2P), new e(7, zzqi.NET_CAPABILITY_IA), new e(8, zzqi.NET_CAPABILITY_RCS), new e(9, zzqi.NET_CAPABILITY_XCAP), new e(10, zzqi.NET_CAPABILITY_EIMS), new e(11, zzqi.NET_CAPABILITY_NOT_METERED), new e(12, zzqi.NET_CAPABILITY_INTERNET), new e(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new e(14, zzqi.NET_CAPABILITY_TRUSTED), new e(15, zzqi.NET_CAPABILITY_NOT_VPN)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.a0(16));
        x.d0(linkedHashMap, eVarArr);
        int i = Build.VERSION.SDK_INT;
        linkedHashMap.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMap.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        linkedHashMap.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
        linkedHashMap.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
        linkedHashMap.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
        linkedHashMap.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        linkedHashMap.put(23, zzqi.NET_CAPABILITY_MCX);
        if (i >= 30) {
            linkedHashMap.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMap.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMap.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMap.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMap.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMap.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMap;
    }
}
