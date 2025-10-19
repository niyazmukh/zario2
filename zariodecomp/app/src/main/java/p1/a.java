package P1;

import X1.h;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P1\a.smali */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2676a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f2677b;

    public a(ShapeableImageView shapeableImageView) {
        this.f2677b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f2677b;
        if (shapeableImageView.f6063p == null) {
            return;
        }
        if (shapeableImageView.f6062o == null) {
            shapeableImageView.f6062o = new h(shapeableImageView.f6063p);
        }
        RectF rectF = shapeableImageView.f6056e;
        Rect rect = this.f2676a;
        rectF.round(rect);
        shapeableImageView.f6062o.setBounds(rect);
        shapeableImageView.f6062o.getOutline(outline);
    }
}
