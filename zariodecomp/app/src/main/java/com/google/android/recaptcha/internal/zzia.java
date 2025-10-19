package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzia.smali */
public final class zzia implements zzih {
    private final Context zza;

    public zzia(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) {
        return zzap.zza(this.zza.getContentResolver());
    }
}
