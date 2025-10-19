package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\C.smali */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5662a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5663b;

    /* renamed from: c, reason: collision with root package name */
    public static int f5664c;

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(zau zauVar) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != zauVar.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = zauVar.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.common.api.j j(Status status) {
        return status.f5537c != null ? new com.google.android.gms.common.api.r(status) : new com.google.android.gms.common.api.j(status);
    }
}
