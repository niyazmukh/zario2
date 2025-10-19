package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzfg.smali */
final class zzfg extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzfg(zzff zzffVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j5) {
        Object objUnmodifiableList;
        List list = (List) zzhi.zzf(obj, j5);
        if (list instanceof zzfe) {
            objUnmodifiableList = ((zzfe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgd) && (list instanceof zzey)) {
                zzey zzeyVar = (zzey) list;
                if (zzeyVar.zzc()) {
                    zzeyVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhi.zzp(obj, j5, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j5) {
        zzfd zzfdVar;
        List list = (List) zzhi.zzf(obj2, j5);
        int size = list.size();
        List listZzd = (List) zzhi.zzf(obj, j5);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzfe ? new zzfd(size) : ((listZzd instanceof zzgd) && (listZzd instanceof zzey)) ? ((zzey) listZzd).zzd(size) : new ArrayList(size);
            zzhi.zzp(obj, j5, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzhi.zzp(obj, j5, arrayList);
                zzfdVar = arrayList;
            } else if (listZzd instanceof zzhd) {
                zzfd zzfdVar2 = new zzfd(listZzd.size() + size);
                zzfdVar2.addAll(zzfdVar2.size(), (zzhd) listZzd);
                zzhi.zzp(obj, j5, zzfdVar2);
                zzfdVar = zzfdVar2;
            } else if ((listZzd instanceof zzgd) && (listZzd instanceof zzey)) {
                zzey zzeyVar = (zzey) listZzd;
                if (!zzeyVar.zzc()) {
                    listZzd = zzeyVar.zzd(listZzd.size() + size);
                    zzhi.zzp(obj, j5, listZzd);
                }
            }
            listZzd = zzfdVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzhi.zzp(obj, j5, list);
    }

    private zzfg() {
        super(null);
    }
}
