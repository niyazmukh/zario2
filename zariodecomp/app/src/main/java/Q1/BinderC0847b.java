package q1;

import android.os.IBinder;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q1.1\b.smali */
public final class BinderC0847b extends zzb implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9467a;

    public BinderC0847b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f9467a = obj;
    }

    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        a aVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return aVarQueryLocalInterface instanceof a ? aVarQueryLocalInterface : new C0848c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object b(a aVar) throws SecurityException {
        if (aVar instanceof BinderC0847b) {
            return ((BinderC0847b) aVar).f9467a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        C.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e6) {
            throw new IllegalArgumentException("Binder object is null.", e6);
        }
    }
}
