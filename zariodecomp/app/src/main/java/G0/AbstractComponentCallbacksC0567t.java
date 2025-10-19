package g0;

import A2.RunnableC0005e;
import a.AbstractC0183a;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0232j;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0655e;
import l.C0708q;
import x0.InterfaceC1033d;
import z2.C1071b;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\t.1.smali */
public abstract class AbstractComponentCallbacksC0567t implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0241v, n0, InterfaceC0232j, InterfaceC1033d {

    /* renamed from: Z, reason: collision with root package name */
    public static final Object f7503Z = new Object();

    /* renamed from: A, reason: collision with root package name */
    public int f7504A;

    /* renamed from: B, reason: collision with root package name */
    public int f7505B;

    /* renamed from: C, reason: collision with root package name */
    public String f7506C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7507D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7508E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7509F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7510H;

    /* renamed from: I, reason: collision with root package name */
    public ViewGroup f7511I;

    /* renamed from: J, reason: collision with root package name */
    public View f7512J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f7513K;

    /* renamed from: M, reason: collision with root package name */
    public r f7515M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f7516N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7517O;

    /* renamed from: P, reason: collision with root package name */
    public String f7518P;

    /* renamed from: Q, reason: collision with root package name */
    public EnumC0236o f7519Q;

    /* renamed from: R, reason: collision with root package name */
    public C0242x f7520R;

    /* renamed from: S, reason: collision with root package name */
    public S f7521S;

    /* renamed from: T, reason: collision with root package name */
    public final androidx.lifecycle.G f7522T;

    /* renamed from: U, reason: collision with root package name */
    public d0 f7523U;

    /* renamed from: V, reason: collision with root package name */
    public A2.G f7524V;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f7525W;
    public final ArrayList X;

    /* renamed from: Y, reason: collision with root package name */
    public final C0563o f7526Y;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f7528b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f7529c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f7530d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f7532f;

    /* renamed from: k, reason: collision with root package name */
    public AbstractComponentCallbacksC0567t f7533k;

    /* renamed from: m, reason: collision with root package name */
    public int f7535m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7537o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7538p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7539q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7540r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7541s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7542t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7543u;

    /* renamed from: v, reason: collision with root package name */
    public int f7544v;

    /* renamed from: w, reason: collision with root package name */
    public C0542J f7545w;

    /* renamed from: x, reason: collision with root package name */
    public C0569v f7546x;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0567t f7548z;

    /* renamed from: a, reason: collision with root package name */
    public int f7527a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f7531e = UUID.randomUUID().toString();

    /* renamed from: l, reason: collision with root package name */
    public String f7534l = null;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f7536n = null;

    /* renamed from: y, reason: collision with root package name */
    public C0542J f7547y = new C0542J();
    public final boolean G = true;

    /* renamed from: L, reason: collision with root package name */
    public boolean f7514L = true;

    public AbstractComponentCallbacksC0567t() {
        new B3.N(this, 26);
        this.f7519Q = EnumC0236o.f4662e;
        this.f7522T = new androidx.lifecycle.G();
        this.f7525W = new AtomicInteger();
        this.X = new ArrayList();
        this.f7526Y = new C0563o(this);
        u();
    }

    public void A(int i, int i5, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void B(Activity activity) {
        this.f7510H = true;
    }

    public void C(Context context) {
        this.f7510H = true;
        C0569v c0569v = this.f7546x;
        AbstractActivityC0570w abstractActivityC0570w = c0569v == null ? null : c0569v.f7551a;
        if (abstractActivityC0570w != null) {
            this.f7510H = false;
            B(abstractActivityC0570w);
        }
    }

    public void D(Bundle bundle) {
        this.f7510H = true;
        U();
        C0542J c0542j = this.f7547y;
        if (c0542j.f7346t >= 1) {
            return;
        }
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(1);
    }

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void F() {
        this.f7510H = true;
    }

    public void G() {
        this.f7510H = true;
    }

    public void H() {
        this.f7510H = true;
    }

    public LayoutInflater I(Bundle bundle) {
        C0569v c0569v = this.f7546x;
        if (c0569v == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0570w abstractActivityC0570w = c0569v.f7555e;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0570w.getLayoutInflater().cloneInContext(abstractActivityC0570w);
        layoutInflaterCloneInContext.setFactory2(this.f7547y.f7334f);
        return layoutInflaterCloneInContext;
    }

    public void J(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f7510H = true;
        C0569v c0569v = this.f7546x;
        if ((c0569v == null ? null : c0569v.f7551a) != null) {
            this.f7510H = true;
        }
    }

    public void K() {
        this.f7510H = true;
    }

    public void L(Bundle bundle) {
    }

    public void M() {
        this.f7510H = true;
    }

    public void N() {
        this.f7510H = true;
    }

    public void O(View view) {
    }

    public void P(Bundle bundle) {
        this.f7510H = true;
    }

    public void Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7547y.N();
        this.f7543u = true;
        this.f7521S = new S(this, e(), new RunnableC0005e(this, 26));
        View viewE = E(layoutInflater, viewGroup);
        this.f7512J = viewE;
        if (viewE == null) {
            if (this.f7521S.f7399e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f7521S = null;
            return;
        }
        this.f7521S.d();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f7512J + " for Fragment " + this);
        }
        a0.k(this.f7512J, this.f7521S);
        View view = this.f7512J;
        S s4 = this.f7521S;
        kotlin.jvm.internal.i.e(view, "<this>");
        view.setTag(2131231338, s4);
        C1071b.j(this.f7512J, this.f7521S);
        this.f7522T.j(this.f7521S);
    }

    public final AbstractActivityC0570w R() {
        AbstractActivityC0570w abstractActivityC0570wL = l();
        if (abstractActivityC0570wL != null) {
            return abstractActivityC0570wL;
        }
        throw new IllegalStateException(B.a.j("Fragment ", this, " not attached to an activity."));
    }

    public final Context S() {
        Context contextN = n();
        if (contextN != null) {
            return contextN;
        }
        throw new IllegalStateException(B.a.j("Fragment ", this, " not attached to a context."));
    }

    public final View T() {
        View view = this.f7512J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(B.a.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void U() {
        Bundle bundle;
        Bundle bundle2 = this.f7528b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f7547y.T(bundle);
        C0542J c0542j = this.f7547y;
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(1);
    }

    public final void V(int i, int i5, int i6, int i7) {
        if (this.f7515M == null && i == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        k().f7495b = i;
        k().f7496c = i5;
        k().f7497d = i6;
        k().f7498e = i7;
    }

    public final void W(Bundle bundle) {
        C0542J c0542j = this.f7545w;
        if (c0542j != null) {
            if (c0542j == null ? false : c0542j.L()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f7532f = bundle;
    }

    public final void X(Intent intent) {
        C0569v c0569v = this.f7546x;
        if (c0569v == null) {
            throw new IllegalStateException(B.a.j("Fragment ", this, " not attached to Activity"));
        }
        B.l.startActivity(c0569v.f7552b, intent, null);
    }

    @Override // androidx.lifecycle.InterfaceC0232j
    public final C0655e a() {
        Application application;
        Context applicationContext = S().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + S().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0655e c0655e = new C0655e(0);
        if (application != null) {
            c0655e.b(g0.f4648a, application);
        }
        c0655e.b(a0.f4626a, this);
        c0655e.b(a0.f4627b, this);
        Bundle bundle = this.f7532f;
        if (bundle != null) {
            c0655e.b(a0.f4628c, bundle);
        }
        return c0655e;
    }

    @Override // x0.InterfaceC1033d
    public final C0708q b() {
        return (C0708q) this.f7524V.f88c;
    }

    @Override // androidx.lifecycle.n0
    public final m0 e() {
        if (this.f7545w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f7545w.f7327M.f7365c;
        m0 m0Var = (m0) map.get(this.f7531e);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0();
        map.put(this.f7531e, m0Var2);
        return m0Var2;
    }

    public Activity f() {
        return l();
    }

    @Override // androidx.lifecycle.InterfaceC0241v
    public final C0242x g() {
        return this.f7520R;
    }

    public i0 h() {
        Application application;
        if (this.f7545w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f7523U == null) {
            Context applicationContext = S().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + S().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f7523U = new d0(application, this, this.f7532f);
        }
        return this.f7523U;
    }

    public AbstractC0183a i() {
        return new C0564p(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f7504A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f7505B));
        printWriter.print(" mTag=");
        printWriter.println(this.f7506C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f7527a);
        printWriter.print(" mWho=");
        printWriter.print(this.f7531e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f7544v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f7537o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f7538p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f7540r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f7541s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f7507D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f7508E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f7509F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f7514L);
        if (this.f7545w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f7545w);
        }
        if (this.f7546x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f7546x);
        }
        if (this.f7548z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f7548z);
        }
        if (this.f7532f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f7532f);
        }
        if (this.f7528b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f7528b);
        }
        if (this.f7529c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f7529c);
        }
        if (this.f7530d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f7530d);
        }
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tD = this.f7533k;
        if (abstractComponentCallbacksC0567tD == null) {
            C0542J c0542j = this.f7545w;
            abstractComponentCallbacksC0567tD = (c0542j == null || (str2 = this.f7534l) == null) ? null : c0542j.f7331c.d(str2);
        }
        if (abstractComponentCallbacksC0567tD != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0567tD);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f7535m);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        r rVar = this.f7515M;
        printWriter.println(rVar == null ? false : rVar.f7494a);
        r rVar2 = this.f7515M;
        if ((rVar2 == null ? 0 : rVar2.f7495b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            r rVar3 = this.f7515M;
            printWriter.println(rVar3 == null ? 0 : rVar3.f7495b);
        }
        r rVar4 = this.f7515M;
        if ((rVar4 == null ? 0 : rVar4.f7496c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            r rVar5 = this.f7515M;
            printWriter.println(rVar5 == null ? 0 : rVar5.f7496c);
        }
        r rVar6 = this.f7515M;
        if ((rVar6 == null ? 0 : rVar6.f7497d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            r rVar7 = this.f7515M;
            printWriter.println(rVar7 == null ? 0 : rVar7.f7497d);
        }
        r rVar8 = this.f7515M;
        if ((rVar8 == null ? 0 : rVar8.f7498e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            r rVar9 = this.f7515M;
            printWriter.println(rVar9 != null ? rVar9.f7498e : 0);
        }
        if (this.f7511I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f7511I);
        }
        if (this.f7512J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f7512J);
        }
        if (n() != null) {
            new S0.v(this, e()).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f7547y + ":");
        this.f7547y.u(B.a.k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final r k() {
        if (this.f7515M == null) {
            r rVar = new r();
            Object obj = f7503Z;
            rVar.f7500g = obj;
            rVar.h = obj;
            rVar.i = obj;
            rVar.f7501j = 1.0f;
            rVar.f7502k = null;
            this.f7515M = rVar;
        }
        return this.f7515M;
    }

    public final AbstractActivityC0570w l() {
        C0569v c0569v = this.f7546x;
        if (c0569v == null) {
            return null;
        }
        return c0569v.f7551a;
    }

    public final C0542J m() {
        if (this.f7546x != null) {
            return this.f7547y;
        }
        throw new IllegalStateException(B.a.j("Fragment ", this, " has not been attached yet."));
    }

    public Context n() {
        C0569v c0569v = this.f7546x;
        if (c0569v == null) {
            return null;
        }
        return c0569v.f7552b;
    }

    public final int o() {
        EnumC0236o enumC0236o = this.f7519Q;
        return (enumC0236o == EnumC0236o.f4659b || this.f7548z == null) ? enumC0236o.ordinal() : Math.min(enumC0236o.ordinal(), this.f7548z.o());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7510H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        R().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f7510H = true;
    }

    public final C0542J p() {
        C0542J c0542j = this.f7545w;
        if (c0542j != null) {
            return c0542j;
        }
        throw new IllegalStateException(B.a.j("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources q() {
        return S().getResources();
    }

    public final String r(int i) {
        return q().getString(i);
    }

    public final String s(int i, Object... objArr) {
        return q().getString(i, objArr);
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.f7546x == null) {
            throw new IllegalStateException(B.a.j("Fragment ", this, " not attached to Activity"));
        }
        C0542J c0542jP = p();
        if (c0542jP.f7316A == null) {
            C0569v c0569v = c0542jP.f7347u;
            if (i == -1) {
                B.l.startActivity(c0569v.f7552b, intent, null);
                return;
            } else {
                c0569v.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        String str = this.f7531e;
        C0538F c0538f = new C0538F();
        c0538f.f7308a = str;
        c0538f.f7309b = i;
        c0542jP.f7319D.addLast(c0538f);
        c0542jP.f7316A.a(intent);
    }

    public final S t() {
        S s4 = this.f7521S;
        if (s4 != null) {
            return s4;
        }
        throw new IllegalStateException(B.a.j("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f7531e);
        if (this.f7504A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f7504A));
        }
        if (this.f7506C != null) {
            sb.append(" tag=");
            sb.append(this.f7506C);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        this.f7520R = new C0242x(this);
        this.f7524V = new A2.G((InterfaceC1033d) this);
        this.f7523U = null;
        ArrayList arrayList = this.X;
        C0563o c0563o = this.f7526Y;
        if (arrayList.contains(c0563o)) {
            return;
        }
        if (this.f7527a >= 0) {
            c0563o.a();
        } else {
            arrayList.add(c0563o);
        }
    }

    public final void v() {
        u();
        this.f7518P = this.f7531e;
        this.f7531e = UUID.randomUUID().toString();
        this.f7537o = false;
        this.f7538p = false;
        this.f7540r = false;
        this.f7541s = false;
        this.f7542t = false;
        this.f7544v = 0;
        this.f7545w = null;
        this.f7547y = new C0542J();
        this.f7546x = null;
        this.f7504A = 0;
        this.f7505B = 0;
        this.f7506C = null;
        this.f7507D = false;
        this.f7508E = false;
    }

    public final boolean w() {
        return this.f7546x != null && this.f7537o;
    }

    public final boolean x() {
        if (!this.f7507D) {
            C0542J c0542j = this.f7545w;
            if (c0542j == null) {
                return false;
            }
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7548z;
            c0542j.getClass();
            if (!(abstractComponentCallbacksC0567t == null ? false : abstractComponentCallbacksC0567t.x())) {
                return false;
            }
        }
        return true;
    }

    public final boolean y() {
        return this.f7544v > 0;
    }

    public void z() {
        this.f7510H = true;
    }
}
