package M;

import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\t0.smali */
public abstract class t0 {
    public static int a(int i) {
        int iStatusBars;
        int i5 = 0;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i & i6) != 0) {
                if (i6 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i6 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i6 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i6 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i6 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i6 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i6 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i6 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i5 |= iStatusBars;
            }
        }
        return i5;
    }
}
