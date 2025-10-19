package o0;

import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\w.smali */
public final class w implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final x f9133a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f9134b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9135c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9136d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9137e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9138f;

    public w(x destination, Bundle bundle, boolean z4, int i, boolean z5, int i5) {
        kotlin.jvm.internal.i.e(destination, "destination");
        this.f9133a = destination;
        this.f9134b = bundle;
        this.f9135c = z4;
        this.f9136d = i;
        this.f9137e = z5;
        this.f9138f = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(w other) {
        kotlin.jvm.internal.i.e(other, "other");
        boolean z4 = other.f9135c;
        boolean z5 = this.f9135c;
        if (z5 && !z4) {
            return 1;
        }
        if (!z5 && z4) {
            return -1;
        }
        int i = this.f9136d - other.f9136d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = other.f9134b;
        Bundle bundle2 = this.f9134b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.i.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z6 = other.f9137e;
        boolean z7 = this.f9137e;
        if (z7 && !z6) {
            return 1;
        }
        if (z7 || !z6) {
            return this.f9138f - other.f9138f;
        }
        return -1;
    }
}
