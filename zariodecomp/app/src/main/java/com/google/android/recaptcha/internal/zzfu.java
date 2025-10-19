package com.google.android.recaptcha.internal;

import L3.j;
import e4.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfu.smali */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List listB;
        i.e(str, "<this>");
        String strValueOf = String.valueOf(new char[]{'.'}[0]);
        m.w0(0);
        int iO0 = m.o0(str, strValueOf, 0, false);
        if (iO0 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iO0).toString());
                length = strValueOf.length() + iO0;
                iO0 = m.o0(str, strValueOf, length, false);
            } while (iO0 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            listB = arrayList;
        } else {
            listB = b.B(str.toString());
        }
        Iterator it = listB.iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrvVar) {
        this.zza = j.z0(zzrvVar.zzf().zzi());
        this.zzb = j.z0(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        i.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
