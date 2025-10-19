package com.google.android.recaptcha.internal;

import O3.g;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import f4.C0521u;
import f4.E;
import f4.H;
import f4.t0;
import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbx.smali */
public final class zzbx {
    public static final H zza(Task task) {
        final C0521u c0521uA = E.a();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                g gVar = c0521uA;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((C0521u) gVar).R(exception);
                } else if (task2.isCanceled()) {
                    ((t0) gVar).cancel((CancellationException) null);
                } else {
                    ((C0521u) gVar).D(task2.getResult());
                }
            }
        });
        return new zzbw(c0521uA);
    }
}
