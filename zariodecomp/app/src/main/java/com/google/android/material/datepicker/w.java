package com.google.android.material.datepicker;

import M.C0135x;
import M.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import t0.g0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\w.smali */
public final class w extends g0 {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6035t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f6036u;

    public w(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131231042);
        this.f6035t = textView;
        WeakHashMap weakHashMap = S.f2363a;
        new C0135x(2131231209, Boolean.class, 0, 28, 1).f(textView, Boolean.TRUE);
        this.f6036u = (MaterialCalendarGridView) linearLayout.findViewById(2131231037);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
