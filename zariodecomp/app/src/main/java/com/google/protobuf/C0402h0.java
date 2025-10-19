package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0208k;

/* renamed from: com.google.protobuf.h0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\h0.1.smali */
public final class C0402h0 implements InterfaceC0425t0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0388a f6515a;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f6516b;

    /* renamed from: c, reason: collision with root package name */
    public final C0428w f6517c;

    public C0402h0(E0 e02, C0428w c0428w, AbstractC0388a abstractC0388a) {
        this.f6516b = e02;
        c0428w.getClass();
        this.f6517c = c0428w;
        this.f6515a = abstractC0388a;
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final boolean a(Object obj) {
        this.f6517c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void b(Object obj, Object obj2) {
        AbstractC0426u0.A(this.f6516b, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final E c() {
        AbstractC0388a abstractC0388a = this.f6515a;
        return abstractC0388a instanceof E ? ((E) abstractC0388a).q() : ((C) ((E) abstractC0388a).j(5)).c();
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void d(Object obj) {
        this.f6516b.getClass();
        E0.b(obj);
        this.f6517c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final int e(E e5) {
        this.f6516b.getClass();
        D0 d02 = e5.unknownFields;
        int i = d02.f6416d;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i5 = 0; i5 < d02.f6413a; i5++) {
            int i6 = d02.f6414b[i5] >>> 3;
            iY += AbstractC0422s.Y(3, (AbstractC0409l) d02.f6415c[i5]) + AbstractC0422s.q0(2, i6) + (AbstractC0422s.p0(1) * 2);
        }
        d02.f6416d = iY;
        return iY;
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final boolean f(E e5, Object obj) {
        this.f6516b.getClass();
        return e5.unknownFields.equals(((E) obj).unknownFields);
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void g(Object obj, Y y4) {
        this.f6517c.getClass();
        B.a.p(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void h(Object obj, byte[] bArr, int i, int i5, C0396e c0396e) {
        E e5 = (E) obj;
        if (e5.unknownFields == D0.f6412f) {
            e5.unknownFields = D0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final int i(E e5) {
        this.f6516b.getClass();
        return e5.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC0425t0
    public final void j(Object obj, C0208k c0208k, v vVar) {
        this.f6516b.getClass();
        E0.a(obj);
        this.f6517c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
