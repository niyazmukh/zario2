package z3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\U.smali */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11263c = Logger.getLogger(U.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static U f11264d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11265a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f11266b = Collections.emptyList();

    public static List a() {
        Logger logger = f11263c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C3.h.class);
        } catch (ClassNotFoundException e5) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e5);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e6) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e6);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e7) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e7);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
