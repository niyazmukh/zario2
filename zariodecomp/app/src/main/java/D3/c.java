package D3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\c.smali */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1344e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f1346b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1347c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1348d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        bVar.b(mVar, mVar2);
        if (!bVar.f1340a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar.f1341b = true;
        c cVar = new c(bVar);
        f1344e = cVar;
        b bVar2 = new b(cVar);
        bVar2.b(mVar, mVar2, m.TLS_1_1, m.TLS_1_0);
        if (!bVar2.f1340a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar2.f1341b = true;
        new c(bVar2);
        new c(new b(false));
    }

    public c(b bVar) {
        this.f1345a = bVar.f1340a;
        this.f1346b = (String[]) bVar.f1342c;
        this.f1347c = (String[]) bVar.f1343d;
        this.f1348d = bVar.f1341b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z4 = cVar.f1345a;
        boolean z5 = this.f1345a;
        if (z5 != z4) {
            return false;
        }
        return !z5 || (Arrays.equals(this.f1346b, cVar.f1346b) && Arrays.equals(this.f1347c, cVar.f1347c) && this.f1348d == cVar.f1348d);
    }

    public final int hashCode() {
        if (this.f1345a) {
            return ((((527 + Arrays.hashCode(this.f1346b)) * 31) + Arrays.hashCode(this.f1347c)) * 31) + (!this.f1348d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        m mVar;
        if (!this.f1345a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f1346b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                aVarArr[i] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = n.f1387a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbO = B.a.o("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f1347c;
        m[] mVarArr = new m[strArr3.length];
        for (int i5 = 0; i5 < strArr3.length; i5++) {
            String str2 = strArr3[i5];
            if ("TLSv1.3".equals(str2)) {
                mVar = m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mVar = m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mVar = m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mVar = m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(AbstractC0854a.b("Unexpected TLS version: ", str2));
                }
                mVar = m.SSL_3_0;
            }
            mVarArr[i5] = mVar;
        }
        String[] strArr4 = n.f1387a;
        sbO.append(Collections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
        sbO.append(", supportsTlsExtensions=");
        sbO.append(this.f1348d);
        sbO.append(")");
        return sbO.toString();
    }
}
