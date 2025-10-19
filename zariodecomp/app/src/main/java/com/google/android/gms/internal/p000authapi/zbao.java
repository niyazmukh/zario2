package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import c1.q;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbao.smali */
final class zbao extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        return new zbw(context, looper, (q) obj, c0370h, interfaceC0345g, interfaceC0355q);
    }
}
