package X1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\o.smali */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final w[] f3784a = new w[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f3785b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f3786c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f3787d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f3788e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f3789f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final w f3790g = new w();
    public final float[] h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f3791j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f3792k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3793l = true;

    public o() {
        for (int i = 0; i < 4; i++) {
            this.f3784a[i] = new w();
            this.f3785b[i] = new Matrix();
            this.f3786c[i] = new Matrix();
        }
    }

    public final void a(m mVar, float f2, RectF rectF, K2.c cVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        w[] wVarArr;
        int i;
        float[] fArr;
        Path path2;
        Path path3;
        o oVar = this;
        m mVar2 = mVar;
        K2.c cVar2 = cVar;
        path.rewind();
        Path path4 = oVar.f3788e;
        path4.rewind();
        Path path5 = oVar.f3789f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = oVar.f3786c;
            matrixArr2 = oVar.f3785b;
            wVarArr = oVar.f3784a;
            fArr = oVar.h;
            if (i5 >= 4) {
                break;
            }
            c cVar3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? mVar2.f3778f : mVar2.f3777e : mVar2.h : mVar2.f3779g;
            r1.d dVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? mVar2.f3774b : mVar2.f3773a : mVar2.f3776d : mVar2.f3775c;
            w wVar = wVarArr[i5];
            dVar.getClass();
            dVar.y(wVar, f2, cVar3.a(rectF));
            int i6 = i5 + 1;
            float f3 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = oVar.f3787d;
            if (i5 == 1) {
                path3 = path4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                path3 = path4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                path3 = path4;
                pointF.set(rectF.right, rectF.top);
            } else {
                path3 = path4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f3);
            w wVar2 = wVarArr[i5];
            fArr[0] = wVar2.f3813c;
            fArr[1] = wVar2.f3814d;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr[i5].preRotate(f3);
            i5 = i6;
            path4 = path3;
        }
        Path path6 = path4;
        int i7 = 0;
        for (i = 4; i7 < i; i = 4) {
            w wVar3 = wVarArr[i7];
            fArr[0] = wVar3.f3811a;
            fArr[1] = wVar3.f3812b;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            wVarArr[i7].b(matrixArr2[i7], path);
            if (cVar2 != null) {
                w wVar4 = wVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                h hVar = (h) cVar2.b;
                BitSet bitSet = hVar.f3741d;
                wVar4.getClass();
                bitSet.set(i7, false);
                wVar4.a(wVar4.f3816f);
                hVar.f3739b[i7] = new p(new ArrayList(wVar4.h), new Matrix(matrix));
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            w wVar5 = wVarArr[i7];
            fArr[0] = wVar5.f3813c;
            fArr[1] = wVar5.f3814d;
            matrixArr2[i7].mapPoints(fArr);
            w wVar6 = wVarArr[i9];
            float f5 = wVar6.f3811a;
            float[] fArr2 = oVar.i;
            fArr2[0] = f5;
            fArr2[1] = wVar6.f3812b;
            matrixArr2[i9].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            w wVar7 = wVarArr[i7];
            fArr[0] = wVar7.f3813c;
            fArr[1] = wVar7.f3814d;
            matrixArr2[i7].mapPoints(fArr);
            float fAbs = (i7 == 1 || i7 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            w wVar8 = oVar.f3790g;
            wVar8.d(0.0f, 0.0f, 270.0f, 0.0f);
            e eVar = i7 != 1 ? i7 != 2 ? i7 != 3 ? mVar2.f3780j : mVar2.i : mVar2.f3782l : mVar2.f3781k;
            eVar.h(fMax, fAbs, f2, wVar8);
            Path path7 = oVar.f3791j;
            path7.reset();
            wVar8.b(matrixArr[i7], path7);
            if (oVar.f3793l && (eVar.g() || oVar.b(path7, i7) || oVar.b(path7, i9))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = wVar8.f3811a;
                fArr[1] = wVar8.f3812b;
                matrixArr[i7].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                wVar8.b(matrixArr[i7], path2);
            } else {
                path2 = path6;
                wVar8.b(matrixArr[i7], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr[i7];
                h hVar2 = (h) cVar.b;
                hVar2.f3741d.set(i7 + 4, false);
                wVar8.a(wVar8.f3816f);
                hVar2.f3740c[i7] = new p(new ArrayList(wVar8.h), new Matrix(matrix2));
            }
            oVar = this;
            mVar2 = mVar;
            cVar2 = cVar;
            path6 = path2;
            i7 = i8;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path.op(path8, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f3792k;
        path2.reset();
        this.f3784a[i].b(this.f3785b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
