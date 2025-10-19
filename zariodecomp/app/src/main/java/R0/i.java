package r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r0.1\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9587a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9588b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9589c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9590d;

    public i(int i, int i5, long j5, long j6) {
        this.f9587a = i;
        this.f9588b = i5;
        this.f9589c = j5;
        this.f9590d = j6;
    }

    public static i a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9587a);
            dataOutputStream.writeInt(this.f9588b);
            dataOutputStream.writeLong(this.f9589c);
            dataOutputStream.writeLong(this.f9590d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9588b == iVar.f9588b && this.f9589c == iVar.f9589c && this.f9587a == iVar.f9587a && this.f9590d == iVar.f9590d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9588b), Long.valueOf(this.f9589c), Integer.valueOf(this.f9587a), Long.valueOf(this.f9590d));
    }
}
