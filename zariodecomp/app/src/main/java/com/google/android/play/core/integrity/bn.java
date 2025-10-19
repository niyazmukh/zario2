package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractBinderC0467o;
import e2.C0457e;
import e2.C0465m;
import e2.C0466n;
import e2.C0477z;
import e2.InterfaceC0452D;
import e2.InterfaceC0468p;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bn.smali */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final C0457e f6318a;

    /* renamed from: b, reason: collision with root package name */
    private final C0477z f6319b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6320c;

    /* renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f6321d;

    /* renamed from: e, reason: collision with root package name */
    private final at f6322e;

    /* renamed from: f, reason: collision with root package name */
    private final k f6323f;

    public bn(Context context, C0477z c0477z, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6321d = taskCompletionSource;
        this.f6320c = context.getPackageName();
        this.f6319b = c0477z;
        this.f6322e = atVar;
        this.f6323f = kVar;
        C0457e c0457e = new C0457e(context, c0477z, "ExpressIntegrityService", bo.f6324a, new InterfaceC0452D() { // from class: com.google.android.play.core.integrity.bd
            @Override // e2.InterfaceC0452D
            public final Object a(IBinder iBinder) {
                int i = AbstractBinderC0467o.i;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0468p ? (InterfaceC0468p) iInterfaceQueryLocalInterface : new C0466n(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f6318a = c0457e;
        c0457e.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j5, long j6, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6320c);
        bundle.putLong("cloud.prj", j5);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j6);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0465m(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(p1.b.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j5, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6320c);
        bundle.putLong("cloud.prj", j5);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0465m(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(p1.b.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f6321d.getTask().isSuccessful() && ((Integer) bnVar.f6321d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.f6319b.b("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6318a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j5, long j6, int i) {
        this.f6319b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j6));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6318a.c(new bg(this, taskCompletionSource, 0, str, j5, j6, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j5, int i) {
        this.f6319b.b("warmUpIntegrityToken(%s)", Long.valueOf(j5));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6318a.c(new bf(this, taskCompletionSource, 0, j5, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
