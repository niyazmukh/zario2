package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y2.C1051D;

/* renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\r0.1.smali */
public final class C0421r0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6575a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6576b;

    /* renamed from: c, reason: collision with root package name */
    public Iterable f6577c;

    public C0421r0(w2.z zVar, s2.d dVar) {
        this.f6577c = zVar;
        this.f6576b = dVar;
    }

    public C0407k a() {
        C0407k c0407k;
        C0407k c0407k2 = (C0407k) this.f6577c;
        if (c0407k2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.f6576b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                c0407k = null;
                break;
            }
            AbstractC0409l abstractC0409l = ((C0423s0) arrayDeque.pop()).f6584f;
            while (abstractC0409l instanceof C0423s0) {
                C0423s0 c0423s0 = (C0423s0) abstractC0409l;
                arrayDeque.push(c0423s0);
                abstractC0409l = c0423s0.f6583e;
            }
            c0407k = (C0407k) abstractC0409l;
        } while (c0407k.isEmpty());
        this.f6577c = c0407k;
        return c0407k2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6575a) {
            case 0:
                return ((C0407k) this.f6577c) != null;
            default:
                return ((Iterator) ((s2.d) this.f6576b).f9680b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6575a) {
            case 0:
                return a();
            default:
                B2.l lVar = (B2.l) ((s2.d) this.f6576b).next();
                w2.z zVar = (w2.z) this.f6577c;
                C1051D c1051d = zVar.f10974b;
                return new w2.y(zVar.f10975c, lVar.f322a, lVar, c1051d.f11074e, c1051d.f11075f.f9681a.f(lVar.f322a));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6575a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public C0421r0(AbstractC0409l abstractC0409l) {
        if (abstractC0409l instanceof C0423s0) {
            C0423s0 c0423s0 = (C0423s0) abstractC0409l;
            ArrayDeque arrayDeque = new ArrayDeque(c0423s0.f6586l);
            this.f6576b = arrayDeque;
            arrayDeque.push(c0423s0);
            AbstractC0409l abstractC0409l2 = c0423s0.f6583e;
            while (abstractC0409l2 instanceof C0423s0) {
                C0423s0 c0423s02 = (C0423s0) abstractC0409l2;
                ((ArrayDeque) this.f6576b).push(c0423s02);
                abstractC0409l2 = c0423s02.f6583e;
            }
            this.f6577c = (C0407k) abstractC0409l2;
            return;
        }
        this.f6576b = null;
        this.f6577c = (C0407k) abstractC0409l;
    }
}
