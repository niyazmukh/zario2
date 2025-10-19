package Z1;

import N.i;
import N.o;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z1\a.smali */
public final class a extends V.b {

    /* renamed from: q, reason: collision with root package name */
    public final Slider f3947q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f3948r;

    public a(Slider slider) {
        super(slider);
        this.f3948r = new Rect();
        this.f3947q = slider;
    }

    @Override // V.b
    public final int n(float f2, float f3) {
        int i = 0;
        while (true) {
            Slider slider = this.f3947q;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f3948r;
            slider.s(i, rect);
            if (rect.contains((int) f2, (int) f3)) {
                return i;
            }
            i++;
        }
    }

    @Override // V.b
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.f3947q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // V.b
    public final boolean s(int i, int i5, Bundle bundle) {
        Slider slider = this.f3947q;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i5 != 4096 && i5 != 8192) {
            if (i5 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.q(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.t();
            slider.postInvalidate();
            p(i);
            return true;
        }
        float fRound = slider.f3970R;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((slider.f3966N - slider.f3965M) / fRound > 20) {
            fRound *= Math.round(r1 / r5);
        }
        if (i5 == 8192) {
            fRound = -fRound;
        }
        if (slider.i()) {
            fRound = -fRound;
        }
        float fFloatValue = slider.getValues().get(i).floatValue() + fRound;
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (fFloatValue < valueFrom) {
            fFloatValue = valueFrom;
        } else if (fFloatValue > valueTo) {
            fFloatValue = valueTo;
        }
        if (!slider.q(i, fFloatValue)) {
            return false;
        }
        slider.t();
        slider.postInvalidate();
        p(i);
        return true;
    }

    @Override // V.b
    public final void u(int i, o oVar) {
        oVar.b(i.f2537m);
        Slider slider = this.f3947q;
        List<Float> values = slider.getValues();
        Float f2 = values.get(i);
        float fFloatValue = f2.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                oVar.a(8192);
            }
            if (fFloatValue < valueTo) {
                oVar.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", f2);
        String string = slider.getContext().getString(2131886362);
        if (values.size() > 1) {
            string = i == slider.getValues().size() - 1 ? slider.getContext().getString(2131886360) : i == 0 ? slider.getContext().getString(2131886361) : "";
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f3948r;
        slider.s(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
