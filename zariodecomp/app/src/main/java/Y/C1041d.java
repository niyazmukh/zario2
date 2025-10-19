package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import r.AbstractC0854a;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y.1\d.smali */
public final class C1041d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f11027a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11029c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11031e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11032f;

    /* renamed from: g, reason: collision with root package name */
    public int f11033g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11034j;

    /* renamed from: k, reason: collision with root package name */
    public View f11035k;

    /* renamed from: l, reason: collision with root package name */
    public View f11036l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11037m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11038n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f11039o;

    public C1041d() {
        super(-2, -2);
        this.f11028b = false;
        this.f11029c = 0;
        this.f11030d = 0;
        this.f11031e = -1;
        this.f11032f = -1;
        this.f11033g = 0;
        this.h = 0;
        this.f11039o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f11037m;
        }
        if (i != 1) {
            return false;
        }
        return this.f11038n;
    }

    public C1041d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        a aVar;
        super(context, attributeSet);
        this.f11028b = false;
        this.f11029c = 0;
        this.f11030d = 0;
        this.f11031e = -1;
        this.f11032f = -1;
        this.f11033g = 0;
        this.h = 0;
        this.f11039o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.a.f11011b);
        this.f11029c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f11032f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f11030d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f11031e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f11033g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f11028b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4336x;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4336x;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4338z;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4337y);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    throw new RuntimeException(AbstractC0854a.b("Could not inflate Behavior subclass ", string), e5);
                }
            }
            this.f11027a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f11027a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public C1041d(C1041d c1041d) {
        super((ViewGroup.MarginLayoutParams) c1041d);
        this.f11028b = false;
        this.f11029c = 0;
        this.f11030d = 0;
        this.f11031e = -1;
        this.f11032f = -1;
        this.f11033g = 0;
        this.h = 0;
        this.f11039o = new Rect();
    }

    public C1041d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f11028b = false;
        this.f11029c = 0;
        this.f11030d = 0;
        this.f11031e = -1;
        this.f11032f = -1;
        this.f11033g = 0;
        this.h = 0;
        this.f11039o = new Rect();
    }

    public C1041d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f11028b = false;
        this.f11029c = 0;
        this.f11030d = 0;
        this.f11031e = -1;
        this.f11032f = -1;
        this.f11033g = 0;
        this.h = 0;
        this.f11039o = new Rect();
    }
}
