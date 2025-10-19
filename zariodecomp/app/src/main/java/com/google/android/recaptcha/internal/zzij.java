package com.google.android.recaptcha.internal;

import K3.k;
import android.webkit.JavascriptInterface;
import f4.C0521u;
import f4.InterfaceC0520t;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzij.smali */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) throws MissingResourceException {
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzen zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzrcVarZzl = zzrc.zzl(zzbt.zza(str));
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzf(zzrcVarZzl);
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzq(zzrr.zzi(zzbt.zza(str)));
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zztsVarZzg = zzts.zzg(zzbt.zza(str));
        zztsVarZzg.zzi().name();
        if (zztsVarZzg.zzi() != zztv.JS_CODE_SUCCESS) {
            zztsVarZzg.zzi().name();
            int i = zzbd.zza;
            zzbd zzbdVarZza = zzbc.zza(zztsVarZzg.zzi());
            this.zza.zzA().hashCode();
            ((C0521u) this.zza.zzA()).R(zzbdVarZza);
            return;
        }
        this.zza.zzA().hashCode();
        if (((C0521u) this.zza.zzA()).D(k.f2288a)) {
            return;
        }
        this.zza.zzA().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzsi zzsiVarZzi = zzsi.zzi(zzbt.zza(str));
        zzsiVarZzi.toString();
        InterfaceC0520t interfaceC0520t = (InterfaceC0520t) this.zza.zze.remove(zzsiVarZzi.zzk());
        if (interfaceC0520t != null) {
            ((C0521u) interfaceC0520t).D(zzsiVarZzi);
        }
    }
}
