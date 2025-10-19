package e0;

import a.AbstractC0183a;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\g.smali */
public final class g extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final f f6835a;

    public g(TextView textView) {
        this.f6835a = new f(textView);
    }

    @Override // a.AbstractC0183a
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        return !(c0.i.f5356j != null) ? inputFilterArr : this.f6835a.E(inputFilterArr);
    }

    @Override // a.AbstractC0183a
    public final void d0(boolean z4) {
        if (c0.i.f5356j != null) {
            this.f6835a.d0(z4);
        }
    }

    @Override // a.AbstractC0183a
    public final void g0(boolean z4) {
        boolean z5 = c0.i.f5356j != null;
        f fVar = this.f6835a;
        if (z5) {
            fVar.g0(z4);
        } else {
            fVar.f6834c = z4;
        }
    }
}
