package A2;

import java.util.HashMap;
import java.util.Map;
import s2.AbstractC0869c;

/* renamed from: A2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\h.1.smali */
public final class C0008h {

    /* renamed from: a, reason: collision with root package name */
    public final int f200a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0869c f201b;

    public C0008h(int i, AbstractC0869c abstractC0869c) {
        this.f200a = i;
        this.f201b = abstractC0869c;
    }

    public static C0008h a(int i, HashMap map) {
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        for (Map.Entry entry : map.entrySet()) {
            abstractC0869cK = abstractC0869cK.k((B2.h) entry.getKey(), ((F) entry.getValue()).f84a);
        }
        return new C0008h(i, abstractC0869cK);
    }
}
