package com.google.android.recaptcha.internal;

import L3.s;
import O3.d;
import f4.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzl.smali */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... elements) {
        List list = this.zza;
        i.e(list, "<this>");
        i.e(elements, "elements");
        list.addAll(L3.i.q0(elements));
    }

    public final Object zzb(String str, long j5, d dVar) {
        return E.g(new zzh(this, str, j5, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r12, com.google.android.recaptcha.internal.zzsc r14, com.google.android.recaptcha.internal.zzek r15, O3.d r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r3 = r11
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r3 = r11
            r1.<init>(r11, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            P3.a r9 = P3.a.f2678a
            int r2 = r1.zzc
            r10 = 1
            if (r2 == 0) goto L33
            if (r2 != r10) goto L2b
            a.AbstractC0183a.m0(r0)
            goto L4a
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            a.AbstractC0183a.m0(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r11
            r4 = r15
            r5 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r10
            java.lang.Object r0 = f4.E.g(r0, r1)
            if (r0 != r9) goto L4a
            return r9
        L4a:
            K3.g r0 = (K3.g) r0
            java.lang.Object r0 = r0.f2280a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, O3.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i, e eVar) {
        s sVar = s.f2351a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) sVar.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
