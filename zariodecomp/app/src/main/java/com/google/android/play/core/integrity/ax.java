package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ax.smali */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f6283a;

    public static synchronized aw a(Context context) {
        try {
            if (f6283a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f6283a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6283a;
    }
}
