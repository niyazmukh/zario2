package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\e.1.smali */
public final class C0385e implements InterfaceC0382b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0384d f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5952b;

    /* renamed from: c, reason: collision with root package name */
    public static final X1.e f5949c = new X1.e();

    /* renamed from: d, reason: collision with root package name */
    public static final G2.e f5950d = new G2.e();
    public static final Parcelable.Creator<C0385e> CREATOR = new c1.s(15);

    public C0385e(List list, InterfaceC0384d interfaceC0384d) {
        this.f5952b = list;
        this.f5951a = interfaceC0384d;
    }

    @Override // com.google.android.material.datepicker.InterfaceC0382b
    public final boolean a(long j5) {
        return this.f5951a.c(this.f5952b, j5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0385e)) {
            return false;
        }
        C0385e c0385e = (C0385e) obj;
        return this.f5952b.equals(c0385e.f5952b) && this.f5951a.b() == c0385e.f5951a.b();
    }

    public final int hashCode() {
        return this.f5952b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f5952b);
        parcel.writeInt(this.f5951a.b());
    }
}
