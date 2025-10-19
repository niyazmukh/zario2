package D3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\h.smali */
public final class h extends k {

    /* renamed from: e, reason: collision with root package name */
    public final Method f1362e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f1363f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f1362e = method;
        this.f1363f = method2;
    }

    @Override // D3.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f1379a);
            }
        }
        try {
            this.f1362e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // D3.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f1363f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // D3.k
    public final int e() {
        return 1;
    }
}
