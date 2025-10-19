package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\h.smali */
public final class h implements InterfaceC0382b {
    public static final Parcelable.Creator<h> CREATOR = new c1.s(17);

    /* renamed from: a, reason: collision with root package name */
    public final long f5956a;

    public h(long j5) {
        this.f5956a = j5;
    }

    @Override // com.google.android.material.datepicker.InterfaceC0382b
    public final boolean a(long j5) {
        return j5 >= this.f5956a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f5956a == ((h) obj).f5956a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5956a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5956a);
    }
}
