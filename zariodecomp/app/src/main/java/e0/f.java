package e0;

import a.AbstractC0183a;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\f.smali */
public final class f extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6832a;

    /* renamed from: b, reason: collision with root package name */
    public final d f6833b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6834c = true;

    public f(TextView textView) {
        this.f6832a = textView;
        this.f6833b = new d(textView);
    }

    @Override // a.AbstractC0183a
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!this.f6834c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f6833b;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // a.AbstractC0183a
    public final void d0(boolean z4) {
        if (z4) {
            q0();
        }
    }

    @Override // a.AbstractC0183a
    public final void g0(boolean z4) {
        this.f6834c = z4;
        q0();
        TextView textView = this.f6832a;
        textView.setFilters(E(textView.getFilters()));
    }

    public final void q0() {
        TextView textView = this.f6832a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f6834c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f6840a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
