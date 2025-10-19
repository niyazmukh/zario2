package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.firebase-auth-api.zzalf.zzb;
import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf.smali */
public abstract class zzalf<MessageType extends zzalf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzajm<MessageType, BuilderType> {
    private static Map<Class<?>, zzalf<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzanx zzb = zzanx.zzc();

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zza.smali */
    public static class zza<T extends zzalf<T, ?>> extends zzajq<T> {
        public zza(T t4) {
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zzc.smali */
    public static final class zzc implements zzakz<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final zzaog zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final zzaoj zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final zzaml zza(zzaml zzamlVar, zzamm zzammVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakz
        public final zzamr zza(zzamr zzamrVar, zzamr zzamrVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zzd.smali */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzalf<MessageType, BuilderType> implements zzamo {
        protected zzakx<zzc> zzc = zzakx.zzb();

        public final zzakx<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakx) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zze.smali */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zzf.smali */
    public static class zzf<ContainingType extends zzamm, Type> extends zzakr<ContainingType, Type> {
    }

    public static /* synthetic */ boolean zza(zzalf zzalfVar, boolean z4) {
        return zzb(zzalfVar, false);
    }

    private final int zzb(zzanb<?> zzanbVar) {
        return zzanbVar == null ? zzamx.zza().zza((zzamx) this).zza(this) : zzanbVar.zza(this);
    }

    public static <E> zzalm<E> zzp() {
        return zzana.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamx.zza().zza((zzamx) this).zzb(this, (zzalf) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamn.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
    public final int zzi() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamm
    public final int zzl() {
        return zza((zzanb) null);
    }

    public final <MessageType2 extends zzalf<MessageType2, BuilderType2>, BuilderType2 extends zzb<MessageType2, BuilderType2>> BuilderType2 zzm() {
        return (BuilderType2) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamm
    public final /* synthetic */ zzaml zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamm
    public final /* synthetic */ zzaml zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final /* synthetic */ zzamm zzs() {
        return (zzalf) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzt() {
        zzamx.zza().zza((zzamx) this).zzd(this);
        zzu();
    }

    public final void zzu() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final boolean zzv() {
        return zzb(this, true);
    }

    public final boolean zzw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    private final int zza() {
        return zzamx.zza().zza((zzamx) this).zzb(this);
    }

    private static <T extends zzalf<T, ?>> T zzb(T t4, zzajv zzajvVar, zzaku zzakuVar) {
        zzakh zzakhVarZzc = zzajvVar.zzc();
        T t5 = (T) zza(t4, zzakhVarZzc, zzakuVar);
        zzakhVarZzc.zzc(0);
        return t5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
    public final int zza(zzanb zzanbVar) {
        if (zzw()) {
            int iZzb = zzb((zzanb<?>) zzanbVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException(a.g(iZzb, "serialized size must be non-negative, was "));
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int iZzb2 = zzb((zzanb<?>) zzanbVar);
        zzb(iZzb2);
        return iZzb2;
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzalf$zzb.smali */
    public static abstract class zzb<MessageType extends zzalf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzajo<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzw()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzf();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        /* renamed from: zzb */
        public final /* synthetic */ zzajo clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaml
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzv()) {
                return messagetype;
            }
            throw new zzanv(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaml
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        public final void zzg() {
            if (this.zza.zzw()) {
                return;
            }
            zzh();
        }

        public void zzh() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
        public final /* synthetic */ zzamm zzs() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
        public final boolean zzv() {
            return zzalf.zza((zzalf) this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzamx.zza().zza((zzamx) messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
    public final void zzb(int i) {
        if (i >= 0) {
            this.zzd = (i & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(a.g(i, "serialized size must be non-negative, was "));
    }

    private static final <T extends zzalf<T, ?>> boolean zzb(T t4, boolean z4) {
        byte bByteValue = ((Byte) t4.zza(zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzamx.zza().zza((zzamx) t4).zze(t4);
        if (z4) {
            t4.zza(zze.zzb, zZze ? t4 : null, null);
        }
        return zZze;
    }

    private static <T extends zzalf<T, ?>> T zza(T t4) throws zzall {
        if (t4 == null || zzb(t4, true)) {
            return t4;
        }
        zzall zzallVarZza = new zzanv(t4).zza();
        zzallVarZza.getClass();
        throw zzallVarZza;
    }

    public static <T extends zzalf<?, ?>> T zza(Class<T> cls) throws ClassNotFoundException {
        zzalf<?, ?> zzalfVar = zzc.get(cls);
        if (zzalfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzalfVar = zzc.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (zzalfVar == null) {
            zzalfVar = (T) ((zzalf) zzanz.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzalfVar != null) {
                zzc.put(cls, zzalfVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzalfVar;
    }

    public static <T extends zzalf<T, ?>> T zza(T t4, zzajv zzajvVar, zzaku zzakuVar) {
        return (T) zza(zzb(t4, zzajvVar, zzakuVar));
    }

    public static <T extends zzalf<T, ?>> T zza(T t4, InputStream inputStream, zzaku zzakuVar) {
        zzakh zzakjVar;
        if (inputStream == null) {
            byte[] bArr = zzalh.zzb;
            zzakjVar = zzakh.zza(bArr, 0, bArr.length, false);
        } else {
            zzakjVar = new zzakj(inputStream);
        }
        return (T) zza(zza(t4, zzakjVar, zzakuVar));
    }

    public static <T extends zzalf<T, ?>> T zza(T t4, byte[] bArr, zzaku zzakuVar) {
        return (T) zza(zza(t4, bArr, 0, bArr.length, zzakuVar));
    }

    private static <T extends zzalf<T, ?>> T zza(T t4, zzakh zzakhVar, zzaku zzakuVar) throws zzall {
        T t5 = (T) t4.zzo();
        try {
            zzanb zzanbVarZza = zzamx.zza().zza((zzamx) t5);
            zzanbVarZza.zza(t5, zzakl.zza(zzakhVar), zzakuVar);
            zzanbVarZza.zzd(t5);
            return t5;
        } catch (zzall e5) {
            if (e5.zzl()) {
                throw new zzall(e5);
            }
            throw e5;
        } catch (zzanv e6) {
            zzall zzallVarZza = e6.zza();
            zzallVarZza.getClass();
            throw zzallVarZza;
        } catch (IOException e7) {
            if (e7.getCause() instanceof zzall) {
                throw ((zzall) e7.getCause());
            }
            throw new zzall(e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof zzall) {
                throw ((zzall) e8.getCause());
            }
            throw e8;
        }
    }

    private static <T extends zzalf<T, ?>> T zza(T t4, byte[] bArr, int i, int i5, zzaku zzakuVar) throws zzall {
        if (i5 == 0) {
            return t4;
        }
        T t5 = (T) t4.zzo();
        try {
            zzanb zzanbVarZza = zzamx.zza().zza((zzamx) t5);
            zzanbVarZza.zza(t5, bArr, 0, i5, new zzaju(zzakuVar));
            zzanbVarZza.zzd(t5);
            return t5;
        } catch (zzall e5) {
            if (e5.zzl()) {
                throw new zzall(e5);
            }
            throw e5;
        } catch (zzanv e6) {
            zzall zzallVarZza = e6.zza();
            zzallVarZza.getClass();
            throw zzallVarZza;
        } catch (IOException e7) {
            if (e7.getCause() instanceof zzall) {
                throw ((zzall) e7.getCause());
            }
            throw new zzall(e7);
        } catch (IndexOutOfBoundsException unused) {
            zzall zzallVarZzj = zzall.zzj();
            zzallVarZzj.getClass();
            throw zzallVarZzj;
        }
    }

    public static <E> zzalm<E> zza(zzalm<E> zzalmVar) {
        return zzalmVar.zza(zzalmVar.size() << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzamm zzammVar, String str, Object[] objArr) {
        return new zzamz(zzammVar, str, objArr);
    }

    public static <T extends zzalf<?, ?>> void zza(Class<T> cls, T t4) {
        t4.zzu();
        zzc.put(cls, t4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamm
    public final void zza(zzakn zzaknVar) {
        zzamx.zza().zza((zzamx) this).zza((zzanb) this, (zzaol) zzakp.zza(zzaknVar));
    }
}
