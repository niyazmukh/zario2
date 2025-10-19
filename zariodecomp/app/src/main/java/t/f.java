package t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\f.smali */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public i f9848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f9849b;

    public f(g gVar) {
        this.f9849b = gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9848a.f9854b - ((i) obj).f9854b;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f9848a != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbB = h.b(string);
                sbB.append(this.f9848a.h[i]);
                sbB.append(" ");
                string = sbB.toString();
            }
        }
        return string + "] " + this.f9848a;
    }
}
