package com.google.android.recaptcha.internal;

import f4.E;
import java.util.TimerTask;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzep.smali */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        E.t(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3);
    }
}
