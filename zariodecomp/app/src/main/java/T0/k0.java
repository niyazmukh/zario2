package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\k0.smali */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10043a;

    /* renamed from: b, reason: collision with root package name */
    public int f10044b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10045c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10047e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10049g;

    public k0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f10049g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f10043a = -1;
        this.f10044b = Integer.MIN_VALUE;
        this.f10045c = false;
        this.f10046d = false;
        this.f10047e = false;
        int[] iArr = this.f10048f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
