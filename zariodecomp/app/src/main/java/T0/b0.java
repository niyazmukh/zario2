package t0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\b0.smali */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f9953a;

    /* renamed from: b, reason: collision with root package name */
    public int f9954b;

    /* renamed from: c, reason: collision with root package name */
    public int f9955c;

    /* renamed from: d, reason: collision with root package name */
    public int f9956d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f9957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9958f;

    /* renamed from: g, reason: collision with root package name */
    public int f9959g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f9956d;
        if (i >= 0) {
            this.f9956d = -1;
            recyclerView.M(i);
            this.f9958f = false;
            return;
        }
        if (!this.f9958f) {
            this.f9959g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f9957e;
        if (baseInterpolator != null && this.f9955c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i5 = this.f9955c;
        if (i5 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f4742f0.b(this.f9953a, this.f9954b, i5, baseInterpolator);
        int i6 = this.f9959g + 1;
        this.f9959g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f9958f = false;
    }
}
