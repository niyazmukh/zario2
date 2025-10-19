package p1;

import A2.C0004d;
import E2.G;
import J0.C0108b;
import J0.t;
import J0.u;
import K0.g;
import K0.k;
import K0.r;
import K0.s;
import M.q;
import N2.n0;
import Q0.h;
import S0.f;
import S0.j;
import S0.n;
import T0.m;
import X3.l;
import a.AbstractC0183a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b3.C0325t;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import e2.C0465m;
import f4.A;
import f4.B0;
import f4.E;
import f4.N;
import j2.AbstractC0627a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import m4.d;
import m4.e;
import o0.C0769D;
import o0.C0770E;
import t2.C0942a;
import u0.v;
import u0.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p1.1\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f9312a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f9313b;

    /* renamed from: c, reason: collision with root package name */
    public static long f9314c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f9315d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9316e = 0;

    public static boolean A(n0 n0Var) {
        n0 n0VarZ = n0Var == null ? null : n0Var.N().z("__type__");
        return n0VarZ != null && "server_timestamp".equals(n0VarZ.P());
    }

    public static List B(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static int C(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException(B.a.i("x (", i, ") must be > 0"));
        }
        switch (AbstractC0627a.f8040a[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final C0769D D(l lVar) {
        C0770E c0770e = new C0770E();
        lVar.invoke(c0770e);
        boolean z4 = c0770e.f9014b;
        q qVar = c0770e.f9013a;
        return new C0769D(z4, c0770e.f9015c, c0770e.f9016d, false, c0770e.f9017e, qVar.f2418a, qVar.f2419b, -1, -1);
    }

    public static Z.b K(String name, h1.i iVar, C0942a c0942a, int i) {
        if ((i & 2) != 0) {
            iVar = null;
        }
        l produceMigrations = c0942a;
        if ((i & 4) != 0) {
            produceMigrations = Z.a.f3925a;
        }
        e eVar = N.f7027a;
        A a5 = d.f8928c;
        B0 b0D = E.d();
        a5.getClass();
        k4.c cVarB = E.b(f.U(a5, b0D));
        i.e(name, "name");
        i.e(produceMigrations, "produceMigrations");
        return new Z.b(name, iVar, produceMigrations, cVarB);
    }

    public static final void N(Object[] objArr, int i, int i5) {
        i.e(objArr, "<this>");
        while (i < i5) {
            objArr[i] = null;
            i++;
        }
    }

    public static TypedValue O(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean P(Context context, int i, boolean z4) {
        TypedValue typedValueO = O(context, i);
        return (typedValueO == null || typedValueO.type != 18) ? z4 : typedValueO.data != 0;
    }

    public static TypedValue Q(Context context, int i, String str) {
        TypedValue typedValueO = O(context, i);
        if (typedValueO != null) {
            return typedValueO;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void R(int i, Object[] array) {
        i.e(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
    }

    public static void T(Object obj, String str, boolean z4) {
        if (!z4) {
            throw new B0.c(AbstractC0183a.U(str, obj));
        }
    }

    public static final Object U(l lVar, Q3.c cVar) {
        return E.C(30000L, new C0325t(lVar, null), cVar);
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0465m c0465m = (C0465m) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", c0465m.f6883a);
            bundle.putLong("event_timestamp", c0465m.f6884b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final boolean b(Object[] objArr, int i, int i5, List list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!i.a(objArr[i + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public static final String c(Object[] objArr, int i, int i5, L3.e eVar) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i6];
            if (obj == eVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static int d(View view) {
        i.e(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(B.a.g(visibility, "Unknown visibility "));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(h4.v r4, X3.a r5, Q3.c r6) {
        /*
            boolean r0 = r6 instanceof h4.s
            if (r0 == 0) goto L13
            r0 = r6
            h4.s r0 = (h4.s) r0
            int r1 = r0.f7823c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7823c = r1
            goto L18
        L13:
            h4.s r0 = new h4.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7822b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f7823c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            X3.a r5 = r0.f7821a
            a.AbstractC0183a.m0(r6)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0183a.m0(r6)
            O3.i r6 = r0.getContext()
            f4.B r2 = f4.B.f7000b
            O3.g r6 = r6.get(r2)
            if (r6 != r4) goto L6d
            r0.f7821a = r5     // Catch: java.lang.Throwable -> L29
            r0.f7823c = r3     // Catch: java.lang.Throwable -> L29
            f4.n r6 = new f4.n     // Catch: java.lang.Throwable -> L29
            O3.d r0 = x(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.s()     // Catch: java.lang.Throwable -> L29
            h4.t r0 = new h4.t     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            h4.u r4 = (h4.u) r4     // Catch: java.lang.Throwable -> L29
            r4.U(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L63
            return r1
        L63:
            r5.invoke()
            K3.k r4 = K3.k.f2288a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.e(h4.v, X3.a, Q3.c):java.lang.Object");
    }

    public static M3.c f(M3.c cVar) {
        cVar.k();
        cVar.f2504c = true;
        return cVar.f2503b > 0 ? cVar : M3.c.f2501d;
    }

    public static void g(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final r n(Context context, C0108b c0108b) throws Resources.NotFoundException {
        w wVarC;
        int i = 6;
        i.e(context, "context");
        S0.i taskExecutor = new S0.i(c0108b.f2025b);
        Context applicationContext = context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        m mVar = (m) taskExecutor.f2858a;
        i.d(mVar, "workTaskExecutor.serialTaskExecutor");
        boolean z4 = context.getResources().getBoolean(2130968582);
        u clock = c0108b.f2026c;
        i.e(clock, "clock");
        if (z4) {
            wVarC = new w(applicationContext, WorkDatabase.class, null);
            wVarC.f10451j = true;
        } else {
            wVarC = v.c(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            wVarC.i = new C0004d(applicationContext, i);
        }
        wVarC.f10450g = mVar;
        wVarC.f10447d.add(new K0.b(clock));
        wVarC.a(K0.d.h);
        wVarC.a(new g(applicationContext, 2, 3));
        wVarC.a(K0.d.i);
        wVarC.a(K0.d.f2126j);
        wVarC.a(new g(applicationContext, 5, 6));
        wVarC.a(K0.d.f2127k);
        wVarC.a(K0.d.f2128l);
        wVarC.a(K0.d.f2129m);
        wVarC.a(new g(applicationContext));
        wVarC.a(new g(applicationContext, 10, 11));
        wVarC.a(K0.d.f2122d);
        wVarC.a(K0.d.f2123e);
        wVarC.a(K0.d.f2124f);
        wVarC.a(K0.d.f2125g);
        wVarC.f10453l = false;
        wVarC.f10454m = true;
        WorkDatabase workDatabase = (WorkDatabase) wVarC.b();
        Context applicationContext2 = context.getApplicationContext();
        i.d(applicationContext2, "context.applicationContext");
        Context applicationContext3 = applicationContext2.getApplicationContext();
        i.d(applicationContext3, "context.applicationContext");
        i.e(taskExecutor, "taskExecutor");
        Q0.a aVar = new Q0.a(applicationContext3, taskExecutor, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        i.d(applicationContext4, "context.applicationContext");
        i.e(taskExecutor, "taskExecutor");
        Q0.a aVar2 = new Q0.a(applicationContext4, taskExecutor, 1);
        Context applicationContext5 = applicationContext2.getApplicationContext();
        i.d(applicationContext5, "context.applicationContext");
        String str = Q0.i.f2722a;
        i.e(taskExecutor, "taskExecutor");
        h hVar = new h(applicationContext5, taskExecutor);
        Context applicationContext6 = applicationContext2.getApplicationContext();
        i.d(applicationContext6, "context.applicationContext");
        i.e(taskExecutor, "taskExecutor");
        Q0.a aVar3 = new Q0.a(applicationContext6, taskExecutor, 2);
        i.e(taskExecutor, "taskExecutor");
        n nVar = new n();
        nVar.f2872a = aVar;
        nVar.f2873b = aVar2;
        nVar.f2874c = hVar;
        nVar.f2875d = aVar3;
        K0.f fVar = new K0.f(context.getApplicationContext(), c0108b, taskExecutor, workDatabase);
        int i5 = s.f2180a;
        String str2 = k.f2155a;
        N0.b bVar = new N0.b(context, workDatabase, c0108b);
        T0.k.a(context, SystemJobService.class, true);
        t.d().a(k.f2155a, "Created SystemJobScheduler and enabled SystemJobService");
        return new r(context.getApplicationContext(), c0108b, taskExecutor, workDatabase, L3.k.Y(bVar, new L0.c(context, c0108b, nVar, fVar, new S0.l(fVar, taskExecutor), taskExecutor)), fVar, nVar);
    }

    public static int o(int i, int i5, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i5;
        int i7 = i - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i ^ i5) >> 31) | 1;
        switch (AbstractC0627a.f8040a[roundingMode.ordinal()]) {
            case 1:
                if (i7 == 0) {
                    return i6;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i6;
            case 3:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i7);
                int iAbs2 = iAbs - (Math.abs(i5) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i6 & 1) != 0))) {
                            return i6;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static void p(int i, String str, String str2, Object... objArr) {
        if (t.h.c(i) >= 1) {
            String strConcat = B.a.l("(26.0.2) [", str, "]: ").concat(String.format(str2, objArr));
            int iC = t.h.c(i);
            if (iC == 0) {
                Log.i("Firestore", strConcat);
            } else if (iC == 1) {
                Log.w("Firestore", strConcat);
            } else if (iC == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static View q(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View viewFindViewById = viewGroup.getChildAt(i5).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final j r(S0.q qVar) {
        i.e(qVar, "<this>");
        return new j(qVar.f2895a, qVar.f2912t);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class s(c4.c cVar) {
        i.e(cVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.c) cVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static com.google.protobuf.B0 t(n0 n0Var) {
        return n0Var.N().A("__local_write_time__").Q();
    }

    public static n0 u(n0 n0Var) {
        n0 n0VarZ = n0Var.N().z("__previous_value__");
        return A(n0VarZ) ? u(n0VarZ) : n0VarZ;
    }

    public static O3.d x(O3.d dVar) {
        O3.d dVarIntercepted;
        i.e(dVar, "<this>");
        Q3.c cVar = dVar instanceof Q3.c ? (Q3.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static boolean y() {
        try {
            if (f9315d == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f9315d == null) {
                f9314c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9315d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9315d.invoke(null, Long.valueOf(f9314c))).booleanValue();
        } catch (Exception e5) {
            if (!(e5 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e5);
                return false;
            }
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean z(byte b5) {
        return b5 > -65;
    }

    public abstract void E(Throwable th);

    public abstract void F(S0.i iVar);

    public void G(View view, int i) {
    }

    public abstract void H(int i);

    public abstract void I(View view, int i, int i5);

    public abstract void J(View view, float f2, float f3);

    public abstract void L(r.g gVar, r.g gVar2);

    public abstract void M(r.g gVar, Thread thread);

    public abstract boolean S(View view, int i);

    public Task V(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        G g3;
        boolean z4;
        K2.c cVar = new K2.c(26);
        cVar.b = this;
        synchronized (firebaseAuth) {
            g3 = firebaseAuth.f6375j;
        }
        if (g3 != null) {
            synchronized (g3.f1412a) {
                try {
                    zzahs zzahsVar = (zzahs) g3.f1414c;
                    z4 = zzahsVar != null && zzahsVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                return g3.s(str, Boolean.FALSE, recaptchaAction).continueWithTask(cVar).continueWithTask(new S0.i(str, g3, recaptchaAction, cVar));
            }
        }
        Task taskW = W(null);
        n nVar = new n();
        nVar.f2872a = recaptchaAction;
        nVar.f2873b = firebaseAuth;
        nVar.f2874c = str;
        nVar.f2875d = cVar;
        return taskW.continueWithTask(nVar);
    }

    public abstract Task W(String str);

    public abstract boolean h(r.h hVar, r.d dVar, r.d dVar2);

    public abstract boolean i(r.h hVar, Object obj, Object obj2);

    public abstract boolean j(r.h hVar, r.g gVar, r.g gVar2);

    public abstract int l(View view, int i);

    public abstract int m(View view, int i);

    public int v(View view) {
        return 0;
    }

    public int w() {
        return 0;
    }
}
