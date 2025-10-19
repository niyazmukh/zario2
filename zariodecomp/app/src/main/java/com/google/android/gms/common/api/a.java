package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\a.smali */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c0370h, obj, (InterfaceC0345g) mVar, (InterfaceC0355q) nVar);
    }

    public g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
