package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0672A;
import l.C0700m;
import l.C0702n;
import l.C0704o;
import l.Y;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\B.smali */
public class B {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f7114b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7115c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f7116d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final C0834k f7117e = new C0834k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f7118a = new Object[2];

    public C0700m a(Context context, AttributeSet attributeSet) {
        return new C0700m(context, attributeSet);
    }

    public C0702n b(Context context, AttributeSet attributeSet) {
        return new C0702n(context, attributeSet, 2130903189);
    }

    public C0704o c(Context context, AttributeSet attributeSet) {
        return new C0704o(context, attributeSet, 2130903207);
    }

    public C0672A d(Context context, AttributeSet attributeSet) {
        return new C0672A(context, attributeSet);
    }

    public Y e(Context context, AttributeSet attributeSet) {
        return new Y(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C0834k c0834k = f7117e;
        Constructor constructor = (Constructor) c0834k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7114b);
            c0834k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f7118a);
    }
}
