package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\j.smali */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f6840a;

    public j(TransformationMethod transformationMethod) {
        this.f6840a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f6840a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || c0.i.a().b() != 1) {
            return charSequence;
        }
        c0.i iVarA = c0.i.a();
        iVarA.getClass();
        return iVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f6840a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i, rect);
        }
    }
}
