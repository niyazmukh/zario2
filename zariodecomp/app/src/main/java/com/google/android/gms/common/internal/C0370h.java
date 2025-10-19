package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y1.C1046a;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\h.1.smali */
public final class C0370h {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5700a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5701b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f5702c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5703d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5704e;

    /* renamed from: f, reason: collision with root package name */
    public final C1046a f5705f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f5706g;

    public C0370h(Set set, String str, String str2) {
        C1046a c1046a = C1046a.f11048a;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f5700a = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f5702c = mapEmptyMap;
        this.f5703d = str;
        this.f5704e = str2;
        this.f5705f = c1046a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f5701b = Collections.unmodifiableSet(hashSet);
    }
}
