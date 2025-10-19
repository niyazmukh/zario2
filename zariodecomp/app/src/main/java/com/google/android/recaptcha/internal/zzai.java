package com.google.android.recaptcha.internal;

import f4.E;
import java.util.TimerTask;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzai.smali */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        E.t(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3);
    }
}
