package com.google.android.gms.internal.p001authapiphone;

import F1.h;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d1.AbstractC0443a;
import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzab.smali */
public final class zzab extends AbstractC0443a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        h hVarA = AbstractC0359w.a();
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1684e = new C0590c[]{zzac.zzc};
        hVarA.f1681b = 1567;
        return doWrite(hVarA.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        h hVarA = AbstractC0359w.a();
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        };
        hVarA.f1684e = new C0590c[]{zzac.zzd};
        hVarA.f1681b = 1568;
        return doWrite(hVarA.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
