package com.google.android.gms.common.api.internal;

import A2.C0020u;
import com.google.android.gms.common.internal.InterfaceC0366d;
import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0417p;
import com.google.protobuf.C0;
import com.google.protobuf.C0415o;
import h1.C0588a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import z3.k0;
import z3.m0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\F.smali */
public final class F implements InterfaceC0366d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5566a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5567b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5568c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5569d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5570e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5571f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5572g;

    public F(C0346h c0346h, com.google.android.gms.common.api.g gVar, C0339a c0339a) {
        this.f5566a = 0;
        this.f5572g = c0346h;
        this.f5570e = null;
        this.f5571f = null;
        this.f5567b = false;
        this.f5568c = gVar;
        this.f5569d = c0339a;
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        S0.f.l(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        S0.f.l(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0366d
    public void a(C0588a c0588a) {
        ((C0346h) this.f5572g).f5638n.post(new Y(1, this, c0588a));
    }

    public AbstractC0388a c(InputStream inputStream) throws IOException {
        AbstractC0417p c0415o;
        byte[] bArr;
        G3.b bVar = (G3.b) this.f5572g;
        bVar.getClass();
        if ((inputStream instanceof G3.a) && ((G3.a) inputStream).f1868b == bVar.f1871a) {
            try {
                AbstractC0388a abstractC0388a = ((G3.a) inputStream).f1867a;
                if (abstractC0388a != null) {
                    return abstractC0388a;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof z3.G) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f1872b;
                    }
                    c0415o = null;
                } else {
                    ThreadLocal threadLocal = G3.b.f1870d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i5 = inputStream.read(bArr, iAvailable - i, i);
                        if (i5 == -1) {
                            break;
                        }
                        i -= i5;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    c0415o = AbstractC0417p.m(bArr, 0, iAvailable, false);
                }
            } else {
                c0415o = null;
            }
            if (c0415o == null) {
                c0415o = new C0415o(inputStream);
            }
            int i6 = bVar.f1873c;
            if (i6 >= 0) {
                if (i6 < 0) {
                    throw new IllegalArgumentException(B.a.g(i6, "Recursion limit cannot be negative: "));
                }
                c0415o.f6563b = i6;
            }
            try {
                com.google.protobuf.E eS = com.google.protobuf.E.s(((com.google.protobuf.D) bVar.f1871a).f6411a, c0415o, G3.c.f1874a);
                if (!com.google.protobuf.E.m(eS, true)) {
                    throw new com.google.protobuf.N(new C0().getMessage());
                }
                c0415o.e(0);
                return eS;
            } catch (com.google.protobuf.N e5) {
                throw new m0(k0.f11354m.g("Invalid protobuf byte sequence").f(e5));
            }
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public G3.a d(com.google.protobuf.E e5) {
        G3.b bVar = (G3.b) this.f5571f;
        bVar.getClass();
        return new G3.a(e5, bVar.f1871a);
    }

    public void e(C0588a c0588a) {
        D d5 = (D) ((C0346h) this.f5572g).f5634j.get((C0339a) this.f5569d);
        if (d5 != null) {
            com.google.android.gms.common.internal.C.c(d5.f5563o.f5638n);
            com.google.android.gms.common.api.g gVar = d5.f5553b;
            gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(c0588a));
            d5.p(c0588a, null);
        }
    }

    public String toString() {
        switch (this.f5566a) {
            case 1:
                C0020u c0020uX = r1.d.X(this);
                c0020uX.a((String) this.f5569d, "fullMethodName");
                c0020uX.a((z3.b0) this.f5568c, "type");
                c0020uX.c("idempotent", false);
                c0020uX.c("safe", false);
                c0020uX.c("sampledToLocalTracing", this.f5567b);
                c0020uX.a((G3.b) this.f5571f, "requestMarshaller");
                c0020uX.a((G3.b) this.f5572g, "responseMarshaller");
                c0020uX.a(null, "schemaDescriptor");
                c0020uX.f250b = true;
                return c0020uX.toString();
            default:
                return super.toString();
        }
    }

    public F(z3.b0 b0Var, String str, G3.b bVar, G3.b bVar2, boolean z4) {
        this.f5566a = 1;
        new AtomicReferenceArray(2);
        S0.f.l(b0Var, "type");
        this.f5568c = b0Var;
        S0.f.l(str, "fullMethodName");
        this.f5569d = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f5570e = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        S0.f.l(bVar, "requestMarshaller");
        this.f5571f = bVar;
        S0.f.l(bVar2, "responseMarshaller");
        this.f5572g = bVar2;
        this.f5567b = z4;
    }
}
