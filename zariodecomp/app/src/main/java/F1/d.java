package F1;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1671b;

    public d(K.f fVar, boolean z4) {
        this.f1671b = fVar;
        this.f1670a = z4;
    }

    public boolean a() {
        return this.f1670a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L44
            if (r8 < 0) goto L44
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f1671b
            K.f r1 = (K.f) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.a()
            return r6
        L17:
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L1b:
            if (r3 >= r8) goto L39
            if (r4 != r2) goto L39
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            F1.d r5 = K.g.f2115a
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L37
        L34:
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r0 = r6.a()
            goto L43
        L42:
            r0 = r1
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.d.b(java.lang.CharSequence, int):boolean");
    }

    public d(String str, boolean z4) {
        this.f1670a = z4;
        this.f1671b = str;
    }

    public d(BottomSheetBehavior bottomSheetBehavior, boolean z4) {
        this.f1671b = bottomSheetBehavior;
        this.f1670a = z4;
    }
}
