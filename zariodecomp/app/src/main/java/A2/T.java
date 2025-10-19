package A2;

import E2.C0106i;
import N2.AbstractC0156x;
import N2.q0;
import a.AbstractC0183a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0407k;
import f.AbstractC0489a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l.AbstractC0692h0;
import q2.C0849a;
import t0.C0916a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\T.smali */
public final class T implements D {

    /* renamed from: a, reason: collision with root package name */
    public Object f133a;

    /* renamed from: b, reason: collision with root package name */
    public Object f134b;

    /* renamed from: c, reason: collision with root package name */
    public int f135c;

    /* renamed from: d, reason: collision with root package name */
    public Object f136d;

    /* renamed from: e, reason: collision with root package name */
    public Object f137e;

    /* renamed from: f, reason: collision with root package name */
    public Object f138f;

    public T(View view) {
        this.f135c = -1;
        this.f133a = view;
        this.f136d = l.r.a();
    }

    public static T q(Context context, int i) throws Resources.NotFoundException {
        r1.d.k("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, A1.a.f57r);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListX = r1.d.x(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListX2 = r1.d.x(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListX3 = r1.d.x(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        X1.m mVarA = X1.m.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new X1.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        T t4 = new T();
        r1.d.l(rect.left);
        r1.d.l(rect.top);
        r1.d.l(rect.right);
        r1.d.l(rect.bottom);
        t4.f133a = rect;
        t4.f136d = colorStateListX2;
        t4.f137e = colorStateListX;
        t4.f134b = colorStateListX3;
        t4.f135c = dimensionPixelSize;
        t4.f138f = mVarA;
        return t4;
    }

    public C0916a A(Object obj, int i, int i5, int i6) {
        C0916a c0916a = (C0916a) ((L.e) this.f133a).a();
        if (c0916a != null) {
            c0916a.f9945a = i;
            c0916a.f9946b = i5;
            c0916a.f9948d = i6;
            c0916a.f9947c = obj;
            return c0916a;
        }
        C0916a c0916a2 = new C0916a();
        c0916a2.f9945a = i;
        c0916a2.f9946b = i5;
        c0916a2.f9948d = i6;
        c0916a2.f9947c = obj;
        return c0916a2;
    }

    public void B() {
        this.f135c = -1;
        H(null);
        l();
    }

    public void C(int i) {
        ColorStateList colorStateListF;
        this.f135c = i;
        l.r rVar = (l.r) this.f136d;
        if (rVar != null) {
            Context context = ((View) this.f133a).getContext();
            synchronized (rVar) {
                colorStateListF = rVar.f8676a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        H(colorStateListF);
        l();
    }

    public C0009i D() {
        this.f135c++;
        List list = (List) this.f137e;
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        while (true) {
            Iterator it = (Iterator) this.f138f;
            if (!it.hasNext() || i >= 900 - list.size()) {
                break;
            }
            arrayList.add(it.next());
            i++;
        }
        Object[] array = arrayList.toArray();
        C0009i c0009iZ0 = ((X) this.f133a).z0(((String) this.f134b) + ((Object) F2.s.g("?", array.length, ", ")) + ((String) this.f136d));
        c0009iZ0.v(array);
        return c0009iZ0;
    }

    public void E(C0916a c0916a) {
        ((ArrayList) this.f137e).add(c0916a);
        int i = c0916a.f9945a;
        g1.i iVar = (g1.i) this.f134b;
        if (i == 1) {
            iVar.v(c0916a.f9946b, c0916a.f9948d);
            return;
        }
        if (i == 2) {
            int i5 = c0916a.f9946b;
            int i6 = c0916a.f9948d;
            RecyclerView recyclerView = (RecyclerView) iVar.f7594b;
            recyclerView.O(i5, i6, false);
            recyclerView.f4750l0 = true;
            return;
        }
        if (i == 4) {
            iVar.t(c0916a.f9947c, c0916a.f9946b, c0916a.f9948d);
        } else if (i == 8) {
            iVar.w(c0916a.f9946b, c0916a.f9948d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0916a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.T.F():void");
    }

    public void G(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0916a c0916a = (C0916a) arrayList.get(i);
            c0916a.f9947c = null;
            ((L.e) this.f133a).c(c0916a);
        }
        arrayList.clear();
    }

    public void H(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((D3.b) this.f137e) == null) {
                this.f137e = new D3.b();
            }
            D3.b bVar = (D3.b) this.f137e;
            bVar.f1342c = colorStateList;
            bVar.f1341b = true;
        } else {
            this.f137e = null;
        }
        l();
    }

    public void I(ColorStateList colorStateList) {
        if (((D3.b) this.f134b) == null) {
            this.f134b = new D3.b();
        }
        D3.b bVar = (D3.b) this.f134b;
        bVar.f1342c = colorStateList;
        bVar.f1341b = true;
        l();
    }

    public void J(PorterDuff.Mode mode) {
        if (((D3.b) this.f134b) == null) {
            this.f134b = new D3.b();
        }
        D3.b bVar = (D3.b) this.f134b;
        bVar.f1343d = mode;
        bVar.f1340a = true;
        l();
    }

    public void K(TextView textView) {
        X1.h hVar = new X1.h();
        X1.h hVar2 = new X1.h();
        X1.m mVar = (X1.m) this.f138f;
        hVar.setShapeAppearanceModel(mVar);
        hVar2.setShapeAppearanceModel(mVar);
        hVar.m((ColorStateList) this.f137e);
        hVar.f3738a.f3729j = this.f135c;
        hVar.invalidateSelf();
        hVar.q((ColorStateList) this.f134b);
        ColorStateList colorStateList = (ColorStateList) this.f136d;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), hVar, hVar2);
        Rect rect = (Rect) this.f133a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = M.S.f2363a;
        M.B.q(textView, insetDrawable);
    }

    public int L(int i, int i5) {
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.f137e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0916a c0916a = (C0916a) arrayList.get(size);
            int i8 = c0916a.f9945a;
            if (i8 == 8) {
                int i9 = c0916a.f9946b;
                int i10 = c0916a.f9948d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i < i7 || i > i6) {
                    if (i < i9) {
                        if (i5 == 1) {
                            c0916a.f9946b = i9 + 1;
                            c0916a.f9948d = i10 + 1;
                        } else if (i5 == 2) {
                            c0916a.f9946b = i9 - 1;
                            c0916a.f9948d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        c0916a.f9948d = i10 + 1;
                    } else if (i5 == 2) {
                        c0916a.f9948d = i10 - 1;
                    }
                    i++;
                } else {
                    if (i5 == 1) {
                        c0916a.f9946b = i9 + 1;
                    } else if (i5 == 2) {
                        c0916a.f9946b = i9 - 1;
                    }
                    i--;
                }
            } else {
                int i11 = c0916a.f9946b;
                if (i11 <= i) {
                    if (i8 == 1) {
                        i -= c0916a.f9948d;
                    } else if (i8 == 2) {
                        i += c0916a.f9948d;
                    }
                } else if (i5 == 1) {
                    c0916a.f9946b = i11 + 1;
                } else if (i5 == 2) {
                    c0916a.f9946b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0916a c0916a2 = (C0916a) arrayList.get(size2);
            int i12 = c0916a2.f9945a;
            L.e eVar = (L.e) this.f133a;
            if (i12 == 8) {
                int i13 = c0916a2.f9948d;
                if (i13 == c0916a2.f9946b || i13 < 0) {
                    arrayList.remove(size2);
                    c0916a2.f9947c = null;
                    eVar.c(c0916a2);
                }
            } else if (c0916a2.f9948d <= 0) {
                arrayList.remove(size2);
                c0916a2.f9947c = null;
                eVar.c(c0916a2);
            }
        }
        return i;
    }

    public void M() {
        ((X) this.f133a).y0("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", (String) this.f134b, -1, ((AbstractC0409l) this.f138f).u());
    }

    @Override // A2.D
    public AbstractC0409l a() {
        return (AbstractC0409l) this.f138f;
    }

    @Override // A2.D
    public void b() {
        X x3 = (X) this.f133a;
        C0009i c0009iZ0 = x3.z0("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = (String) this.f134b;
        c0009iZ0.v(str);
        Cursor cursorH0 = c0009iZ0.h0();
        try {
            boolean zMoveToFirst = cursorH0.moveToFirst();
            cursorH0.close();
            if (zMoveToFirst) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C0009i c0009iZ02 = x3.z0("SELECT path FROM document_mutations WHERE uid = ?");
            c0009iZ02.v(str);
            cursorH0 = c0009iZ02.h0();
            while (cursorH0.moveToNext()) {
                try {
                    arrayList.add(AbstractC0156x.z(cursorH0.getString(0)));
                } finally {
                }
            }
            cursorH0.close();
            AbstractC0183a.N(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        } finally {
        }
    }

    @Override // A2.D
    public C2.i c(int i) {
        C0009i c0009iZ0 = ((X) this.f133a).z0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        c0009iZ0.v(1000000, (String) this.f134b, Integer.valueOf(i + 1));
        Cursor cursorH0 = c0009iZ0.h0();
        try {
            if (!cursorH0.moveToFirst()) {
                cursorH0.close();
                return null;
            }
            C2.i iVarR = r(cursorH0.getBlob(1), cursorH0.getInt(0));
            cursorH0.close();
            return iVarR;
        } catch (Throwable th) {
            if (cursorH0 != null) {
                try {
                    cursorH0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // A2.D
    public C2.i d(l2.o oVar, ArrayList arrayList, List list) throws SQLException {
        int i = this.f135c;
        this.f135c = i + 1;
        C2.i iVar = new C2.i(i, oVar, arrayList, list);
        K2.c cVar = (K2.c) this.f136d;
        cVar.getClass();
        D2.j jVarF = D2.k.F();
        jVarF.d();
        D2.k.v((D2.k) jVarF.f6410b, iVar.f1087a);
        S0.l lVar = (S0.l) cVar.b;
        B0 b0W = S0.l.w(iVar.f1088b);
        jVarF.d();
        D2.k.y((D2.k) jVarF.f6410b, b0W);
        Iterator it = iVar.f1089c.iterator();
        while (it.hasNext()) {
            q0 q0VarT = lVar.t((C2.h) it.next());
            jVarF.d();
            D2.k.w((D2.k) jVarF.f6410b, q0VarT);
        }
        Iterator it2 = iVar.f1090d.iterator();
        while (it2.hasNext()) {
            q0 q0VarT2 = lVar.t((C2.h) it2.next());
            jVarF.d();
            D2.k.x((D2.k) jVarF.f6410b, q0VarT2);
        }
        D2.k kVar = (D2.k) jVarF.b();
        Integer numValueOf = Integer.valueOf(i);
        byte[] bArrD = kVar.d();
        String str = (String) this.f134b;
        X x3 = (X) this.f133a;
        x3.y0("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", str, numValueOf, bArrD);
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementCompileStatement = x3.h.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            B2.h hVar = ((C2.h) it3.next()).f1084a;
            if (hashSet.add(hVar)) {
                Object[] objArr = {str, AbstractC0156x.C(hVar.f315a), Integer.valueOf(i)};
                sQLiteStatementCompileStatement.clearBindings();
                X.x0(sQLiteStatementCompileStatement, objArr);
                sQLiteStatementCompileStatement.executeUpdateDelete();
                ((InterfaceC0007g) this.f137e).r(hVar.d());
            }
        }
        return iVar;
    }

    @Override // A2.D
    public void e(C2.i iVar, AbstractC0409l abstractC0409l) {
        abstractC0409l.getClass();
        this.f138f = abstractC0409l;
        M();
    }

    @Override // A2.D
    public void f(C2.i iVar) throws SQLException {
        X x3 = (X) this.f133a;
        SQLiteStatement sQLiteStatementCompileStatement = x3.h.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementCompileStatement2 = x3.h.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i = iVar.f1087a;
        Integer numValueOf = Integer.valueOf(i);
        String str = (String) this.f134b;
        sQLiteStatementCompileStatement.clearBindings();
        X.x0(sQLiteStatementCompileStatement, new Object[]{str, numValueOf});
        AbstractC0183a.N(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(iVar.f1087a));
        Iterator it = iVar.f1090d.iterator();
        while (it.hasNext()) {
            B2.h hVar = ((C2.h) it.next()).f1084a;
            Object[] objArr = {str, AbstractC0156x.C(hVar.f315a), Integer.valueOf(i)};
            sQLiteStatementCompileStatement2.clearBindings();
            X.x0(sQLiteStatementCompileStatement2, objArr);
            sQLiteStatementCompileStatement2.executeUpdateDelete();
            x3.f148f.d(hVar);
        }
    }

    @Override // A2.D
    public void g(AbstractC0409l abstractC0409l) {
        abstractC0409l.getClass();
        this.f138f = abstractC0409l;
        M();
    }

    @Override // A2.D
    public List h() {
        ArrayList arrayList = new ArrayList();
        C0009i c0009iZ0 = ((X) this.f133a).z0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        c0009iZ0.v(1000000, (String) this.f134b);
        Cursor cursorH0 = c0009iZ0.h0();
        while (cursorH0.moveToNext()) {
            try {
                arrayList.add(r(cursorH0.getBlob(1), cursorH0.getInt(0)));
            } catch (Throwable th) {
                if (cursorH0 != null) {
                    try {
                        cursorH0.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorH0.close();
        return arrayList;
    }

    @Override // A2.D
    public ArrayList i(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0156x.C(((B2.h) it.next()).f315a));
        }
        T t4 = new T((X) this.f133a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, (String) this.f134b), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (((Iterator) t4.f138f).hasNext()) {
            t4.D().C(new S(this, hashSet, arrayList2, 0));
        }
        if (t4.f135c > 1) {
            Collections.sort(arrayList2, new C0002b(4));
        }
        return arrayList2;
    }

    @Override // A2.D
    public C2.i j(int i) {
        C0009i c0009iZ0 = ((X) this.f133a).z0("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        c0009iZ0.v(1000000, (String) this.f134b, Integer.valueOf(i));
        Cursor cursorH0 = c0009iZ0.h0();
        try {
            if (!cursorH0.moveToFirst()) {
                cursorH0.close();
                return null;
            }
            C2.i iVarR = r(cursorH0.getBlob(0), i);
            cursorH0.close();
            return iVarR;
        } catch (Throwable th) {
            if (cursorH0 != null) {
                try {
                    cursorH0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void k(q2.i iVar) {
        if (((HashSet) this.f133a).contains(iVar.f9489a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f136d).add(iVar);
    }

    public void l() {
        View view = (View) this.f133a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((D3.b) this.f137e) != null) {
                if (((D3.b) this.f138f) == null) {
                    this.f138f = new D3.b();
                }
                D3.b bVar = (D3.b) this.f138f;
                bVar.f1342c = null;
                bVar.f1341b = false;
                bVar.f1343d = null;
                bVar.f1340a = false;
                WeakHashMap weakHashMap = M.S.f2363a;
                ColorStateList colorStateListG = M.H.g(view);
                if (colorStateListG != null) {
                    bVar.f1341b = true;
                    bVar.f1342c = colorStateListG;
                }
                PorterDuff.Mode modeH = M.H.h(view);
                if (modeH != null) {
                    bVar.f1340a = true;
                    bVar.f1343d = modeH;
                }
                if (bVar.f1341b || bVar.f1340a) {
                    l.r.e(background, bVar, view.getDrawableState());
                    return;
                }
            }
            D3.b bVar2 = (D3.b) this.f134b;
            if (bVar2 != null) {
                l.r.e(background, bVar2, view.getDrawableState());
                return;
            }
            D3.b bVar3 = (D3.b) this.f137e;
            if (bVar3 != null) {
                l.r.e(background, bVar3, view.getDrawableState());
            }
        }
    }

    public C0849a m() {
        if (((q2.d) this.f137e) != null) {
            return new C0849a((String) this.f134b, new HashSet((HashSet) this.f133a), new HashSet((HashSet) this.f136d), this.f135c, (q2.d) this.f137e, (HashSet) this.f138f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public boolean n(int i) {
        ArrayList arrayList = (ArrayList) this.f137e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0916a c0916a = (C0916a) arrayList.get(i5);
            int i6 = c0916a.f9945a;
            if (i6 == 8) {
                if (u(c0916a.f9948d, i5 + 1) == i) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = c0916a.f9946b;
                int i8 = c0916a.f9948d + i7;
                while (i7 < i8) {
                    if (u(i7, i5 + 1) == i) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void o() {
        ArrayList arrayList = (ArrayList) this.f137e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g1.i) this.f134b).p((C0916a) arrayList.get(i));
        }
        G(arrayList);
        this.f135c = 0;
    }

    public void p() {
        o();
        ArrayList arrayList = (ArrayList) this.f136d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0916a c0916a = (C0916a) arrayList.get(i);
            int i5 = c0916a.f9945a;
            g1.i iVar = (g1.i) this.f134b;
            if (i5 == 1) {
                iVar.p(c0916a);
                iVar.v(c0916a.f9946b, c0916a.f9948d);
            } else if (i5 == 2) {
                iVar.p(c0916a);
                int i6 = c0916a.f9946b;
                int i7 = c0916a.f9948d;
                RecyclerView recyclerView = (RecyclerView) iVar.f7594b;
                recyclerView.O(i6, i7, true);
                recyclerView.f4750l0 = true;
                recyclerView.f4745i0.f9974c += i7;
            } else if (i5 == 4) {
                iVar.p(c0916a);
                iVar.t(c0916a.f9947c, c0916a.f9946b, c0916a.f9948d);
            } else if (i5 == 8) {
                iVar.p(c0916a);
                iVar.w(c0916a.f9946b, c0916a.f9948d);
            }
        }
        G(arrayList);
        this.f135c = 0;
    }

    public C2.i r(byte[] bArr, int i) {
        try {
            int length = bArr.length;
            K2.c cVar = (K2.c) this.f136d;
            if (length < 1000000) {
                return cVar.q(D2.k.H(bArr));
            }
            ArrayList arrayList = new ArrayList();
            C0407k c0407k = AbstractC0409l.f6528b;
            arrayList.add(AbstractC0409l.k(bArr, 0, bArr.length));
            boolean z4 = true;
            while (z4) {
                int size = (arrayList.size() * 1000000) + 1;
                C0009i c0009iZ0 = ((X) this.f133a).z0("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                c0009iZ0.v(Integer.valueOf(size), 1000000, (String) this.f134b, Integer.valueOf(i));
                Cursor cursorH0 = c0009iZ0.h0();
                try {
                    if (cursorH0.moveToFirst()) {
                        byte[] blob = cursorH0.getBlob(0);
                        C0407k c0407k2 = AbstractC0409l.f6528b;
                        arrayList.add(AbstractC0409l.k(blob, 0, blob.length));
                        if (blob.length < 1000000) {
                            z4 = false;
                        }
                    }
                    cursorH0.close();
                } finally {
                }
            }
            int size2 = arrayList.size();
            return cVar.q(D2.k.G(size2 == 0 ? AbstractC0409l.f6528b : AbstractC0409l.g(arrayList.iterator(), size2)));
        } catch (com.google.protobuf.N e5) {
            AbstractC0183a.z("MutationBatch failed to parse: %s", e5);
            throw null;
        }
    }

    public void s(C0916a c0916a) {
        int i;
        L.e eVar;
        int i5 = c0916a.f9945a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = L(c0916a.f9946b, i5);
        int i6 = c0916a.f9946b;
        int i7 = c0916a.f9945a;
        if (i7 == 2) {
            i = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0916a);
            }
            i = 1;
        }
        int i8 = 1;
        int i9 = 1;
        while (true) {
            int i10 = c0916a.f9948d;
            eVar = (L.e) this.f133a;
            if (i8 >= i10) {
                break;
            }
            int iL2 = L((i * i8) + c0916a.f9946b, c0916a.f9945a);
            int i11 = c0916a.f9945a;
            if (i11 == 2 ? iL2 != iL : !(i11 == 4 && iL2 == iL + 1)) {
                C0916a c0916aA = A(c0916a.f9947c, i11, iL, i9);
                t(c0916aA, i6);
                c0916aA.f9947c = null;
                eVar.c(c0916aA);
                if (c0916a.f9945a == 4) {
                    i6 += i9;
                }
                i9 = 1;
                iL = iL2;
            } else {
                i9++;
            }
            i8++;
        }
        Object obj = c0916a.f9947c;
        c0916a.f9947c = null;
        eVar.c(c0916a);
        if (i9 > 0) {
            C0916a c0916aA2 = A(obj, c0916a.f9945a, iL, i9);
            t(c0916aA2, i6);
            c0916aA2.f9947c = null;
            eVar.c(c0916aA2);
        }
    }

    @Override // A2.D
    public void start() {
        Cursor cursorH0;
        ArrayList arrayList = new ArrayList();
        X x3 = (X) this.f133a;
        Cursor cursorH02 = x3.z0("SELECT uid FROM mutation_queues").h0();
        while (cursorH02.moveToNext()) {
            try {
                arrayList.add(cursorH02.getString(0));
            } finally {
                if (cursorH02 != null) {
                    try {
                        cursorH02.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        cursorH02.close();
        this.f135c = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C0009i c0009iZ0 = x3.z0("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            c0009iZ0.v(str);
            cursorH0 = c0009iZ0.h0();
            while (cursorH0.moveToNext()) {
                try {
                    this.f135c = Math.max(this.f135c, cursorH0.getInt(0));
                } finally {
                }
            }
            cursorH0.close();
        }
        this.f135c++;
        C0009i c0009iZ02 = x3.z0("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        c0009iZ02.v((String) this.f134b);
        cursorH0 = c0009iZ02.h0();
        try {
            if (!cursorH0.moveToFirst()) {
                cursorH0.close();
                M();
            } else {
                byte[] blob = cursorH0.getBlob(0);
                C0407k c0407k = AbstractC0409l.f6528b;
                this.f138f = AbstractC0409l.k(blob, 0, blob.length);
                cursorH0.close();
            }
        } finally {
        }
    }

    public void t(C0916a c0916a, int i) {
        g1.i iVar = (g1.i) this.f134b;
        iVar.p(c0916a);
        int i5 = c0916a.f9945a;
        if (i5 != 2) {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            iVar.t(c0916a.f9947c, i, c0916a.f9948d);
            return;
        }
        int i6 = c0916a.f9948d;
        RecyclerView recyclerView = (RecyclerView) iVar.f7594b;
        recyclerView.O(i, i6, true);
        recyclerView.f4750l0 = true;
        recyclerView.f4745i0.f9974c += i6;
    }

    public int u(int i, int i5) {
        ArrayList arrayList = (ArrayList) this.f137e;
        int size = arrayList.size();
        while (i5 < size) {
            C0916a c0916a = (C0916a) arrayList.get(i5);
            int i6 = c0916a.f9945a;
            if (i6 == 8) {
                int i7 = c0916a.f9946b;
                if (i7 == i) {
                    i = c0916a.f9948d;
                } else {
                    if (i7 < i) {
                        i--;
                    }
                    if (c0916a.f9948d <= i) {
                        i++;
                    }
                }
            } else {
                int i8 = c0916a.f9946b;
                if (i8 > i) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = c0916a.f9948d;
                    if (i < i8 + i9) {
                        return -1;
                    }
                    i -= i9;
                } else if (i6 == 1) {
                    i += c0916a.f9948d;
                }
            }
            i5++;
        }
        return i;
    }

    public ColorStateList v() {
        D3.b bVar = (D3.b) this.f134b;
        if (bVar != null) {
            return (ColorStateList) bVar.f1342c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        D3.b bVar = (D3.b) this.f134b;
        if (bVar != null) {
            return (PorterDuff.Mode) bVar.f1343d;
        }
        return null;
    }

    public void x(Task task) {
        w2.o oVar;
        if (this.f135c > 0) {
            Exception exception = task.getException();
            if ((exception instanceof w2.p) && ((oVar = ((w2.p) exception).f10950a) == w2.o.ABORTED || oVar == w2.o.ALREADY_EXISTS || oVar == w2.o.FAILED_PRECONDITION || !C0106i.a(oVar))) {
                this.f135c--;
                ((F2.p) this.f134b).a(new RunnableC0005e(this, 28));
                return;
            }
        }
        ((TaskCompletionSource) this.f138f).setException(task.getException());
    }

    public boolean y() {
        return ((ArrayList) this.f136d).size() > 0;
    }

    public void z(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.f133a;
        Context context = view.getContext();
        int[] iArr = AbstractC0489a.f6985z;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        View view2 = (View) this.f133a;
        Context context2 = view2.getContext();
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(view2, context2, iArr, attributeSet, (TypedArray) c0009iY.f205c, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f135c = typedArray.getResourceId(0, -1);
                l.r rVar = (l.r) this.f136d;
                Context context3 = view.getContext();
                int i5 = this.f135c;
                synchronized (rVar) {
                    colorStateListF = rVar.f8676a.f(context3, i5);
                }
                if (colorStateListF != null) {
                    H(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                M.H.q(view, c0009iY.F(1));
            }
            if (typedArray.hasValue(2)) {
                M.H.r(view, AbstractC0692h0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            c0009iY.e0();
        }
    }

    public T(Class cls, Class[] clsArr) {
        this.f134b = null;
        HashSet hashSet = new HashSet();
        this.f133a = hashSet;
        this.f136d = new HashSet();
        this.f135c = 0;
        this.f138f = new HashSet();
        hashSet.add(q2.q.a(cls));
        for (Class cls2 : clsArr) {
            p1.b.k(cls2, "Null interface");
            ((HashSet) this.f133a).add(q2.q.a(cls2));
        }
    }

    public T(X x3, String str, List list, ArrayList arrayList, String str2) {
        this.f135c = 0;
        this.f133a = x3;
        this.f134b = str;
        this.f137e = list;
        this.f136d = str2;
        this.f138f = arrayList.iterator();
    }
}
