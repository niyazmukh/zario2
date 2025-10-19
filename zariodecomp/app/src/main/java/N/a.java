package N;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\a.smali */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2527a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2529c;

    public a(int i, o oVar, int i5) {
        this.f2527a = i;
        this.f2528b = oVar;
        this.f2529c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2527a);
        this.f2528b.f2543a.performAction(this.f2529c, bundle);
    }
}
