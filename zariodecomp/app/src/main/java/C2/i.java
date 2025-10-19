package C2;

import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1087a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.o f1088b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1089c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1090d;

    public i(int i, l2.o oVar, ArrayList arrayList, List list) {
        AbstractC0183a.N(!list.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f1087a = i;
        this.f1088b = oVar;
        this.f1089c = arrayList;
        this.f1090d = list;
    }

    public final f a(B2.l lVar, f fVar) {
        l2.o oVar;
        int i = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f1089c;
            int size = arrayList.size();
            oVar = this.f1088b;
            if (i5 >= size) {
                break;
            }
            h hVar = (h) arrayList.get(i5);
            if (hVar.f1084a.equals(lVar.f322a)) {
                fVar = hVar.a(lVar, fVar, oVar);
            }
            i5++;
        }
        while (true) {
            List list = this.f1090d;
            if (i >= list.size()) {
                return fVar;
            }
            h hVar2 = (h) list.get(i);
            if (hVar2.f1084a.equals(lVar.f322a)) {
                fVar = hVar2.a(lVar, fVar, oVar);
            }
            i++;
        }
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1090d.iterator();
        while (it.hasNext()) {
            hashSet.add(((h) it.next()).f1084a);
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1087a == iVar.f1087a && this.f1088b.equals(iVar.f1088b) && this.f1089c.equals(iVar.f1089c) && this.f1090d.equals(iVar.f1090d);
    }

    public final int hashCode() {
        return this.f1090d.hashCode() + ((this.f1089c.hashCode() + ((this.f1088b.hashCode() + (this.f1087a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutationBatch(batchId=" + this.f1087a + ", localWriteTime=" + this.f1088b + ", baseMutations=" + this.f1089c + ", mutations=" + this.f1090d + ')';
    }
}
