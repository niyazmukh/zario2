package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\g.1.smali */
public final class C0387g implements InterfaceC0382b {
    public static final Parcelable.Creator<C0387g> CREATOR = new c1.s(16);

    /* renamed from: a, reason: collision with root package name */
    public final long f5955a;

    public C0387g(long j5) {
        this.f5955a = j5;
    }

    @Override // com.google.android.material.datepicker.InterfaceC0382b
    public final boolean a(long j5) {
        return j5 <= this.f5955a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0387g) && this.f5955a == ((C0387g) obj).f5955a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5955a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5955a);
    }
}
