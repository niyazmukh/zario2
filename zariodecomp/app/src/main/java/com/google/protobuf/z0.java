package com.google.protobuf;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\z0.smali */
public final class z0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f6609a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0427v0 f6611c;

    public z0(C0427v0 c0427v0, Comparable comparable, Object obj) {
        this.f6611c = c0427v0;
        this.f6609a = comparable;
        this.f6610b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6609a.compareTo(((z0) obj).f6609a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f6609a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f6610b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6609a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6610b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6609a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6610b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6611c.b();
        Object obj2 = this.f6610b;
        this.f6610b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6609a + "=" + this.f6610b;
    }
}
