package o0;

import N2.AbstractC0156x;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\O.smali */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f9036b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9037a = new LinkedHashMap();

    public final void a(N n5) {
        String strL = AbstractC0156x.L(n5.getClass());
        if (strL.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f9037a;
        N n6 = (N) linkedHashMap.get(strL);
        if (kotlin.jvm.internal.i.a(n6, n5)) {
            return;
        }
        boolean z4 = false;
        if (n6 != null && n6.f9035b) {
            z4 = true;
        }
        if (z4) {
            throw new IllegalStateException(("Navigator " + n5 + " is replacing an already attached " + n6).toString());
        }
        if (!n5.f9035b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + n5 + " is already attached to another NavController").toString());
    }

    public final N b(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        N n5 = (N) this.f9037a.get(name);
        if (n5 != null) {
            return n5;
        }
        throw new IllegalStateException(B.a.l("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
