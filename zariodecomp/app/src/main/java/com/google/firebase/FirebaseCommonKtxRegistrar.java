package com.google.firebase;

import L3.k;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f4.A;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l2.g;
import m2.InterfaceC0744a;
import m2.InterfaceC0745c;
import m2.InterfaceC0746d;
import p1.b;
import q2.C0849a;
import q2.i;
import q2.q;

@Keep
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\FirebaseCommonKtxRegistrar.smali */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0849a> getComponents() {
        q qVar = new q(InterfaceC0744a.class, A.class);
        q[] qVarArr = new q[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            b.k(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        i iVar = new i(new q(InterfaceC0744a.class, Executor.class), 1, 0);
        if (hashSet.contains(iVar.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        C0849a c0849a = new C0849a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, g.f8778b, hashSet3);
        q qVar3 = new q(InterfaceC0745c.class, A.class);
        q[] qVarArr2 = new q[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            b.k(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        i iVar2 = new i(new q(InterfaceC0745c.class, Executor.class), 1, 0);
        if (hashSet4.contains(iVar2.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet5.add(iVar2);
        C0849a c0849a2 = new C0849a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, g.f8779c, hashSet6);
        q qVar5 = new q(m2.b.class, A.class);
        q[] qVarArr3 = new q[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            b.k(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        i iVar3 = new i(new q(m2.b.class, Executor.class), 1, 0);
        if (hashSet7.contains(iVar3.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet8.add(iVar3);
        C0849a c0849a3 = new C0849a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, g.f8780d, hashSet9);
        q qVar7 = new q(InterfaceC0746d.class, A.class);
        q[] qVarArr4 = new q[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qVar7);
        for (q qVar8 : qVarArr4) {
            b.k(qVar8, "Null interface");
        }
        Collections.addAll(hashSet10, qVarArr4);
        i iVar4 = new i(new q(InterfaceC0746d.class, Executor.class), 1, 0);
        if (hashSet10.contains(iVar4.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet11.add(iVar4);
        return k.Y(c0849a, c0849a2, c0849a3, new C0849a(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, g.f8781e, hashSet12));
    }
}
