package com.google.android.material.datepicker;

import A2.RunnableC0012l;
import a.AbstractC0183a;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\z.smali */
public final class z extends Q1.j {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f6042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6043b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDateFormat f6044c;

    /* renamed from: d, reason: collision with root package name */
    public final C0383c f6045d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6046e;

    /* renamed from: f, reason: collision with root package name */
    public final RunnableC0012l f6047f;

    /* renamed from: k, reason: collision with root package name */
    public RunnableC0386f f6048k;

    /* renamed from: l, reason: collision with root package name */
    public int f6049l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6050m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6051n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6052o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f6053p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A f6054q;

    public z(A a5, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, C0383c c0383c, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, q qVar, int i) {
        this.f6050m = i;
        this.f6054q = a5;
        this.f6051n = textInputLayout2;
        this.f6052o = textInputLayout3;
        this.f6053p = qVar;
        this.f6043b = str;
        this.f6044c = simpleDateFormat;
        this.f6042a = textInputLayout;
        this.f6045d = c0383c;
        this.f6046e = textInputLayout.getContext().getString(2131886408);
        this.f6047f = new RunnableC0012l(16, this, str);
    }

    public final void a() {
        switch (this.f6050m) {
            case 0:
                A a5 = this.f6054q;
                a5.f5926d = null;
                A.b(a5, this.f6051n, this.f6052o, this.f6053p);
                break;
            default:
                A a6 = this.f6054q;
                a6.f5927e = null;
                A.b(a6, this.f6051n, this.f6052o, this.f6053p);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f6043b;
        if (length >= str.length() || editable.length() < this.f6049l) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public final void b(Long l4) {
        switch (this.f6050m) {
            case 0:
                A a5 = this.f6054q;
                a5.f5926d = l4;
                A.b(a5, this.f6051n, this.f6052o, this.f6053p);
                break;
            default:
                A a6 = this.f6054q;
                a6.f5927e = l4;
                A.b(a6, this.f6051n, this.f6052o, this.f6053p);
                break;
        }
    }

    @Override // Q1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        this.f6049l = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.f, java.lang.Runnable] */
    @Override // Q1.j, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) throws ParseException {
        C0383c c0383c = this.f6045d;
        TextInputLayout textInputLayout = this.f6042a;
        RunnableC0012l runnableC0012l = this.f6047f;
        textInputLayout.removeCallbacks(runnableC0012l);
        textInputLayout.removeCallbacks(this.f6048k);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f6043b.length()) {
            return;
        }
        try {
            Date date = this.f6044c.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (c0383c.f5944c.a(time)) {
                Calendar calendarC = D.c(c0383c.f5942a.f6019a);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    t tVar = c0383c.f5943b;
                    int i7 = tVar.f6023e;
                    Calendar calendarC2 = D.c(tVar.f6019a);
                    calendarC2.set(5, i7);
                    if (time <= calendarC2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r7 = new Runnable() { // from class: com.google.android.material.datepicker.f
                @Override // java.lang.Runnable
                public final void run() {
                    z zVar = this.f5953a;
                    zVar.getClass();
                    zVar.f6042a.setError(String.format(zVar.f6046e, AbstractC0183a.C(time).replace(' ', (char) 160)));
                    zVar.a();
                }
            };
            this.f6048k = r7;
            textInputLayout.post(r7);
        } catch (ParseException unused) {
            textInputLayout.post(runnableC0012l);
        }
    }
}
