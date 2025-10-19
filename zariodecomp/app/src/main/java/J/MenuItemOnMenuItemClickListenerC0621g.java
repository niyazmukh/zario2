package j;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\g.smali */
public final class MenuItemOnMenuItemClickListenerC0621g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f7985c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f7986a;

    /* renamed from: b, reason: collision with root package name */
    public Method f7987b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f7987b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f7986a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
