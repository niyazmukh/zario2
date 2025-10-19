package t0;

import android.util.SparseArray;

/* renamed from: t0.W, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\W.smali */
public final class C0915W {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f9935a;

    /* renamed from: b, reason: collision with root package name */
    public int f9936b;

    public final C0914V a(int i) {
        SparseArray sparseArray = this.f9935a;
        C0914V c0914v = (C0914V) sparseArray.get(i);
        if (c0914v != null) {
            return c0914v;
        }
        C0914V c0914v2 = new C0914V();
        sparseArray.put(i, c0914v2);
        return c0914v2;
    }
}
