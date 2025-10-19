package P0;

import K3.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.InterfaceC0232j;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import com.niyaz.zario.ui.auth.LoginFragment;
import com.niyaz.zario.ui.auth.SignupFragment;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import com.niyaz.zario.ui.history.HistoryFragment;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import com.niyaz.zario.ui.profile.ProfileFragment;
import com.niyaz.zario.ui.target.TargetFragment;
import g0.AbstractComponentCallbacksC0567t;
import i4.I;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o0.C0787j;
import o0.C0790m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P0\b.smali */
public final class b extends j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(0);
        this.f2665a = i;
        this.f2666b = obj;
        this.f2667c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [K3.c, java.lang.Object] */
    @Override // X3.a
    public final Object invoke() {
        i0 i0VarH;
        i0 i0VarH2;
        i0 i0VarH3;
        i0 i0VarH4;
        i0 i0VarH5;
        i0 i0VarH6;
        i0 i0VarH7;
        i0 i0VarH8;
        switch (this.f2665a) {
            case 0:
                Q0.f fVar = ((e) this.f2666b).f2673a;
                c listener = (c) this.f2667c;
                fVar.getClass();
                i.e(listener, "listener");
                synchronized (fVar.f2716c) {
                    if (fVar.f2717d.remove(listener) && fVar.f2717d.isEmpty()) {
                        fVar.d();
                    }
                }
                return k.f2288a;
            case 1:
                SharedPreferences sharedPreferences = ((Context) this.f2666b).getSharedPreferences((String) this.f2667c, 0);
                i.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 2:
                Context applicationContext = (Context) this.f2666b;
                i.d(applicationContext, "applicationContext");
                String name = ((Z.b) this.f2667c).f3926a;
                i.e(name, "name");
                String fileName = name.concat(".preferences_pb");
                i.e(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            case 3:
                n0 n0Var = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j = n0Var instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var : null;
                if (interfaceC0232j != null && (i0VarH = interfaceC0232j.h()) != null) {
                    return i0VarH;
                }
                i0 defaultViewModelProviderFactory = ((LoginFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 4:
                n0 n0Var2 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j2 = n0Var2 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var2 : null;
                if (interfaceC0232j2 != null && (i0VarH2 = interfaceC0232j2.h()) != null) {
                    return i0VarH2;
                }
                i0 defaultViewModelProviderFactory2 = ((SignupFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            case 5:
                n0 n0Var3 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j3 = n0Var3 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var3 : null;
                if (interfaceC0232j3 != null && (i0VarH3 = interfaceC0232j3.h()) != null) {
                    return i0VarH3;
                }
                i0 defaultViewModelProviderFactory3 = ((FeedbackFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory3, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory3;
            case 6:
                n0 n0Var4 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j4 = n0Var4 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var4 : null;
                if (interfaceC0232j4 != null && (i0VarH4 = interfaceC0232j4.h()) != null) {
                    return i0VarH4;
                }
                i0 defaultViewModelProviderFactory4 = ((FlexStakesFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory4, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory4;
            case 7:
                n0 n0Var5 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j5 = n0Var5 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var5 : null;
                if (interfaceC0232j5 != null && (i0VarH5 = interfaceC0232j5.h()) != null) {
                    return i0VarH5;
                }
                i0 defaultViewModelProviderFactory5 = ((HistoryFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory5, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory5;
            case 8:
                n0 n0Var6 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j6 = n0Var6 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var6 : null;
                if (interfaceC0232j6 != null && (i0VarH6 = interfaceC0232j6.h()) != null) {
                    return i0VarH6;
                }
                i0 defaultViewModelProviderFactory6 = ((InterventionFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory6, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory6;
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                ((C0790m) this.f2666b).e((C0787j) this.f2667c);
                return k.f2288a;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                n0 n0Var7 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j7 = n0Var7 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var7 : null;
                if (interfaceC0232j7 != null && (i0VarH7 = interfaceC0232j7.h()) != null) {
                    return i0VarH7;
                }
                i0 defaultViewModelProviderFactory7 = ((ProfileFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory7, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory7;
            case 11:
                C0790m c0790m = (C0790m) this.f2666b;
                for (C0787j c0787j : (Iterable) ((I) c0790m.f9091f.f7964a).K()) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + c0787j + " due to fragment " + ((AbstractComponentCallbacksC0567t) this.f2667c) + " viewmodel being cleared");
                    }
                    c0790m.b(c0787j);
                }
                return k.f2288a;
            default:
                n0 n0Var8 = (n0) this.f2667c.getValue();
                InterfaceC0232j interfaceC0232j8 = n0Var8 instanceof InterfaceC0232j ? (InterfaceC0232j) n0Var8 : null;
                if (interfaceC0232j8 != null && (i0VarH8 = interfaceC0232j8.h()) != null) {
                    return i0VarH8;
                }
                i0 defaultViewModelProviderFactory8 = ((TargetFragment) this.f2666b).h();
                i.d(defaultViewModelProviderFactory8, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, C0787j c0787j, C0790m c0790m) {
        super(0);
        this.f2665a = 11;
        this.f2666b = c0790m;
        this.f2667c = abstractComponentCallbacksC0567t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0790m c0790m, C0787j c0787j, boolean z4) {
        super(0);
        this.f2665a = 9;
        this.f2666b = c0790m;
        this.f2667c = c0787j;
    }
}
