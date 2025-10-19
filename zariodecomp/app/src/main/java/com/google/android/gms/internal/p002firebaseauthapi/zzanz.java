package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanz.smali */
final class zzanz {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanz$zza.smali */
    public static final class zza extends zzc {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final double zza(Object obj, long j5) {
            return Double.longBitsToDouble(zze(obj, j5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final float zzb(Object obj, long j5) {
            return Float.intBitsToFloat(zzd(obj, j5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final boolean zzc(Object obj, long j5) {
            return zzanz.zza ? zzanz.zzf(obj, j5) : zzanz.zzg(obj, j5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, boolean z4) {
            if (zzanz.zza) {
                zzanz.zza(obj, j5, z4);
            } else {
                zzanz.zzb(obj, j5, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, byte b5) {
            if (!zzanz.zza) {
                zzanz.zzd(obj, j5, b5);
            } else {
                zzanz.zzc(obj, j5, b5);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, double d5) {
            zza(obj, j5, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, float f2) {
            zza(obj, j5, Float.floatToIntBits(f2));
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanz$zzb.smali */
    public static final class zzb extends zzc {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final double zza(Object obj, long j5) {
            return Double.longBitsToDouble(zze(obj, j5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final float zzb(Object obj, long j5) {
            return Float.intBitsToFloat(zzd(obj, j5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final boolean zzc(Object obj, long j5) {
            return zzanz.zza ? zzanz.zzf(obj, j5) : zzanz.zzg(obj, j5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, boolean z4) {
            if (zzanz.zza) {
                zzanz.zza(obj, j5, z4);
            } else {
                zzanz.zzb(obj, j5, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, byte b5) {
            if (!zzanz.zza) {
                zzanz.zzd(obj, j5, b5);
            } else {
                zzanz.zzc(obj, j5, b5);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, double d5) {
            zza(obj, j5, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzanz.zzc
        public final void zza(Object obj, long j5, float f2) {
            zza(obj, j5, Float.floatToIntBits(f2));
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzanz$zzc.smali */
    public static abstract class zzc {
        Unsafe zza;

        public zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j5);

        public abstract void zza(Object obj, long j5, byte b5);

        public abstract void zza(Object obj, long j5, double d5);

        public abstract void zza(Object obj, long j5, float f2);

        public final void zza(Object obj, long j5, int i) {
            this.zza.putInt(obj, j5, i);
        }

        public abstract void zza(Object obj, long j5, boolean z4);

        public abstract float zzb(Object obj, long j5);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzanz.zze() != null;
            } catch (Throwable th) {
                zzanz.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j5);

        public final int zzd(Object obj, long j5) {
            return this.zza.getInt(obj, j5);
        }

        public final long zze(Object obj, long j5) {
            return this.zza.getLong(obj, j5);
        }

        public final void zza(Object obj, long j5, long j6) {
            this.zza.putLong(obj, j5, j6);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzanz.zza(th);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzajs.zza()
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzanz$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzanz$zza
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.firebase-auth-api.zzanz$zzb r1 = new com.google.android.gms.internal.firebase-auth-api.zzanz$zzb
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzi = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<int[]> r2 = int[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<long[]> r2 = long[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<float[]> r2 = float[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<double[]> r2 = double[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            zzb(r2)
            zzc(r2)
            java.lang.reflect.Field r2 = zze()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.p002firebaseauthapi.zzanz.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzanz.<clinit>():void");
    }

    private zzanz() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j5) {
        return zzf.zze(obj, j5);
    }

    public static Object zze(Object obj, long j5) {
        return zzf.zza.getObject(obj, j5);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j5) {
        return ((byte) (zzc(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j5) {
        return ((byte) (zzc(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j5) {
        return zzf.zzc(obj, j5);
    }

    public static float zzb(Object obj, long j5) {
        return zzf.zzb(obj, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        zza(obj, j6, ((255 & b5) << i) | (zzc(obj, j6) & (~(255 << i))));
    }

    public static double zza(Object obj, long j5) {
        return zzf.zza(obj, j5);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j5) {
        return zzf.zzd(obj, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static void zzc(Object obj, long j5, boolean z4) {
        zzf.zza(obj, j5, z4);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzany());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j5, byte b5) {
        long j6 = (-4) & j5;
        int iZzc = zzc(obj, j6);
        int i = ((~((int) j5)) & 3) << 3;
        zza(obj, j6, ((255 & b5) << i) | (iZzc & (~(255 << i))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzanz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zzb(Object obj, long j5, boolean z4) {
        zzd(obj, j5, z4 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j5, boolean z4) {
        zzc(obj, j5, z4 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j5, byte b5) {
        zzf.zza((Object) bArr, zzi + j5, b5);
    }

    public static void zza(Object obj, long j5, double d5) {
        zzf.zza(obj, j5, d5);
    }

    public static void zza(Object obj, long j5, float f2) {
        zzf.zza(obj, j5, f2);
    }

    public static void zza(Object obj, long j5, int i) {
        zzf.zza(obj, j5, i);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j5, long j6) {
        zzf.zza(obj, j5, j6);
    }

    public static void zza(Object obj, long j5, Object obj2) {
        zzf.zza.putObject(obj, j5, obj2);
    }
}
