package l2;

import com.google.android.gms.common.internal.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\h.smali */
public class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        C.e(str, "Detail message must not be empty");
    }
}
