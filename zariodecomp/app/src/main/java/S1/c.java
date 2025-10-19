package S1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public G0.b f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2941c;

    public /* synthetic */ c(View view, int i) {
        this.f2940b = i;
        this.f2941c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f2940b) {
            case 0:
                d dVar = (d) this.f2941c;
                dVar.setIndeterminate(false);
                dVar.b(dVar.f2943b);
                break;
            case 1:
                d dVar2 = (d) this.f2941c;
                if (!dVar2.f2947f) {
                    dVar2.setVisibility(dVar2.f2948k);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((J1.b) this.f2941c).f2088s;
                if (colorStateList != null) {
                    E.b.h(drawable, colorStateList);
                    break;
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f2940b) {
            case 2:
                J1.b bVar = (J1.b) this.f2941c;
                ColorStateList colorStateList = bVar.f2088s;
                if (colorStateList != null) {
                    E.b.g(drawable, colorStateList.getColorForState(bVar.f2092w, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
