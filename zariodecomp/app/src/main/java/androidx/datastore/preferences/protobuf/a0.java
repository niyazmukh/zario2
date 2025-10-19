package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C0427v0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\a0.smali */
public class a0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4476b;

    public /* synthetic */ a0(AbstractMap abstractMap, int i) {
        this.f4475a = i;
        this.f4476b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4475a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((X) this.f4476b).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((C0427v0) this.f4476b).put((Comparable) entry2.getKey(), entry2.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4475a) {
            case 0:
                ((X) this.f4476b).clear();
                break;
            default:
                ((C0427v0) this.f4476b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4475a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((X) this.f4476b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C0427v0) this.f4476b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 == value2 || (obj3 != null && obj3.equals(value2))) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4475a) {
            case 0:
                return new Z((X) this.f4476b, 0);
            default:
                return new Z((C0427v0) this.f4476b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4475a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((X) this.f4476b).remove(entry.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((C0427v0) this.f4476b).remove(entry2.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4475a) {
            case 0:
                return ((X) this.f4476b).size();
            default:
                return ((C0427v0) this.f4476b).size();
        }
    }
}
