package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import h1.C0590c;
import h1.C0591d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\k.1.smali */
public abstract class AbstractC0373k extends AbstractC0368f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C0370h zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0373k(Context context, Looper looper, int i, C0370h c0370h, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        synchronized (AbstractC0374l.f5729a) {
            try {
                if (AbstractC0374l.f5730b == null) {
                    AbstractC0374l.f5730b = new O(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        O o5 = AbstractC0374l.f5730b;
        Object obj = C0591d.f7630c;
        C.f(interfaceC0345g);
        C.f(interfaceC0355q);
        super(context, looper, o5, i, new r(interfaceC0345g), new r(interfaceC0355q), c0370h.f5704e);
        this.zab = c0370h;
        this.zad = null;
        Set<Scope> set = c0370h.f5701b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C0370h getClientSettings() {
        return this.zab;
    }

    public C0590c[] getRequiredFeatures() {
        return new C0590c[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
