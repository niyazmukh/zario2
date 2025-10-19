package com.google.android.recaptcha.internal;

import K3.c;
import K3.k;
import L3.j;
import O3.d;
import P3.a;
import S0.f;
import android.app.Application;
import android.webkit.WebView;
import f4.C0521u;
import f4.D0;
import f4.E;
import f4.InterfaceC0520t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzja.smali */
public final class zzja extends zze {
    public InterfaceC0520t zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final c zzk;
    private final c zzl;
    private final c zzm;
    private final c zzn;
    private final c zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = f.P(zzis.zza);
        this.zzl = f.P(zzit.zza);
        this.zzm = f.P(zziu.zza);
        this.zzn = f.P(zziv.zza);
        this.zzo = f.P(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, O3.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzja r4 = r0.zzd
            a.AbstractC0183a.m0(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0183a.m0(r6)
            K3.c r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            java.lang.Object r6 = r6.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzbi r5 = r4.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            f4.C r5 = r5.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzin r0 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r1 = 0
            r0.<init>(r4, r6, r1)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r6 = 3
            f4.E.t(r5, r1, r1, r0, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L67
        L5e:
            f4.t r4 = r4.zzA()
            f4.u r4 = (f4.C0521u) r4
            r4.R(r5)
        L67:
            K3.k r4 = K3.k.f2288a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, O3.d r10) throws java.util.MissingResourceException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.String r8 = r0.zzf
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            a.AbstractC0183a.m0(r10)     // Catch: java.lang.Exception -> L30
            r3 = r8
            r4 = r9
            r8 = r0
            goto L64
        L30:
            r8 = move-exception
            goto L75
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            a.AbstractC0183a.m0(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            K3.c r10 = r8.zzl     // Catch: java.lang.Exception -> L70
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L70
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L70
            r0.zzd = r8     // Catch: java.lang.Exception -> L70
            r0.zze = r9     // Catch: java.lang.Exception -> L70
            r0.zzf = r10     // Catch: java.lang.Exception -> L70
            r0.zzc = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L70
            if (r0 == r1) goto L74
            r4 = r9
            r3 = r10
            r10 = r0
        L64:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L70
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L70
            goto L95
        L70:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L75
        L74:
            return r1
        L75:
            com.google.android.recaptcha.internal.zzbd r9 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r10 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r10, r1, r8)
            com.google.android.recaptcha.internal.zzen r8 = r0.zzp
            if (r8 == 0) goto L89
            r8.zzb(r9)
        L89:
            r8 = 0
            r0.zzp = r8
            f4.t r8 = r0.zzA()
            f4.u r8 = (f4.C0521u) r8
            r8.R(r9)
        L95:
            K3.k r8 = K3.k.f2288a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r10, O3.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            K3.k r3 = K3.k.f2288a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r10 = r0.zzd
            a.AbstractC0183a.m0(r11)
            goto L78
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r10 = r0.zze
            com.google.android.recaptcha.internal.zzja r9 = r0.zzd
            a.AbstractC0183a.m0(r11)
            goto L5b
        L40:
            a.AbstractC0183a.m0(r11)
            com.google.android.recaptcha.internal.zzcb r11 = r9.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r6, r7}
            r0.zzd = r9
            r0.zze = r10
            r0.zzc = r5
            java.lang.Object r11 = r11.zzb(r2, r0)
            if (r11 == r1) goto L9a
        L5b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L64
            return r3
        L64:
            com.google.android.recaptcha.internal.zzcb r11 = r9.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r9
            r0.zze = r10
            r0.zzc = r4
            java.lang.Object r11 = r11.zzc(r2, r0)
            if (r11 != r1) goto L75
            goto L9a
        L75:
            r8 = r10
            r10 = r9
            r9 = r8
        L78:
            f4.u r11 = f4.E.a()
            r10.zza = r11
            com.google.android.recaptcha.internal.zzek r11 = r10.zzj
            r11.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r11.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r11 = r10.zzq
            f4.C r11 = r11.zza()
            com.google.android.recaptcha.internal.zziz r0 = new com.google.android.recaptcha.internal.zziz
            r1 = 0
            r0.<init>(r10, r9, r1)
            r9 = 3
            f4.E.t(r11, r1, r1, r0, r9)
            return r3
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, O3.d):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC0520t zzA() {
        InterfaceC0520t interfaceC0520t = this.zza;
        if (interfaceC0520t != null) {
            return interfaceC0520t;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(j.v0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, d dVar) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9 A[Catch: Exception -> 0x0039, PHI: r10 r11
  0x00c9: PHI (r10v12 java.lang.String) = (r10v11 java.lang.String), (r10v18 java.lang.String) binds: [B:44:0x00c7, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r11v8 com.google.android.recaptcha.internal.zzja) = (r11v18 com.google.android.recaptcha.internal.zzja), (r11v19 com.google.android.recaptcha.internal.zzja) binds: [B:44:0x00c7, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0039, blocks: (B:16:0x0034, B:47:0x0107, B:23:0x0048, B:45:0x00c9, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(java.lang.String r11, O3.d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, d dVar) throws MissingResourceException {
        if (i.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return k.f2288a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r5.zzc(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, O3.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            P3.a r1 = P3.a.f2678a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            a.AbstractC0183a.m0(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            a.AbstractC0183a.m0(r7)
            goto L6c
        L36:
            a.AbstractC0183a.m0(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L5f
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r5 = r5.zzG(r6, r0)
            if (r5 == r1) goto L6b
        L5c:
            K3.k r5 = K3.k.f2288a
            return r5
        L5f:
            com.google.android.recaptcha.internal.zzcb r5 = r5.zzg
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r5 = r5.zzc(r6, r0)
            if (r5 != r1) goto L6c
        L6b:
            return r1
        L6c:
            com.google.android.recaptcha.internal.zzbd r5 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r6 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r7 = com.google.android.recaptcha.internal.zzba.zzav
            r0 = 0
            r5.<init>(r6, r7, r0)
            K3.f r5 = a.AbstractC0183a.v(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, O3.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j5, Exception exc, d dVar) {
        exc.getMessage();
        InterfaceC0520t interfaceC0520t = (InterfaceC0520t) this.zze.remove(str);
        if (interfaceC0520t != null) {
            ((C0521u) interfaceC0520t).R(exc);
        }
        return k.f2288a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, d dVar) {
        return ((exc instanceof D0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(d dVar) {
        return E.B(this.zzq.zzb().e(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), dVar);
    }

    public final Object zzx(d dVar) throws Throwable {
        Object objB = E.B(this.zzq.zzb().e(), new zzil(this, (d) null), dVar);
        return objB == a.f2678a ? objB : k.f2288a;
    }
}
