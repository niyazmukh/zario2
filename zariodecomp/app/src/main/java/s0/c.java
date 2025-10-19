package S0;

import A2.C0003c;
import J0.w;
import J0.y;
import J0.z;
import N2.AbstractC0156x;
import N2.j0;
import android.animation.Animator;
import android.database.Cursor;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.animation.Animation;
import androidx.lifecycle.G;
import androidx.work.impl.WorkDatabase_Impl;
import d0.C0442a;
import h1.C0591d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.AbstractC0817a;
import q.C0828e;
import q.C0834k;
import s2.C0870e;
import t0.g0;
import t0.r0;
import u0.AbstractC0967h;
import u0.C0955C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\c.smali */
public final class c implements z, M.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2846a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2847b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2848c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2846a = i;
        this.f2847b = obj;
        this.f2848c = obj2;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z4) {
        c0.u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (c0.u[]) editable.getSpans(selectionStart, selectionEnd, c0.u.class)) != null && uVarArr.length > 0) {
            for (c0.u uVar : uVarArr) {
                int spanStart = editable.getSpanStart(uVar);
                int spanEnd = editable.getSpanEnd(uVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static String u(q4.d dVar) {
        long j5 = dVar.f9515b;
        if (j5 <= 64) {
            return dVar.q().c();
        }
        return dVar.r((int) Math.min(j5, 64L)).c() + "...";
    }

    public void a(g0 g0Var, M.q qVar) {
        C0834k c0834k = (C0834k) this.f2847b;
        r0 r0VarA = (r0) c0834k.getOrDefault(g0Var, null);
        if (r0VarA == null) {
            r0VarA = r0.a();
            c0834k.put(g0Var, r0VarA);
        }
        r0VarA.f10112c = qVar;
        r0VarA.f10110a |= 8;
    }

    public boolean b(B2.h hVar) {
        s2.d dVarG = ((C0870e) this.f2847b).g(new C0003c(hVar, 0));
        if (((Iterator) dVarG.f9680b).hasNext()) {
            return ((C0003c) dVarG.next()).f172a.equals(hVar);
        }
        return false;
    }

    public ArrayList d(String str) {
        C0955C c0955cK = C0955C.k(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c0955cK.f(1);
        } else {
            c0955cK.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2847b;
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

    public boolean e(CharSequence charSequence, int i, int i5, c0.n nVar) {
        if (nVar.f5372c == 0) {
            c0.c cVar = (c0.c) this.f2848c;
            C0442a c0442aC = nVar.c();
            int iA = c0442aC.a(8);
            if (iA != 0) {
                ((ByteBuffer) c0442aC.f2436d).getShort(iA + c0442aC.f2433a);
            }
            cVar.getClass();
            ThreadLocal threadLocal = c0.c.f5347b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i5) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar.f5348a;
            String string = sb.toString();
            int i6 = D.e.a;
            nVar.f5372c = D.d.a(textPaint, string) ? 2 : 1;
        }
        return nVar.f5372c == 2;
    }

    public boolean f() {
        return ((Logger) this.f2847b).isLoggable((Level) this.f2848c);
    }

    public void g(int i, int i5, q4.d dVar, int i6, boolean z4) {
        if (f()) {
            ((Logger) this.f2847b).log((Level) this.f2848c, B.a.w(i) + " DATA: streamId=" + i5 + " endStream=" + z4 + " length=" + i6 + " bytes=" + u(dVar));
        }
    }

    public void h(int i, int i5, E3.a aVar, q4.f fVar) {
        if (f()) {
            StringBuilder sb = new StringBuilder();
            sb.append(B.a.w(i));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i5);
            sb.append(" errorCode=");
            sb.append(aVar);
            sb.append(" length=");
            sb.append(fVar.b());
            sb.append(" bytes=");
            q4.d dVar = new q4.d();
            fVar.l(dVar, fVar.b());
            sb.append(u(dVar));
            ((Logger) this.f2847b).log((Level) this.f2848c, sb.toString());
        }
    }

    public void i(int i, long j5) {
        if (f()) {
            ((Logger) this.f2847b).log((Level) this.f2848c, B.a.w(i) + " PING: ack=false bytes=" + j5);
        }
    }

    public void j(int i, int i5, E3.a aVar) {
        if (f()) {
            ((Logger) this.f2847b).log((Level) this.f2848c, B.a.w(i) + " RST_STREAM: streamId=" + i5 + " errorCode=" + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // M.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M.u0 k(android.view.View r14, M.u0 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2848c
            Q1.n r0 = (Q1.n) r0
            int r1 = r0.f2807a
            java.lang.Object r13 = r13.f2847b
            F1.d r13 = (F1.d) r13
            M.s0 r2 = r15.f2427a
            r3 = 7
            D.c r3 = r2.f(r3)
            r4 = 32
            D.c r2 = r2.f(r4)
            int r4 = r3.f1266b
            java.lang.Object r5 = r13.f1671b
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r5
            r5.f5862w = r4
            boolean r4 = Q1.k.g(r14)
            int r6 = r14.getPaddingBottom()
            int r7 = r14.getPaddingLeft()
            int r8 = r14.getPaddingRight()
            boolean r9 = r5.f5854o
            if (r9 == 0) goto L3c
            int r6 = r15.a()
            r5.f5861v = r6
            int r10 = r0.f2809c
            int r6 = r6 + r10
        L3c:
            int r0 = r0.f2808b
            boolean r10 = r5.f5855p
            int r11 = r3.f1265a
            if (r10 == 0) goto L4a
            if (r4 == 0) goto L48
            r7 = r0
            goto L49
        L48:
            r7 = r1
        L49:
            int r7 = r7 + r11
        L4a:
            boolean r10 = r5.f5856q
            int r12 = r3.f1267c
            if (r10 == 0) goto L56
            if (r4 == 0) goto L53
            goto L54
        L53:
            r1 = r0
        L54:
            int r8 = r1 + r12
        L56:
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            boolean r1 = r5.f5858s
            r4 = 1
            if (r1 == 0) goto L69
            int r1 = r0.leftMargin
            if (r1 == r11) goto L69
            r0.leftMargin = r11
            r1 = r4
            goto L6a
        L69:
            r1 = 0
        L6a:
            boolean r10 = r5.f5859t
            if (r10 == 0) goto L75
            int r10 = r0.rightMargin
            if (r10 == r12) goto L75
            r0.rightMargin = r12
            r1 = r4
        L75:
            boolean r10 = r5.f5860u
            if (r10 == 0) goto L82
            int r10 = r0.topMargin
            int r3 = r3.f1266b
            if (r10 == r3) goto L82
            r0.topMargin = r3
            goto L83
        L82:
            r4 = r1
        L83:
            if (r4 == 0) goto L88
            r14.setLayoutParams(r0)
        L88:
            int r0 = r14.getPaddingTop()
            r14.setPadding(r7, r0, r8, r6)
            boolean r13 = r13.f1670a
            if (r13 == 0) goto L97
            int r14 = r2.f1268d
            r5.f5852m = r14
        L97:
            if (r9 != 0) goto L9b
            if (r13 == 0) goto L9e
        L9b:
            r5.I()
        L9e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.c.k(android.view.View, M.u0):M.u0");
    }

    public void l(int i, E2.j jVar) {
        if (f()) {
            StringBuilder sb = new StringBuilder();
            sb.append(B.a.w(i));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(C3.n.class);
            for (C3.n nVar : C3.n.values()) {
                if (jVar.b(nVar.f1231a)) {
                    enumMap.put((EnumMap) nVar, (C3.n) Integer.valueOf(((int[]) jVar.f1460c)[nVar.f1231a]));
                }
            }
            sb.append(enumMap.toString());
            ((Logger) this.f2847b).log((Level) this.f2848c, sb.toString());
        }
    }

    public void m(int i, int i5, long j5) {
        if (f()) {
            ((Logger) this.f2847b).log((Level) this.f2848c, B.a.w(i) + " WINDOW_UPDATE: streamId=" + i5 + " windowSizeIncrement=" + j5);
        }
    }

    public void n(AbstractC0156x abstractC0156x) {
        ((G) this.f2847b).h(abstractC0156x);
        boolean z4 = abstractC0156x instanceof y;
        U0.k kVar = (U0.k) this.f2848c;
        if (z4) {
            kVar.j((y) abstractC0156x);
        } else if (abstractC0156x instanceof w) {
            kVar.k(((w) abstractC0156x).f2069d);
        }
    }

    public M.q o(g0 g0Var, int i) {
        r0 r0Var;
        M.q qVar;
        C0834k c0834k = (C0834k) this.f2847b;
        int iE = c0834k.e(g0Var);
        if (iE >= 0 && (r0Var = (r0) c0834k.j(iE)) != null) {
            int i5 = r0Var.f10110a;
            if ((i5 & i) != 0) {
                int i6 = i5 & (~i);
                r0Var.f10110a = i6;
                if (i == 4) {
                    qVar = r0Var.f10111b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    qVar = r0Var.f10112c;
                }
                if ((i6 & 12) == 0) {
                    c0834k.i(iE);
                    r0Var.f10110a = 0;
                    r0Var.f10111b = null;
                    r0Var.f10112c = null;
                    r0.f10109d.c(r0Var);
                }
                return qVar;
            }
        }
        return null;
    }

    public C0870e p(int i) {
        s2.d dVarG = ((C0870e) this.f2848c).g(new C0003c(B2.h.b(), i));
        C0870e c0870eF = B2.h.f314c;
        while (((Iterator) dVarG.f9680b).hasNext()) {
            C0003c c0003c = (C0003c) dVarG.next();
            if (c0003c.f173b != i) {
                break;
            }
            c0870eF = c0870eF.f(c0003c.f172a);
        }
        return c0870eF;
    }

    public void q(g0 g0Var) {
        r0 r0Var = (r0) ((C0834k) this.f2847b).getOrDefault(g0Var, null);
        if (r0Var == null) {
            return;
        }
        r0Var.f10110a &= -2;
    }

    public C0870e r(int i) {
        s2.d dVarG = ((C0870e) this.f2848c).g(new C0003c(B2.h.b(), i));
        C0870e c0870eF = B2.h.f314c;
        while (((Iterator) dVarG.f9680b).hasNext()) {
            C0003c c0003c = (C0003c) dVarG.next();
            if (c0003c.f173b != i) {
                break;
            }
            c0870eF = c0870eF.f(c0003c.f172a);
            this.f2847b = ((C0870e) this.f2847b).h(c0003c);
            this.f2848c = ((C0870e) this.f2848c).h(c0003c);
        }
        return c0870eF;
    }

    public void s(g0 g0Var) {
        C0828e c0828e = (C0828e) this.f2848c;
        int iF = c0828e.f() - 1;
        while (true) {
            if (iF < 0) {
                break;
            }
            if (g0Var == c0828e.g(iF)) {
                Object[] objArr = c0828e.f9408c;
                Object obj = objArr[iF];
                Object obj2 = C0828e.f9405e;
                if (obj != obj2) {
                    objArr[iF] = obj2;
                    c0828e.f9406a = true;
                }
            } else {
                iF--;
            }
        }
        r0 r0Var = (r0) ((C0834k) this.f2847b).remove(g0Var);
        if (r0Var != null) {
            r0Var.f10110a = 0;
            r0Var.f10111b = null;
            r0Var.f10112c = null;
            r0.f10109d.c(r0Var);
        }
    }

    public void t(int i, int i5, int i6, int i7) {
        AbstractC0817a abstractC0817a = (AbstractC0817a) this.f2848c;
        abstractC0817a.f9295d.set(i, i5, i6, i7);
        Rect rect = abstractC0817a.f9294c;
        super/*android.view.View*/.setPadding(i + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
    }

    public String toString() {
        switch (this.f2846a) {
            case 4:
                return "Request{url=" + ((F3.a) this.f2847b) + '}';
            default:
                return super.toString();
        }
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f2846a = 0;
        this.f2847b = workDatabase_Impl;
        this.f2848c = new b(workDatabase_Impl, 0);
    }

    public c(v vVar) {
        this.f2846a = 4;
        this.f2847b = (F3.a) vVar.f2935b;
        K2.c cVar = (K2.c) vVar.f2936c;
        cVar.getClass();
        this.f2848c = new g1.i(cVar);
    }

    public c(int i) {
        this.f2846a = i;
        switch (i) {
            case 2:
                this.f2847b = new C0870e(Collections.emptyList(), C0003c.f170c);
                this.f2848c = new C0870e(Collections.emptyList(), C0003c.f171d);
                break;
            case 5:
                this.f2847b = new G();
                this.f2848c = new U0.k();
                n(z.h);
                break;
            case 8:
                C0591d c0591d = C0591d.f7631d;
                this.f2847b = new SparseIntArray();
                this.f2848c = c0591d;
                break;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                this.f2847b = new C0834k();
                this.f2848c = new C0828e();
                break;
        }
    }

    public c(Level level) {
        this.f2846a = 3;
        Logger logger = Logger.getLogger(C3.m.class.getName());
        f.l(level, "level");
        this.f2848c = level;
        f.l(logger, "logger");
        this.f2847b = logger;
    }

    public c(i iVar, J3.c cVar, c0.c cVar2) {
        this.f2846a = 7;
        this.f2847b = iVar;
        this.f2848c = cVar2;
    }

    public c(Animation animation) {
        this.f2846a = 9;
        this.f2847b = animation;
        this.f2848c = null;
    }

    public c(Animator animator) {
        this.f2846a = 9;
        this.f2847b = null;
        this.f2848c = animator;
    }

    public c(AbstractC0817a abstractC0817a) {
        this.f2846a = 10;
        this.f2848c = abstractC0817a;
    }
}
