package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\q.smali */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f5058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f5060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f5061e;

    public q(s sVar, int i, TextView textView, int i5, TextView textView2) {
        this.f5061e = sVar;
        this.f5057a = i;
        this.f5058b = textView;
        this.f5059c = i5;
        this.f5060d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Y y4;
        int i = this.f5057a;
        s sVar = this.f5061e;
        sVar.f5076n = i;
        sVar.f5074l = null;
        TextView textView = this.f5058b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5059c == 1 && (y4 = sVar.f5080r) != null) {
                y4.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5060d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5060d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
