package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.util.List;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafc.smali */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzt.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * 1000) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
        } catch (IllegalArgumentException e5) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e5));
            return -1;
        }
    }

    public final String zzb() {
        return AbstractC0854a.b("X", Integer.toString(this.zza));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.p002firebaseauthapi.zzafc zza() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzafc.zza():com.google.android.gms.internal.firebase-auth-api.zzafc");
    }
}
