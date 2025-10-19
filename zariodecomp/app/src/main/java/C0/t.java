package c0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\t.smali */
public final class t extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5391a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5392b;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f5392b = new ArrayList();
        r1.d.m(cls, "watcherClass cannot be null");
        this.f5391a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5392b;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f5390b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5392b;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final s c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5392b;
            if (i >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar.f5389a == obj) {
                return sVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f5391a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5392b;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f5390b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s sVarC;
        if (d(obj) && (sVarC = c(obj)) != null) {
            obj = sVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        if (this.f5391a != cls) {
            return super.getSpans(i, i5, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i, i5, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i6 = 0; i6 < sVarArr.length; i6++) {
            objArr[i6] = sVarArr[i6].f5389a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        if (cls == null || this.f5391a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVarC;
        if (d(obj)) {
            sVarC = c(obj);
            if (sVarC != null) {
                obj = sVarC;
            }
        } else {
            sVarC = null;
        }
        super.removeSpan(obj);
        if (sVarC != null) {
            this.f5392b.remove(sVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence) {
        replace(i, i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f5392b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return new t(this.f5391a, this, i, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        replace(i, i5, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence) {
        a();
        super.replace(i, i5, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    public t(Class cls, t tVar, int i, int i5) {
        super(tVar, i, i5);
        this.f5392b = new ArrayList();
        r1.d.m(cls, "watcherClass cannot be null");
        this.f5391a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i, i5, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
