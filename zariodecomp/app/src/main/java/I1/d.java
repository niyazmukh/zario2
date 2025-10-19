package I1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I1\d.smali */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f1926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f1925b = i;
        switch (i) {
            case 1:
                this.f1926c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f1926c = carouselLayoutManager;
                break;
        }
    }

    @Override // I1.e
    public final int c() {
        switch (this.f1925b) {
            case 0:
                return this.f1926c.f9926o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f1926c;
                return carouselLayoutManager.f9926o - carouselLayoutManager.B();
        }
    }

    @Override // I1.e
    public final int d() {
        switch (this.f1925b) {
            case 0:
                return this.f1926c.C();
            default:
                return 0;
        }
    }

    @Override // I1.e
    public final int e() {
        switch (this.f1925b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f1926c;
                return carouselLayoutManager.f9925n - carouselLayoutManager.D();
            default:
                return this.f1926c.f9925n;
        }
    }

    @Override // I1.e
    public final int f() {
        switch (this.f1925b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f1926c;
                if (carouselLayoutManager.z0()) {
                    return carouselLayoutManager.f9925n;
                }
                return 0;
        }
    }

    @Override // I1.e
    public final int g() {
        switch (this.f1925b) {
            case 0:
                return 0;
            default:
                return this.f1926c.E();
        }
    }
}
