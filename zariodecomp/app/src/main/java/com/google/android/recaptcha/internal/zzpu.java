package com.google.android.recaptcha.internal;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzpu.smali */
final class zzpu extends IllegalArgumentException {
    public zzpu(int i, int i5) {
        super(a.h("Unpaired surrogate at index ", i, i5, " of "));
    }
}
