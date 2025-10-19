package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzj.smali */
public final class zzj extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, m mVar, n nVar) {
        return new zzk(context, looper, c0370h, mVar, nVar);
    }
}
