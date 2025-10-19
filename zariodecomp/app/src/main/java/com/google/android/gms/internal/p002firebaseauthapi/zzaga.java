package com.google.android.gms.internal.p002firebaseauthapi;

import l2.h;
import o2.u;
import o2.v;
import o2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaga.smali */
final class zzaga extends w {
    private final /* synthetic */ w zza;
    private final /* synthetic */ String zzb;

    public zzaga(w wVar, String str) {
        this.zza = wVar;
        this.zzb = str;
    }

    @Override // o2.w
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzagb.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // o2.w
    public final void onCodeSent(String str, v vVar) {
        this.zza.onCodeSent(str, vVar);
    }

    @Override // o2.w
    public final void onVerificationCompleted(u uVar) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(uVar);
    }

    @Override // o2.w
    public final void onVerificationFailed(h hVar) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationFailed(hVar);
    }
}
