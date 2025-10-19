package A;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\z.smali */
public abstract class z {
    public static PendingIntent a(Context context, int i, Intent[] intentArr, int i5, Bundle bundle) {
        return PendingIntent.getActivities(context, i, intentArr, i5, bundle);
    }
}
