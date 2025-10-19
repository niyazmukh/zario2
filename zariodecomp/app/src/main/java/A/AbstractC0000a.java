package A;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\a.smali */
public abstract class AbstractC0000a {
    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7, bundle);
    }
}
