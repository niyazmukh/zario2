package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzand.smali */
final class zzand {
    private static final zzanu<?, ?> zza = new zzanw();

    @Deprecated
    public static int zza(int i, zzamm zzammVar, zzanb zzanbVar) {
        return ((zzajm) zzammVar).zza(zzanbVar) + (zzakn.zzh(i) << 1);
    }

    public static int zzb(int i, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zzb(list);
    }

    public static int zzc(int i, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakn.zzb(i, 0) * size;
    }

    public static int zzd(int i, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakn.zza(i, 0L) * size;
    }

    public static int zze(int i, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zze(list);
    }

    public static int zzf(int i, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * list.size()) + zzf(list);
    }

    public static int zzg(int i, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zzg(list);
    }

    public static int zzh(int i, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zzh(list);
    }

    public static int zzi(int i, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zzi(list);
    }

    public static int zzj(int i, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakn.zzh(i) * size) + zzj(list);
    }

    public static void zzk(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzk(i, list, z4);
    }

    public static void zzl(int i, List<Long> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzl(i, list, z4);
    }

    public static void zzm(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzm(i, list, z4);
    }

    public static void zzn(int i, List<Long> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzn(i, list, z4);
    }

    private static int zza(zzajm zzajmVar, zzanb zzanbVar) {
        return zzakn.zzd(zzajmVar.zza(zzanbVar));
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zzb(List<Integer> list) {
        int iZza;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            iZza = 0;
            while (i < size) {
                iZza += zzakn.zza(zzaliVar.zzb(i));
                i++;
            }
        } else {
            iZza = 0;
            while (i < size) {
                iZza += zzakn.zza(list.get(i).intValue());
                i++;
            }
        }
        return iZza;
    }

    public static void zzc(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzc(i, list, z4);
    }

    public static void zzd(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzd(i, list, z4);
    }

    public static int zze(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            iZzc = 0;
            while (i < size) {
                iZzc += zzakn.zzc(zzaliVar.zzb(i));
                i++;
            }
        } else {
            iZzc = 0;
            while (i < size) {
                iZzc += zzakn.zzc(list.get(i).intValue());
                i++;
            }
        }
        return iZzc;
    }

    public static int zzf(List<Long> list) {
        int iZzb;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            iZzb = 0;
            while (i < size) {
                iZzb += zzakn.zzb(zzalxVar.zzb(i));
                i++;
            }
        } else {
            iZzb = 0;
            while (i < size) {
                iZzb += zzakn.zzb(list.get(i).longValue());
                i++;
            }
        }
        return iZzb;
    }

    public static int zzg(List<Integer> list) {
        int iZzg;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            iZzg = 0;
            while (i < size) {
                iZzg += zzakn.zzg(zzaliVar.zzb(i));
                i++;
            }
        } else {
            iZzg = 0;
            while (i < size) {
                iZzg += zzakn.zzg(list.get(i).intValue());
                i++;
            }
        }
        return iZzg;
    }

    public static int zzh(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            iZzd = 0;
            while (i < size) {
                iZzd += zzakn.zzd(zzalxVar.zzb(i));
                i++;
            }
        } else {
            iZzd = 0;
            while (i < size) {
                iZzd += zzakn.zzd(list.get(i).longValue());
                i++;
            }
        }
        return iZzd;
    }

    public static int zzi(List<Integer> list) {
        int iZzi;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            iZzi = 0;
            while (i < size) {
                iZzi += zzakn.zzi(zzaliVar.zzb(i));
                i++;
            }
        } else {
            iZzi = 0;
            while (i < size) {
                iZzi += zzakn.zzi(list.get(i).intValue());
                i++;
            }
        }
        return iZzi;
    }

    public static int zzj(List<Long> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            iZze = 0;
            while (i < size) {
                iZze += zzakn.zze(zzalxVar.zzb(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += zzakn.zze(list.get(i).longValue());
                i++;
            }
        }
        return iZze;
    }

    public static int zza(int i, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakn.zza(i, true) * size;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zza(int i, List<zzajv> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzh = zzakn.zzh(i) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iZzh += zzakn.zza(list.get(i5));
        }
        return iZzh;
    }

    public static int zzb(int i, List<?> list, zzanb<?> zzanbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzh = zzakn.zzh(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof zzalu) {
                iZzh = zzakn.zza((zzalu) obj) + iZzh;
            } else {
                iZzh += zza((zzajm) obj, (zzanb) zzanbVar);
            }
        }
        return iZzh;
    }

    public static void zze(int i, List<Long> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zze(i, list, z4);
    }

    public static void zzf(int i, List<Float> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzf(i, list, z4);
    }

    public static void zzg(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzg(i, list, z4);
    }

    public static void zzh(int i, List<Long> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzh(i, list, z4);
    }

    public static void zzi(int i, List<Integer> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzi(i, list, z4);
    }

    public static void zzj(int i, List<Long> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzj(i, list, z4);
    }

    public static int zza(int i, List<zzamm> list, zzanb<?> zzanbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iZza += zza(i, list.get(i5), (zzanb) zzanbVar);
        }
        return iZza;
    }

    public static int zza(int i, Object obj, zzanb<?> zzanbVar) {
        if (obj instanceof zzalu) {
            return zzakn.zzb(i, (zzalu) obj);
        }
        return zzakn.zzh(i) + zza((zzajm) obj, (zzanb) zzanbVar);
    }

    public static int zzb(int i, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzh = zzakn.zzh(i) * size;
        if (list instanceof zzalt) {
            zzalt zzaltVar = (zzalt) list;
            while (i5 < size) {
                Object objZza = zzaltVar.zza(i5);
                if (objZza instanceof zzajv) {
                    iZza2 = zzakn.zza((zzajv) objZza);
                } else {
                    iZza2 = zzakn.zza((String) objZza);
                }
                iZzh = iZza2 + iZzh;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzajv) {
                    iZza = zzakn.zza((zzajv) obj);
                } else {
                    iZza = zzakn.zza((String) obj);
                }
                iZzh = iZza + iZzh;
                i5++;
            }
        }
        return iZzh;
    }

    public static zzanu<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar) {
        if (zzaljVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int iIntValue = num.intValue();
                if (zzaljVar.zza(iIntValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = (UB) zza(obj, i, iIntValue, ub, zzanuVar);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzaljVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i, iIntValue2, ub, zzanuVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zzb(int i, List<Double> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, z4);
    }

    public static void zzb(int i, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, (zzanb) zzanbVar);
    }

    public static <UT, UB> UB zza(Object obj, int i, int i5, UB ub, zzanu<UT, UB> zzanuVar) {
        if (ub == null) {
            ub = zzanuVar.zzc(obj);
        }
        zzanuVar.zzb(ub, i, i5);
        return ub;
    }

    public static void zzb(int i, List<String> list, zzaol zzaolVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list);
    }

    public static <T, FT extends zzakz<FT>> void zza(zzakw<FT> zzakwVar, T t4, T t5) {
        zzakx<T> zzakxVarZza = zzakwVar.zza(t5);
        if (zzakxVarZza.zza.isEmpty()) {
            return;
        }
        zzakwVar.zzb(t4).zza((zzakx) zzakxVarZza);
    }

    public static <T> void zza(zzamf zzamfVar, T t4, T t5, long j5) {
        zzanz.zza(t4, j5, zzamfVar.zza(zzanz.zze(t4, j5), zzanz.zze(t5, j5)));
    }

    public static <T, UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t4, T t5) {
        zzanuVar.zzc(t4, zzanuVar.zza(zzanuVar.zzd(t4), zzanuVar.zzd(t5)));
    }

    public static void zza(Class<?> cls) {
        zzalf.class.isAssignableFrom(cls);
    }

    public static void zza(int i, List<Boolean> list, zzaol zzaolVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, z4);
    }

    public static void zza(int i, List<zzajv> list, zzaol zzaolVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list);
    }

    public static void zza(int i, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, (zzanb) zzanbVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
