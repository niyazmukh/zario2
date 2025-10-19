package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\j.smali */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3762a;

    public j(float f2) {
        this.f3762a = f2;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f3762a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f3762a == ((j) obj).f3762a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3762a)});
    }
}
