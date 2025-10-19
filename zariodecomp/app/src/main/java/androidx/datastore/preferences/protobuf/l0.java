package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\l0.smali */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r1.d f4529a;

    static {
        f4529a = (i0.f4512d && i0.f4511c && !AbstractC0200c.a()) ? new j0(1) : new j0(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new k0(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }
}
