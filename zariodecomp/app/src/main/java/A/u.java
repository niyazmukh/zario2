package A;

import android.app.Notification;
import android.content.LocusId;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\u.smali */
public abstract class u {
    public static Notification.Builder a(Notification.Builder builder, boolean z4) {
        return builder.setAllowSystemGeneratedContextualActions(z4);
    }

    public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z4) {
        return builder.setContextual(z4);
    }

    public static Notification.Builder d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
