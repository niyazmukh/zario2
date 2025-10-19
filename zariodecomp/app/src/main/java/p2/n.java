package p2;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.niyaz.zario.worker.UsageMonitoringWorker;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\n.smali */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final zzah f9358a = zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", UsageMonitoringWorker.OUTPUT_TIMESTAMP);

    /* renamed from: b, reason: collision with root package name */
    public static final n f9359b = new n();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.f5535a);
        editorEdit.putString("statusMessage", status.f5536b);
        editorEdit.putLong(UsageMonitoringWorker.OUTPUT_TIMESTAMP, System.currentTimeMillis());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzah zzahVar = f9358a;
        int size = zzahVar.size();
        int i = 0;
        while (i < size) {
            E e5 = zzahVar.get(i);
            i++;
            editorEdit.remove((String) e5);
        }
        editorEdit.commit();
    }
}
