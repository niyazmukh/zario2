package com.google.android.recaptcha.internal;

import B.a;
import N2.j0;
import N2.n0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzmt.smali */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int iZzd;
        int iZzA;
        zzpw zzpwVarZzd = zzmsVar.zzd();
        int iZza = zzmsVar.zza();
        zzmsVar.zzg();
        int iZzA2 = zzln.zzA(iZza << 3);
        if (zzpwVarZzd == zzpw.zzj) {
            byte[] bArr = zznl.zzb;
            if (((zzoi) obj) instanceof zzkp) {
                throw null;
            }
            iZzA2 += iZzA2;
        }
        zzpx zzpxVar = zzpx.INT;
        int iZzB = 4;
        switch (zzpwVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 1:
                ((Float) obj).getClass();
                return iZzA2 + iZzB;
            case 2:
                iZzB = zzln.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 3:
                iZzB = zzln.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 4:
                iZzB = zzln.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 5:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 6:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 7:
                ((Boolean) obj).getClass();
                iZzB = 1;
                return iZzA2 + iZzB;
            case 8:
                if (!(obj instanceof zzle)) {
                    iZzB = zzln.zzz((String) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzle) obj).zzd();
                iZzA = zzln.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                iZzB = ((zzoi) obj).zzo();
                return iZzA2 + iZzB;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (!(obj instanceof zzns)) {
                    iZzB = zzln.zzx((zzoi) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzns) obj).zza();
                iZzA = zzln.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 11:
                if (obj instanceof zzle) {
                    iZzd = ((zzle) obj).zzd();
                    iZzA = zzln.zzA(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzA = zzln.zzA(iZzd);
                }
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                iZzB = zzln.zzA(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 13:
                iZzB = obj instanceof zznf ? zzln.zzB(((zznf) obj).zza()) : zzln.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 14:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 15:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzB = zzln.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzA2 + iZzB;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                iZzB = zzln.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzA2 + iZzB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z4) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zzf(zzmsVar, zzl(value));
            return;
        }
        Object objZze = zze(zzmsVar);
        if (objZze != null) {
            if (z4) {
                throw null;
            }
            this.zza.zzf(zzmsVar, objZze instanceof zzon ? zzmsVar.zzc((zzon) objZze, (zzon) value) : zzmsVar.zzb(((zzoi) objZze).zzae(), (zzoi) value).zzk());
        } else {
            this.zza.zzf(zzmsVar, zzl(value));
            if (z4) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzA;
        int iZzx;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        if (value instanceof zzns) {
            int iZza = ((zzms) entry.getKey()).zza();
            int iZzA2 = zzln.zzA(8);
            i = iZzA2 + iZzA2;
            iZzA = zzln.zzA(iZza) + zzln.zzA(16);
            int iZzA3 = zzln.zzA(24);
            int iZza2 = ((zzns) value).zza();
            iZzx = a.q(iZza2, iZza2, iZzA3);
        } else {
            int iZza3 = ((zzms) entry.getKey()).zza();
            int iZzA4 = zzln.zzA(8);
            i = iZzA4 + iZzA4;
            iZzA = zzln.zzA(iZza3) + zzln.zzA(16);
            iZzx = zzln.zzx((zzoi) value) + zzln.zzA(24);
        }
        return i + iZzA + iZzx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzmtVar.zzi((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (obj instanceof zzns) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = this.zza.zzg(i).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int iZzc = zzmtVar.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            zzm(zzmtVar.zza.zzg(i));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.recaptcha.internal.zzpw r0 = r3.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zznl.zzb
            r4.getClass()
            com.google.android.recaptcha.internal.zzpw r1 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r1 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzoi
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zznf
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzle
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzpe r2 = r2.zza
            r2.zzf(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r0 = r3.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.recaptcha.internal.zzpw r3 = r3.zzd()
            com.google.android.recaptcha.internal.zzpx r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzmt(boolean z4) {
        zzg();
        zzg();
    }
}
