package com.google.android.recaptcha;

import O3.d;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\Recaptcha.smali */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j5, d dVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j5 = 10000;
        }
        return recaptcha.m2getClientBWLJW6A(application, str, j5, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, d dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, O3.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r4 = r0.zza
            P3.a r9 = P3.a.f2678a
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.AbstractC0183a.m0(r4)     // Catch: java.lang.Throwable -> L27
            goto L3d
        L27:
            r4 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0183a.m0(r4)
            r0.zzc = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r4 != r9) goto L3d
            return r9
        L3d:
            com.google.android.recaptcha.internal.zzdc r4 = (com.google.android.recaptcha.internal.zzdc) r4     // Catch: java.lang.Throwable -> L27
            goto L44
        L40:
            K3.f r4 = a.AbstractC0183a.v(r4)
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m2getClientBWLJW6A(android.app.Application, java.lang.String, long, O3.d):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j5) {
        return zzcq.zzc(application, str, j5);
    }
}
