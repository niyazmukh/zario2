package com.google.android.gms.internal.auth;

import Y0.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzal.smali */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final q addWorkAccount(o oVar, String str) {
        return ((G) oVar).f5573b.doWrite((l) new zzae(this, a.f3869a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return ((G) oVar).f5573b.doWrite((l) new zzag(this, a.f3869a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z4) {
        setWorkAuthenticatorEnabledWithResult(oVar, z4);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z4) {
        return ((G) oVar).f5573b.doWrite((l) new zzac(this, a.f3869a, oVar, z4));
    }
}
