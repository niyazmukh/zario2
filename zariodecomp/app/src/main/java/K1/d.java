package K1;

import N.i;
import N.o;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K1\d.smali */
public final class d extends V.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f2211q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f2211q = chip;
    }

    @Override // V.b
    public final int n(float f2, float f3) {
        Rect rect = Chip.f5902A;
        Chip chip = this.f2211q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
    }

    @Override // V.b
    public final void o(ArrayList arrayList) {
        boolean z4 = false;
        arrayList.add(0);
        Rect rect = Chip.f5902A;
        Chip chip = this.f2211q;
        if (chip.d()) {
            f fVar = chip.f5905e;
            if (fVar != null && fVar.f2233O) {
                z4 = true;
            }
            if (!z4 || chip.f5908l == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // V.b
    public final boolean s(int i, int i5, Bundle bundle) {
        boolean z4 = false;
        if (i5 == 16) {
            Chip chip = this.f2211q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f5908l;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z4 = true;
                }
                if (chip.f5919w) {
                    chip.f5918v.x(1, 1);
                }
            }
        }
        return z4;
    }

    @Override // V.b
    public final void t(o oVar) {
        Chip chip = this.f2211q;
        boolean zE = chip.e();
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        accessibilityNodeInfo.setCheckable(zE);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // V.b
    public final void u(int i, o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f5902A);
            return;
        }
        Chip chip = this.f2211q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(2131886387, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        oVar.b(i.f2531e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // V.b
    public final void v(int i, boolean z4) {
        if (i == 1) {
            Chip chip = this.f2211q;
            chip.f5913q = z4;
            chip.refreshDrawableState();
        }
    }
}
