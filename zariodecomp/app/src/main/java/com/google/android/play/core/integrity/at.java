package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.C0457e;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\at.smali */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0462j f6279a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6280b;

    public at(InterfaceC0462j interfaceC0462j, InterfaceC0462j interfaceC0462j2) {
        this.f6279a = interfaceC0462j;
        this.f6280b = interfaceC0462j2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C0457e c0457e) {
        Object objA = this.f6279a.a();
        objA.getClass();
        k kVar = (k) this.f6280b.a();
        kVar.getClass();
        activity.getClass();
        c0457e.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, c0457e);
    }
}
