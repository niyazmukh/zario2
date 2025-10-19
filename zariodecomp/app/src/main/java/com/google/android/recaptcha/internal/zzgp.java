package com.google.android.recaptcha.internal;

import L3.j;
import e4.a;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgp.smali */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strH0;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i5 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i6 = 0;
            while (i5 < length) {
                int i7 = iArr[i5];
                i6++;
                if (i6 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i7));
                i5++;
            }
            sb.append((CharSequence) "]");
            strH0 = sb.toString();
            i.d(strH0, "toString(...)");
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, a.a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i8 = 0;
                while (i5 < length2) {
                    long j5 = jArr[i5];
                    i8++;
                    if (i8 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j5));
                    i5++;
                }
                sb2.append((CharSequence) "]");
                strH0 = sb2.toString();
                i.d(strH0, "toString(...)");
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i9 = 0;
                while (i5 < length3) {
                    short s4 = sArr[i5];
                    i9++;
                    if (i9 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s4));
                    i5++;
                }
                sb3.append((CharSequence) "]");
                strH0 = sb3.toString();
                i.d(strH0, "toString(...)");
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i10 = 0;
                while (i5 < length4) {
                    float f2 = fArr[i5];
                    i10++;
                    if (i10 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f2));
                    i5++;
                }
                sb4.append((CharSequence) "]");
                strH0 = sb4.toString();
                i.d(strH0, "toString(...)");
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i11 = 0;
                while (i5 < length5) {
                    double d5 = dArr[i5];
                    i11++;
                    if (i11 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d5));
                    i5++;
                }
                sb5.append((CharSequence) "]");
                strH0 = sb5.toString();
                i.d(strH0, "toString(...)");
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strH0 = L3.i.x0((Object[]) objZza, ",", "[", "]", 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strH0 = j.h0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strH0 = str;
        }
        zzgdVar.zzc().zze(i, strH0);
    }
}
