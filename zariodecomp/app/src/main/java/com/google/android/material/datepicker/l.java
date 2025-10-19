package com.google.android.material.datepicker;

import A2.T;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import t0.AbstractC0907N;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\l.smali */
public final class l extends AbstractC0907N {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5965a = D.e(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f5966b = D.e(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f5967c;

    public l(o oVar) {
        this.f5967c = oVar;
    }

    @Override // t0.AbstractC0907N
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        if ((recyclerView.getAdapter() instanceof G) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            G g3 = (G) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            o oVar = this.f5967c;
            Iterator it = oVar.f5974c0.d().iterator();
            while (it.hasNext()) {
                L.c cVar = (L.c) it.next();
                Object obj2 = cVar.a;
                if (obj2 != null && (obj = cVar.b) != null) {
                    long jLongValue = ((Long) obj2).longValue();
                    Calendar calendar = this.f5965a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj).longValue();
                    Calendar calendar2 = this.f5966b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - g3.f5932c.f5975d0.f5942a.f6021c;
                    int i5 = calendar2.get(1) - g3.f5932c.f5975d0.f5942a.f6021c;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i5);
                    int i6 = gridLayoutManager.f4685F;
                    int i7 = i / i6;
                    int i8 = i5 / i6;
                    int i9 = i7;
                    while (i9 <= i8) {
                        if (gridLayoutManager.q(gridLayoutManager.f4685F * i9) != null) {
                            canvas.drawRect((i9 != i7 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), r10.getTop() + ((Rect) ((T) oVar.f5978g0.f2184d).f133a).top, (i9 != i8 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), r10.getBottom() - ((Rect) ((T) oVar.f5978g0.f2184d).f133a).bottom, (Paint) oVar.f5978g0.h);
                        }
                        i9++;
                    }
                }
            }
        }
    }
}
