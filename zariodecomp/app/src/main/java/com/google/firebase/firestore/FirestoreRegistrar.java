package com.google.firebase.firestore;

import A2.T;
import E2.k;
import E2.n;
import G2.g;
import K2.b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import l2.f;
import l2.j;
import n2.InterfaceC0764a;
import p2.InterfaceC0821a;
import q2.C0849a;
import q2.InterfaceC0850b;
import q2.i;
import r1.d;
import w2.s;

@Keep
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\firestore\FirestoreRegistrar.smali */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s lambda$getComponents$0(InterfaceC0850b interfaceC0850b) {
        return new s((Context) interfaceC0850b.a(Context.class), (f) interfaceC0850b.a(f.class), interfaceC0850b.f(InterfaceC0821a.class), interfaceC0850b.f(InterfaceC0764a.class), new k(interfaceC0850b.b(b.class), interfaceC0850b.b(g.class), (j) interfaceC0850b.a(j.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0849a> getComponents() {
        T t4 = new T(s.class, new Class[0]);
        t4.f134b = LIBRARY_NAME;
        t4.k(i.a(f.class));
        t4.k(i.a(Context.class));
        t4.k(new i(0, 1, g.class));
        t4.k(new i(0, 1, b.class));
        t4.k(new i(0, 2, InterfaceC0821a.class));
        t4.k(new i(0, 2, InterfaceC0764a.class));
        t4.k(new i(0, 0, j.class));
        t4.f137e = new n(15);
        return Arrays.asList(t4.m(), d.r(LIBRARY_NAME, "26.0.2"));
    }
}
