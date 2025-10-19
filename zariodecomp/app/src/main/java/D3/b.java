package D3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D3\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1341b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1342c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1343d;

    public b(boolean z4) {
        this.f1340a = z4;
    }

    public void a(a... aVarArr) {
        if (!this.f1340a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            strArr[i] = aVarArr[i].f1339a;
        }
        this.f1342c = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.String[]] */
    public void b(m... mVarArr) {
        if (!this.f1340a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        ?? r02 = new String[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            r02[i] = mVarArr[i].f1386a;
        }
        this.f1343d = r02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    public b(c cVar) {
        this.f1340a = cVar.f1345a;
        this.f1342c = cVar.f1346b;
        this.f1343d = cVar.f1347c;
        this.f1341b = cVar.f1348d;
    }
}
