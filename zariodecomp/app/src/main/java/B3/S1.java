package B3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\S1.smali */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f538a;

    /* renamed from: b, reason: collision with root package name */
    public final List f539b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f540c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f541d;

    /* renamed from: e, reason: collision with root package name */
    public final int f542e;

    /* renamed from: f, reason: collision with root package name */
    public final V1 f543f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f544g;
    public final boolean h;

    public S1(List list, Collection collection, Collection collection2, V1 v12, boolean z4, boolean z5, boolean z6, int i) {
        this.f539b = list;
        S0.f.l(collection, "drainedSubstreams");
        this.f540c = collection;
        this.f543f = v12;
        this.f541d = collection2;
        this.f544g = z4;
        this.f538a = z5;
        this.h = z6;
        this.f542e = i;
        S0.f.q("passThrough should imply buffer is null", !z5 || list == null);
        S0.f.q("passThrough should imply winningSubstream != null", (z5 && v12 == null) ? false : true);
        S0.f.q("passThrough should imply winningSubstream is drained", !z5 || (collection.size() == 1 && collection.contains(v12)) || (collection.size() == 0 && v12.f578b));
        S0.f.q("cancelled should imply committed", (z4 && v12 == null) ? false : true);
    }

    public final S1 a(V1 v12) {
        Collection collectionUnmodifiableCollection;
        S0.f.q("hedging frozen", !this.h);
        S0.f.q("already committed", this.f543f == null);
        Collection collection = this.f541d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(v12);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(v12);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new S1(this.f539b, this.f540c, collectionUnmodifiableCollection, this.f543f, this.f544g, this.f538a, this.h, this.f542e + 1);
    }

    public final S1 b(V1 v12) {
        ArrayList arrayList = new ArrayList(this.f541d);
        arrayList.remove(v12);
        return new S1(this.f539b, this.f540c, Collections.unmodifiableCollection(arrayList), this.f543f, this.f544g, this.f538a, this.h, this.f542e);
    }

    public final S1 c(V1 v12, V1 v13) {
        ArrayList arrayList = new ArrayList(this.f541d);
        arrayList.remove(v12);
        arrayList.add(v13);
        return new S1(this.f539b, this.f540c, Collections.unmodifiableCollection(arrayList), this.f543f, this.f544g, this.f538a, this.h, this.f542e);
    }

    public final S1 d(V1 v12) {
        v12.f578b = true;
        Collection collection = this.f540c;
        if (!collection.contains(v12)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(v12);
        return new S1(this.f539b, Collections.unmodifiableCollection(arrayList), this.f541d, this.f543f, this.f544g, this.f538a, this.h, this.f542e);
    }

    public final S1 e(V1 v12) {
        List list;
        S0.f.q("Already passThrough", !this.f538a);
        boolean z4 = v12.f578b;
        Collection collectionUnmodifiableCollection = this.f540c;
        if (!z4) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(v12);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(v12);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        V1 v13 = this.f543f;
        boolean z5 = v13 != null;
        if (z5) {
            S0.f.q("Another RPC attempt has already committed", v13 == v12);
            list = null;
        } else {
            list = this.f539b;
        }
        return new S1(list, collection, this.f541d, this.f543f, this.f544g, z5, this.h, this.f542e);
    }
}
