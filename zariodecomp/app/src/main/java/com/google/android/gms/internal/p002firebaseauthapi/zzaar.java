package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import o2.C0800d;
import o2.E;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaar.smali */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        C.f(zzaftVar);
        this.zza = zzaftVar;
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    public static void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status statusS0;
        if (zzajdVar.zzo()) {
            H hZzb = zzajdVar.zzb();
            String strZzc = zzajdVar.zzc();
            String strZzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                statusS0 = new Status(17012, null, null, null);
            } else {
                statusS0 = f.s0(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(statusS0, hZzb, strZzc, strZzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        C.f(zzahmVar);
        C.f(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(String str, zzael zzaelVar) {
        C.f(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(String str, zzael zzaelVar) {
        C.f(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        C.d(zzahmVar.zzc());
        C.f(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        C.f(zzaelVar);
        C.f(zzaimVar);
        C.f(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        C.f(zzaelVar);
        C.f(zzahvVar);
        C.f(zzailVar);
        C.f(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        C.f(zzaelVar);
        C.f(zzahvVar);
        C.f(zzahkVar);
        C.f(zzailVar);
        C.f(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, String str2, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        C.d(zzaicVar.zzb());
        C.f(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        C.d(str);
        C.f(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        C.f(zzafvVar);
        C.d(str);
        zzahv zzahvVarZzb = zzahv.zzb(str);
        if (zzahvVarZzb.zzg()) {
            zzafvVar.zza((zzafv<zzahv>) zzahvVarZzb);
        } else {
            this.zza.zza(new zzahj(zzahvVarZzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        C.f(zzagzVar);
        C.f(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        C.f(zzahbVar);
        C.f(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        C.f(zzagxVar);
        C.f(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, String str, String str2, Boolean bool, H h, zzael zzaelVar, zzafs zzafsVar) {
        C.f(zzahvVar);
        C.f(zzafsVar);
        C.f(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, h, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        C.f(zzahoVar);
        C.f(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        C.f(zzahtVar);
        C.f(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.d(str3);
        C.f(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        C.d(str);
        C.f(zzajbVar);
        C.f(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        C.d(str);
        C.f(zzajgVar);
        C.f(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        C.d(zzahmVar.zzd());
        C.f(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        C.d(zzaijVar.zzd());
        C.f(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        C.f(zzajbVar);
        C.f(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        C.f(zzajcVar);
        C.f(zzaelVar);
        this.zza.zza(zzajcVar, (zzafv<zzajf>) new zzabd(this, zzaelVar));
    }

    public final void zza(C0800d c0800d, String str, zzael zzaelVar) {
        C.f(c0800d);
        C.f(zzaelVar);
        if (c0800d.f9214e) {
            zza(c0800d.f9213d, new zzaav(this, c0800d, str, zzaelVar));
        } else {
            zza(new zzagx(c0800d, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        C.f(zzajgVar);
        C.f(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        C.f(zzaioVar);
        C.f(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        C.f(zzaiqVar);
        C.f(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, zzael zzaelVar) {
        C.d(str);
        C.d(str2);
        C.f(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, E e5, zzael zzaelVar) {
        C.d(str);
        C.f(e5);
        C.f(zzaelVar);
        zza(str, (zzafv<zzahv>) new zzack(this, e5, zzaelVar));
    }
}
