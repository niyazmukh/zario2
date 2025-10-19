package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.MissingResourceException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzen.smali */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i, String str, int i5, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i5;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:34:0x00c7, B:38:0x00e6], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: NameNotFoundException -> 0x0144, TryCatch #0 {NameNotFoundException -> 0x0144, blocks: (B:43:0x0113, B:45:0x0117, B:46:0x0130), top: B:59:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[Catch: NameNotFoundException -> 0x0144, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0144, blocks: (B:43:0x0113, B:45:0x0117, B:46:0x0130), top: B:59:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzqq r13) throws java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() throws MissingResourceException {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) throws MissingResourceException {
        zzqo zzqoVarZzg = zzqq.zzg();
        zzqoVarZzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzqoVarZzg.zze(zzbdVar.zza().zza());
        zzqoVarZzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbdVar.zzd();
        if (strZzd != null) {
            zzqoVarZzg.zzf(strZzd);
        }
        zzc(4, (zzqq) zzqoVarZzg.zzk());
    }
}
