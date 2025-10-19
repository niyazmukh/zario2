package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\a.smali */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3718a;

    public a(float f2) {
        this.f3718a = f2;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return this.f3718a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3718a == ((a) obj).f3718a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3718a)});
    }
}
