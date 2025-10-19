package C3;

import B3.AbstractC0056k0;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\p.smali */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1243b = Logger.getLogger(p.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final p f1244c;

    /* renamed from: a, reason: collision with root package name */
    public final D3.k f1245a;

    static {
        p pVar;
        D3.k kVar = D3.k.f1372d;
        ClassLoader classLoader = p.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e5) {
            Level level = Level.FINE;
            Logger logger = f1243b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e5);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e6) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e6);
                pVar = new p(kVar);
            }
        }
        pVar = new o(kVar);
        f1244c = pVar;
    }

    public p(D3.k kVar) {
        S0.f.l(kVar, "platform");
        this.f1245a = kVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            S0.f.e(str, "Userinfo must not be present on authority: '%s'", AbstractC0056k0.a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f1245a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f1245a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        D3.k kVar = this.f1245a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            kVar.a(sSLSocket);
        }
    }
}
