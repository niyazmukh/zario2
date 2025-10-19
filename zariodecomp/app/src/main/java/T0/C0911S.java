package t0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: t0.S, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\S.smali */
public class C0911S extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public g0 f9927a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f9928b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9929c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9930d;

    public C0911S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9928b = new Rect();
        this.f9929c = true;
        this.f9930d = false;
    }

    public C0911S(int i, int i5) {
        super(i, i5);
        this.f9928b = new Rect();
        this.f9929c = true;
        this.f9930d = false;
    }

    public C0911S(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9928b = new Rect();
        this.f9929c = true;
        this.f9930d = false;
    }

    public C0911S(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9928b = new Rect();
        this.f9929c = true;
        this.f9930d = false;
    }

    public C0911S(C0911S c0911s) {
        super((ViewGroup.LayoutParams) c0911s);
        this.f9928b = new Rect();
        this.f9929c = true;
        this.f9930d = false;
    }
}
