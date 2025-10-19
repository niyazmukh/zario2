package z3;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* renamed from: z3.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\A.smali */
public final class C1072A {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f11227d = Logger.getLogger(C1072A.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final C1072A f11228e = new C1072A();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f11229a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11230b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11231c;

    public C1072A() {
        new ConcurrentSkipListMap();
        this.f11229a = new ConcurrentSkipListMap();
        this.f11230b = new ConcurrentHashMap();
        this.f11231c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
