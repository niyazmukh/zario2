package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzoz.smali */
final class zzoz extends zzpe {
    public zzoz() {
        super((zzpd) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzms) ((zzpa) zzg(i)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzms) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
