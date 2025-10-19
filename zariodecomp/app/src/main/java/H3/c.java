package h3;

import android.content.Context;
import androidx.lifecycle.f0;
import b3.C0316k;
import i4.C;
import i4.I;
import i4.x;
import java.util.concurrent.CancellationException;
import o2.C0806k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h3.1\c.smali */
public final class c extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7717a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.o f7718b;

    /* renamed from: c, reason: collision with root package name */
    public final C0316k f7719c;

    /* renamed from: d, reason: collision with root package name */
    public final I f7720d;

    /* renamed from: e, reason: collision with root package name */
    public final x f7721e;

    /* renamed from: f, reason: collision with root package name */
    public final I f7722f;

    /* renamed from: g, reason: collision with root package name */
    public final x f7723g;
    public final I h;
    public final x i;

    /* renamed from: j, reason: collision with root package name */
    public final I f7724j;

    /* renamed from: k, reason: collision with root package name */
    public final x f7725k;

    /* renamed from: l, reason: collision with root package name */
    public final I f7726l;

    /* renamed from: m, reason: collision with root package name */
    public final x f7727m;

    /* renamed from: n, reason: collision with root package name */
    public final I f7728n;

    /* renamed from: o, reason: collision with root package name */
    public final x f7729o;

    public c(Context context, e3.o sessionRepository, C0316k authRepository) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.i.e(authRepository, "authRepository");
        this.f7717a = context;
        this.f7718b = sessionRepository;
        this.f7719c = authRepository;
        I iB = C.b(V2.b.f3427a);
        this.f7720d = iB;
        this.f7721e = new x(iB);
        I iB2 = C.b(null);
        this.f7722f = iB2;
        this.f7723g = new x(iB2);
        I iB3 = C.b(null);
        this.h = iB3;
        this.i = new x(iB3);
        I iB4 = C.b(null);
        this.f7724j = iB4;
        this.f7725k = new x(iB4);
        I iB5 = C.b(null);
        this.f7726l = iB5;
        this.f7727m = new x(iB5);
        I iB6 = C.b(null);
        this.f7728n = iB6;
        this.f7729o = new x(iB6);
    }

    public static final String b(c cVar, Throwable th) throws Throwable {
        if (th instanceof CancellationException) {
            throw th;
        }
        boolean z4 = th instanceof o2.m;
        Context context = cVar.f7717a;
        if (z4) {
            String string = context.getString(2131886132);
            kotlin.jvm.internal.i.d(string, "getString(...)");
            return string;
        }
        if (th instanceof o2.n) {
            String string2 = context.getString(2131886135);
            kotlin.jvm.internal.i.d(string2, "getString(...)");
            return string2;
        }
        if ((th instanceof o2.j) || (th instanceof C0806k)) {
            String string3 = context.getString(2131886136);
            kotlin.jvm.internal.i.d(string3, "getString(...)");
            return string3;
        }
        if (th instanceof l2.i) {
            String string4 = context.getString(2131886134);
            kotlin.jvm.internal.i.d(string4, "getString(...)");
            return string4;
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return localizedMessage;
        }
        String string5 = context.getString(2131886133);
        kotlin.jvm.internal.i.d(string5, "getString(...)");
        return string5;
    }

    public final V2.q c(String str) {
        int length = str.length();
        Context context = this.f7717a;
        return length == 0 ? new V2.q(context.getString(2131886204), false) : !L.d.f2291a.matcher(str).matches() ? new V2.q(context.getString(2131886212), false) : new V2.q();
    }

    public final V2.q d(String str) {
        int length = str.length();
        Context context = this.f7717a;
        return length == 0 ? new V2.q(context.getString(2131886206), false) : str.length() < 8 ? new V2.q(context.getString(2131886222), false) : new V2.q();
    }
}
