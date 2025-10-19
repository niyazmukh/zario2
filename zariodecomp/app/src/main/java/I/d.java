package I;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\d.smali */
public abstract class d {
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
