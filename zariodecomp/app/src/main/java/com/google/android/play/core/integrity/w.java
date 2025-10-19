package com.google.android.play.core.integrity;

import android.content.Context;
import e2.C0460h;
import e2.InterfaceC0462j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\w.smali */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f6355a = this;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0462j f6356b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0462j f6357c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0462j f6358d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0462j f6359e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0462j f6360f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0462j f6361g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        c0.l lVar = new c0.l(context, 1);
        this.f6356b = lVar;
        C0460h c0460hB = C0460h.b(bb.f6292a);
        this.f6357c = c0460hB;
        au auVar = new au(lVar, n.f6346a);
        this.f6358d = auVar;
        C0460h c0460hB2 = C0460h.b(new bp(lVar, c0460hB, auVar, n.f6346a));
        this.f6359e = c0460hB2;
        C0460h c0460hB3 = C0460h.b(new bu(c0460hB2));
        this.f6360f = c0460hB3;
        this.f6361g = C0460h.b(new ba(c0460hB2, c0460hB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f6361g.a();
    }
}
