package com.google.android.recaptcha.internal;

import K3.k;
import O3.d;
import P3.a;
import Q3.j;
import X3.p;
import a.AbstractC0183a;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzac.smali */
final class zzac extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // Q3.a
    public final d create(Object obj, d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    @Override // X3.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((C) obj, (d) obj2)).invokeSuspend(k.f2288a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzy zzyVar;
        a aVar = a.f2678a;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e5) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e5.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i = 2;
            this.zzb = 2;
            if (e5 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e5).getErrorCode();
                if (errorCode == -100) {
                    i = 44;
                } else if (errorCode == -12) {
                    i = 39;
                } else if (errorCode == -3) {
                    i = 30;
                } else if (errorCode == -2) {
                    i = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i = 53;
                            break;
                        case -17:
                            i = 52;
                            break;
                        case -16:
                            i = 43;
                            break;
                        case -15:
                            i = 42;
                            break;
                        case -14:
                            i = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i = 36;
                                    break;
                                case -8:
                                    i = 35;
                                    break;
                                case -7:
                                    i = 34;
                                    break;
                                case -6:
                                    i = 33;
                                    break;
                                case -5:
                                    i = 32;
                                    break;
                            }
                    }
                } else {
                    i = 28;
                }
            } else {
                i = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj == aVar) {
                return aVar;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            AbstractC0183a.m0(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                AbstractC0183a.m0(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            AbstractC0183a.m0(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
