package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\w.1.smali */
public class C0718w extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8705a;

    /* renamed from: b, reason: collision with root package name */
    public final C.d f8706b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W0.a(context);
        this.f8707c = false;
        V0.a(getContext(), this);
        A2.T t4 = new A2.T(this);
        this.f8705a = t4;
        t4.z(attributeSet, i);
        C.d dVar = new C.d(this);
        this.f8706b = dVar;
        dVar.e(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            t4.l();
        }
        C.d dVar = this.f8706b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        D3.b bVar;
        C.d dVar = this.f8706b;
        if (dVar == null || (bVar = (D3.b) dVar.f1048d) == null) {
            return null;
        }
        return (ColorStateList) bVar.f1342c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        D3.b bVar;
        C.d dVar = this.f8706b;
        if (dVar == null || (bVar = (D3.b) dVar.f1048d) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f1343d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8706b.f1047c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C.d dVar = this.f8706b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C.d dVar = this.f8706b;
        if (dVar != null && drawable != null && !this.f8707c) {
            dVar.f1046b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f8707c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f1047c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f1046b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f8707c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C.d dVar = this.f8706b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f1047c;
            if (i != 0) {
                Drawable drawableB = r1.d.B(imageView.getContext(), i);
                if (drawableB != null) {
                    AbstractC0692h0.a(drawableB);
                }
                imageView.setImageDrawable(drawableB);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C.d dVar = this.f8706b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8705a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C.d dVar = this.f8706b;
        if (dVar != null) {
            if (((D3.b) dVar.f1048d) == null) {
                dVar.f1048d = new D3.b();
            }
            D3.b bVar = (D3.b) dVar.f1048d;
            bVar.f1342c = colorStateList;
            bVar.f1341b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C.d dVar = this.f8706b;
        if (dVar != null) {
            if (((D3.b) dVar.f1048d) == null) {
                dVar.f1048d = new D3.b();
            }
            D3.b bVar = (D3.b) dVar.f1048d;
            bVar.f1343d = mode;
            bVar.f1340a = true;
            dVar.a();
        }
    }
}
