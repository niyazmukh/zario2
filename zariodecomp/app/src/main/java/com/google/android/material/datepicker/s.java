package com.google.android.material.datepicker;

import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\s.smali */
public final class s<S> extends y {

    /* renamed from: b0, reason: collision with root package name */
    public int f6016b0;

    /* renamed from: c0, reason: collision with root package name */
    public A f6017c0;

    /* renamed from: d0, reason: collision with root package name */
    public C0383c f6018d0;

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f7532f;
        }
        this.f6016b0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6017c0 = (A) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6018d0 = (C0383c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    @Override // g0.AbstractComponentCallbacksC0567t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View E(android.view.LayoutInflater r24, android.view.ViewGroup r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.s.E(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void L(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6016b0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6017c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6018d0);
    }
}
