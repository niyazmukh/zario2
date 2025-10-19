package V;

import N.o;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V\c.smali */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3399a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3400b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3401c;

    /* renamed from: d, reason: collision with root package name */
    public final X1.e f3402d;

    public c(boolean z4, X1.e eVar) {
        this.f3401c = z4;
        this.f3402d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3402d.getClass();
        Rect rect = this.f3399a;
        ((o) obj).f(rect);
        Rect rect2 = this.f3400b;
        ((o) obj2).f(rect2);
        int i = rect.top;
        int i5 = rect2.top;
        if (i < i5) {
            return -1;
        }
        if (i > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z4 = this.f3401c;
        if (i6 < i7) {
            return z4 ? 1 : -1;
        }
        if (i6 > i7) {
            return z4 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z4 ? 1 : -1;
        }
        if (i10 > i11) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
