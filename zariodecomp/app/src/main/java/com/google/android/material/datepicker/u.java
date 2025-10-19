package com.google.android.material.datepicker;

import A2.T;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\u.smali */
public final class u extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6026f = D.e(null).getMaximum(4);

    /* renamed from: k, reason: collision with root package name */
    public static final int f6027k = (D.e(null).getMaximum(7) + D.e(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final t f6028a;

    /* renamed from: b, reason: collision with root package name */
    public final A f6029b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6030c;

    /* renamed from: d, reason: collision with root package name */
    public K0.t f6031d;

    /* renamed from: e, reason: collision with root package name */
    public final C0383c f6032e;

    public u(t tVar, A a5, C0383c c0383c) {
        this.f6028a = tVar;
        this.f6029b = a5;
        this.f6032e = c0383c;
        this.f6030c = a5.c();
    }

    public final int a() {
        int firstDayOfWeek = this.f6032e.f5946e;
        t tVar = this.f6028a;
        Calendar calendar = tVar.f6019a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i5 = i - firstDayOfWeek;
        return i5 < 0 ? i5 + tVar.f6022d : i5;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarC = D.c(this.f6028a.f6019a);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f6028a.f6023e) - 1;
    }

    public final void d(TextView textView, long j5) {
        boolean z4;
        boolean z5;
        T t4;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z6 = false;
        boolean z7 = D.d().getTimeInMillis() == j5;
        A a5 = this.f6029b;
        Iterator it = a5.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            Object obj = ((L.c) it.next()).a;
            if (obj != null && ((Long) obj).longValue() == j5) {
                z4 = true;
                break;
            }
        }
        Iterator it2 = a5.d().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z5 = false;
                break;
            }
            Object obj2 = ((L.c) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j5) {
                z5 = true;
                break;
            }
        }
        Calendar calendarD = D.d();
        Calendar calendarE = D.e(null);
        calendarE.setTimeInMillis(j5);
        String str = calendarD.get(1) == calendarE.get(1) ? D.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j5)) : D.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j5));
        if (z7) {
            str = String.format(context.getString(2131886422), str);
        }
        if (z4) {
            str = String.format(context.getString(2131886415), str);
        } else if (z5) {
            str = String.format(context.getString(2131886401), str);
        }
        textView.setContentDescription(str);
        if (this.f6032e.f5944c.a(j5)) {
            textView.setEnabled(true);
            Iterator it3 = a5.c().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (D.a(j5) == D.a(((Long) it3.next()).longValue())) {
                    z6 = true;
                    break;
                }
            }
            textView.setSelected(z6);
            t4 = z6 ? (T) this.f6031d.f2182b : D.d().getTimeInMillis() == j5 ? (T) this.f6031d.f2183c : (T) this.f6031d.f2181a;
        } else {
            textView.setEnabled(false);
            t4 = (T) this.f6031d.f2187g;
        }
        t4.K(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j5) {
        t tVarD = t.d(j5);
        t tVar = this.f6028a;
        if (tVarD.equals(tVar)) {
            Calendar calendarC = D.c(tVar.f6019a);
            calendarC.setTimeInMillis(j5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (calendarC.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j5);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f6027k;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f6028a.f6022d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            K0.t r1 = r4.f6031d
            if (r1 != 0) goto Lf
            K0.t r1 = new K0.t
            r1.<init>(r0)
            r4.f6031d = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427419(0x7f0b005b, float:1.8476454E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.t r7 = r4.f6028a
            int r2 = r7.f6023e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L73
        L6c:
            long r5 = r5.longValue()
            r4.d(r0, r5)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
