package D3;

import A2.C0009i;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\g.smali */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public final C0009i f1359e;

    /* renamed from: f, reason: collision with root package name */
    public final C0009i f1360f;

    /* renamed from: g, reason: collision with root package name */
    public final C0009i f1361g;
    public final C0009i h;
    public final int i;

    public g(C0009i c0009i, C0009i c0009i2, C0009i c0009i3, C0009i c0009i4, Provider provider, int i) {
        super(provider);
        this.f1359e = c0009i;
        this.f1360f = c0009i2;
        this.f1361g = c0009i3;
        this.h = c0009i4;
        this.i = i;
    }

    @Override // D3.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.f1359e.T(sSLSocket, Boolean.TRUE);
            this.f1360f.T(sSLSocket, str);
        }
        C0009i c0009i = this.h;
        if (c0009i.M(sSLSocket.getClass()) != null) {
            c0009i.U(sSLSocket, k.b(list));
        }
    }

    @Override // D3.k
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        C0009i c0009i = this.f1361g;
        if ((c0009i.M(sSLSocket.getClass()) != null) && (bArr = (byte[]) c0009i.U(sSLSocket, new Object[0])) != null) {
            return new String(bArr, n.f1388b);
        }
        return null;
    }

    @Override // D3.k
    public final int e() {
        return this.i;
    }
}
