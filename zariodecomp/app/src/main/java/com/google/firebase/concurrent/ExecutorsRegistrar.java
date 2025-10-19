package com.google.firebase.concurrent;

import E2.n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m2.InterfaceC0744a;
import m2.InterfaceC0745c;
import m2.InterfaceC0746d;
import p1.b;
import q2.C0849a;
import q2.e;
import q2.m;
import q2.q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\concurrent\ExecutorsRegistrar.smali */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f6393a = new m(new e(2));

    /* renamed from: b, reason: collision with root package name */
    public static final m f6394b = new m(new e(3));

    /* renamed from: c, reason: collision with root package name */
    public static final m f6395c = new m(new e(4));

    /* renamed from: d, reason: collision with root package name */
    public static final m f6396d = new m(new e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(InterfaceC0744a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(InterfaceC0744a.class, ExecutorService.class), new q(InterfaceC0744a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            b.k(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        C0849a c0849a = new C0849a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new n(10), hashSet3);
        q qVar3 = new q(m2.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(m2.b.class, ExecutorService.class), new q(m2.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            b.k(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        C0849a c0849a2 = new C0849a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, new n(11), hashSet6);
        q qVar5 = new q(InterfaceC0745c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(InterfaceC0745c.class, ExecutorService.class), new q(InterfaceC0745c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            b.k(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        C0849a c0849a3 = new C0849a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, new n(12), hashSet9);
        q qVar7 = new q(InterfaceC0746d.class, Executor.class);
        q[] qVarArr4 = new q[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qVar7);
        for (q qVar8 : qVarArr4) {
            b.k(qVar8, "Null interface");
        }
        Collections.addAll(hashSet10, qVarArr4);
        return Arrays.asList(c0849a, c0849a2, c0849a3, new C0849a(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, new n(13), hashSet12));
    }
}
