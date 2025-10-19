package com.google.android.gms.internal.auth;

import X0.b;
import X0.d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0590c;
import k1.C0657a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzab.smali */
final class zzab extends l implements zzg {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private static final C0657a zzd;
    private final Context zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, hVar);
        zzd = new C0657a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.i, k.f5649c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.c() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(C.j(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{d.f3716c};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        hVarA.f1681b = 1513;
        return doWrite(hVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final b bVar) {
        C.g(bVar, "request cannot be null.");
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{d.f3715b};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        hVarA.f1681b = 1515;
        return doWrite(hVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        C.g(account, "Account name cannot be null!");
        C.e(str, "Scope cannot be null!");
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{d.f3716c};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        hVarA.f1681b = 1512;
        return doWrite(hVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(Account account) {
        C.g(account, "account cannot be null.");
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{d.f3715b};
        hVarA.f1683d = new zzr(this, account);
        hVarA.f1681b = 1517;
        return doWrite(hVarA.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        C.g(str, "Client package name cannot be null!");
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{d.f3715b};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        hVarA.f1681b = 1514;
        return doWrite(hVarA.a());
    }
}
