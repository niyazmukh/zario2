package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\A.smali */
public final class A implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f7110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7111b;

    /* renamed from: c, reason: collision with root package name */
    public Method f7112c;

    /* renamed from: d, reason: collision with root package name */
    public Context f7113d;

    public A(View view, String str) {
        this.f7110a = view;
        this.f7111b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f7112c == null) {
            View view2 = this.f7110a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f7111b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbO = B.a.o("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbO.append(view2.getClass());
                    sbO.append(str);
                    throw new IllegalStateException(sbO.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f7112c = method;
                        this.f7113d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f7112c.invoke(this.f7113d, view);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e6) {
            throw new IllegalStateException("Could not execute method for android:onClick", e6);
        }
    }
}
