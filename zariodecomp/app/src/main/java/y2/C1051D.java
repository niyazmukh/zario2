package y2;

import java.util.ArrayList;
import s2.C0870e;

/* renamed from: y2.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\D.smali */
public final class C1051D {

    /* renamed from: a, reason: collision with root package name */
    public final v f11070a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.j f11071b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.j f11072c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11073d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11074e;

    /* renamed from: f, reason: collision with root package name */
    public final C0870e f11075f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11076g;
    public final boolean h;
    public final boolean i;

    public C1051D(v vVar, B2.j jVar, B2.j jVar2, ArrayList arrayList, boolean z4, C0870e c0870e, boolean z5, boolean z6, boolean z7) {
        this.f11070a = vVar;
        this.f11071b = jVar;
        this.f11072c = jVar2;
        this.f11073d = arrayList;
        this.f11074e = z4;
        this.f11075f = c0870e;
        this.f11076g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1051D)) {
            return false;
        }
        C1051D c1051d = (C1051D) obj;
        if (this.f11074e == c1051d.f11074e && this.f11076g == c1051d.f11076g && this.h == c1051d.h && this.f11070a.equals(c1051d.f11070a) && this.f11075f.equals(c1051d.f11075f) && this.f11071b.equals(c1051d.f11071b) && this.f11072c.equals(c1051d.f11072c) && this.i == c1051d.i) {
            return this.f11073d.equals(c1051d.f11073d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f11075f.f9681a.hashCode() + ((this.f11073d.hashCode() + ((this.f11072c.hashCode() + ((this.f11071b.hashCode() + (this.f11070a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f11074e ? 1 : 0)) * 31) + (this.f11076g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f11070a + ", " + this.f11071b + ", " + this.f11072c + ", " + this.f11073d + ", isFromCache=" + this.f11074e + ", mutatedKeys=" + this.f11075f.f9681a.size() + ", didSyncStateChange=" + this.f11076g + ", excludesMetadataChanges=" + this.h + ", hasCachedResults=" + this.i + ")";
    }
}
