package L3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\p.smali */
public abstract class p extends o {
    public static void b0(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(abstractCollection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
