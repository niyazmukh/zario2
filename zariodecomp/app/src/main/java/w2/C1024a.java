package w2;

import com.google.protobuf.AbstractC0409l;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\a.1.smali */
public final class C1024a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0409l f10918a;

    public C1024a(AbstractC0409l abstractC0409l) {
        this.f10918a = abstractC0409l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return F2.s.c(this.f10918a, ((C1024a) obj).f10918a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1024a) {
            if (this.f10918a.equals(((C1024a) obj).f10918a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10918a.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + F2.s.h(this.f10918a) + " }";
    }
}
