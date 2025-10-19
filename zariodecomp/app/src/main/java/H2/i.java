package h2;

import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\i.smali */
public final class i extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final i f7677e = new i(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f7678c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f7679d;

    public i(Object[] objArr, int i) {
        this.f7678c = objArr;
        this.f7679d = i;
    }

    @Override // h2.e, h2.AbstractC0592a
    public final int g(int i, Object[] objArr) {
        Object[] objArr2 = this.f7678c;
        int i5 = this.f7679d;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S0.f.k(i, this.f7679d);
        Object obj = this.f7678c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // h2.AbstractC0592a
    public final Object[] h() {
        return this.f7678c;
    }

    @Override // h2.AbstractC0592a
    public final int i() {
        return this.f7679d;
    }

    @Override // h2.AbstractC0592a
    public final int j() {
        return 0;
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7679d;
    }
}
