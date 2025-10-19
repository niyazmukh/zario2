package z3;

import A2.C0020u;
import g2.C0580c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\c.1.smali */
public final class C1079c {
    public static final C1079c i;

    /* renamed from: a, reason: collision with root package name */
    public final C1092p f11285a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11286b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.l f11287c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[][] f11288d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11289e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f11290f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f11291g;
    public final Integer h;

    static {
        K0.t tVar = new K0.t();
        tVar.f2184d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        tVar.f2185e = Collections.emptyList();
        i = new C1079c(tVar);
    }

    public C1079c(K0.t tVar) {
        this.f11285a = (C1092p) tVar.f2181a;
        this.f11286b = (Executor) tVar.f2182b;
        this.f11287c = (E2.l) tVar.f2183c;
        this.f11288d = (Object[][]) tVar.f2184d;
        this.f11289e = (List) tVar.f2185e;
        this.f11290f = (Boolean) tVar.f2186f;
        this.f11291g = (Integer) tVar.f2187g;
        this.h = (Integer) tVar.h;
    }

    public static K0.t b(C1079c c1079c) {
        K0.t tVar = new K0.t();
        tVar.f2181a = c1079c.f11285a;
        tVar.f2182b = c1079c.f11286b;
        tVar.f2183c = c1079c.f11287c;
        tVar.f2184d = c1079c.f11288d;
        tVar.f2185e = c1079c.f11289e;
        tVar.f2186f = c1079c.f11290f;
        tVar.f2187g = c1079c.f11291g;
        tVar.h = c1079c.h;
        return tVar;
    }

    public final Object a(C0580c c0580c) {
        S0.f.l(c0580c, "key");
        int i5 = 0;
        while (true) {
            Object[][] objArr = this.f11288d;
            if (i5 >= objArr.length) {
                return null;
            }
            if (c0580c.equals(objArr[i5][0])) {
                return objArr[i5][1];
            }
            i5++;
        }
    }

    public final C1079c c(C0580c c0580c, Object obj) {
        Object[][] objArr;
        S0.f.l(c0580c, "key");
        K0.t tVarB = b(this);
        int i5 = 0;
        while (true) {
            objArr = this.f11288d;
            if (i5 >= objArr.length) {
                i5 = -1;
                break;
            }
            if (c0580c.equals(objArr[i5][0])) {
                break;
            }
            i5++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i5 == -1 ? 1 : 0), 2);
        tVarB.f2184d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i5 == -1) {
            ((Object[][]) tVarB.f2184d)[objArr.length] = new Object[]{c0580c, obj};
        } else {
            ((Object[][]) tVarB.f2184d)[i5] = new Object[]{c0580c, obj};
        }
        return new C1079c(tVarB);
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f11285a, "deadline");
        c0020uX.a(null, "authority");
        c0020uX.a(this.f11287c, "callCredentials");
        Executor executor = this.f11286b;
        c0020uX.a(executor != null ? executor.getClass() : null, "executor");
        c0020uX.a(null, "compressorName");
        c0020uX.a(Arrays.deepToString(this.f11288d), "customOptions");
        c0020uX.c("waitForReady", Boolean.TRUE.equals(this.f11290f));
        c0020uX.a(this.f11291g, "maxInboundMessageSize");
        c0020uX.a(this.h, "maxOutboundMessageSize");
        c0020uX.a(this.f11289e, "streamTracerFactories");
        return c0020uX.toString();
    }
}
