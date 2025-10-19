package K0;

import A2.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\t.smali */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Object f2181a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2182b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2183c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2184d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2185e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2186f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2187g;
    public Object h;

    public t(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p1.b.Q(context, 2130903763, com.google.android.material.datepicker.o.class.getCanonicalName()).data, A1.a.f56q);
        this.f2181a = T.q(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f2187g = T.q(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f2182b = T.q(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f2183c = T.q(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListX = r1.d.x(context, typedArrayObtainStyledAttributes, 7);
        this.f2184d = T.q(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f2185e = T.q(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2186f = T.q(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListX.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
