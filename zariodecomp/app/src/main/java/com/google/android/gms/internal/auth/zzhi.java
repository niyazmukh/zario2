package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzhi.smali */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhi.<clinit>():void");
    }

    private zzhi() {
    }

    public static double zza(Object obj, long j5) {
        return zze.zza(obj, j5);
    }

    public static float zzb(Object obj, long j5) {
        return zze.zzb(obj, j5);
    }

    public static int zzc(Object obj, long j5) {
        return zze.zzi(obj, j5);
    }

    public static long zzd(Object obj, long j5) {
        return zze.zzj(obj, j5);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static Object zzf(Object obj, long j5) {
        return zze.zzl(obj, j5);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j5, boolean z4) {
        long j6 = (-4) & j5;
        zzhh zzhhVar = zze;
        int iZzi = zzhhVar.zzi(obj, j6);
        int i = ((~((int) j5)) & 3) << 3;
        zzhhVar.zzm(obj, j6, ((z4 ? 1 : 0) << i) | ((~(255 << i)) & iZzi));
    }

    public static /* synthetic */ void zzj(Object obj, long j5, boolean z4) {
        long j6 = (-4) & j5;
        zzhh zzhhVar = zze;
        int i = (((int) j5) & 3) << 3;
        zzhhVar.zzm(obj, j6, ((z4 ? 1 : 0) << i) | ((~(255 << i)) & zzhhVar.zzi(obj, j6)));
    }

    public static void zzk(Object obj, long j5, boolean z4) {
        zze.zzc(obj, j5, z4);
    }

    public static void zzl(Object obj, long j5, double d5) {
        zze.zzd(obj, j5, d5);
    }

    public static void zzm(Object obj, long j5, float f2) {
        zze.zze(obj, j5, f2);
    }

    public static void zzn(Object obj, long j5, int i) {
        zze.zzm(obj, j5, i);
    }

    public static void zzo(Object obj, long j5, long j6) {
        zze.zzn(obj, j5, j6);
    }

    public static void zzp(Object obj, long j5, Object obj2) {
        zze.zzo(obj, j5, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j5) {
        return ((byte) ((zze.zzi(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j5) {
        return ((byte) ((zze.zzi(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i = zzdr.zza;
        try {
            Class cls2 = zzc;
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

    public static boolean zzt(Object obj, long j5) {
        return zze.zzf(obj, j5);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzdr.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
