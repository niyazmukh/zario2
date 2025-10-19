package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import o2.w;
import q.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagb.smali */
public final class zzagb {
    private static final Map<String, zzagd> zza = new b();

    public static w zza(String str, w wVar, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(wVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, w wVar, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = map.get(str);
            if (System.currentTimeMillis() - zzagdVar.zzb < 120000) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(wVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
