package b4;

import N2.AbstractC0156x;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b4\a.smali */
public abstract class a implements Iterable, Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5340c = 1;

    public a(char c5, char c6) {
        this.f5338a = c5;
        this.f5339b = (char) AbstractC0156x.M(c5, c6, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f5338a, this.f5339b, this.f5340c);
    }
}
