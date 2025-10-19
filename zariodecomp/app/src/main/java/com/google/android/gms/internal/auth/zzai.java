package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzai.smali */
final class zzai implements s {
    private static final Account zza = new Account("DUMMY_NAME", "com.google");
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.zzb;
    }
}
