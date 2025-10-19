package K0;

import android.content.Context;
import java.io.File;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K0\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2120a = new a();

    public final File a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
