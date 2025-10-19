package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\G.smali */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public u0 f2359a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f2361c;

    public G(View view, r rVar) {
        this.f2360b = view;
        this.f2361c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 u0VarF = u0.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f2361c;
        if (i < 30) {
            H.a(windowInsets, this.f2360b);
            if (u0VarF.equals(this.f2359a)) {
                return rVar.k(view, u0VarF).e();
            }
        }
        this.f2359a = u0VarF;
        u0 u0VarK = rVar.k(view, u0VarF);
        if (i >= 30) {
            return u0VarK.e();
        }
        WeakHashMap weakHashMap = S.f2363a;
        F.c(view);
        return u0VarK.e();
    }
}
