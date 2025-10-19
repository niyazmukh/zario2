package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\c.1.smali */
public abstract class AbstractC0200c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4478a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4479b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4478a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4479b = cls2 != null;
    }

    public static boolean a() {
        return (f4478a == null || f4479b) ? false : true;
    }
}
