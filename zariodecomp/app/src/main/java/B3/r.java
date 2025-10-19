package B3;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import z3.AbstractC1080d;
import z3.C1075D;
import z3.C1100z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\r.smali */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f954c = Logger.getLogger(AbstractC1080d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f955a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C1075D f956b;

    public r(C1075D c1075d, long j5, String str) {
        S0.f.l(str, "description");
        this.f956b = c1075d;
        String strConcat = str.concat(" created");
        z3.y yVar = z3.y.a;
        S0.f.l(strConcat, "description");
        b(new C1100z(strConcat, yVar, j5, null));
    }

    public static void a(C1075D c1075d, Level level, String str) {
        Logger logger = f954c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c1075d + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(C1100z c1100z) {
        int iOrdinal = c1100z.f11408b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f955a) {
        }
        a(this.f956b, level, c1100z.f11407a);
    }
}
