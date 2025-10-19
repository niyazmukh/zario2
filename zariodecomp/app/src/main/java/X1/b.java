package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\b.smali */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3720b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3719a;
            f2 += ((b) cVar).f3720b;
        }
        this.f3719a = cVar;
        this.f3720b = f2;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f3719a.a(rectF) + this.f3720b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3719a.equals(bVar.f3719a) && this.f3720b == bVar.f3720b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3719a, Float.valueOf(this.f3720b)});
    }
}
