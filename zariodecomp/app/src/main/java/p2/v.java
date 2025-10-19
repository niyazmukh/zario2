package p2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\v.smali */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9369a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static v f9370b;

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }
}
