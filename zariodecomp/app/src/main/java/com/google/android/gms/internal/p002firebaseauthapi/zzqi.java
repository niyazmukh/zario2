package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzqi.smali */
public final class zzqi {
    private final Map<zzqj, zznx<?, ?>> zza;
    private final Map<zzqk, zznt<?>> zzb;
    private final Map<zzqj, zzph<?, ?>> zzc;
    private final Map<zzqk, zzpd<?>> zzd;

    private zzqi(zzqh zzqhVar) {
        this.zza = new HashMap(zzqhVar.zza);
        this.zzb = new HashMap(zzqhVar.zzb);
        this.zzc = new HashMap(zzqhVar.zzc);
        this.zzd = new HashMap(zzqhVar.zzd);
    }

    public final <SerializationT extends zzqf> zzbi zza(SerializationT serializationt, zzch zzchVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(serializationt.getClass(), serializationt.zzc());
        if (this.zzb.containsKey(zzqkVar)) {
            return this.zzb.get(zzqkVar).zza(serializationt, zzchVar);
        }
        throw new GeneralSecurityException(a.l("No Key Parser for requested key type ", String.valueOf(zzqkVar), " available"));
    }

    public final <SerializationT extends zzqf> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzqk(serializationt.getClass(), serializationt.zzc()));
    }

    public final <SerializationT extends zzqf> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzqk(serializationt.getClass(), serializationt.zzc()));
    }

    public final <SerializationT extends zzqf> zzcb zza(SerializationT serializationt) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(serializationt.getClass(), serializationt.zzc());
        if (this.zzd.containsKey(zzqkVar)) {
            return this.zzd.get(zzqkVar).zza(serializationt);
        }
        throw new GeneralSecurityException(a.l("No Parameters Parser for requested key type ", String.valueOf(zzqkVar), " available"));
    }

    public final <KeyT extends zzbi, SerializationT extends zzqf> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzch zzchVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(keyt.getClass(), cls);
        if (this.zza.containsKey(zzqjVar)) {
            return (SerializationT) this.zza.get(zzqjVar).zza(keyt, zzchVar);
        }
        throw new GeneralSecurityException(a.l("No Key serializer for ", String.valueOf(zzqjVar), " available"));
    }

    public final <ParametersT extends zzcb, SerializationT extends zzqf> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzqjVar)) {
            return (SerializationT) this.zzc.get(zzqjVar).zza(parameterst);
        }
        throw new GeneralSecurityException(a.l("No Key Format serializer for ", String.valueOf(zzqjVar), " available"));
    }
}
