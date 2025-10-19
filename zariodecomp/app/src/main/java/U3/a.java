package U3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U3\a.smali */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f3386a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f3386a = num;
    }
}
