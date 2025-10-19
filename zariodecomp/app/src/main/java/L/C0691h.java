package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import k.C0643b;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\h.1.smali */
public final class C0691h extends C0718w implements InterfaceC0695j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0693i f8589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691h(C0693i c0693i, Context context) {
        super(context, null, 2130903072);
        this.f8589d = c0693i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g1.a(this, getContentDescription());
        setOnTouchListener(new C0643b(this, this));
    }

    @Override // l.InterfaceC0695j
    public final boolean a() {
        return false;
    }

    @Override // l.InterfaceC0695j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f8589d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            E.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
