package z3;

import g2.C0580c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\r.smali */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final C0580c f11391c = new C0580c(String.valueOf(','), 0);

    /* renamed from: d, reason: collision with root package name */
    public static final r f11392d = new r(C1084h.f11313b, false, new r(new C1084h(2), true, new r()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f11393a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11394b;

    public r(InterfaceC1085i interfaceC1085i, boolean z4, r rVar) {
        String strD = interfaceC1085i.d();
        S0.f.g("Comma is currently not allowed in message encoding", !strD.contains(","));
        int size = rVar.f11393a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(rVar.f11393a.containsKey(interfaceC1085i.d()) ? size : size + 1);
        for (C1093q c1093q : rVar.f11393a.values()) {
            String strD2 = c1093q.f11387a.d();
            if (!strD2.equals(strD)) {
                linkedHashMap.put(strD2, new C1093q(c1093q.f11387a, c1093q.f11388b));
            }
        }
        linkedHashMap.put(strD, new C1093q(interfaceC1085i, z4));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f11393a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C1093q) entry.getValue()).f11388b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C0580c c0580c = f11391c;
        c0580c.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) c0580c.f7601b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            this.f11394b = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public r() {
        this.f11393a = new LinkedHashMap(0);
        this.f11394b = new byte[0];
    }
}
