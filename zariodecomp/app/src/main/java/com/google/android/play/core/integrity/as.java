package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import e2.AbstractBinderC0476x;
import e2.C0457e;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\as.smali */
final class as extends AbstractBinderC0476x {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f6273a;

    /* renamed from: b, reason: collision with root package name */
    final C0457e f6274b;

    /* renamed from: c, reason: collision with root package name */
    private final C0477z f6275c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6276d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6277e;

    /* renamed from: f, reason: collision with root package name */
    private final Activity f6278f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C0457e c0457e) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f6275c = new C0477z("RequestDialogCallbackImpl");
        this.f6276d = context.getPackageName();
        this.f6277e = kVar;
        this.f6273a = taskCompletionSource;
        this.f6278f = activity;
        this.f6274b = c0457e;
    }

    @Override // e2.y
    public final void b(Bundle bundle) {
        this.f6274b.d(this.f6273a);
        this.f6275c.b("onRequestDialog(%s)", this.f6276d);
        com.google.android.gms.common.api.j jVarA = this.f6277e.a(bundle);
        if (jVarA != null) {
            this.f6273a.trySetException(jVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            C0477z c0477z = this.f6275c;
            Object[] objArr = {this.f6276d};
            c0477z.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C0477z.c(c0477z.f6885a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f6273a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f6278f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f6274b.a()));
        C0477z c0477z2 = this.f6275c;
        Object[] objArr2 = new Object[0];
        c0477z2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", C0477z.c(c0477z2.f6885a, "Starting dialog intent...", objArr2));
        }
        this.f6278f.startActivityForResult(intent, 0);
    }
}
