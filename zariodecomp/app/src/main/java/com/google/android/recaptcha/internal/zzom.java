package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzom.smali */
final class zzom implements zzow {
    private final zzoi zza;
    private final zzpl zzb;
    private final boolean zzc;
    private final zzmp zzd;

    private zzom(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        this.zzb = zzplVar;
        this.zzc = zzoiVar instanceof zzna;
        this.zzd = zzmpVar;
        this.zza = zzoiVar;
    }

    public static zzom zzc(zzpl zzplVar, zzmp zzmpVar, zzoi zzoiVar) {
        return new zzom(zzplVar, zzmpVar, zzoiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int iZzb = ((zznd) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzna) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int iHashCode = ((zznd) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        zzoi zzoiVar = this.zza;
        return zzoiVar instanceof zznd ? ((zznd) zzoiVar).zzv() : zzoiVar.zzad().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzoy.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzoy.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        boolean zZzO;
        zzpl zzplVar = this.zzb;
        Object objZza = zzplVar.zza(obj);
        ((zzna) obj).zzi();
        while (zzovVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzovVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzovVar.zzO();
                    } else {
                        if (zzmoVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzplVar.zzk(objZza, zzovVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zznc zzncVarZza = null;
                    zzle zzleVarZzp = null;
                    while (zzovVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzovVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzovVar.zzj();
                            zzncVarZza = zzmoVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzncVarZza != null) {
                                throw null;
                            }
                            zzleVarZzp = zzovVar.zzp();
                        } else if (!zzovVar.zzO()) {
                            break;
                        }
                    }
                    if (zzovVar.zzd() != 12) {
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzleVarZzp == null) {
                        continue;
                    } else {
                        if (zzncVarZza != null) {
                            throw null;
                        }
                        zzplVar.zzg(objZza, iZzj, zzleVarZzp);
                    }
                }
            } finally {
                zzplVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084 A[EDGE_INSN: B:57:0x0084->B:33:0x0084 BREAK  A[LOOP:1: B:18:0x0049->B:60:0x0049], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzkt r14) throws com.google.android.recaptcha.internal.zznn {
        /*
            r9 = this;
            r0 = 3
            r1 = r10
            com.google.android.recaptcha.internal.zznd r1 = (com.google.android.recaptcha.internal.zznd) r1
            com.google.android.recaptcha.internal.zzpm r2 = r1.zzc
            com.google.android.recaptcha.internal.zzpm r3 = com.google.android.recaptcha.internal.zzpm.zzc()
            if (r2 != r3) goto L12
            com.google.android.recaptcha.internal.zzpm r2 = com.google.android.recaptcha.internal.zzpm.zzf()
            r1.zzc = r2
        L12:
            com.google.android.recaptcha.internal.zzna r10 = (com.google.android.recaptcha.internal.zzna) r10
            r10.zzi()
            r10 = 0
            r1 = r10
        L19:
            if (r12 >= r13) goto L8d
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r12, r14)
            int r3 = r14.zza
            r12 = 11
            r4 = 2
            if (r3 == r12) goto L47
            r12 = r3 & 7
            if (r12 != r4) goto L42
            com.google.android.recaptcha.internal.zzmo r12 = r14.zzd
            com.google.android.recaptcha.internal.zzoi r1 = r9.zza
            int r4 = r3 >>> 3
            com.google.android.recaptcha.internal.zznc r1 = r12.zza(r1, r4)
            if (r1 != 0) goto L3f
            r4 = r11
            r6 = r13
            r7 = r2
            r8 = r14
            int r12 = com.google.android.recaptcha.internal.zzku.zzh(r3, r4, r5, r6, r7, r8)
            goto L19
        L3f:
            int r9 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L42:
            int r12 = com.google.android.recaptcha.internal.zzku.zzo(r3, r11, r5, r13, r14)
            goto L19
        L47:
            r12 = 0
            r3 = r10
        L49:
            if (r5 >= r13) goto L84
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r5, r14)
            int r6 = r14.zza
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r4) goto L6a
            if (r7 == r0) goto L5a
            goto L7b
        L5a:
            if (r1 != 0) goto L67
            if (r8 != r4) goto L7b
            int r5 = com.google.android.recaptcha.internal.zzku.zza(r11, r5, r14)
            java.lang.Object r3 = r14.zzc
            com.google.android.recaptcha.internal.zzle r3 = (com.google.android.recaptcha.internal.zzle) r3
            goto L49
        L67:
            int r9 = com.google.android.recaptcha.internal.zzos.zza
            throw r10
        L6a:
            if (r8 != 0) goto L7b
            int r5 = com.google.android.recaptcha.internal.zzku.zzi(r11, r5, r14)
            int r12 = r14.zza
            com.google.android.recaptcha.internal.zzmo r1 = r14.zzd
            com.google.android.recaptcha.internal.zzoi r6 = r9.zza
            com.google.android.recaptcha.internal.zznc r1 = r1.zza(r6, r12)
            goto L49
        L7b:
            r7 = 12
            if (r6 == r7) goto L84
            int r5 = com.google.android.recaptcha.internal.zzku.zzo(r6, r11, r5, r13, r14)
            goto L49
        L84:
            if (r3 == 0) goto L8b
            int r12 = r12 << r0
            r12 = r12 | r4
            r2.zzj(r12, r3)
        L8b:
            r12 = r5
            goto L19
        L8d:
            if (r12 != r13) goto L90
            return
        L90:
            com.google.android.recaptcha.internal.zznn r9 = new com.google.android.recaptcha.internal.zznn
            java.lang.String r10 = "Failed to parse the message."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzom.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzkt):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Iterator itZzf = ((zzna) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzms zzmsVar = (zzms) entry.getKey();
            if (zzmsVar.zze() != zzpx.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (entry instanceof zznp) {
                zzpyVar.zzw(zzmsVar.zza(), ((zznp) entry).zza().zzb());
            } else {
                zzpyVar.zzw(zzmsVar.zza(), entry.getValue());
            }
        }
        ((zznd) obj).zzc.zzk(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        return ((zzna) obj).zzb.zzk();
    }
}
