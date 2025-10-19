package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\Q.smali */
public final class Q extends AbstractC0390b implements S, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f6459b;

    static {
        new Q();
    }

    public Q(ArrayList arrayList) {
        super(true);
        this.f6459b = arrayList;
    }

    @Override // com.google.protobuf.S
    public final S a() {
        return this.f6487a ? new H0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        this.f6459b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f6459b.size(), collection);
    }

    @Override // com.google.protobuf.S
    public final Object b(int i) {
        return this.f6459b.get(i);
    }

    @Override // com.google.protobuf.K
    public final K c(int i) {
        List list = this.f6459b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new Q(arrayList);
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f6459b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.S
    public final void d(AbstractC0409l abstractC0409l) {
        f();
        this.f6459b.add(abstractC0409l);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.S
    public final List e() {
        return Collections.unmodifiableList(this.f6459b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.f6459b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0409l) {
            AbstractC0409l abstractC0409l = (AbstractC0409l) obj;
            abstractC0409l.getClass();
            Charset charset = L.f6425a;
            str = abstractC0409l.size() == 0 ? "" : abstractC0409l.v();
            if (abstractC0409l.p()) {
                list.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, L.f6425a);
            y0 y0Var = P0.f6458a;
            if (P0.f6458a.U(0, bArr, 0, bArr.length) == 0) {
                list.set(i, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        String str;
        f();
        Object objRemove = this.f6459b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0409l) {
            AbstractC0409l abstractC0409l = (AbstractC0409l) objRemove;
            abstractC0409l.getClass();
            Charset charset = L.f6425a;
            str = abstractC0409l.size() == 0 ? "" : abstractC0409l.v();
        } else {
            str = new String((byte[]) objRemove, L.f6425a);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        Object obj2 = this.f6459b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0409l)) {
            return new String((byte[]) obj2, L.f6425a);
        }
        AbstractC0409l abstractC0409l = (AbstractC0409l) obj2;
        abstractC0409l.getClass();
        Charset charset = L.f6425a;
        return abstractC0409l.size() == 0 ? "" : abstractC0409l.v();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6459b.size();
    }

    public Q() {
        super(false);
        this.f6459b = Collections.emptyList();
    }

    @Override // com.google.protobuf.AbstractC0390b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        f();
        if (collection instanceof S) {
            collection = ((S) collection).e();
        }
        boolean zAddAll = this.f6459b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public Q(int i) {
        this(new ArrayList(i));
    }
}
