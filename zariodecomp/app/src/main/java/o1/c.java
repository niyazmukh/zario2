package o1;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o1.1\c.smali */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9164a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
