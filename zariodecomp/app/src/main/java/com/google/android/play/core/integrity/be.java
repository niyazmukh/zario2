package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0459g;
import e2.AbstractRunnableC0449A;
import e2.C0477z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\be.smali */
final class be extends AbstractRunnableC0449A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6294a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f6295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f6295b = bnVar;
        this.f6294a = context;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f6294a;
        TaskCompletionSource taskCompletionSource = this.f6295b.f6321d;
        C0477z c0477z = AbstractC0459g.f6878a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i = (applicationInfo != null && applicationInfo.enabled && AbstractC0459g.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i));
    }
}
