package com.google.android.gms.common.api.internal;

import h1.C0590c;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\E.smali */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C0339a f5564a;

    /* renamed from: b, reason: collision with root package name */
    public final C0590c f5565b;

    public /* synthetic */ E(C0339a c0339a, C0590c c0590c) {
        this.f5564a = c0339a;
        this.f5565b = c0590c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof E)) {
            E e5 = (E) obj;
            if (com.google.android.gms.common.internal.C.i(this.f5564a, e5.f5564a) && com.google.android.gms.common.internal.C.i(this.f5565b, e5.f5565b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5564a, this.f5565b});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.c(this.f5564a, "key");
        lVar.c(this.f5565b, "feature");
        return lVar.toString();
    }
}
