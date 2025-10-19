package I;

import android.content.Context;
import android.os.UserManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\n.smali */
public abstract class n {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
