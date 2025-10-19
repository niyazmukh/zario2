package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.f;
import q.b;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzagl.smali */
public final class zzagl {
    private static final Map<String, zzagk> zza = new b();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new b();

    private static String zza(String str, int i, boolean z4) {
        if (z4) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }

    public static String zzb(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return a.k(zzagkVar != null ? AbstractC0854a.b("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return a.k(zzagkVar != null ? AbstractC0854a.b("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return a.k(zzagkVar != null ? AbstractC0854a.b("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            return a.k(zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(f fVar) {
        Map<String, zzagk> map = zza;
        fVar.a();
        return map.containsKey(fVar.f8773c.f8783a);
    }

    public static void zza(f fVar, String str, int i) {
        fVar.a();
        String str2 = fVar.f8773c.f8783a;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(str2, new zzagk(str, i));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(str2).iterator();
                    boolean z4 = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
