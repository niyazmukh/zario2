package i0;

import J0.E;
import J0.s;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i0\a.smali */
public final class a extends E {

    /* renamed from: b, reason: collision with root package name */
    public final Map f7828b;

    public a(Map map) {
        this.f7828b = map;
    }

    @Override // J0.E
    public final s a(Context context, String str, WorkerParameters workerParameters) {
        Provider provider = (Provider) this.f7828b.get(str);
        if (provider == null) {
            return null;
        }
        return ((b) provider.get()).create(context, workerParameters);
    }
}
