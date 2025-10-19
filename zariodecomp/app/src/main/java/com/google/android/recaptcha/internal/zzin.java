package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import Q3.j;
import X3.p;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzin.smali */
final class zzin extends j implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzin(this.zzb, this.zzc, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.zzF(r1, r3) == r0) goto L13;
     */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r3.zza
            r2 = 1
            a.AbstractC0183a.m0(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2a
        Ld:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L2d
        L17:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzja.zzu(r4, r1, r3)
            if (r3 != r0) goto L2a
            goto L2d
        L2a:
            K3.k r3 = K3.k.f2288a
            return r3
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
