package g0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\x.1.smali */
public final class RunnableC0571x extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f7561a;

    /* renamed from: b, reason: collision with root package name */
    public final View f7562b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7563c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7564d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7565e;

    public RunnableC0571x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f7565e = true;
        this.f7561a = viewGroup;
        this.f7562b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation) {
        this.f7565e = true;
        if (this.f7563c) {
            return !this.f7564d;
        }
        if (!super.getTransformation(j5, transformation)) {
            this.f7563c = true;
            M.u.a(this.f7561a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f7563c;
        ViewGroup viewGroup = this.f7561a;
        if (z4 || !this.f7565e) {
            viewGroup.endViewTransition(this.f7562b);
            this.f7564d = true;
        } else {
            this.f7565e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation, float f2) {
        this.f7565e = true;
        if (this.f7563c) {
            return !this.f7564d;
        }
        if (!super.getTransformation(j5, transformation, f2)) {
            this.f7563c = true;
            M.u.a(this.f7561a, this);
        }
        return true;
    }
}
