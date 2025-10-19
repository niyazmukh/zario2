package C3;

import A2.C0009i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\o.smali */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final C0009i f1232d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0009i f1233e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0009i f1234f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0009i f1235g;
    public static final C0009i h;
    public static final C0009i i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f1236j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f1237k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f1238l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f1239m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f1240n;

    /* renamed from: o, reason: collision with root package name */
    public static final Method f1241o;

    /* renamed from: p, reason: collision with root package name */
    public static final Constructor f1242p;

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|62|3|58|4|(6:52|5|60|6|64|7)|36|54|37|56|38|50|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        r4.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
    
        r4.log(java.util.logging.Level.FINER, "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r2);
     */
    static {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.o.<clinit>():void");
    }

    @Override // C3.p
    public final void a(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((D3.l) it.next()).f1379a);
        }
        boolean z4 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (p.c(str)) {
                        Method method2 = f1236j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f1232d.T(sSLSocket, Boolean.TRUE);
                        } else {
                            f1237k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f1241o;
                        if (method3 == null || (constructor = f1242p) == null) {
                            f1233e.T(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException(e6);
                }
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        Method method4 = f1240n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f1238l.invoke(sSLParameters, strArr);
                z4 = true;
            } catch (InvocationTargetException e8) {
                if (!(e8.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e8;
                }
                p.f1243b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z4 && (method = f1239m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {D3.k.b(list)};
        D3.k kVar = this.f1245a;
        if (kVar.e() == 1) {
            f1235g.U(sSLSocket, objArr);
        }
        if (kVar.e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        i.U(sSLSocket, objArr);
    }

    @Override // C3.p
    public final String b(SSLSocket sSLSocket) {
        Logger logger = p.f1243b;
        Method method = f1240n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e6);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        D3.k kVar = this.f1245a;
        if (kVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f1234f.U(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, D3.n.f1388b);
                }
            } catch (Exception e7) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e7);
            }
        }
        if (kVar.e() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.U(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, D3.n.f1388b);
                }
            } catch (Exception e8) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e8);
            }
        }
        return null;
    }

    @Override // C3.p
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String strB = b(sSLSocket);
        return strB == null ? super.d(sSLSocket, str, list) : strB;
    }
}
