package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzams.smali */
final class zzams<T> implements zzanb<T> {
    private final zzamm zza;
    private final zzanu<?, ?> zzb;
    private final boolean zzc;
    private final zzakw<?> zzd;

    private zzams(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        this.zzb = zzanuVar;
        this.zzc = zzakwVar.zza(zzammVar);
        this.zzd = zzakwVar;
        this.zza = zzammVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t4) {
        zzanu<?, ?> zzanuVar = this.zzb;
        int iZzb = zzanuVar.zzb(zzanuVar.zzd(t4));
        return this.zzc ? iZzb + this.zzd.zza(t4).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t4) {
        int iHashCode = this.zzb.zzd(t4).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t4).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t4) {
        this.zzb.zzf(t4);
        this.zzd.zzc(t4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t4) {
        return this.zzd.zza(t4).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zzb(T t4, T t5) {
        if (!this.zzb.zzd(t4).equals(this.zzb.zzd(t5))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t4).equals(this.zzd.zza(t5));
        }
        return true;
    }

    public static <T> zzams<T> zza(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        return new zzams<>(zzanuVar, zzakwVar, zzammVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        zzamm zzammVar = this.zza;
        if (zzammVar instanceof zzalf) {
            return (T) ((zzalf) zzammVar).zzo();
        }
        return (T) zzammVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t4, T t5) {
        zzand.zza(this.zzb, t4, t5);
        if (this.zzc) {
            zzand.zza(this.zzd, t4, t5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:47:0x000c->B:55:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r12, com.google.android.gms.internal.p002firebaseauthapi.zzanc r13, com.google.android.gms.internal.p002firebaseauthapi.zzaku r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.firebase-auth-api.zzanu<?, ?> r0 = r11.zzb
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r1 = r11.zzd
            java.lang.Object r2 = r0.zzc(r12)
            com.google.android.gms.internal.firebase-auth-api.zzakx r3 = r1.zzb(r12)
        Lc:
            int r4 = r13.zzc()     // Catch: java.lang.Throwable -> L35
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r12, r2)
            return
        L19:
            int r4 = r13.zzd()     // Catch: java.lang.Throwable -> L35
            r6 = 11
            r7 = 0
            if (r4 == r6) goto L41
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3c
            com.google.android.gms.internal.firebase-auth-api.zzamm r5 = r11.zza     // Catch: java.lang.Throwable -> L35
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r14, r5, r4)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L37
            r1.zza(r13, r4, r14, r3)     // Catch: java.lang.Throwable -> L35
            goto L86
        L35:
            r11 = move-exception
            goto L92
        L37:
            boolean r4 = r0.zza(r2, r13, r7)     // Catch: java.lang.Throwable -> L35
            goto L87
        L3c:
            boolean r4 = r13.zzt()     // Catch: java.lang.Throwable -> L35
            goto L87
        L41:
            r4 = 0
            r6 = r4
        L43:
            int r8 = r13.zzc()     // Catch: java.lang.Throwable -> L35
            r9 = 12
            if (r8 == r5) goto L75
            int r8 = r13.zzd()     // Catch: java.lang.Throwable -> L35
            r10 = 16
            if (r8 != r10) goto L5e
            int r7 = r13.zzj()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.firebase-auth-api.zzamm r4 = r11.zza     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r1.zza(r14, r4, r7)     // Catch: java.lang.Throwable -> L35
            goto L43
        L5e:
            r10 = 26
            if (r8 != r10) goto L6d
            if (r4 == 0) goto L68
            r1.zza(r13, r4, r14, r3)     // Catch: java.lang.Throwable -> L35
            goto L43
        L68:
            com.google.android.gms.internal.firebase-auth-api.zzajv r6 = r13.zzp()     // Catch: java.lang.Throwable -> L35
            goto L43
        L6d:
            if (r8 == r9) goto L75
            boolean r8 = r13.zzt()     // Catch: java.lang.Throwable -> L35
            if (r8 != 0) goto L43
        L75:
            int r5 = r13.zzd()     // Catch: java.lang.Throwable -> L35
            if (r5 != r9) goto L8d
            if (r6 == 0) goto L86
            if (r4 == 0) goto L83
            r1.zza(r6, r4, r14, r3)     // Catch: java.lang.Throwable -> L35
            goto L86
        L83:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L35
        L86:
            r4 = 1
        L87:
            if (r4 != 0) goto Lc
            r0.zzb(r12, r2)
            return
        L8d:
            com.google.android.gms.internal.firebase-auth-api.zzall r11 = com.google.android.gms.internal.p002firebaseauthapi.zzall.zzb()     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        L92:
            r0.zzb(r12, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzams.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzaju r14) throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzalf) r0
            com.google.android.gms.internal.firebase-auth-api.zzanx r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzanx r2 = com.google.android.gms.internal.p002firebaseauthapi.zzanx.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzanx r1 = com.google.android.gms.internal.p002firebaseauthapi.zzanx.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzd r10 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaku r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamm r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza()
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L4c:
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzajv r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzajv) r2
            goto L53
        L72:
            com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza()
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaku r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamm r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzall r9 = com.google.android.gms.internal.p002firebaseauthapi.zzall.zzg()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzams.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t4, zzaol zzaolVar) {
        Iterator itZzd = this.zzd.zza(t4).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzakz zzakzVar = (zzakz) entry.getKey();
            if (zzakzVar.zzc() == zzaoj.MESSAGE && !zzakzVar.zze() && !zzakzVar.zzd()) {
                if (entry instanceof zzalp) {
                    zzaolVar.zza(zzakzVar.zza(), (Object) ((zzalp) entry).zza().zzb());
                } else {
                    zzaolVar.zza(zzakzVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzanu<?, ?> zzanuVar = this.zzb;
        zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t4), zzaolVar);
    }
}
