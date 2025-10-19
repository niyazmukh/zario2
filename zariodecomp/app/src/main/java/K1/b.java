package K1;

import N2.AbstractC0156x;
import Q1.h;
import Q1.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K1\b.smali */
public final class b extends AbstractC0156x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2209e;

    public /* synthetic */ b(Object obj, int i) {
        this.f2208d = i;
        this.f2209e = obj;
    }

    private final void k0(int i) {
    }

    @Override // N2.AbstractC0156x
    public final void S(int i) {
        switch (this.f2208d) {
            case 0:
                break;
            default:
                i iVar = (i) this.f2209e;
                iVar.f2799d = true;
                h hVar = (h) iVar.f2800e.get();
                if (hVar != null) {
                    hVar.a();
                    break;
                }
                break;
        }
    }

    @Override // N2.AbstractC0156x
    public final void T(Typeface typeface, boolean z4) {
        switch (this.f2208d) {
            case 0:
                Chip chip = (Chip) this.f2209e;
                f fVar = chip.f5905e;
                chip.setText(fVar.f2224G0 ? fVar.f2227I : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    i iVar = (i) this.f2209e;
                    iVar.f2799d = true;
                    h hVar = (h) iVar.f2800e.get();
                    if (hVar != null) {
                        hVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
