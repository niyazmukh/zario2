package C;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\o.smali */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1060a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f1061b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1062c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, C.b r20, boolean r21, boolean r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.b(android.content.Context, int, android.util.TypedValue, int, C.b, boolean, boolean):android.graphics.Typeface");
    }
}
