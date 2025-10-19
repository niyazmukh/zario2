package o3;

import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import e3.o;
import f4.E;
import i4.C;
import i4.I;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\k.smali */
public final class k extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f9265a;

    /* renamed from: b, reason: collision with root package name */
    public final X2.a f9266b;

    /* renamed from: c, reason: collision with root package name */
    public final I f9267c;

    /* renamed from: d, reason: collision with root package name */
    public final I f9268d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneId f9269e;

    /* renamed from: f, reason: collision with root package name */
    public final DateTimeFormatter f9270f;

    public k(X2.a evaluationHistoryDao, o userSessionRepository) {
        kotlin.jvm.internal.i.e(userSessionRepository, "userSessionRepository");
        kotlin.jvm.internal.i.e(evaluationHistoryDao, "evaluationHistoryDao");
        this.f9265a = userSessionRepository;
        this.f9266b = evaluationHistoryDao;
        I iB = C.b(new C0813g(1023));
        this.f9267c = iB;
        this.f9268d = iB;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        kotlin.jvm.internal.i.d(zoneIdSystemDefault, "systemDefault(...)");
        this.f9269e = zoneIdSystemDefault;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMM d, yyyy");
        kotlin.jvm.internal.i.d(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.f9270f = dateTimeFormatterOfPattern;
        E.t(a0.h(this), null, null, new C0816j(this, null), 3);
    }
}
