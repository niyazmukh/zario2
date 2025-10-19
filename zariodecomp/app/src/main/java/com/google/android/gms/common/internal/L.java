package com.google.android.gms.common.internal;

import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\L.smali */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f5678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5679b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5680c;

    public L(String str, String str2, boolean z4) {
        C.d(str);
        this.f5678a = str;
        C.d(str2);
        this.f5679b = str2;
        this.f5680c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l4 = (L) obj;
        return C.i(this.f5678a, l4.f5678a) && C.i(this.f5679b, l4.f5679b) && C.i(null, null) && this.f5680c == l4.f5680c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5678a, this.f5679b, null, 4225, Boolean.valueOf(this.f5680c)});
    }

    public final String toString() {
        String str = this.f5678a;
        if (str != null) {
            return str;
        }
        C.f(null);
        throw null;
    }
}
