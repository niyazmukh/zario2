package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\U.smali */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0218v f4454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4455b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4456c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4457d;

    public U(AbstractC0218v abstractC0218v, String str, Object[] objArr) {
        this.f4454a = abstractC0218v;
        this.f4455b = str;
        this.f4456c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4457d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f4457d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final AbstractC0198a a() {
        return this.f4454a;
    }

    public final Object[] b() {
        return this.f4456c;
    }

    public final String c() {
        return this.f4455b;
    }

    public final int d() {
        int i = this.f4457d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
