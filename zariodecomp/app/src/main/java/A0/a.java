package A0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A0\a.smali */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f27e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28a;

    /* renamed from: b, reason: collision with root package name */
    public final File f29b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f30c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f31d;

    public a(String str, File file, boolean z4) {
        Lock lock;
        this.f28a = z4;
        this.f29b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f27e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f30c = lock;
    }

    public final void a(boolean z4) throws IOException {
        this.f30c.lock();
        if (z4) {
            File file = this.f29b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f31d = channel;
            } catch (IOException e5) {
                this.f31d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e5);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f31d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f30c.unlock();
    }
}
