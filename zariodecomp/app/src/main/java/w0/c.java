package w0;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w0.1\c.smali */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f10885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10886b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10887c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10888d;

    public c(String str, int i, int i5, String str2) {
        this.f10885a = i;
        this.f10886b = i5;
        this.f10887c = str;
        this.f10888d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        i.e(other, "other");
        int i = this.f10885a - other.f10885a;
        return i == 0 ? this.f10886b - other.f10886b : i;
    }
}
