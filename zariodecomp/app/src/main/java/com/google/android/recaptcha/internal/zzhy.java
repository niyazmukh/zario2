package com.google.android.recaptcha.internal;

import L3.i;
import L3.j;
import L3.s;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzhy.smali */
public final class zzhy {
    private List zza = s.f2351a;

    public final long zza(long[] jArr) {
        Iterator it = j.l0(this.zza, i.y0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = i.y0(jArr);
    }
}
