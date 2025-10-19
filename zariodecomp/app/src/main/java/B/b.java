package B;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\b.smali */
public abstract class b {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
