package com.google.android.recaptcha.internal;

import L3.l;
import L3.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.i;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzgy.smali */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        boolean z4 = obj instanceof byte[];
        s sVar = s.f2351a;
        int i = 0;
        if (z4) {
            byte[] bArr = (byte[]) obj;
            i.e(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return sVar;
            }
            if (length == 1) {
                return b.B(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            i.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return sVar;
            }
            if (length3 == 1) {
                return b.B(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i < length4) {
                arrayList2.add(Short.valueOf(sArr[i]));
                i++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            i.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                return sVar;
            }
            if (length5 == 1) {
                return b.B(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i < length6) {
                arrayList3.add(Integer.valueOf(iArr[i]));
                i++;
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return L3.i.y0((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            i.e(fArr, "<this>");
            int length7 = fArr.length;
            if (length7 == 0) {
                return sVar;
            }
            if (length7 == 1) {
                return b.B(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length8 = fArr.length;
            while (i < length8) {
                arrayList4.add(Float.valueOf(fArr[i]));
                i++;
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        i.e(dArr, "<this>");
        int length9 = dArr.length;
        if (length9 == 0) {
            return sVar;
        }
        if (length9 == 1) {
            return b.B(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length10 = dArr.length;
        while (i < length10) {
            arrayList5.add(Double.valueOf(dArr[i]));
            i++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(l.a0(listZzc2));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(l.a0(listZzc));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}
