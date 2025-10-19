package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzoz.smali */
public final class zzoz {
    private static final zzoz zza = (zzoz) zzql.zza(new zzqo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpc
        public final Object zza() {
            zzoz zzozVar = new zzoz();
            zzozVar.zza(zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpb
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zznz
                public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                    return ((zzof) zzbiVar).zza(zzchVar);
                }
            }, zzof.class, zzqb.class));
            return zzozVar;
        }
    });
    private final AtomicReference<zzqi> zzb = new AtomicReference<>(new zzqh().zza());

    public final <SerializationT extends zzqf> zzbi zza(SerializationT serializationt, zzch zzchVar) {
        return this.zzb.get().zza((zzqi) serializationt, zzchVar);
    }

    public final <SerializationT extends zzqf> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb((zzqi) serializationt);
    }

    public final <SerializationT extends zzqf> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc((zzqi) serializationt);
    }

    public final <SerializationT extends zzqf> zzcb zza(SerializationT serializationt) {
        return this.zzb.get().zza((zzqi) serializationt);
    }

    public static zzoz zza() {
        return zza;
    }

    public final <KeyT extends zzbi, SerializationT extends zzqf> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzch zzchVar) {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzchVar);
    }

    public final <ParametersT extends zzcb, SerializationT extends zzqf> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.zzb.get().zza((zzqi) parameterst, (Class) cls);
    }

    public final synchronized <SerializationT extends zzqf> void zza(zznt<SerializationT> zzntVar) {
        this.zzb.set(new zzqh(this.zzb.get()).zza(zzntVar).zza());
    }

    public final synchronized <KeyT extends zzbi, SerializationT extends zzqf> void zza(zznx<KeyT, SerializationT> zznxVar) {
        this.zzb.set(new zzqh(this.zzb.get()).zza(zznxVar).zza());
    }

    public final synchronized <SerializationT extends zzqf> void zza(zzpd<SerializationT> zzpdVar) {
        this.zzb.set(new zzqh(this.zzb.get()).zza(zzpdVar).zza());
    }

    public final synchronized <ParametersT extends zzcb, SerializationT extends zzqf> void zza(zzph<ParametersT, SerializationT> zzphVar) {
        this.zzb.set(new zzqh(this.zzb.get()).zza(zzphVar).zza());
    }
}
