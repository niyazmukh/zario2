package G0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\j.smali */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1767a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1768b;

    /* renamed from: c, reason: collision with root package name */
    public float f1769c;

    /* renamed from: d, reason: collision with root package name */
    public float f1770d;

    /* renamed from: e, reason: collision with root package name */
    public float f1771e;

    /* renamed from: f, reason: collision with root package name */
    public float f1772f;

    /* renamed from: g, reason: collision with root package name */
    public float f1773g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f1774j;

    /* renamed from: k, reason: collision with root package name */
    public String f1775k;

    public j() {
        this.f1767a = new Matrix();
        this.f1768b = new ArrayList();
        this.f1769c = 0.0f;
        this.f1770d = 0.0f;
        this.f1771e = 0.0f;
        this.f1772f = 1.0f;
        this.f1773g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f1774j = new Matrix();
        this.f1775k = null;
    }

    @Override // G0.k
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1768b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // G0.k
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f1768b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f1774j;
        matrix.reset();
        matrix.postTranslate(-this.f1770d, -this.f1771e);
        matrix.postScale(this.f1772f, this.f1773g);
        matrix.postRotate(this.f1769c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f1770d, this.i + this.f1771e);
    }

    public String getGroupName() {
        return this.f1775k;
    }

    public Matrix getLocalMatrix() {
        return this.f1774j;
    }

    public float getPivotX() {
        return this.f1770d;
    }

    public float getPivotY() {
        return this.f1771e;
    }

    public float getRotation() {
        return this.f1769c;
    }

    public float getScaleX() {
        return this.f1772f;
    }

    public float getScaleY() {
        return this.f1773g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f1770d) {
            this.f1770d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f1771e) {
            this.f1771e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f1769c) {
            this.f1769c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f1772f) {
            this.f1772f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f1773g) {
            this.f1773g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, q.b bVar) {
        h hVar;
        this.f1767a = new Matrix();
        this.f1768b = new ArrayList();
        this.f1769c = 0.0f;
        this.f1770d = 0.0f;
        this.f1771e = 0.0f;
        this.f1772f = 1.0f;
        this.f1773g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1774j = matrix;
        this.f1775k = null;
        this.f1769c = jVar.f1769c;
        this.f1770d = jVar.f1770d;
        this.f1771e = jVar.f1771e;
        this.f1772f = jVar.f1772f;
        this.f1773g = jVar.f1773g;
        this.h = jVar.h;
        this.i = jVar.i;
        String str = jVar.f1775k;
        this.f1775k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(jVar.f1774j);
        ArrayList arrayList = jVar.f1768b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof j) {
                this.f1768b.add(new j((j) obj, bVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f1759e = 0.0f;
                    iVar2.f1761g = 1.0f;
                    iVar2.h = 1.0f;
                    iVar2.i = 0.0f;
                    iVar2.f1762j = 1.0f;
                    iVar2.f1763k = 0.0f;
                    iVar2.f1764l = Paint.Cap.BUTT;
                    iVar2.f1765m = Paint.Join.MITER;
                    iVar2.f1766n = 4.0f;
                    iVar2.f1758d = iVar.f1758d;
                    iVar2.f1759e = iVar.f1759e;
                    iVar2.f1761g = iVar.f1761g;
                    iVar2.f1760f = iVar.f1760f;
                    iVar2.f1778c = iVar.f1778c;
                    iVar2.h = iVar.h;
                    iVar2.i = iVar.i;
                    iVar2.f1762j = iVar.f1762j;
                    iVar2.f1763k = iVar.f1763k;
                    iVar2.f1764l = iVar.f1764l;
                    iVar2.f1765m = iVar.f1765m;
                    iVar2.f1766n = iVar.f1766n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1768b.add(hVar);
                Object obj2 = hVar.f1777b;
                if (obj2 != null) {
                    bVar.put(obj2, hVar);
                }
            }
        }
    }
}
