package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaif.smali */
public class zzaif implements zzaez<zzaif> {
    private static final String zza = "zzaif";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzahy zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzaif zza(java.lang.String r17) throws com.google.android.gms.internal.p002firebaseauthapi.zzacn {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = o1.c.a(r4)     // Catch: java.lang.Throwable -> L69
            r0.zzb = r4     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = o1.c.a(r4)     // Catch: java.lang.Throwable -> L69
            r0.zzc = r4     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "PASSWORD_RESET"
            java.lang.String r6 = "VERIFY_EMAIL"
            java.lang.String r7 = "RECOVER_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r10 = "REVERT_SECOND_FACTOR_ADDITION"
            r12 = 1
            if (r4 == r12) goto L47
            switch(r4) {
                case 4: goto L45;
                case 5: goto L43;
                case 6: goto L41;
                case 7: goto L3f;
                case 8: goto L3d;
                default: goto L3b;
            }
        L3b:
            r4 = 0
            goto L48
        L3d:
            r4 = r10
            goto L48
        L3f:
            r4 = r9
            goto L48
        L41:
            r4 = r8
            goto L48
        L43:
            r4 = r7
            goto L48
        L45:
            r4 = r6
            goto L48
        L47:
            r4 = r5
        L48:
            r0.zzd = r4     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r4 == 0) goto La6
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            int r13 = r4.hashCode()     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            r15 = 3
            r11 = 2
            r14 = 4
            switch(r13) {
                case -1874510116: goto L8b;
                case -1452371317: goto L83;
                case -1341836234: goto L7b;
                case -1099157829: goto L73;
                case 870738373: goto L6b;
                case 970484929: goto L61;
                default: goto L60;
            }     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
        L60:
            goto L93
        L61:
            boolean r5 = r4.equals(r7)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = r14
            goto L94
        L69:
            r0 = move-exception
            goto Lb7
        L6b:
            boolean r5 = r4.equals(r8)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = r11
            goto L94
        L73:
            boolean r5 = r4.equals(r9)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = r15
            goto L94
        L7b:
            boolean r5 = r4.equals(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = 0
            goto L94
        L83:
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = r12
            goto L94
        L8b:
            boolean r5 = r4.equals(r10)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r5 == 0) goto L93
            r5 = 5
            goto L94
        L93:
            r5 = -1
        L94:
            if (r5 == 0) goto La3
            if (r5 == r12) goto La3
            if (r5 == r11) goto La3
            if (r5 == r15) goto La3
            if (r5 == r14) goto La3
            r6 = 5
            if (r5 == r6) goto La3
            r11 = 0
            goto La4
        La3:
            r11 = r4
        La4:
            r0.zzd = r11     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
        La6:
            boolean r4 = r3.has(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            if (r4 == 0) goto Lb6
            org.json.JSONObject r2 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            com.google.android.gms.internal.firebase-auth-api.zzahy r2 = com.google.android.gms.internal.p002firebaseauthapi.zzahy.zza(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
            r0.zze = r2     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69
        Lb6:
            return r0
        Lb7:
            java.lang.String r2 = com.google.android.gms.internal.p002firebaseauthapi.zzaif.zza
            com.google.android.gms.internal.firebase-auth-api.zzacn r0 = com.google.android.gms.internal.p002firebaseauthapi.zzajk.zza(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaif.zza(java.lang.String):com.google.android.gms.internal.firebase-auth-api.zzaif");
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }

    public final zzahy zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
