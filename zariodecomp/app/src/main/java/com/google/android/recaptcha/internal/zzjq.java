package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzjq.smali */
public final class zzjq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
