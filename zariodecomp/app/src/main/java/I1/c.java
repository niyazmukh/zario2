package I1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC0907N;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I1\c.smali */
public final class c extends AbstractC0907N {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1924b;

    public c() {
        Paint paint = new Paint();
        this.f1923a = paint;
        this.f1924b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t0.AbstractC0907N
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f1923a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(2131099902));
        Iterator it = this.f1924b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = D.a.f1263a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).y0()) {
                canvas.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5900p.g(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5900p.c(), paint);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f5900p.d(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5900p.e(), 0.0f, paint);
            }
        }
    }
}
