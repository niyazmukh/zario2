package S0;

import A2.D;
import A2.I;
import A2.InterfaceC0001a;
import A2.InterfaceC0007g;
import A2.J;
import A2.f0;
import J0.C0108b;
import M.Y;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.navigation.fragment.NavHostFragment;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.TaskCompletionSource;
import f4.C0524x;
import f4.E;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import g0.DialogInterfaceOnCancelListenerC0561m;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o0.C0767B;
import o0.C0779b;
import o0.x;
import o0.z;
import r.AbstractC0854a;
import u0.AbstractC0967h;
import u0.C0955C;
import x2.C1038d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\f.smali */
public abstract class f implements Y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2853a = 0;

    public static x A(z zVar) {
        kotlin.jvm.internal.i.e(zVar, "<this>");
        Iterator it = d4.g.l0(zVar.l(zVar.f9154p, true), C0779b.f9049l).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (x) next;
    }

    public static int B(double d5, double d6) {
        if (d5 < d6) {
            return -1;
        }
        if (d5 > d6) {
            return 1;
        }
        if (d5 == d6) {
            return 0;
        }
        if (Double.isNaN(d6)) {
            return !Double.isNaN(d5) ? 1 : 0;
        }
        return -1;
    }

    public static O3.g C(O3.g gVar, O3.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object L(X2.g r9, Y2.d r10, java.util.ArrayList r11, O3.d r12) {
        /*
            boolean r0 = r12 instanceof X2.f
            if (r0 == 0) goto L13
            r0 = r12
            X2.f r0 = (X2.f) r0
            int r1 = r0.f3830e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3830e = r1
            goto L18
        L13:
            X2.f r0 = new X2.f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f3829d
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3830e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            long r9 = r0.f3828c
            a.AbstractC0183a.m0(r12)
            goto Lb2
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.util.List r11 = r0.f3827b
            X2.g r9 = r0.f3826a
            a.AbstractC0183a.m0(r12)
            goto L5d
        L3d:
            a.AbstractC0183a.m0(r12)
            r0.f3826a = r9
            r0.f3827b = r11
            r0.f3830e = r4
            r12 = r9
            X2.o r12 = (X2.o) r12
            r12.getClass()
            X2.i r2 = new X2.i
            r4 = 0
            r2.<init>(r12, r10, r4)
            java.lang.Object r10 = r12.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r10 = (com.niyaz.zario.data.local.AppDatabase_Impl) r10
            java.lang.Object r12 = z2.C1071b.d(r10, r2, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            java.lang.Number r12 = (java.lang.Number) r12
            long r4 = r12.longValue()
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto Lb3
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = L3.l.a0(r11)
            r10.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        L76:
            boolean r12 = r11.hasNext()
            r2 = 0
            if (r12 == 0) goto L93
            java.lang.Object r12 = r11.next()
            Y2.f r12 = (Y2.f) r12
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r7 = 16381(0x3ffd, float:2.2955E-41)
            r8 = 0
            Y2.f r12 = Y2.f.a(r12, r6, r8, r2, r7)
            r10.add(r12)
            goto L76
        L93:
            r0.f3826a = r2
            r0.f3827b = r2
            r0.f3828c = r4
            r0.f3830e = r3
            X2.o r9 = (X2.o) r9
            r9.getClass()
            S0.r r11 = new S0.r
            r12 = 5
            r11.<init>(r12, r9, r10)
            java.lang.Object r9 = r9.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r9 = (com.niyaz.zario.data.local.AppDatabase_Impl) r9
            java.lang.Object r9 = z2.C1071b.d(r9, r11, r0)
            if (r9 != r1) goto Lb1
            return r1
        Lb1:
            r9 = r4
        Lb2:
            r4 = r9
        Lb3:
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.f.L(X2.g, Y2.d, java.util.ArrayList, O3.d):java.lang.Object");
    }

    public static boolean M(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static K3.c O(X3.a aVar) {
        K3.d[] dVarArr = K3.d.f2276a;
        K3.j jVar = K3.j.f2287a;
        K3.l lVar = new K3.l();
        lVar.f2289a = (kotlin.jvm.internal.j) aVar;
        lVar.f2290b = jVar;
        return lVar;
    }

    public static K3.h P(X3.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        return new K3.h(initializer);
    }

    public static Typeface Q(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, r(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static O3.i R(O3.g gVar, O3.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(gVar.getKey(), key) ? O3.j.f2661a : gVar;
    }

    public static MappedByteBuffer S(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = D.h.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static O3.i U(O3.g gVar, O3.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == O3.j.f2661a ? gVar : (O3.i) context.fold(gVar, O3.b.f2656c);
    }

    public static void X(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.c()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C.j(status));
        }
    }

    public static final q4.b Y(Socket socket) throws IOException {
        int i = q4.g.f9520a;
        q4.n nVar = new q4.n(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.i.d(outputStream, "getOutputStream()");
        return new q4.b(nVar, new q4.b(outputStream, nVar));
    }

    public static int Z(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final q4.c a0(Socket socket) throws IOException {
        int i = q4.g.f9520a;
        q4.n nVar = new q4.n(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.i.d(inputStream, "getInputStream()");
        return new q4.c(nVar, new q4.c(inputStream, nVar));
    }

    public static final Object c0(k4.r rVar, k4.r rVar2, X3.p pVar) throws Throwable {
        Object c0524x;
        Object objE;
        try {
            kotlin.jvm.internal.u.c(2, pVar);
            c0524x = pVar.invoke(rVar2, rVar);
        } catch (Throwable th) {
            c0524x = new C0524x(th, false);
        }
        P3.a aVar = P3.a.f2678a;
        if (c0524x == aVar || (objE = rVar.E(c0524x)) == E.f7012e) {
            return aVar;
        }
        if (objE instanceof C0524x) {
            throw ((C0524x) objE).f7107a;
        }
        return E.z(objE);
    }

    public static String d(int i, int i5, String str) {
        if (i < 0) {
            return AbstractC0183a.U("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return AbstractC0183a.U("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(B.a.g(i5, "negative size: "));
    }

    public static int d0(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void e(Object obj, String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(AbstractC0183a.U(str, obj));
        }
    }

    public static b4.f e0(int i, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new b4.f(i, i5 - 1, 1);
        }
        b4.f fVar = b4.f.f5345d;
        return b4.f.f5345d;
    }

    public static void f(String str, int i, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(AbstractC0183a.U(str, Integer.valueOf(i)));
        }
    }

    public static void f0(Parcel parcel, int i, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcel.writeBundle(bundle);
            w0(iV0, parcel);
        }
    }

    public static void g(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g0(Parcel parcel, int i, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcel.writeByteArray(bArr);
            w0(iV0, parcel);
        }
    }

    public static void h(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void h0(Parcel parcel, int i, Double d5) {
        if (d5 == null) {
            return;
        }
        u0(parcel, i, 8);
        parcel.writeDouble(d5.doubleValue());
    }

    public static void i(boolean z4, String str, long j5) {
        if (!z4) {
            throw new IllegalArgumentException(AbstractC0183a.U(str, Long.valueOf(j5)));
        }
    }

    public static void i0(Parcel parcel, int i, int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcel.writeIntArray(iArr);
            w0(iV0, parcel);
        }
    }

    public static final void j(WorkDatabase workDatabase, C0108b configuration, K0.m continuation) {
        int i;
        kotlin.jvm.internal.i.e(workDatabase, "workDatabase");
        kotlin.jvm.internal.i.e(configuration, "configuration");
        kotlin.jvm.internal.i.e(continuation, "continuation");
        ArrayList arrayList = new ArrayList(new L3.g(new K0.m[]{continuation}, true));
        int i5 = 0;
        while (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            List list = ((K0.m) arrayList.remove(L3.k.X(arrayList))).f2161e;
            kotlin.jvm.internal.i.d(list, "current.work");
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((J0.v) it.next()).f2067b.f2902j.h.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i5 += i;
        }
        if (i5 == 0) {
            return;
        }
        t tVarV = workDatabase.v();
        tVarV.getClass();
        C0955C c0955cK = C0955C.k(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = tVarV.f2920a;
        workDatabase_Impl.b();
        Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
        try {
            int i6 = cursorF.moveToFirst() ? cursorF.getInt(0) : 0;
            cursorF.close();
            c0955cK.l();
            int i7 = i6 + i5;
            int i8 = configuration.i;
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + i8 + ";\nalready enqueued count: " + i6 + ";\ncurrent enqueue operation count: " + i5 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        } catch (Throwable th) {
            cursorF.close();
            c0955cK.l();
            throw th;
        }
    }

    public static void j0(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        u0(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void k(int i, int i5) {
        String strU;
        if (i < 0 || i >= i5) {
            if (i < 0) {
                strU = AbstractC0183a.U("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(B.a.g(i5, "negative size: "));
                }
                strU = AbstractC0183a.U("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(strU);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void l0(Parcel parcel, int i, Long l4) {
        if (l4 == null) {
            return;
        }
        u0(parcel, i, 8);
        parcel.writeLong(l4.longValue());
    }

    public static void m(int i, int i5) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(d(i, i5, "index"));
        }
    }

    public static void m0(Parcel parcel, int i, Parcelable parcelable, int i5, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcelable.writeToParcel(parcel, i5);
            w0(iV0, parcel);
        }
    }

    public static void n(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? d(i, i6, "start index") : (i5 < 0 || i5 > i6) ? d(i5, i6, "end index") : AbstractC0183a.U("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    public static void n0(Parcel parcel, int i, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcel.writeString(str);
            w0(iV0, parcel);
        }
    }

    public static void o(int i, int i5, int i6) {
        if (i >= 0 && i5 <= i6) {
            if (i > i5) {
                throw new IllegalArgumentException(B.a.h("fromIndex: ", i, i5, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i5 + ", size: " + i6);
    }

    public static void o0(Parcel parcel, int i, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                u0(parcel, i, 0);
            }
        } else {
            int iV0 = v0(i, parcel);
            parcel.writeStringArray(strArr);
            w0(iV0, parcel);
        }
    }

    public static void p(Object obj, String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(AbstractC0183a.U(str, obj));
        }
    }

    public static void p0(Parcel parcel, int i, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int iV0 = v0(i, parcel);
        parcel.writeStringList(arrayList);
        w0(iV0, parcel);
    }

    public static void q(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void q0(Parcel parcel, int i, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int iV0 = v0(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        w0(iV0, parcel);
    }

    public static int r(int i, int i5, int i6) {
        return i < i5 ? i5 : i > i6 ? i6 : i;
    }

    public static void r0(Parcel parcel, int i, List list, boolean z4) {
        if (list == null) {
            if (z4) {
                u0(parcel, i, 0);
                return;
            }
            return;
        }
        int iV0 = v0(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        w0(iV0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(X2.g r6, O3.d r7) {
        /*
            boolean r0 = r7 instanceof X2.e
            if (r0 == 0) goto L13
            r0 = r7
            X2.e r0 = (X2.e) r0
            int r1 = r0.f3825c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3825c = r1
            goto L18
        L13:
            X2.e r0 = new X2.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3824b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3825c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            a.AbstractC0183a.m0(r7)
            goto L95
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            X2.g r6 = r0.f3823a
            a.AbstractC0183a.m0(r7)
            goto L7a
        L3b:
            X2.g r6 = r0.f3823a
            a.AbstractC0183a.m0(r7)
            goto L5f
        L41:
            a.AbstractC0183a.m0(r7)
            r0.f3823a = r6
            r0.f3825c = r5
            r7 = r6
            X2.o r7 = (X2.o) r7
            r7.getClass()
            X2.k r2 = new X2.k
            r5 = 1
            r2.<init>(r7, r5)
            java.lang.Object r7 = r7.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r7 = (com.niyaz.zario.data.local.AppDatabase_Impl) r7
            java.lang.Object r7 = z2.C1071b.d(r7, r2, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r0.f3823a = r6
            r0.f3825c = r4
            r7 = r6
            X2.o r7 = (X2.o) r7
            r7.getClass()
            X2.k r2 = new X2.k
            r4 = 0
            r2.<init>(r7, r4)
            java.lang.Object r7 = r7.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r7 = (com.niyaz.zario.data.local.AppDatabase_Impl) r7
            java.lang.Object r7 = z2.C1071b.d(r7, r2, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            r7 = 0
            r0.f3823a = r7
            r0.f3825c = r3
            X2.o r6 = (X2.o) r6
            r6.getClass()
            X2.k r7 = new X2.k
            r2 = 2
            r7.<init>(r6, r2)
            java.lang.Object r6 = r6.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r6 = (com.niyaz.zario.data.local.AppDatabase_Impl) r6
            java.lang.Object r6 = z2.C1071b.d(r6, r7, r0)
            if (r6 != r1) goto L95
            return r1
        L95:
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.f.s(X2.g, O3.d):java.lang.Object");
    }

    public static Status s0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? t0((String) listAsList.get(0), (String) listAsList.get(1)) : t0((String) listAsList.get(0), null);
    }

    public static final void t(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0156x.c(th, th2);
            }
        }
    }

    public static Status t0(String str, String str2) {
        int i;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i = 17038;
                break;
            case "INVALID_OOB_CODE":
                i = 17030;
                break;
            case "MISSING_EMAIL":
                i = 17034;
                break;
            case "INVALID_CODE":
                i = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i = 17214;
                break;
            case "TOKEN_EXPIRED":
                i = 17021;
                break;
            case "INVALID_TENANT_ID":
                i = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i = 17094;
                break;
            case "INVALID_CERT_HASH":
                i = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i = 17084;
                break;
            case "MISSING_PASSWORD":
                i = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i = 17056;
                break;
            case "WEAK_PASSWORD":
                i = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i = 17089;
                break;
            case "INVALID_SENDER":
                i = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i = 17095;
                break;
            case "EMAIL_EXISTS":
                i = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i = 17000;
                break;
            case "INVALID_PASSWORD":
                i = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i = 17202;
                break;
            case "SESSION_EXPIRED":
                i = 17051;
                break;
            case "MISSING_CODE":
                i = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i = 17201;
                break;
            case "USER_DISABLED":
                i = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        return i == 17499 ? str2 != null ? new Status(i, AbstractC0854a.c(str, ":", str2), null, null) : new Status(i, str, null, null) : new Status(i, str2, null, null);
    }

    public static long u(long j5, long j6) {
        return j5 < j6 ? j6 : j5;
    }

    public static void u0(Parcel parcel, int i, int i5) {
        parcel.writeInt(i | (i5 << 16));
    }

    public static long v(long j5, long j6) {
        return j5 > j6 ? j6 : j5;
    }

    public static int v0(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int w(int i, int i5, int i6) {
        if (i5 <= i6) {
            return i < i5 ? i5 : i > i6 ? i6 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + '.');
    }

    public static void w0(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final R3.b y(Enum[] entries) {
        kotlin.jvm.internal.i.e(entries, "entries");
        return new R3.b(entries);
    }

    public static final C0767B z(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        Dialog dialog;
        Window window;
        kotlin.jvm.internal.i.e(abstractComponentCallbacksC0567t, "<this>");
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = abstractComponentCallbacksC0567t; abstractComponentCallbacksC0567t2 != null; abstractComponentCallbacksC0567t2 = abstractComponentCallbacksC0567t2.f7548z) {
            if (abstractComponentCallbacksC0567t2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0567t2).Y();
            }
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = abstractComponentCallbacksC0567t2.p().f7350x;
            if (abstractComponentCallbacksC0567t3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC0567t3).Y();
            }
        }
        View view = abstractComponentCallbacksC0567t.f7512J;
        if (view != null) {
            return r1.d.u(view);
        }
        View decorView = null;
        DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = abstractComponentCallbacksC0567t instanceof DialogInterfaceOnCancelListenerC0561m ? (DialogInterfaceOnCancelListenerC0561m) abstractComponentCallbacksC0567t : null;
        if (dialogInterfaceOnCancelListenerC0561m != null && (dialog = dialogInterfaceOnCancelListenerC0561m.f7481l0) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return r1.d.u(decorView);
        }
        throw new IllegalStateException(B.a.j("Fragment ", abstractComponentCallbacksC0567t, " does not have a NavController set"));
    }

    public abstract InterfaceC0001a D(C1038d c1038d);

    public abstract InterfaceC0007g E(C1038d c1038d);

    public abstract D F(C1038d c1038d, InterfaceC0007g interfaceC0007g);

    public abstract A2.E G();

    public abstract I H();

    public abstract J I();

    public g1.i J(AbstractActivityC0570w abstractActivityC0570w, Object obj) {
        return null;
    }

    public abstract f0 K();

    public abstract boolean N();

    public abstract Object T(Intent intent, int i);

    public abstract Object V(String str, F2.q qVar);

    public abstract void W(String str, Runnable runnable);

    @Override // M.Y
    public void b(View view) {
    }

    public abstract void b0();

    @Override // M.Y
    public void c() {
    }

    public abstract void k0(byte[] bArr, int i, int i5);

    public abstract Intent x(AbstractActivityC0570w abstractActivityC0570w, Object obj);
}
