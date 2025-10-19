package com.google.android.gms.internal.p002firebaseauthapi;

import S0.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import java.util.Objects;
import o2.AbstractC0799c;
import o2.u;
import p2.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafh.smali */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    public zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) {
        String str = status.f5536b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 8);
        zza(new zzafj(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 7);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 6);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 9);
        zzaff.zza(this.zza);
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    private final void zza(Status status, AbstractC0799c abstractC0799c, String str, String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = abstractC0799c;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        i iVar = zzaffVar.zzf;
        if (iVar != null) {
            iVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 8);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 3);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 5);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(f.s0("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, u uVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 2);
        zza(status, uVar, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type: " + i, i == 2);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 4);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type: " + i, i == 1);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(u uVar) {
        int i = this.zza.zza;
        C.h("Unexpected response type " + i, i == 8);
        this.zza.zzu = true;
        zza(new zzafi(this, uVar));
    }
}
