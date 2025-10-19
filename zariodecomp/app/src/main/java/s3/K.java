package s3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\K.smali */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9734b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9735c;

    /* renamed from: d, reason: collision with root package name */
    public final u3.b f9736d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9737e;

    public K(String packageName, long j5, long j6, u3.b bVar, String str) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        this.f9733a = packageName;
        this.f9734b = j5;
        this.f9735c = j6;
        this.f9736d = bVar;
        this.f9737e = str;
    }

    public static K a(K k5, long j5, long j6, u3.b bVar, String str, int i) {
        String packageName = k5.f9733a;
        if ((i & 2) != 0) {
            j5 = k5.f9734b;
        }
        long j7 = j5;
        if ((i & 8) != 0) {
            bVar = k5.f9736d;
        }
        u3.b confidence = bVar;
        if ((i & 16) != 0) {
            str = k5.f9737e;
        }
        k5.getClass();
        kotlin.jvm.internal.i.e(packageName, "packageName");
        kotlin.jvm.internal.i.e(confidence, "confidence");
        return new K(packageName, j7, j6, confidence, str);
    }

    public final I b(long j5, long j6) {
        long j7 = this.f9734b;
        long j8 = this.f9735c;
        return new I(this.f9733a, this.f9734b, j6 > 0 ? Math.max(Math.min(j5, j6 + j8), Math.max(j7 + L.f9738c, j8)) : Math.max(j5, Math.max(j7 + L.f9738c, j8)), this.f9737e);
    }

    public final K c(long j5, u3.b newConfidence) {
        kotlin.jvm.internal.i.e(newConfidence, "newConfidence");
        int iOrdinal = newConfidence.ordinal();
        u3.b bVar = this.f9736d;
        return a(this, 0L, Math.max(this.f9735c, j5), iOrdinal < bVar.ordinal() ? newConfidence : bVar, null, 19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k5 = (K) obj;
        return kotlin.jvm.internal.i.a(this.f9733a, k5.f9733a) && this.f9734b == k5.f9734b && this.f9735c == k5.f9735c && this.f9736d == k5.f9736d && kotlin.jvm.internal.i.a(this.f9737e, k5.f9737e);
    }

    public final int hashCode() {
        int iHashCode = (this.f9736d.hashCode() + B.a.e(B.a.e(this.f9733a.hashCode() * 31, 31, this.f9734b), 31, this.f9735c)) * 31;
        String str = this.f9737e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionAccumulator(packageName=");
        sb.append(this.f9733a);
        sb.append(", startMs=");
        sb.append(this.f9734b);
        sb.append(", lastEventMs=");
        sb.append(this.f9735c);
        sb.append(", confidence=");
        sb.append(this.f9736d);
        sb.append(", taskRootPackageName=");
        return B.a.m(sb, this.f9737e, ")");
    }
}
