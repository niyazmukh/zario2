package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\A.smali */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new c1.s(19);

    /* renamed from: a, reason: collision with root package name */
    public String f5923a;

    /* renamed from: b, reason: collision with root package name */
    public Long f5924b = null;

    /* renamed from: c, reason: collision with root package name */
    public Long f5925c = null;

    /* renamed from: d, reason: collision with root package name */
    public Long f5926d = null;

    /* renamed from: e, reason: collision with root package name */
    public Long f5927e = null;

    public static void b(A a5, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, q qVar) {
        Long l4 = a5.f5926d;
        if (l4 == null || a5.f5927e == null) {
            if (textInputLayout.getError() != null && a5.f5923a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            qVar.a();
        } else if (l4.longValue() <= a5.f5927e.longValue()) {
            Long l5 = a5.f5926d;
            a5.f5924b = l5;
            Long l6 = a5.f5927e;
            a5.f5925c = l6;
            qVar.b(new L.c(l5, l6));
        } else {
            textInputLayout.setError(a5.f5923a);
            textInputLayout2.setError(" ");
            qVar.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f5924b;
        if (l4 != null) {
            arrayList.add(l4);
        }
        Long l5 = this.f5925c;
        if (l5 != null) {
            arrayList.add(l5);
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new L.c(this.f5924b, this.f5925c));
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Long l4 = this.f5924b;
        return (l4 == null || this.f5925c == null || l4.longValue() > this.f5925c.longValue()) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f5924b);
        parcel.writeValue(this.f5925c);
    }
}
