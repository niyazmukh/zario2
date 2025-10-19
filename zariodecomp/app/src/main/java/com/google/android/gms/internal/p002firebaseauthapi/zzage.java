package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzage.smali */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzagc.zza.c(AbstractC0854a.b("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
