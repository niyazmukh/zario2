package com.google.firebase.auth;

import A2.C0004d;
import A2.T;
import C2.j;
import G2.e;
import H2.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.f;
import m2.InterfaceC0744a;
import m2.InterfaceC0745c;
import m2.InterfaceC0746d;
import n2.InterfaceC0764a;
import p2.InterfaceC0821a;
import p2.d;
import q2.C0849a;
import q2.InterfaceC0850b;
import q2.i;
import q2.q;

@Keep
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\auth\FirebaseAuthRegistrar.smali */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, InterfaceC0850b interfaceC0850b) {
        f fVar = (f) interfaceC0850b.a(f.class);
        b bVarB = interfaceC0850b.b(InterfaceC0764a.class);
        b bVarB2 = interfaceC0850b.b(G2.f.class);
        return new d(fVar, bVarB, bVarB2, (Executor) interfaceC0850b.c(qVar2), (Executor) interfaceC0850b.c(qVar3), (ScheduledExecutorService) interfaceC0850b.c(qVar4), (Executor) interfaceC0850b.c(qVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0849a> getComponents() {
        q qVar = new q(InterfaceC0744a.class, Executor.class);
        q qVar2 = new q(m2.b.class, Executor.class);
        q qVar3 = new q(InterfaceC0745c.class, Executor.class);
        q qVar4 = new q(InterfaceC0745c.class, ScheduledExecutorService.class);
        q qVar5 = new q(InterfaceC0746d.class, Executor.class);
        T t4 = new T(FirebaseAuth.class, new Class[]{InterfaceC0821a.class});
        t4.k(i.a(f.class));
        t4.k(new i(1, 1, G2.f.class));
        t4.k(new i(qVar, 1, 0));
        t4.k(new i(qVar2, 1, 0));
        t4.k(new i(qVar3, 1, 0));
        t4.k(new i(qVar4, 1, 0));
        t4.k(new i(qVar5, 1, 0));
        t4.k(new i(0, 1, InterfaceC0764a.class));
        j jVar = new j(5);
        jVar.f1092b = qVar;
        jVar.f1093c = qVar2;
        jVar.f1094d = qVar3;
        jVar.f1095e = qVar4;
        jVar.f1096f = qVar5;
        t4.f137e = jVar;
        C0849a c0849aM = t4.m();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(e.class));
        return Arrays.asList(c0849aM, new C0849a(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new C0004d(eVar, 15), hashSet3), r1.d.r("fire-auth", "24.0.1"));
    }
}
