package E1;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import d2.C0444a;
import l.j1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E1\a.smali */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1390b;

    public /* synthetic */ a(Object obj, int i) {
        this.f1389a = i;
        this.f1390b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        switch (this.f1389a) {
            case 0:
                ((BottomAppBar$Behavior) this.f1390b).getClass();
                throw null;
            case 1:
                C0444a c0444a = (C0444a) this.f1390b;
                c0444a.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                c0444a.f6793M = iArr[0];
                view.getWindowVisibleDisplayFrame(c0444a.G);
                return;
            default:
                SearchView searchView = (SearchView) this.f1390b;
                View view2 = searchView.f4225B;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f4258v.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zA = j1.a(searchView);
                    int dimensionPixelSize = searchView.f4239Q ? resources.getDimensionPixelSize(2131099690) + resources.getDimensionPixelSize(2131099689) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f4256t;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
