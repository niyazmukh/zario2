package com.google.android.recaptcha.internal;

import L3.s;
import X3.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzfy.smali */
public final class zzfy extends zzfx {
    private final p zza;
    private final String zzb;

    public zzfy(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List arrayList;
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                arrayList.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            arrayList = s.f2351a;
        }
        zztfVarZzf.zze(arrayList);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        p pVar = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        pVar.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
