package l3;

import K3.g;
import L3.u;
import a.AbstractC0183a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.niyaz.zario.databinding.ItemTodayUsageEntryBinding;
import java.util.Set;
import k3.C0660a;
import k3.C0670k;
import kotlin.jvm.internal.i;
import t0.AbstractC0898E;
import t0.g0;
import u0.AbstractC0967h;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l3.1\f.smali */
public final class C0733f extends AbstractC0898E {

    /* renamed from: f, reason: collision with root package name */
    public static final C0731c f8804f = new C0731c();

    /* renamed from: d, reason: collision with root package name */
    public final C0660a f8805d;

    /* renamed from: e, reason: collision with root package name */
    public Set f8806e;

    public C0733f(C0660a c0660a) {
        super(f8804f);
        this.f8805d = c0660a;
        this.f8806e = u.f2353a;
    }

    @Override // t0.AbstractC0902I
    public final void c(g0 g0Var, int i) {
        Object objV;
        final C0670k c0670k = (C0670k) this.f9896c.f9970f.get(i);
        i.b(c0670k);
        Set set = this.f8806e;
        String str = c0670k.f8322a;
        boolean zContains = set.contains(str);
        final C0660a onEntryClick = this.f8805d;
        i.e(onEntryClick, "onEntryClick");
        ItemTodayUsageEntryBinding itemTodayUsageEntryBinding = ((e) g0Var).f8803t;
        Context context = itemTodayUsageEntryBinding.getRoot().getContext();
        PackageManager packageManager = context.getPackageManager();
        try {
            objV = packageManager.getApplicationIcon(str);
        } catch (Throwable th) {
            objV = AbstractC0183a.v(th);
        }
        if (g.a(objV) != null) {
            objV = packageManager.getDefaultActivityIcon();
        }
        i.d(objV, "getOrElse(...)");
        itemTodayUsageEntryBinding.ivAppIcon.setImageDrawable((Drawable) objV);
        ShapeableImageView shapeableImageView = itemTodayUsageEntryBinding.ivAppIcon;
        String str2 = c0670k.f8323b;
        shapeableImageView.setContentDescription(context.getString(2131886156, str2));
        itemTodayUsageEntryBinding.tvAppLabel.setText(str2);
        itemTodayUsageEntryBinding.tvUsageDuration.setText(AbstractC0967h.b(context, c0670k.f8324c));
        itemTodayUsageEntryBinding.getRoot().setAlpha(zContains ? 1.0f : 0.6f);
        itemTodayUsageEntryBinding.getRoot().setSelected(zContains);
        itemTodayUsageEntryBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onEntryClick.invoke(c0670k);
            }
        });
        itemTodayUsageEntryBinding.getRoot().setContentDescription(context.getString(zContains ? 2131886285 : 2131886286, str2, itemTodayUsageEntryBinding.tvUsageDuration.getText()));
    }

    @Override // t0.AbstractC0902I
    public final g0 d(ViewGroup parent) {
        i.e(parent, "parent");
        ItemTodayUsageEntryBinding itemTodayUsageEntryBindingInflate = ItemTodayUsageEntryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        i.d(itemTodayUsageEntryBindingInflate, "inflate(...)");
        return new e(itemTodayUsageEntryBindingInflate);
    }
}
