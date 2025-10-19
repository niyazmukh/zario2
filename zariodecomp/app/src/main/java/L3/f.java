package L3;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\f.smali */
public abstract class f extends AbstractSet implements Set, Y3.b {
    public abstract int f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }
}
