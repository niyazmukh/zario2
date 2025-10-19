package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\i.smali */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f5957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5959c;

    public i() {
        Calendar calendarE = D.e(null);
        this.f5957a = calendarE;
        this.f5958b = calendarE.getMaximum(7);
        this.f5959c = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5958b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i5 = this.f5958b;
        if (i >= i5) {
            return null;
        }
        int i6 = i + this.f5959c;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131427420, viewGroup, false);
        }
        int i5 = i + this.f5959c;
        int i6 = this.f5958b;
        if (i5 > i6) {
            i5 -= i6;
        }
        Calendar calendar = this.f5957a;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131886400), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i) {
        Calendar calendarE = D.e(null);
        this.f5957a = calendarE;
        this.f5958b = calendarE.getMaximum(7);
        this.f5959c = i;
    }
}
