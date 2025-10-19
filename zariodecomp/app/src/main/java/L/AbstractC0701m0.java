package l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: l.m0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\m0.1.smali */
public abstract class AbstractC0701m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f8633a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        f8633a = declaredField;
    }
}
