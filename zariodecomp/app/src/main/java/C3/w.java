package C3;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\w.smali */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f1258a;

    public w(int i, int i5) {
        AbstractC0183a.N((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        AbstractC0183a.N((i5 & 1) == i, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f1258a = i5;
    }
}
