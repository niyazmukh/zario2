package j;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\l.smali */
public abstract class l {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
