package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaex.smali */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) throws zzacn {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaez) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e5) {
                    throw new zzacn(AbstractC0854a.b("Json conversion failed! ", e5.getMessage()), e5);
                }
            } catch (Exception e6) {
                throw new zzacn("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e6);
            }
        }
        try {
            zzagt zzagtVar = (zzagt) new zzagt().zza(str);
            if (zzagtVar.zzb()) {
                return zzagtVar.zza();
            }
            throw new zzacn("No error message: " + str);
        } catch (Exception e7) {
            throw new zzacn(AbstractC0854a.b("Json conversion failed! ", e7.getMessage()), e7);
        }
    }
}
