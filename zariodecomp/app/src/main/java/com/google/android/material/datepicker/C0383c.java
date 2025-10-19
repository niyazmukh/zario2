package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.material.datepicker.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\c.1.smali */
public final class C0383c implements Parcelable {
    public static final Parcelable.Creator<C0383c> CREATOR = new c1.s(14);

    /* renamed from: a, reason: collision with root package name */
    public final t f5942a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5943b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0382b f5944c;

    /* renamed from: d, reason: collision with root package name */
    public t f5945d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5946e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5947f;

    /* renamed from: k, reason: collision with root package name */
    public final int f5948k;

    public C0383c(t tVar, t tVar2, InterfaceC0382b interfaceC0382b, t tVar3, int i) {
        Objects.requireNonNull(tVar, "start cannot be null");
        Objects.requireNonNull(tVar2, "end cannot be null");
        Objects.requireNonNull(interfaceC0382b, "validator cannot be null");
        this.f5942a = tVar;
        this.f5943b = tVar2;
        this.f5945d = tVar3;
        this.f5946e = i;
        this.f5944c = interfaceC0382b;
        if (tVar3 != null && tVar.f6019a.compareTo(tVar3.f6019a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (tVar3 != null && tVar3.f6019a.compareTo(tVar2.f6019a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > D.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f5948k = tVar.f(tVar2) + 1;
        this.f5947f = (tVar2.f6021c - tVar.f6021c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383c)) {
            return false;
        }
        C0383c c0383c = (C0383c) obj;
        return this.f5942a.equals(c0383c.f5942a) && this.f5943b.equals(c0383c.f5943b) && L.b.a(this.f5945d, c0383c.f5945d) && this.f5946e == c0383c.f5946e && this.f5944c.equals(c0383c.f5944c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5942a, this.f5943b, this.f5945d, Integer.valueOf(this.f5946e), this.f5944c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5942a, 0);
        parcel.writeParcelable(this.f5943b, 0);
        parcel.writeParcelable(this.f5945d, 0);
        parcel.writeParcelable(this.f5944c, 0);
        parcel.writeInt(this.f5946e);
    }
}
