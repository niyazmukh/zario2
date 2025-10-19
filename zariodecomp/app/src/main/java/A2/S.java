package A2;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\S.smali */
public final /* synthetic */ class S implements F2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f132d;

    public /* synthetic */ S(Object obj, Cloneable cloneable, Object obj2, int i) {
        this.f129a = i;
        this.f130b = obj;
        this.f131c = cloneable;
        this.f132d = obj2;
    }

    @Override // F2.k
    public final void a(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f129a) {
            case 0:
                T t4 = (T) this.f130b;
                t4.getClass();
                int i = cursor.getInt(0);
                Integer numValueOf = Integer.valueOf(i);
                HashSet hashSet = (HashSet) this.f131c;
                if (!hashSet.contains(numValueOf)) {
                    hashSet.add(Integer.valueOf(i));
                    ((ArrayList) this.f132d).add(t4.r(cursor.getBlob(1), i));
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.f130b;
                d0Var.getClass();
                int i5 = cursor.getInt(0);
                if (((SparseArray) this.f131c).get(i5) == null) {
                    Object[] objArr = {Integer.valueOf(i5)};
                    X x3 = d0Var.f178a;
                    x3.y0("DELETE FROM target_documents WHERE target_id = ?", objArr);
                    x3.y0("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i5));
                    d0Var.f183f--;
                    int[] iArr = (int[]) this.f132d;
                    iArr[0] = iArr[0] + 1;
                    break;
                }
                break;
        }
    }
}
