package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0183a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.t;
import p2.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaek.smali */
final class zzaek extends zzaff<String, u> {
    private final String zzv;
    private final String zzw;

    public zzaek(String str, String str2) {
        super(4);
        C.e(str, "code cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        char c5 = 5;
        char c6 = 3;
        zzaif zzaifVar = this.zzm;
        if (zzaifVar.zzg()) {
            zzaifVar.zzc();
        } else {
            zzaifVar.zzb();
        }
        zzaifVar.zzb();
        if (zzaifVar.zzh()) {
            String strZzd = zzaifVar.zzd();
            strZzd.getClass();
            switch (strZzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c5 = 6;
                    break;
                case "PASSWORD_RESET":
                    c5 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c5 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    break;
                case "EMAIL_SIGNIN":
                    c5 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c5 = 2;
                    break;
                default:
                    c5 = 3;
                    break;
            }
            if (c5 != 4 && c5 != 3) {
                if (zzaifVar.zzf()) {
                    String strZzb = zzaifVar.zzb();
                    t tVarP0 = AbstractC0183a.p0(zzaifVar.zza());
                    C.d(strZzb);
                    C.f(tVarP0);
                } else if (zzaifVar.zzg()) {
                    String strZzc = zzaifVar.zzc();
                    String strZzb2 = zzaifVar.zzb();
                    C.d(strZzc);
                    C.d(strZzb2);
                } else if (zzaifVar.zze()) {
                    C.d(zzaifVar.zzb());
                }
            }
            c6 = c5;
        }
        if (c6 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzd(this.zzv, this.zzw, this.zzb);
    }
}
