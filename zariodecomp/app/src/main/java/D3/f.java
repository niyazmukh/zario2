package D3;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\f.smali */
public final class f implements PrivilegedExceptionAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1358a;

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.f1358a) {
            case 0:
                return SSLEngine.class.getMethod("getApplicationProtocol", null);
            case 1:
                return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            default:
                return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }
}
