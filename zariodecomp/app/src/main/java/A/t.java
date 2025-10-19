package A;

import android.app.Notification;
import android.app.Person;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\t.smali */
public abstract class t {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}
