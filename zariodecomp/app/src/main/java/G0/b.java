package G0;

import S1.c;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\b.smali */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1746a;

    public b(c cVar) {
        this.f1746a = cVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f1746a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f1746a.b(drawable);
    }
}
