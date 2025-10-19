package b3;

import android.content.Intent;
import java.util.Map;

/* renamed from: b3.T, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\T.smali */
public final /* synthetic */ class C0295T implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5191a;

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f5191a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.i.e(it, "it");
                break;
            case 1:
                f4.A a5 = (O3.g) obj;
                if (a5 instanceof f4.A) {
                    break;
                }
                break;
            case 2:
                Map.Entry it2 = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(it2, "it");
                break;
            case 3:
                Intent createMainActivityPendingIntent = (Intent) obj;
                kotlin.jvm.internal.i.e(createMainActivityPendingIntent, "$this$createMainActivityPendingIntent");
                createMainActivityPendingIntent.putExtra("navigate_to", "feedback");
                break;
            default:
                kotlin.jvm.internal.i.e((Intent) obj, "<this>");
                break;
        }
        return K3.k.f2288a;
    }
}
