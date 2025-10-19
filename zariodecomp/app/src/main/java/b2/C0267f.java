package b2;

import a.AbstractC0183a;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\f.smali */
public final class C0267f extends AbstractC0277p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0267f(C0276o c0276o, int i) {
        super(c0276o);
        this.f5009e = i;
    }

    @Override // b2.AbstractC0277p
    public void r() {
        switch (this.f5009e) {
            case 0:
                C0276o c0276o = this.f5054b;
                c0276o.f5045s = null;
                CheckableImageButton checkableImageButton = c0276o.f5037k;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0183a.h0(checkableImageButton, null);
                break;
        }
    }
}
