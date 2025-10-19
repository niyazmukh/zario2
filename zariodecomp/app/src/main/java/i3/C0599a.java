package i3;

import kotlin.jvm.internal.i;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i3.1\a.smali */
public final class C0599a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7842c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7843d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7844e;

    public C0599a(boolean z4, int i, int i5, String planLabel, boolean z5) {
        i.e(planLabel, "planLabel");
        this.f7840a = z4;
        this.f7841b = i;
        this.f7842c = i5;
        this.f7843d = planLabel;
        this.f7844e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0599a)) {
            return false;
        }
        C0599a c0599a = (C0599a) obj;
        return this.f7840a == c0599a.f7840a && this.f7841b == c0599a.f7841b && this.f7842c == c0599a.f7842c && i.a(this.f7843d, c0599a.f7843d) && this.f7844e == c0599a.f7844e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7844e) + B.a.f(B.a.c(this.f7842c, B.a.c(this.f7841b, Boolean.hashCode(this.f7840a) * 31, 31), 31), 31, this.f7843d);
    }

    public final String toString() {
        return "FeedbackData(goalMet=" + this.f7840a + ", pointsChange=" + this.f7841b + ", goalStreak=" + this.f7842c + ", planLabel=" + this.f7843d + ", isLoading=" + this.f7844e + ")";
    }
}
