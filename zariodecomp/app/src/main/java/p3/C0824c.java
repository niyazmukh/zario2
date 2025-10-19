package p3;

import B.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.niyaz.zario.databinding.ItemProfileCycleBinding;
import java.text.NumberFormat;
import kotlin.jvm.internal.i;
import o3.C0811e;
import o3.EnumC0812f;
import t0.AbstractC0898E;
import t0.g0;

/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p3.1\c.smali */
public final class C0824c extends AbstractC0898E {

    /* renamed from: d, reason: collision with root package name */
    public static final NumberFormat f9387d;

    static {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        i.d(integerInstance, "getIntegerInstance(...)");
        f9387d = integerInstance;
    }

    @Override // t0.AbstractC0902I
    public final void c(g0 g0Var, int i) {
        String string;
        int color;
        Object obj = this.f9896c.f9970f.get(i);
        i.d(obj, "getItem(...)");
        C0811e c0811e = (C0811e) obj;
        ItemProfileCycleBinding itemProfileCycleBinding = ((C0822a) g0Var).f9385t;
        Context context = itemProfileCycleBinding.getRoot().getContext();
        TextView textView = itemProfileCycleBinding.tvCycleDate;
        String str = c0811e.f9241b;
        textView.setText(str);
        itemProfileCycleBinding.tvCyclePoints.setText(context.getString(2131886468, f9387d.format(Integer.valueOf(c0811e.f9243d))));
        EnumC0812f enumC0812f = c0811e.f9242c;
        int iOrdinal = enumC0812f.ordinal();
        if (iOrdinal == 0) {
            string = context.getString(2131886469);
        } else {
            if (iOrdinal != 1) {
                throw new B0.c();
            }
            string = context.getString(2131886470);
        }
        i.b(string);
        int iOrdinal2 = enumC0812f.ordinal();
        if (iOrdinal2 == 0) {
            color = l.getColor(context, 2131034220);
        } else {
            if (iOrdinal2 != 1) {
                throw new B0.c();
            }
            color = l.getColor(context, 2131034219);
        }
        itemProfileCycleBinding.tvCycleStatus.setText(string);
        itemProfileCycleBinding.tvCycleStatus.setTextColor(color);
        itemProfileCycleBinding.getRoot().setContentDescription(context.getString(2131886465, str, string, itemProfileCycleBinding.tvCyclePoints.getText()));
    }

    @Override // t0.AbstractC0902I
    public final g0 d(ViewGroup parent) {
        i.e(parent, "parent");
        ItemProfileCycleBinding itemProfileCycleBindingInflate = ItemProfileCycleBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        i.d(itemProfileCycleBindingInflate, "inflate(...)");
        return new C0822a(itemProfileCycleBindingInflate);
    }
}
