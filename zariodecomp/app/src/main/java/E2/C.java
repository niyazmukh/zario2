package E2;

import com.google.protobuf.J;
import java.util.List;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\C.smali */
public final class C extends d {

    /* renamed from: d, reason: collision with root package name */
    public final List f1396d;

    /* renamed from: e, reason: collision with root package name */
    public final J f1397e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.h f1398f;

    /* renamed from: g, reason: collision with root package name */
    public final B2.l f1399g;

    public C(List list, J j5, B2.h hVar, B2.l lVar) {
        this.f1396d = list;
        this.f1397e = j5;
        this.f1398f = hVar;
        this.f1399g = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c5 = (C) obj;
        if (!this.f1396d.equals(c5.f1396d)) {
            return false;
        }
        if (!((com.google.protobuf.H) this.f1397e).equals(c5.f1397e) || !this.f1398f.equals(c5.f1398f)) {
            return false;
        }
        B2.l lVar = c5.f1399g;
        B2.l lVar2 = this.f1399g;
        return lVar2 != null ? lVar2.equals(lVar) : lVar == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f1398f.f315a.hashCode() + ((((com.google.protobuf.H) this.f1397e).hashCode() + (this.f1396d.hashCode() * 31)) * 31)) * 31;
        B2.l lVar = this.f1399g;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentChange{updatedTargetIds=" + this.f1396d + ", removedTargetIds=" + this.f1397e + ", key=" + this.f1398f + ", newDocument=" + this.f1399g + '}';
    }
}
