package H3;

import a.AbstractC0183a;
import g2.C0580c;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H3\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0580c f1911a;

    static {
        Logger.getLogger(b.class.getName());
        if (!AbstractC0183a.R(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f1911a = new C0580c("internal-stub-type", 2);
    }
}
