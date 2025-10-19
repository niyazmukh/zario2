package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzag.smali */
public final class zzag {
    private final String zza = ",\n  ";

    private zzag(String str) {
    }

    public static zzag zza(String str) {
        return new zzag(",\n  ");
    }

    public static final CharSequence zzd(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final Appendable zzb(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(zzd(it.next()));
            while (it.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zzd(it.next()));
            }
        }
        return appendable;
    }
}
