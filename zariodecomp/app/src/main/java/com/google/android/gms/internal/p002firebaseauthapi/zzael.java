package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import k1.C0657a;
import o2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzael.smali */
public class zzael implements zzaem {
    private final zzaem zza;
    private final C0657a zzb;

    public zzael(zzael zzaelVar) {
        this(zzaelVar.zza, zzaelVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending send verification code response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending set account info response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending create auth uri response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending email verification response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e5, new Object[0]);
        }
    }

    public zzael(zzaem zzaemVar, C0657a c0657a) {
        C.f(zzaemVar);
        this.zza = zzaemVar;
        C.f(c0657a);
        this.zzb = c0657a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending delete account response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        try {
            this.zza.zza(zzaapVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending failure result with credential", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        try {
            this.zza.zza(zzaasVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending failure result for mfa", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, u uVar) {
        try {
            this.zza.zza(status, uVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending failure result.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending failure result.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        try {
            this.zza.zza(zzahrVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        try {
            this.zza.zza(zzahsVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        try {
            this.zza.zza(zzahvVar, zzahkVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending get token and account info user response", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        try {
            this.zza.zza(zzaifVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending password reset response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        try {
            this.zza.zza(zzaigVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending revoke token response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        try {
            this.zza.zza(zzairVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        try {
            this.zza.zza(zzahvVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending token result.", e5, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(u uVar) {
        try {
            this.zza.zza(uVar);
        } catch (RemoteException e5) {
            this.zzb.b("RemoteException when sending verification completed response.", e5, new Object[0]);
        }
    }
}
