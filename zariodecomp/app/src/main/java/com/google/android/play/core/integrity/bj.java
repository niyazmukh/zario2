package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bj.smali */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f6311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j5) {
        super(str, j5);
        this.f6311a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f6311a.f6314e);
        return this.f6311a.f6312c.c(activity, bundle);
    }
}
