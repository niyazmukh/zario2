package B3;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.C1099x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\A1.smali */
public final class A1 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f371d = Logger.getLogger(A1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final o2 f372e = new o2(15);

    /* renamed from: f, reason: collision with root package name */
    public static final o2 f373f = new o2(16);

    /* renamed from: a, reason: collision with root package name */
    public final o2 f374a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f375b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f376c;

    public A1() {
        String str = System.getenv("GRPC_PROXY_EXP");
        o2 o2Var = f373f;
        o2Var.getClass();
        this.f374a = o2Var;
        o2 o2Var2 = f372e;
        o2Var2.getClass();
        this.f375b = o2Var2;
        if (str == null) {
            this.f376c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f371d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f376c = new InetSocketAddress(strArrSplit[0], i);
    }

    public final C1099x a(InetSocketAddress inetSocketAddress) {
        URL url;
        C1099x c1099x;
        if (inetSocketAddress == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f376c;
        if (inetSocketAddress2 != null) {
            int i = C1099x.f11402e;
            S0.f.l(inetSocketAddress, "targetAddress");
            return new C1099x(inetSocketAddress2, inetSocketAddress, null, null);
        }
        Logger logger = f371d;
        try {
            try {
                URI uri = new URI("https", null, AbstractC0056k0.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                this.f374a.getClass();
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                String strD = AbstractC0056k0.d(inetSocketAddress3);
                InetAddress address = inetSocketAddress3.getAddress();
                int port = inetSocketAddress3.getPort();
                this.f375b.getClass();
                try {
                    url = new URL("https", strD, port, "");
                } catch (MalformedURLException unused) {
                    logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strD});
                    url = null;
                }
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i5 = C1099x.f11402e;
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    c1099x = new C1099x(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    c1099x = new C1099x(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                }
                return c1099x;
            } catch (URISyntaxException e5) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e5);
                return null;
            }
        } catch (Throwable th) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
