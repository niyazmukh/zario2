package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
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

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzr.smali */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, hVar);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.i, k.f5649c);
    }

    public final Task<Integer> checkPermissionState() {
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zzac.zza};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1681b = 1564;
        return doRead(hVarA.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        C.f(str);
        C.a("The package name cannot be empty.", !str.isEmpty());
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zzac.zza};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1681b = 1565;
        return doRead(hVarA.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zzac.zza};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1681b = 1563;
        return doWrite(hVarA.a());
    }

    public zzr(Context context) {
        super(context, null, zzc, e.i, k.f5649c);
    }
}
