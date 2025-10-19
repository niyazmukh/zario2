package i3;

import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import e3.o;
import f4.E;
import i4.C;
import i4.I;
import i4.x;
import kotlin.jvm.internal.i;

/* renamed from: i3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\g.smali */
public final class C0605g extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final X2.a f7855a;

    /* renamed from: b, reason: collision with root package name */
    public final o f7856b;

    /* renamed from: c, reason: collision with root package name */
    public final I f7857c;

    /* renamed from: d, reason: collision with root package name */
    public final x f7858d;

    public C0605g(X2.a historyDao, o userSessionRepository) {
        i.e(historyDao, "historyDao");
        i.e(userSessionRepository, "userSessionRepository");
        this.f7855a = historyDao;
        this.f7856b = userSessionRepository;
        I iB = C.b(new C0599a(false, 0, 0, "", true));
        this.f7857c = iB;
        this.f7858d = new x(iB);
        E.t(a0.h(this), null, null, new C0604f(this, null), 3);
    }
}
