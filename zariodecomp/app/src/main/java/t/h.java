package t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t.1\h.smali */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9852a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static /* synthetic */ boolean a(int i, int i5) {
        if (i != 0) {
            return i == i5;
        }
        throw null;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ int c(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f9852a, 0, iArr, 0, i);
        return iArr;
    }
}
