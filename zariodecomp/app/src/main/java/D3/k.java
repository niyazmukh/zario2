package D3;

import A2.C0009i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\k.smali */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1370b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1371c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d, reason: collision with root package name */
    public static final k f1372d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f1373a;

    static {
        Logger logger;
        Object obj;
        Provider provider;
        k kVar;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i5 = 0;
        loop0: while (true) {
            logger = f1370b;
            obj = null;
            if (i5 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i5];
            for (String str : f1371c) {
                if (str.equals(provider2.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i5++;
        }
        if (provider != null) {
            int i6 = 7;
            C0009i c0009i = new C0009i(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i6);
            C0009i c0009i2 = new C0009i(obj, "setHostname", new Class[]{String.class}, i6);
            C0009i c0009i3 = new C0009i(byte[].class, "getAlpnSelectedProtocol", new Class[0], i6);
            C0009i c0009i4 = new C0009i(obj, "setAlpnProtocols", new Class[]{byte[].class}, i6);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i = 1;
                kVar = new g(c0009i, c0009i2, c0009i3, c0009i4, provider, i);
            } else {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                    i = 1;
                } catch (ClassNotFoundException e5) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e5);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e6) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e6);
                        i = 3;
                    }
                }
                kVar = new g(c0009i, c0009i2, c0009i3, c0009i4, provider, i);
            }
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new f(0))).invoke(sSLContext.createSSLEngine(), null);
                        kVar = new h(provider3, (Method) AccessController.doPrivileged(new f(1)), (Method) AccessController.doPrivileged(new f(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        kVar = new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    kVar = new k(provider3);
                }
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(e7);
            }
        }
        f1372d = kVar;
    }

    public k(Provider provider) {
        this.f1373a = provider;
    }

    public static byte[] b(List list) {
        q4.d dVar = new q4.d();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) list.get(i);
            if (lVar != l.HTTP_1_0) {
                dVar.u(lVar.f1379a.length());
                dVar.w(lVar.f1379a);
            }
        }
        return dVar.m(dVar.f9515b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }
}
