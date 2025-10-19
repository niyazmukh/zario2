package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: l.j0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\j0.1.smali */
public abstract class AbstractC0696j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f8616a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f8617b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f8618c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8619d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f8616a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f8617b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f8618c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f8619d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
