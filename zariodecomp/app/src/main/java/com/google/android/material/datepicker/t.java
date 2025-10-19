package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\t.smali */
public final class t implements Comparable, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new c1.s(18);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f6019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6021c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6022d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6023e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6024f;

    /* renamed from: k, reason: collision with root package name */
    public String f6025k;

    public t(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = D.c(calendar);
        this.f6019a = calendarC;
        this.f6020b = calendarC.get(2);
        this.f6021c = calendarC.get(1);
        this.f6022d = calendarC.getMaximum(7);
        this.f6023e = calendarC.getActualMaximum(5);
        this.f6024f = calendarC.getTimeInMillis();
    }

    public static t c(int i, int i5) {
        Calendar calendarE = D.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i5);
        return new t(calendarE);
    }

    public static t d(long j5) {
        Calendar calendarE = D.e(null);
        calendarE.setTimeInMillis(j5);
        return new t(calendarE);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t tVar) {
        return this.f6019a.compareTo(tVar.f6019a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        if (this.f6025k == null) {
            this.f6025k = D.b("yMMMM", Locale.getDefault()).format(new Date(this.f6019a.getTimeInMillis()));
        }
        return this.f6025k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f6020b == tVar.f6020b && this.f6021c == tVar.f6021c;
    }

    public final int f(t tVar) {
        if (!(this.f6019a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (tVar.f6020b - this.f6020b) + ((tVar.f6021c - this.f6021c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6020b), Integer.valueOf(this.f6021c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6021c);
        parcel.writeInt(this.f6020b);
    }
}
