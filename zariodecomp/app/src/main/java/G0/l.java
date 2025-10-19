package G0;

import N2.AbstractC0156x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\l.smali */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public D.f[] f1776a;

    /* renamed from: b, reason: collision with root package name */
    public String f1777b;

    /* renamed from: c, reason: collision with root package name */
    public int f1778c;

    public l() {
        this.f1776a = null;
        this.f1778c = 0;
    }

    public D.f[] getPathData() {
        return this.f1776a;
    }

    public String getPathName() {
        return this.f1777b;
    }

    public void setPathData(D.f[] fVarArr) {
        D.f[] fVarArr2 = this.f1776a;
        boolean z4 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= fVarArr2.length) {
                    z4 = true;
                    break;
                }
                D.f fVar = fVarArr2[i];
                char c5 = fVar.f1269a;
                D.f fVar2 = fVarArr[i];
                if (c5 != fVar2.f1269a || fVar.f1270b.length != fVar2.f1270b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z4) {
            this.f1776a = AbstractC0156x.A(fVarArr);
            return;
        }
        D.f[] fVarArr3 = this.f1776a;
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            fVarArr3[i5].f1269a = fVarArr[i5].f1269a;
            int i6 = 0;
            while (true) {
                float[] fArr = fVarArr[i5].f1270b;
                if (i6 < fArr.length) {
                    fVarArr3[i5].f1270b[i6] = fArr[i6];
                    i6++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f1776a = null;
        this.f1778c = 0;
        this.f1777b = lVar.f1777b;
        this.f1776a = AbstractC0156x.A(lVar.f1776a);
    }
}
