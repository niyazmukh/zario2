package com.google.android.play.core.integrity;

import android.content.Context;
import e2.C0460h;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\s.smali */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f6348a = this;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6349b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0462j f6350c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0462j f6351d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0462j f6352e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0462j f6353f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        c0.l lVar = new c0.l(context, 1);
        this.f6349b = lVar;
        C0460h c0460hB = C0460h.b(ac.f6239a);
        this.f6350c = c0460hB;
        au auVar = new au(lVar, l.f6341a);
        this.f6351d = auVar;
        C0460h c0460hB2 = C0460h.b(new al(lVar, c0460hB, auVar, l.f6341a));
        this.f6352e = c0460hB2;
        this.f6353f = C0460h.b(new ab(c0460hB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f6353f.a();
    }
}
