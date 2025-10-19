package C3;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\s.smali */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1247a = Collections.unmodifiableList(Arrays.asList(D3.l.HTTP_2));

    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.Serializable, java.lang.String[]] */
    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, D3.c cVar) throws IOException {
        D3.l lVar;
        S0.f.l(sSLSocketFactory, "sslSocketFactory");
        S0.f.l(socket, "socket");
        S0.f.l(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = cVar.f1346b;
        String[] strArr2 = strArr != null ? (String[]) D3.n.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) D3.n.a(cVar.f1347c, sSLSocket.getEnabledProtocols());
        D3.b bVar = new D3.b(cVar);
        if (!bVar.f1340a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            bVar.f1342c = null;
        } else {
            bVar.f1342c = (String[]) strArr2.clone();
        }
        if (!bVar.f1340a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            bVar.f1343d = null;
        } else {
            bVar.f1343d = (String[]) strArr3.clone();
        }
        D3.c cVar2 = new D3.c(bVar);
        sSLSocket.setEnabledProtocols(cVar2.f1347c);
        String[] strArr4 = cVar2.f1346b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        p pVar = p.f1244c;
        boolean z4 = cVar.f1348d;
        List list = f1247a;
        String strD = pVar.d(sSLSocket, str, z4 ? list : null);
        if (strD.equals("http/1.0")) {
            lVar = D3.l.HTTP_1_0;
        } else if (strD.equals("http/1.1")) {
            lVar = D3.l.HTTP_1_1;
        } else if (strD.equals("h2")) {
            lVar = D3.l.HTTP_2;
        } else {
            if (!strD.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strD));
            }
            lVar = D3.l.SPDY_3;
        }
        S0.f.p(strD, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(lVar));
        if (D3.e.f1356a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
