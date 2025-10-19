package q2;

import A2.C0004d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\a.smali */
public final class C0849a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9468a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9469b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9470c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9471d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9472e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f9473f;

    public C0849a(String str, Set set, Set set2, int i, d dVar, Set set3) {
        this.f9468a = str;
        this.f9469b = Collections.unmodifiableSet(set);
        this.f9470c = Collections.unmodifiableSet(set2);
        this.f9471d = i;
        this.f9472e = dVar;
        this.f9473f = Collections.unmodifiableSet(set3);
    }

    public static C0849a a(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            p1.b.k(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new C0849a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new C0004d(obj, 15), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f9469b.toArray()) + ">{0, type=" + this.f9471d + ", deps=" + Arrays.toString(this.f9470c.toArray()) + "}";
    }
}
