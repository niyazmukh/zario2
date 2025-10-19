package z3;

import java.util.Comparator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\T.smali */
public final class T implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((S) obj).c() - ((S) obj2).c();
    }
}
