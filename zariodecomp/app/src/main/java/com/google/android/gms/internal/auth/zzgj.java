package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzgj.smali */
final class zzgj {
    private static final Class zza;
    private static final zzgy zzb;
    private static final zzgy zzc;
    private static final zzgy zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzj(false);
        zzc = zzj(true);
        zzd = new zzha();
    }

    public static zzgy zza() {
        return zzb;
    }

    public static zzgy zzb() {
        return zzc;
    }

    public static zzgy zzc() {
        return zzd;
    }

    public static Object zzd(int i, List list, zzex zzexVar, Object obj, zzgy zzgyVar) {
        if (zzexVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = (Integer) list.get(i6);
                int iIntValue = num.intValue();
                if (zzexVar.zza()) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    obj = zze(i, iIntValue, obj, zzgyVar);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzexVar.zza()) {
                    obj = zze(i, iIntValue2, obj, zzgyVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zze(int i, int i5, Object obj, zzgy zzgyVar) {
        if (obj == null) {
            obj = zzgyVar.zzc();
        }
        zzgyVar.zzd(obj, i, i5);
        return obj;
    }

    public static void zzf(zzgy zzgyVar, Object obj, Object obj2) {
        zzgyVar.zzf(obj, zzgyVar.zzb(zzgyVar.zza(obj), zzgyVar.zza(obj2)));
    }

    public static void zzg(Class cls) {
        Class cls2;
        if (!zzeu.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzi(zzfr zzfrVar, Object obj, Object obj2, long j5) {
        zzhi.zzp(obj, j5, zzfr.zza(zzhi.zzf(obj, j5), zzhi.zzf(obj2, j5)));
    }

    private static zzgy zzj(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgy) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
