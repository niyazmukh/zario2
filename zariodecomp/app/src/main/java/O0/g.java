package O0;

import N2.j0;
import S1.o;
import W.T;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.W;
import androidx.lifecycle.Z;
import androidx.lifecycle.c0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.navigation.fragment.NavHostFragment;
import com.niyaz.zario.ui.auth.LoginFragment;
import com.niyaz.zario.ui.auth.SignupFragment;
import com.niyaz.zario.ui.feedback.FeedbackFragment;
import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;
import com.niyaz.zario.ui.history.HistoryFragment;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import com.niyaz.zario.ui.profile.ProfileFragment;
import com.niyaz.zario.ui.target.TargetFragment;
import e4.m;
import g0.C0542J;
import g0.C0544L;
import i4.InterfaceC0612g;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import l.C0708q;
import o0.C0767B;
import o0.C0768C;
import o0.C0788k;
import o0.C0789l;
import o0.O;
import o0.r;
import q0.C0840d;
import z0.C1064c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O0\g.smali */
public final class g extends kotlin.jvm.internal.j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i) {
        super(0);
        this.f2619a = i;
        this.f2620b = obj;
    }

    @Override // X3.a
    public final Object invoke() {
        Object[] objArr;
        C0242x c0242xG;
        z0.f fVar;
        switch (this.f2619a) {
            case 0:
                return new c[((InterfaceC0612g[]) this.f2620b).length];
            case 1:
                Object obj = T.d;
                File file = (File) this.f2620b;
                synchronized (obj) {
                    T.c.remove(file.getAbsolutePath());
                }
                return K3.k.f2288a;
            case 2:
                File file2 = (File) ((P0.b) this.f2620b).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                if (m.z0(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 3:
                return (c0) new l0((n0) this.f2620b, new Z()).b(c0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 4:
                return (LoginFragment) this.f2620b;
            case 5:
                return (n0) ((g) this.f2620b).invoke();
            case 6:
                return (SignupFragment) this.f2620b;
            case 7:
                return (n0) ((g) this.f2620b).invoke();
            case 8:
                return (FeedbackFragment) this.f2620b;
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return (n0) ((g) this.f2620b).invoke();
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return (FlexStakesFragment) this.f2620b;
            case 11:
                return (n0) ((g) this.f2620b).invoke();
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return (HistoryFragment) this.f2620b;
            case 13:
                return (n0) ((g) this.f2620b).invoke();
            case 14:
                return (InterventionFragment) this.f2620b;
            case 15:
                return (n0) ((g) this.f2620b).invoke();
            case 16:
                C0767B c0767b = (C0767B) this.f2620b;
                c0767b.getClass();
                return new C0768C(c0767b.f8979a, c0767b.f8997u);
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return (ProfileFragment) this.f2620b;
            case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return (n0) ((g) this.f2620b).invoke();
            case 19:
                NavHostFragment navHostFragment = (NavHostFragment) this.f2620b;
                Context contextN = navHostFragment.n();
                if (contextN == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                C0767B c0767b2 = new C0767B(contextN);
                if (!navHostFragment.equals(c0767b2.f8990n)) {
                    InterfaceC0241v interfaceC0241v = c0767b2.f8990n;
                    C0789l c0789l = c0767b2.f8994r;
                    if (interfaceC0241v != null && (c0242xG = interfaceC0241v.g()) != null) {
                        c0242xG.f(c0789l);
                    }
                    c0767b2.f8990n = navHostFragment;
                    navHostFragment.f7520R.a(c0789l);
                }
                m0 m0VarE = navHostFragment.e();
                r rVar = c0767b2.f8991o;
                C0544L c0544l = r.f9109b;
                if (!kotlin.jvm.internal.i.a(rVar, (r) new l0(m0VarE, c0544l, i).a(r.class))) {
                    if (!c0767b2.f8985g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    c0767b2.f8991o = (r) new l0(m0VarE, c0544l, i).a(r.class);
                }
                Context contextS = navHostFragment.S();
                C0542J childFragmentManager = navHostFragment.m();
                kotlin.jvm.internal.i.d(childFragmentManager, "childFragmentManager");
                C0840d c0840d = new C0840d(contextS, childFragmentManager);
                O o5 = c0767b2.f8997u;
                o5.a(c0840d);
                Context contextS2 = navHostFragment.S();
                C0542J childFragmentManager2 = navHostFragment.m();
                kotlin.jvm.internal.i.d(childFragmentManager2, "childFragmentManager");
                int i = navHostFragment.f7504A;
                if (i == 0 || i == -1) {
                    i = 2131231071;
                }
                o5.a(new q0.m(contextS2, childFragmentManager2, i));
                Bundle bundleC = ((C0708q) navHostFragment.f7524V.f88c).c("android-support-nav:fragment:navControllerState");
                if (bundleC != null) {
                    bundleC.setClassLoader(contextN.getClassLoader());
                    c0767b2.f8982d = bundleC.getBundle("android-support-nav:controller:navigatorState");
                    c0767b2.f8983e = bundleC.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = c0767b2.f8989m;
                    linkedHashMap.clear();
                    int[] intArray = bundleC.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            c0767b2.f8988l.put(Integer.valueOf(intArray[i5]), stringArrayList.get(i6));
                            i5++;
                            i6++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String id : stringArrayList2) {
                            Parcelable[] parcelableArray = bundleC.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                            if (parcelableArray != null) {
                                kotlin.jvm.internal.i.d(id, "id");
                                int length2 = parcelableArray.length;
                                L3.h hVar = new L3.h();
                                if (length2 == 0) {
                                    objArr = L3.h.f2344d;
                                } else {
                                    if (length2 <= 0) {
                                        throw new IllegalArgumentException(B.a.g(length2, "Illegal Capacity: "));
                                    }
                                    objArr = new Object[length2];
                                }
                                hVar.f2346b = objArr;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < parcelableArray.length) {
                                        int i8 = i7 + 1;
                                        try {
                                            Parcelable parcelable = parcelableArray[i7];
                                            kotlin.jvm.internal.i.c(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                            hVar.addLast((C0788k) parcelable);
                                            i7 = i8;
                                        } catch (ArrayIndexOutOfBoundsException e5) {
                                            throw new NoSuchElementException(e5.getMessage());
                                        }
                                    } else {
                                        linkedHashMap.put(id, hVar);
                                    }
                                }
                            }
                        }
                    }
                    c0767b2.f8984f = bundleC.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                ((C0708q) navHostFragment.f7524V.f88c).f("android-support-nav:fragment:navControllerState", new W(c0767b2, 2));
                Bundle bundleC2 = ((C0708q) navHostFragment.f7524V.f88c).c("android-support-nav:fragment:graphId");
                if (bundleC2 != null) {
                    navHostFragment.f4682c0 = bundleC2.getInt("android-support-nav:fragment:graphId");
                }
                ((C0708q) navHostFragment.f7524V.f88c).f("android-support-nav:fragment:graphId", new W(navHostFragment, 3));
                int i9 = navHostFragment.f4682c0;
                K3.h hVar2 = c0767b2.f8977B;
                if (i9 != 0) {
                    c0767b2.o(((C0768C) hVar2.getValue()).b(i9), null);
                } else {
                    Bundle bundle = navHostFragment.f7532f;
                    i = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i != 0) {
                        c0767b2.o(((C0768C) hVar2.getValue()).b(i), bundle2);
                    }
                }
                return c0767b2;
            case 20:
                return (TargetFragment) this.f2620b;
            case 21:
                return (n0) ((g) this.f2620b).invoke();
            case 22:
                return ((o) this.f2620b).l();
            default:
                z0.g gVar = (z0.g) this.f2620b;
                String str = gVar.f11192b;
                Context context = gVar.f11191a;
                if (str == null || !gVar.f11194d) {
                    fVar = new z0.f(context, gVar.f11192b, new C1064c(), gVar.f11193c, gVar.f11195e);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
                    fVar = new z0.f(context, new File(noBackupFilesDir, gVar.f11192b).getAbsolutePath(), new C1064c(), gVar.f11193c, gVar.f11195e);
                }
                fVar.setWriteAheadLoggingEnabled(gVar.f11197k);
                return fVar;
        }
    }
}
