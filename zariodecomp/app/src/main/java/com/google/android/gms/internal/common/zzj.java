package com.google.android.gms.internal.common;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzj.smali */
public final class zzj {
    public static Object zza(Class cls, String str, zzi... zziVarArr) {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z4, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < zziVarArr.length; i++) {
            zzi zziVar = zziVarArr[i];
            zziVar.getClass();
            clsArr[i] = zziVar.zzc();
            objArr[i] = zziVarArr[i].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
