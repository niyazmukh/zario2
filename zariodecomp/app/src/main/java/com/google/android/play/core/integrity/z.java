package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\z.smali */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f6367a;

    public static synchronized s a(Context context) {
        try {
            if (f6367a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f6367a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6367a;
    }
}
