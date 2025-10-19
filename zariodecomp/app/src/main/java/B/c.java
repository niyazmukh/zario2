package B;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\c.smali */
public abstract class c {
    public static Context a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }
}
