package l;

import a.AbstractC0183a;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0489a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\u.1.smali */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f8700a;

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f8701b;

    public u(TextView textView) {
        this.f8700a = textView;
        this.f8701b = new K2.c(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f8700a.getContext().obtainStyledAttributes(attributeSet, AbstractC0489a.i, i, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z4) {
        ((AbstractC0183a) this.f8701b.b).d0(z4);
    }

    public final void c(boolean z4) {
        ((AbstractC0183a) this.f8701b.b).g0(z4);
    }
}
