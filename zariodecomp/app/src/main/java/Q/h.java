package Q;

import android.widget.ListView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\h.smali */
public abstract class h {
    public static boolean a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    public static void b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
