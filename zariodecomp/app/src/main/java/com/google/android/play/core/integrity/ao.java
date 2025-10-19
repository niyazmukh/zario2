package com.google.android.play.core.integrity;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ao.smali */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f6267a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f6268b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6269c = null;

    public /* synthetic */ ao(String str, Long l4, Object obj, an anVar) {
        this.f6267a = str;
        this.f6268b = l4;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f6268b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f6267a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r5 = r5.f6268b
            if (r5 != 0) goto L26
            java.lang.Long r5 = r1.cloudProjectNumber()
            if (r5 != 0) goto L24
        L22:
            r5 = r0
            goto L31
        L24:
            r5 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L24
            goto L22
        L31:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r1 == 0) goto L44
            boolean r1 = a()
            if (r1 == 0) goto L44
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r5 == 0) goto L42
            java.lang.Object r5 = r6.f6269c
            goto L45
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r5
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f6267a.hashCode() ^ 1000003;
        Long l4 = this.f6268b;
        int iHashCode2 = (l4 == null ? 0 : l4.hashCode()) ^ (iHashCode * 1000003);
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f6267a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f6267a + ", cloudProjectNumber=" + this.f6268b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
