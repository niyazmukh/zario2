package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzbc.smali */
public abstract class zzbc extends zzav implements Set {
    private transient zzaz zza;

    private static zzbc zzf(int i, Object... objArr) {
        if (i == 0) {
            return zzbt.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzby(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i5 = iZzh - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            zzbq.zza(obj2, i8);
            int iHashCode = obj2.hashCode();
            int iZza = zzau.zza(iHashCode);
            while (true) {
                int i9 = iZza & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += iHashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i7, i, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzby(obj4);
        }
        if (zzh(i7) < iZzh / 2) {
            return zzf(i7, objArr);
        }
        if (i7 <= 0) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzbt(objArr, i6, objArr2, i5, i7);
    }

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzbc zzk(Object obj, Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbc) && zzg() && ((zzbc) obj).zzg() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzcb iterator();

    public boolean zzg() {
        return false;
    }

    public zzaz zzi() {
        zzaz zzazVar = this.zza;
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarZzj = zzj();
        this.zza = zzazVarZzj;
        return zzazVarZzj;
    }

    public zzaz zzj() {
        Object[] array = toArray();
        int i = zzaz.zzd;
        return zzaz.zzh(array, array.length);
    }
}
