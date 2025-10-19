package c0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\v.smali */
public final class v implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5396a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f5397b;

    public v(Spannable spannable) {
        this.f5397b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f5397b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5397b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5397b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5397b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5397b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5397b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        return this.f5397b.getSpans(i, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5397b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        return this.f5397b.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f5397b;
        if (!this.f5396a && (spannable instanceof PrecomputedText)) {
            this.f5397b = new SpannableString(spannable);
        }
        this.f5396a = true;
        this.f5397b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        Spannable spannable = this.f5397b;
        if (!this.f5396a && (spannable instanceof PrecomputedText)) {
            this.f5397b = new SpannableString(spannable);
        }
        this.f5396a = true;
        this.f5397b.setSpan(obj, i, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return this.f5397b.subSequence(i, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5397b.toString();
    }

    public v(CharSequence charSequence) {
        this.f5397b = new SpannableString(charSequence);
    }
}
