package J0;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\h.smali */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2049b = t.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final h f2050c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2051a;

    static {
        h hVar = new h(new HashMap());
        b(hVar);
        f2050c = hVar;
    }

    public h(h hVar) {
        this.f2051a = new HashMap(hVar.f2051a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003e -> B:33:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static J0.h a(byte[] r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = J0.h.f2049b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L73
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Throwable -> L46
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.lang.Throwable -> L46
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L2f
        L1d:
            if (r8 <= 0) goto L31
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L2f
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L2f
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L2f
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r8 = move-exception
            goto L60
        L2f:
            r8 = move-exception
            goto L4a
        L31:
            r4.close()     // Catch: java.io.IOException -> L35
            goto L39
        L35:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L39:
            r3.close()     // Catch: java.io.IOException -> L3d
            goto L5a
        L3d:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L5a
        L42:
            r2 = move-exception
            r4 = r8
            r8 = r2
            goto L60
        L46:
            r4 = move-exception
            r7 = r4
            r4 = r8
            r8 = r7
        L4a:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L57:
            r3.close()     // Catch: java.io.IOException -> L3d
        L5a:
            J0.h r8 = new J0.h
            r8.<init>(r2)
            return r8
        L60:
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L6a:
            r3.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L72:
            throw r8
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.h.a(byte[]):J0.h");
    }

    public static byte[] b(h hVar) throws Throwable {
        String str = f2049b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(hVar.f2051a.size());
                    for (Map.Entry entry : hVar.f2051a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e5) {
                        Log.e(str, "Error in Data#toByteArray: ", e5);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        Log.e(str, "Error in Data#toByteArray: ", e6);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e7) {
                    e = e7;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e8) {
                            Log.e(str, "Error in Data#toByteArray: ", e8);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e9) {
                        Log.e(str, "Error in Data#toByteArray: ", e9);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e10) {
                            Log.e(str, "Error in Data#toByteArray: ", e10);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#toByteArray: ", e11);
                        throw th;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f2051a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((h) obj).f2051a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2051a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f2051a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public h(HashMap map) {
        this.f2051a = new HashMap(map);
    }
}
