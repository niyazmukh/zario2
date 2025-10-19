package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\a0.smali */
public final class a0 extends Fragment implements InterfaceC0351m {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f5614b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C.d f5615a = new C.d(4, (byte) 0);

    @Override // com.google.android.gms.common.api.internal.InterfaceC0351m
    public final void c(String str, AbstractC0350l abstractC0350l) {
        this.f5615a.h(str, abstractC0350l);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0351m
    public final AbstractC0350l d(Class cls, String str) {
        return (AbstractC0350l) cls.cast(((Map) this.f5615a.f1047c).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f5615a.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0351m
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i5, Intent intent) {
        super.onActivityResult(i, i5, intent);
        Iterator it = ((Map) this.f5615a.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onActivityResult(i, i5, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5615a.i(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C.d dVar = this.f5615a;
        dVar.f1046b = 5;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C.d dVar = this.f5615a;
        dVar.f1046b = 3;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f5615a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C.d dVar = this.f5615a;
        dVar.f1046b = 2;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C.d dVar = this.f5615a;
        dVar.f1046b = 4;
        Iterator it = ((Map) dVar.f1047c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0350l) it.next()).onStop();
        }
    }
}
