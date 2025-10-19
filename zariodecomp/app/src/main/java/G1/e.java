package G1;

import M.C0118c;
import N.n;
import N.o;
import a2.AbstractC0193h;
import a2.C0194i;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G1\e.smali */
public final class e extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1835e;

    public /* synthetic */ e(Object obj, int i) {
        this.f1834d = i;
        this.f1835e = obj;
    }

    @Override // M.C0118c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1834d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1835e).f6075d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // M.C0118c
    public final void d(View view, o oVar) {
        Object obj = this.f1835e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
        switch (this.f1834d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, oVar.f2543a);
                int i = MaterialButtonToggleGroup.f5882o;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i5 = -1;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                i5 = i7;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.c(i6)) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                oVar.h(n.a(0, 1, i5, 1, ((MaterialButton) view).f5879s));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f6076e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f6075d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = oVar.f2543a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f6080B);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = oVar.f2543a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                oVar.a(1048576);
                accessibilityNodeInfo3.setDismissable(true);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = oVar.f2543a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                com.google.android.material.datepicker.o oVar2 = (com.google.android.material.datepicker.o) obj;
                accessibilityNodeInfo4.setHintText(oVar2.f5984m0.getVisibility() == 0 ? oVar2.r(2131886426) : oVar2.r(2131886424));
                break;
        }
    }

    @Override // M.C0118c
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f1834d) {
            case 3:
                if (i != 1048576) {
                    break;
                } else {
                    ((C0194i) ((AbstractC0193h) this.f1835e)).a(3);
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
