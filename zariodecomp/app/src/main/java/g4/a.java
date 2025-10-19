package g4;

import android.os.Looper;
import f4.v0;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g4\a.smali */
public final class a {
    public v0 a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(e.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int b() {
        return 1073741823;
    }

    public String c() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
