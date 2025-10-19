package D3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\i.smali */
public final class i extends k {

    /* renamed from: e, reason: collision with root package name */
    public final Method f1364e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f1365f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f1366g;
    public final Class h;
    public final Class i;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f1364e = method;
        this.f1365f = method2;
        this.f1366g = method3;
        this.h = cls;
        this.i = cls2;
    }

    @Override // D3.k
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f1366g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e5) {
            k.f1370b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e5);
        }
    }

    @Override // D3.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) list.get(i);
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f1379a);
            }
        }
        try {
            this.f1364e.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.h, this.i}, new j(arrayList)));
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // D3.k
    public final String d(SSLSocket sSLSocket) {
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f1365f.invoke(null, sSLSocket));
            boolean z4 = jVar.f1368b;
            if (!z4 && jVar.f1369c == null) {
                k.f1370b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z4) {
                return null;
            }
            return jVar.f1369c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // D3.k
    public final int e() {
        return 1;
    }
}
