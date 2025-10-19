package c0;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\s.smali */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5389a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5390b = new AtomicInteger(0);

    public s(Object obj) {
        this.f5389a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f5389a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f5389a).beforeTextChanged(charSequence, i, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i5) {
        if (this.f5390b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f5389a).onSpanAdded(spannable, obj, i, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i5, int i6, int i7) {
        if (this.f5390b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f5389a).onSpanChanged(spannable, obj, i, i5, i6, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i5) {
        if (this.f5390b.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f5389a).onSpanRemoved(spannable, obj, i, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f5389a).onTextChanged(charSequence, i, i5, i6);
    }
}
