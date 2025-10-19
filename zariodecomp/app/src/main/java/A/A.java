package A;

import B.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\A.1.smali */
public final class A implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f0a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1b;

    public A(Context context) {
        this.f1b = context;
    }

    public final void f(ComponentName componentName) {
        Context context = this.f1b;
        ArrayList arrayList = this.f0a;
        int size = arrayList.size();
        try {
            for (Intent intentA = c.a(context, componentName); intentA != null; intentA = c.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e5);
        }
    }

    public final void g() {
        ArrayList arrayList = this.f0a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f1b;
        if (l.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f0a.iterator();
    }
}
