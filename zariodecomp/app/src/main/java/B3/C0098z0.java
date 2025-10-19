package B3;

import java.text.MessageFormat;
import java.util.logging.Level;
import z3.AbstractC1080d;
import z3.C1075D;

/* renamed from: B3.z0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\z0.1.smali */
public final class C0098z0 extends AbstractC1080d {

    /* renamed from: d, reason: collision with root package name */
    public C1075D f1030d;

    @Override // z3.AbstractC1080d
    public final void l(int i, String str) {
        C1075D c1075d = this.f1030d;
        Level levelT = C0069p.t(i);
        if (r.f954c.isLoggable(levelT)) {
            r.a(c1075d, levelT, str);
        }
    }

    @Override // z3.AbstractC1080d
    public final void m(int i, String str, Object... objArr) {
        C1075D c1075d = this.f1030d;
        Level levelT = C0069p.t(i);
        if (r.f954c.isLoggable(levelT)) {
            r.a(c1075d, levelT, MessageFormat.format(str, objArr));
        }
    }
}
