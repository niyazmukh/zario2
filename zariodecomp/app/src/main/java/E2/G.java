package E2;

import A2.g0;
import B3.C0063m1;
import a.AbstractC0183a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l.AbstractC0692h0;
import l.H0;
import l.V0;
import q2.C0849a;
import q2.InterfaceC0850b;
import s2.d;
import t0.C0908O;
import v2.InterfaceC1001a;
import y2.EnumC1056e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\G.smali */
public final class G implements InterfaceC0850b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1412a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1413b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1414c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1415d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1416e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1417f;

    public G(l2.f fVar, FirebaseAuth firebaseAuth) {
        p2.v vVar = new p2.v();
        this.f1412a = new Object();
        this.f1413b = new HashMap();
        this.f1415d = fVar;
        this.f1416e = firebaseAuth;
        this.f1417f = vVar;
    }

    public static boolean i(int[] iArr, int i) {
        for (int i5 : iArr) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList j(Context context, int i) {
        int iC = V0.c(context, 2130903273);
        int iB = V0.b(context, 2130903270);
        int[] iArr = V0.f8523b;
        int[] iArr2 = V0.f8525d;
        int iB2 = D.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, V0.f8524c, V0.f8527f}, new int[]{iB, iB2, D.a.b(iC, i), i});
    }

    public static LayerDrawable l(H0 h02, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = h02.c(context, 2131165288);
        Drawable drawableC2 = h02.c(context, 2131165289);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void r(Drawable drawable, int i) {
        PorterDuff.Mode mode = l.r.f8674b;
        int[] iArr = AbstractC0692h0.f8590a;
        drawable.mutate().setColorFilter(l.r.c(i, mode));
    }

    @Override // q2.InterfaceC0850b
    public Object a(Class cls) {
        if (!((Set) this.f1412a).contains(q2.q.a(cls))) {
            throw new B0.c("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((InterfaceC0850b) this.f1417f).a(cls);
        if (!cls.equals(InterfaceC1001a.class)) {
            return objA;
        }
        return new q2.r();
    }

    @Override // q2.InterfaceC0850b
    public H2.b b(Class cls) {
        return e(q2.q.a(cls));
    }

    @Override // q2.InterfaceC0850b
    public Object c(q2.q qVar) {
        if (((Set) this.f1412a).contains(qVar)) {
            return ((InterfaceC0850b) this.f1417f).c(qVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // q2.InterfaceC0850b
    public q2.o d(q2.q qVar) {
        if (((Set) this.f1414c).contains(qVar)) {
            return ((InterfaceC0850b) this.f1417f).d(qVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // q2.InterfaceC0850b
    public H2.b e(q2.q qVar) {
        if (((Set) this.f1413b).contains(qVar)) {
            return ((InterfaceC0850b) this.f1417f).e(qVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // q2.InterfaceC0850b
    public q2.o f(Class cls) {
        return d(q2.q.a(cls));
    }

    @Override // q2.InterfaceC0850b
    public H2.b g(q2.q qVar) {
        if (((Set) this.f1416e).contains(qVar)) {
            return ((InterfaceC0850b) this.f1417f).g(qVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // q2.InterfaceC0850b
    public Set h(q2.q qVar) {
        if (((Set) this.f1415d).contains(qVar)) {
            return ((InterfaceC0850b) this.f1417f).h(qVar);
        }
        throw new B0.c("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    public A k(int i) {
        HashMap map = (HashMap) this.f1413b;
        A a5 = (A) map.get(Integer.valueOf(i));
        if (a5 != null) {
            return a5;
        }
        A a6 = new A();
        map.put(Integer.valueOf(i), a6);
        return a6;
    }

    public ColorStateList m(Context context, int i) {
        if (i == 2131165245) {
            return B.l.getColorStateList(context, 2131034133);
        }
        if (i == 2131165291) {
            return B.l.getColorStateList(context, 2131034136);
        }
        if (i != 2131165290) {
            if (i == 2131165233) {
                return j(context, V0.c(context, 2130903270));
            }
            if (i == 2131165227) {
                return j(context, 0);
            }
            if (i == 2131165232) {
                return j(context, V0.c(context, 2130903268));
            }
            if (i == 2131165286 || i == 2131165287) {
                return B.l.getColorStateList(context, 2131034135);
            }
            if (i((int[]) this.f1413b, i)) {
                return V0.d(context, 2130903274);
            }
            if (i((int[]) this.f1416e, i)) {
                return B.l.getColorStateList(context, 2131034132);
            }
            if (i((int[]) this.f1417f, i)) {
                return B.l.getColorStateList(context, 2131034131);
            }
            if (i == 2131165283) {
                return B.l.getColorStateList(context, 2131034134);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = V0.d(context, 2130903324);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = V0.f8523b;
            iArr2[0] = V0.b(context, 2130903324);
            iArr[1] = V0.f8526e;
            iArr2[1] = V0.c(context, 2130903272);
            iArr[2] = V0.f8527f;
            iArr2[2] = V0.c(context, 2130903324);
        } else {
            int[] iArr3 = V0.f8523b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = V0.f8526e;
            iArr2[1] = V0.c(context, 2130903272);
            iArr[2] = V0.f8527f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean n(int i) {
        return o(i) != null;
    }

    public g0 o(int i) {
        A a5 = (A) ((HashMap) this.f1413b).get(Integer.valueOf(i));
        if (a5 == null || a5.f1391a == 0) {
            return (g0) ((HashMap) ((C0063m1) this.f1412a).f906f).get(Integer.valueOf(i));
        }
        return null;
    }

    public void p(int i, B2.h hVar, B2.l lVar) {
        if (n(i)) {
            A aK = k(i);
            boolean zF = ((C0908O) ((C0063m1) this.f1412a).f903c).a(i).f9681a.f(hVar);
            HashMap map = aK.f1392b;
            if (zF) {
                EnumC1056e enumC1056e = EnumC1056e.f11086a;
                aK.f1393c = true;
                map.put(hVar, enumC1056e);
            } else {
                aK.f1393c = true;
                map.remove(hVar);
            }
            Set hashSet = (Set) ((HashMap) this.f1415d).get(hVar);
            if (hashSet == null) {
                hashSet = new HashSet();
                ((HashMap) this.f1415d).put(hVar, hashSet);
            }
            hashSet.add(Integer.valueOf(i));
            if (lVar != null) {
                ((HashMap) this.f1414c).put(hVar, lVar);
            }
        }
    }

    public void q(int i) {
        HashMap map = (HashMap) this.f1413b;
        AbstractC0183a.N(map.get(Integer.valueOf(i)) != null && ((A) map.get(Integer.valueOf(i))).f1391a == 0, "Should only reset active targets", new Object[0]);
        map.put(Integer.valueOf(i), new A());
        Iterator it = ((C0908O) ((C0063m1) this.f1412a).f903c).a(i).iterator();
        while (true) {
            d dVar = (d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return;
            } else {
                p(i, (B2.h) dVar.next(), null);
            }
        }
    }

    public Task s(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskContinueWithTask;
        if (zzac.zzc(str)) {
            str = "*";
        }
        Task taskT = t(str);
        if (bool.booleanValue() || taskT == null) {
            String str2 = zzac.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (taskContinueWithTask = t(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1416e;
                taskContinueWithTask = firebaseAuth.f6372e.zza(firebaseAuth.i, "RECAPTCHA_ENTERPRISE").continueWithTask(new S0.v(this, str2));
            }
            taskT = taskContinueWithTask;
        }
        return taskT.continueWithTask(new g1.i(this, recaptchaAction));
    }

    public Task t(String str) {
        Task task;
        synchronized (this.f1412a) {
            task = (Task) ((HashMap) this.f1413b).get(str);
        }
        return task;
    }

    public G(C0849a c0849a, InterfaceC0850b interfaceC0850b) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q2.i iVar : c0849a.f9470c) {
            int i = iVar.f9491c;
            boolean z4 = i == 0;
            int i5 = iVar.f9490b;
            q2.q qVar = iVar.f9489a;
            if (z4) {
                if (i5 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i == 2) {
                hashSet3.add(qVar);
            } else if (i5 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!c0849a.f9473f.isEmpty()) {
            hashSet.add(q2.q.a(InterfaceC1001a.class));
        }
        this.f1412a = Collections.unmodifiableSet(hashSet);
        this.f1413b = Collections.unmodifiableSet(hashSet2);
        this.f1414c = Collections.unmodifiableSet(hashSet3);
        this.f1415d = Collections.unmodifiableSet(hashSet4);
        this.f1416e = Collections.unmodifiableSet(hashSet5);
        this.f1417f = interfaceC0850b;
    }

    public G() {
        this.f1412a = new int[]{2131165301, 2131165299, 2131165225};
        this.f1413b = new int[]{2131165249, 2131165284, 2131165256, 2131165251, 2131165252, 2131165255, 2131165254};
        this.f1414c = new int[]{2131165298, 2131165300, 2131165242, 2131165294, 2131165295, 2131165296, 2131165297};
        this.f1415d = new int[]{2131165274, 2131165240, 2131165273};
        this.f1416e = new int[]{2131165292, 2131165302};
        this.f1417f = new int[]{2131165228, 2131165234, 2131165229, 2131165235};
    }

    public G(B2.f fVar, C0063m1 c0063m1) {
        this.f1413b = new HashMap();
        this.f1414c = new HashMap();
        this.f1415d = new HashMap();
        this.f1416e = new HashMap();
        this.f1417f = fVar;
        this.f1412a = c0063m1;
    }
}
