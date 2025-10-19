package X1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\p.smali */
public final class p extends v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f3795d;

    public p(ArrayList arrayList, Matrix matrix) {
        this.f3794c = arrayList;
        this.f3795d = matrix;
    }

    @Override // X1.v
    public final void a(Matrix matrix, W1.a aVar, int i, Canvas canvas) {
        Iterator it = this.f3794c.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a(this.f3795d, aVar, i, canvas);
        }
    }
}
