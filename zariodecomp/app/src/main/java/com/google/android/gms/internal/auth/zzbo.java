package com.google.android.gms.internal.auth;

import F1.h;
import Z0.c;
import Z0.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e1.C0448a;
import e1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbo.smali */
public final class zzbo extends l {
    public zzbo(Activity activity, d dVar) {
        super(activity, activity, c.f3944a, dVar == null ? d.f3945b : dVar, k.f5649c);
    }

    public final Task<String> getSpatulaHeader() {
        h hVarA = AbstractC0359w.a();
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1681b = 1520;
        return doRead(hVarA.a());
    }

    public final Task<b> performProxyRequest(final C0448a c0448a) {
        h hVarA = AbstractC0359w.a();
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                C0448a c0448a2 = c0448a;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), c0448a2);
            }
        };
        hVarA.f1681b = 1518;
        return doWrite(hVarA.a());
    }

    public zzbo(Context context, d dVar) {
        super(context, null, c.f3944a, dVar == null ? d.f3945b : dVar, k.f5649c);
    }
}
