package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api-phone\zzt.smali */
final class zzt extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        return new zzw(context, looper, c0370h, interfaceC0345g, interfaceC0355q);
    }
}
