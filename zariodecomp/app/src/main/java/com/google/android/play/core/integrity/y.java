package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\y.smali */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f6363b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6364c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6366e;

    /* renamed from: a, reason: collision with root package name */
    private final C0477z f6362a = new C0477z("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f6365d = new Object();

    public y(String str, long j5) {
        this.f6363b = str;
        this.f6364c = j5;
    }

    public final Task a(Activity activity, int i) {
        synchronized (this.f6365d) {
            try {
                if (this.f6366e) {
                    return Tasks.forResult(0);
                }
                this.f6366e = true;
                C0477z c0477z = this.f6362a;
                Object[] objArr = {Integer.valueOf(i)};
                c0477z.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", C0477z.c(c0477z.f6885a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.f6363b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f6364c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
