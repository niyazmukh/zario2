package b2;

import M.C0118c;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\z.smali */
public final class z extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f5117d;

    public z(TextInputLayout textInputLayout) {
        this.f5117d = textInputLayout;
    }

    @Override // M.C0118c
    public final void d(View view, N.o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f5117d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z4 = textInputLayout.f6186x0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z5 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        x xVar = textInputLayout.f6145b;
        Y y4 = xVar.f5106b;
        if (y4.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(y4);
            accessibilityNodeInfo.setTraversalAfter(y4);
        } else {
            accessibilityNodeInfo.setTraversalAfter(xVar.f5108d);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (!z4 && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z5) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        Y y5 = textInputLayout.f6165n.f5087y;
        if (y5 != null) {
            accessibilityNodeInfo.setLabelFor(y5);
        }
        textInputLayout.f6147c.b().n(oVar);
    }

    @Override // M.C0118c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f5117d.f6147c.b().o(accessibilityEvent);
    }
}
