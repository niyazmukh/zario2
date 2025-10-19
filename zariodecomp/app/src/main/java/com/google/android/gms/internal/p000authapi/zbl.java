package com.google.android.gms.internal.p000authapi;

import Z0.b;
import android.app.PendingIntent;
import b1.C0259a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbl.smali */
public final class zbl {
    public final q delete(o oVar, Credential credential) {
        C.g(oVar, "client must not be null");
        C.g(credential, "credential must not be null");
        return ((G) oVar).f5573b.doWrite((l) new zbi(this, oVar, credential));
    }

    public final q disableAutoSignIn(o oVar) {
        C.g(oVar, "client must not be null");
        return ((G) oVar).f5573b.doWrite((l) new zbj(this, oVar));
    }

    public final PendingIntent getHintPickerIntent(o oVar, HintRequest hintRequest) {
        C.g(oVar, "client must not be null");
        C.g(hintRequest, "request must not be null");
        i iVar = b.f3942a;
        throw new UnsupportedOperationException();
    }

    public final q request(o oVar, C0259a c0259a) {
        C.g(oVar, "client must not be null");
        C.g(c0259a, "request must not be null");
        return ((G) oVar).f5573b.doRead((l) new zbg(this, oVar, c0259a));
    }

    public final q save(o oVar, Credential credential) {
        C.g(oVar, "client must not be null");
        C.g(credential, "credential must not be null");
        return ((G) oVar).f5573b.doWrite((l) new zbh(this, oVar, credential));
    }
}
