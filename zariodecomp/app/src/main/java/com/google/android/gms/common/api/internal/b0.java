package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import g0.AbstractComponentCallbacksC0567t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\b0.smali */
public final class b0 extends AbstractComponentCallbacksC0567t implements InterfaceC0351m {

    /* renamed from: b0, reason: collision with root package name */
    public static final WeakHashMap f5616b0 = new WeakHashMap();

    /* renamed from: a0, reason: collision with root package name */
    public final C.d f5617a0 = new C.d(4, (byte) 0);

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void A(int i, int i5, Intent intent) {
        super.A(i, i5, intent);
        Iterator it = ((Map) this.f5617a0.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onActivityResult(i, i5, intent);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void D(Bundle bundle) {
        super.D(bundle);
        this.f5617a0.i(bundle);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void F() {
        this.f7510H = true;
        C.d dVar = this.f5617a0;
        dVar.f1046b = 5;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onDestroy();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void K() {
        this.f7510H = true;
        C.d dVar = this.f5617a0;
        dVar.f1046b = 3;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onResume();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void L(Bundle bundle) {
        this.f5617a0.j(bundle);
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void M() {
        this.f7510H = true;
        C.d dVar = this.f5617a0;
        dVar.f1046b = 2;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onStart();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void N() {
        this.f7510H = true;
        C.d dVar = this.f5617a0;
        dVar.f1046b = 4;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0351m
    public final void c(String str, AbstractC0350l abstractC0350l) {
        this.f5617a0.h(str, abstractC0350l);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0351m
    public final AbstractC0350l d(Class cls, String str) {
        return (AbstractC0350l) cls.cast(((Map) this.f5617a0.f1047c).get(str));
    }

    @Override // g0.AbstractComponentCallbacksC0567t
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f5617a0.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
