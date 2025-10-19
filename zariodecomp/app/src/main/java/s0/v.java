package S0;

import A2.C0009i;
import B3.RunnableC0040f;
import E2.G;
import M.F;
import M.S;
import M.X;
import N2.AbstractC0156x;
import N2.n0;
import a.AbstractC0183a;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.firestore.FirebaseFirestore;
import g.y;
import g1.C0575d;
import j.AbstractC0616a;
import j.C0620f;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k.MenuC0638B;
import l0.C0726a;
import l0.C0727b;
import l0.C0728c;
import q.C0834k;
import r.AbstractC0854a;
import t0.p0;
import t0.q0;
import u0.AbstractC0967h;
import u0.C0955C;
import w2.B;
import y2.C1049B;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\v.smali */
public final class v implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2934a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2935b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2936c;

    public /* synthetic */ v(int i) {
        this.f2934a = i;
    }

    public void a(String str, PrintWriter printWriter) {
        C0728c c0728c = (C0728c) this.f2936c;
        if (c0728c.f8752a.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < c0728c.f8752a.f(); i++) {
                C0726a c0726a = (C0726a) c0728c.f8752a.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c0728c.f8752a.d(i));
                printWriter.print(": ");
                printWriter.println(c0726a.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c0726a.f8746l);
                C0575d c0575d = c0726a.f8746l;
                String str3 = str2 + "  ";
                c0575d.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(c0575d.f7579a);
                if (c0575d.f7580b || c0575d.f7583e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(c0575d.f7580b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(c0575d.f7583e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (c0575d.f7581c || c0575d.f7582d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(c0575d.f7581c);
                    printWriter.print(" mReset=");
                    printWriter.println(c0575d.f7582d);
                }
                if (c0575d.f7585g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(c0575d.f7585g);
                    printWriter.print(" waiting=");
                    c0575d.f7585g.getClass();
                    printWriter.println(false);
                }
                if (c0575d.h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(c0575d.h);
                    printWriter.print(" waiting=");
                    c0575d.h.getClass();
                    printWriter.println(false);
                }
                if (c0726a.f8748n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c0726a.f8748n);
                    C0727b c0727b = c0726a.f8748n;
                    c0727b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0727b.f8750b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                C0575d c0575d2 = c0726a.f8746l;
                Object obj = c0726a.f4581e;
                Object obj2 = obj != D.f4576k ? obj : null;
                c0575d2.getClass();
                StringBuilder sb = new StringBuilder(64);
                p1.b.g(obj2, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c0726a.f4579c > 0);
            }
        }
    }

    public View b(int i, int i5, int i6, int i7) {
        q0 q0Var = (q0) this.f2935b;
        int iE = q0Var.e();
        int iC = q0Var.c();
        int i8 = i5 > i ? 1 : -1;
        View view = null;
        while (i != i5) {
            View viewB = q0Var.b(i);
            int iH = q0Var.h(viewB);
            int iG = q0Var.g(viewB);
            p0 p0Var = (p0) this.f2936c;
            p0Var.f10102b = iE;
            p0Var.f10103c = iC;
            p0Var.f10104d = iH;
            p0Var.f10105e = iG;
            if (i6 != 0) {
                p0Var.f10101a = i6;
                if (p0Var.a()) {
                    return viewB;
                }
            }
            if (i7 != 0) {
                p0Var.f10101a = i7;
                if (p0Var.a()) {
                    view = viewB;
                }
            }
            i += i8;
        }
        return view;
    }

    public String c(String str) {
        String str2 = (String) this.f2936c;
        Resources resources = (Resources) this.f2935b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList d(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2935b;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            c0955cK.l();
        }
    }

    public void e(String str, String str2) {
        K2.c cVar = (K2.c) this.f2936c;
        cVar.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i5), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i6 = 0; i6 < length2; i6++) {
            char cCharAt2 = str2.charAt(i6);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i6), str2));
            }
        }
        while (true) {
            ArrayList arrayList = (ArrayList) cVar.b;
            if (i >= arrayList.size()) {
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public boolean f(View view) {
        q0 q0Var = (q0) this.f2935b;
        int iE = q0Var.e();
        int iC = q0Var.c();
        int iH = q0Var.h(view);
        int iG = q0Var.g(view);
        p0 p0Var = (p0) this.f2936c;
        p0Var.f10102b = iE;
        p0Var.f10103c = iC;
        p0Var.f10104d = iH;
        p0Var.f10105e = iG;
        p0Var.f10101a = 24579;
        return p0Var.a();
    }

    public void g(AbstractC0616a abstractC0616a) {
        i iVar = (i) this.f2935b;
        ((ActionMode.Callback) iVar.f2858a).onDestroyActionMode(iVar.m(abstractC0616a));
        y yVar = (y) this.f2936c;
        if (yVar.f7251A != null) {
            yVar.f7288p.getDecorView().removeCallbacks(yVar.f7252B);
        }
        if (yVar.f7298z != null) {
            X x3 = yVar.f7253C;
            if (x3 != null) {
                x3.b();
            }
            X xA = S.a(yVar.f7298z);
            xA.a(0.0f);
            yVar.f7253C = xA;
            xA.d(new g.q(this, 2));
        }
        yVar.f7297y = null;
        ViewGroup viewGroup = yVar.f7255E;
        WeakHashMap weakHashMap = S.f2363a;
        F.c(viewGroup);
        yVar.H();
    }

    public boolean h(AbstractC0616a abstractC0616a, k.l lVar) {
        ViewGroup viewGroup = ((y) this.f2936c).f7255E;
        WeakHashMap weakHashMap = S.f2363a;
        F.c(viewGroup);
        i iVar = (i) this.f2935b;
        C0620f c0620fM = iVar.m(abstractC0616a);
        C0834k c0834k = (C0834k) iVar.f2861d;
        Menu menuC0638B = (Menu) c0834k.getOrDefault(lVar, null);
        if (menuC0638B == null) {
            menuC0638B = new MenuC0638B((Context) iVar.f2859b, lVar);
            c0834k.put(lVar, menuC0638B);
        }
        return ((ActionMode.Callback) iVar.f2858a).onPrepareActionMode(c0620fM, menuC0638B);
    }

    public void i(J.e eVar) {
        int i = eVar.f1999b;
        Handler handler = (Handler) this.f2936c;
        g1.i iVar = (g1.i) this.f2935b;
        if (i != 0) {
            handler.post(new RunnableC0040f(iVar, i, 2));
        } else {
            handler.post(new A3.a(2, iVar, eVar.f1998a, false));
        }
    }

    public void j(w2.g gVar, Map map, B b5) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f2936c;
        firebaseFirestore.getClass();
        AbstractC0156x.i(gVar, "Provided DocumentReference must not be null.");
        if (gVar.f10930b != firebaseFirestore) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
        AbstractC0156x.i(map, "Provided data must not be null.");
        AbstractC0156x.i(b5, "Provided options must not be null.");
        boolean z4 = b5.f10914a;
        g1.i iVar = firebaseFirestore.f6403g;
        C0009i c0009iZ = z4 ? iVar.z(map) : iVar.A(map);
        C1049B c1049b = (C1049B) this.f2935b;
        B2.h hVar = gVar.f10929a;
        List listSingletonList = Collections.singletonList(c0009iZ.i0(hVar, c1049b.a(hVar)));
        AbstractC0183a.N(!c1049b.f11061d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
        c1049b.f11060c.addAll(listSingletonList);
        c1049b.f11062e.add(hVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C.f(exception);
            String message = exception.getMessage();
            C.f(message);
            return Tasks.forException(new p2.o(message));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String strZza = zzahsVar.zza();
        if (zzac.zzc(strZza)) {
            return Tasks.forException(new p2.o(AbstractC0854a.b("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f2935b)));
        }
        List<String> listZza = zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(AbstractC0854a.b("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f2935b));
        }
        G g3 = (G) this.f2936c;
        p2.v vVar = (p2.v) g3.f1417f;
        l2.f fVar = (l2.f) g3.f1415d;
        fVar.a();
        Application application = (Application) fVar.f8771a;
        vVar.getClass();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        G g5 = (G) this.f2936c;
        String str2 = (String) this.f2935b;
        synchronized (g5.f1412a) {
            g5.f1414c = zzahsVar;
            ((HashMap) g5.f1413b).put(str2, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }

    public String toString() {
        switch (this.f2934a) {
            case 5:
                return "Bounds{lower=" + ((D.c) this.f2935b) + " upper=" + ((D.c) this.f2936c) + "}";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                p1.b.g((InterfaceC0241v) this.f2935b, sb);
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f2934a = i;
        this.f2935b = obj;
        this.f2936c = obj2;
    }

    public v(Context context) {
        this.f2934a = 7;
        C.f(context);
        Resources resources = context.getResources();
        this.f2935b = resources;
        this.f2936c = resources.getResourcePackageName(2131886175);
    }

    public v(G g3, String str) {
        this.f2934a = 10;
        this.f2935b = str;
        Objects.requireNonNull(g3);
        this.f2936c = g3;
    }

    public v(WorkDatabase_Impl workDatabase_Impl) {
        this.f2934a = 0;
        this.f2935b = workDatabase_Impl;
        this.f2936c = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 19);
    }

    public v(InterfaceC0241v interfaceC0241v, m0 m0Var) {
        this.f2934a = 9;
        this.f2935b = interfaceC0241v;
        this.f2936c = (C0728c) new l0(m0Var, C0728c.f8751c).a(C0728c.class);
    }

    public v(C1049B c1049b, FirebaseFirestore firebaseFirestore) {
        this.f2934a = 12;
        c1049b.getClass();
        this.f2935b = c1049b;
        firebaseFirestore.getClass();
        this.f2936c = firebaseFirestore;
    }

    public v(q0 q0Var) {
        this.f2934a = 11;
        this.f2935b = q0Var;
        p0 p0Var = new p0();
        p0Var.f10101a = 0;
        this.f2936c = p0Var;
    }

    public v(ArrayList arrayList, ArrayList arrayList2) {
        this.f2934a = 2;
        int size = arrayList.size();
        this.f2935b = new int[size];
        this.f2936c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2935b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2936c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public v(int i, int i5) {
        this.f2934a = 2;
        this.f2935b = new int[]{i, i5};
        this.f2936c = new float[]{0.0f, 1.0f};
    }

    public v(int i, int i5, int i6) {
        this.f2934a = 2;
        this.f2935b = new int[]{i, i5, i6};
        this.f2936c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public v(y yVar, i iVar) {
        this.f2934a = 8;
        this.f2936c = yVar;
        this.f2935b = iVar;
    }
}
