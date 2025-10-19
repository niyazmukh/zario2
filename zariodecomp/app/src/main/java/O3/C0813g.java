package o3;

import L3.s;
import java.util.List;

/* renamed from: o3.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\g.smali */
public final class C0813g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9249c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9250d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9251e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9252f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9253g;
    public final V2.f h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f9254j;

    public C0813g(boolean z4, String email, int i, int i5, int i6, int i7, List cycles, V2.f fVar, Integer num, Integer num2) {
        kotlin.jvm.internal.i.e(email, "email");
        kotlin.jvm.internal.i.e(cycles, "cycles");
        this.f9247a = z4;
        this.f9248b = email;
        this.f9249c = i;
        this.f9250d = i5;
        this.f9251e = i6;
        this.f9252f = i7;
        this.f9253g = cycles;
        this.h = fVar;
        this.i = num;
        this.f9254j = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0813g)) {
            return false;
        }
        C0813g c0813g = (C0813g) obj;
        return this.f9247a == c0813g.f9247a && kotlin.jvm.internal.i.a(this.f9248b, c0813g.f9248b) && this.f9249c == c0813g.f9249c && this.f9250d == c0813g.f9250d && this.f9251e == c0813g.f9251e && this.f9252f == c0813g.f9252f && kotlin.jvm.internal.i.a(this.f9253g, c0813g.f9253g) && this.h == c0813g.h && kotlin.jvm.internal.i.a(this.i, c0813g.i) && kotlin.jvm.internal.i.a(this.f9254j, c0813g.f9254j);
    }

    public final int hashCode() {
        int iHashCode = (this.f9253g.hashCode() + B.a.c(this.f9252f, B.a.c(this.f9251e, B.a.c(this.f9250d, B.a.c(this.f9249c, B.a.f(Boolean.hashCode(this.f9247a) * 31, 31, this.f9248b), 31), 31), 31), 31)) * 31;
        V2.f fVar = this.h;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9254j;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileUiState(isLoading=" + this.f9247a + ", email=" + this.f9248b + ", daysSinceSignup=" + this.f9249c + ", cyclesMet=" + this.f9250d + ", cyclesElapsed=" + this.f9251e + ", totalPoints=" + this.f9252f + ", cycles=" + this.f9253g + ", condition=" + this.h + ", flexibleReward=" + this.i + ", flexiblePenalty=" + this.f9254j + ")";
    }

    public /* synthetic */ C0813g(int i) {
        this((i & 1) != 0, "", 0, 0, 0, 0, s.f2351a, null, null, null);
    }
}
