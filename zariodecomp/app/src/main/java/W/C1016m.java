package w;

import N2.j0;
import N2.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC0854a;
import s.AbstractC0863a;
import u.C0951a;

/* renamed from: w.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\m.smali */
public final class C1016m {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10859d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f10860e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10861a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10862b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10863c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10860e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(C1004a c1004a, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1004a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i5 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC1018p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1004a.isInEditMode() && (c1004a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1004a.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f4331q;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f4331q.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = iIntValue;
            i++;
            i5++;
        }
        return i5 != strArrSplit.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static C1011h d(Context context, AttributeSet attributeSet) {
        C1011h c1011h = new C1011h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1019q.f10864a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C1014k c1014k = c1011h.f10776b;
            C1013j c1013j = c1011h.f10777c;
            C1015l c1015l = c1011h.f10779e;
            C1012i c1012i = c1011h.f10778d;
            if (index != 1 && 23 != index && 24 != index) {
                c1013j.getClass();
                c1012i.getClass();
                c1015l.getClass();
            }
            SparseIntArray sparseIntArray = f10860e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1012i.f10827o = f(typedArrayObtainStyledAttributes, index, c1012i.f10827o);
                    break;
                case 2:
                    c1012i.f10787F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10787F);
                    break;
                case 3:
                    c1012i.f10826n = f(typedArrayObtainStyledAttributes, index, c1012i.f10826n);
                    break;
                case 4:
                    c1012i.f10825m = f(typedArrayObtainStyledAttributes, index, c1012i.f10825m);
                    break;
                case 5:
                    c1012i.f10834v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1012i.f10838z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1012i.f10838z);
                    break;
                case 7:
                    c1012i.f10782A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1012i.f10782A);
                    break;
                case 8:
                    c1012i.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.G);
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    c1012i.f10831s = f(typedArrayObtainStyledAttributes, index, c1012i.f10831s);
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    c1012i.f10830r = f(typedArrayObtainStyledAttributes, index, c1012i.f10830r);
                    break;
                case 11:
                    c1012i.f10792L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10792L);
                    break;
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    c1012i.f10793M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10793M);
                    break;
                case 13:
                    c1012i.f10789I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10789I);
                    break;
                case 14:
                    c1012i.f10791K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10791K);
                    break;
                case 15:
                    c1012i.f10794N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10794N);
                    break;
                case 16:
                    c1012i.f10790J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10790J);
                    break;
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    c1012i.f10812d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1012i.f10812d);
                    break;
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    c1012i.f10814e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1012i.f10814e);
                    break;
                case 19:
                    c1012i.f10816f = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10816f);
                    break;
                case 20:
                    c1012i.f10832t = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10832t);
                    break;
                case 21:
                    c1012i.f10810c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1012i.f10810c);
                    break;
                case 22:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, c1014k.f10844a);
                    c1014k.f10844a = i5;
                    c1014k.f10844a = f10859d[i5];
                    break;
                case 23:
                    c1012i.f10808b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1012i.f10808b);
                    break;
                case 24:
                    c1012i.f10784C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10784C);
                    break;
                case 25:
                    c1012i.f10818g = f(typedArrayObtainStyledAttributes, index, c1012i.f10818g);
                    break;
                case 26:
                    c1012i.h = f(typedArrayObtainStyledAttributes, index, c1012i.h);
                    break;
                case 27:
                    c1012i.f10783B = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10783B);
                    break;
                case 28:
                    c1012i.f10785D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10785D);
                    break;
                case 29:
                    c1012i.i = f(typedArrayObtainStyledAttributes, index, c1012i.i);
                    break;
                case 30:
                    c1012i.f10822j = f(typedArrayObtainStyledAttributes, index, c1012i.f10822j);
                    break;
                case 31:
                    c1012i.f10788H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10788H);
                    break;
                case 32:
                    c1012i.f10828p = f(typedArrayObtainStyledAttributes, index, c1012i.f10828p);
                    break;
                case 33:
                    c1012i.f10829q = f(typedArrayObtainStyledAttributes, index, c1012i.f10829q);
                    break;
                case 34:
                    c1012i.f10786E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10786E);
                    break;
                case 35:
                    c1012i.f10824l = f(typedArrayObtainStyledAttributes, index, c1012i.f10824l);
                    break;
                case 36:
                    c1012i.f10823k = f(typedArrayObtainStyledAttributes, index, c1012i.f10823k);
                    break;
                case 37:
                    c1012i.f10833u = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10833u);
                    break;
                case 38:
                    c1011h.f10775a = typedArrayObtainStyledAttributes.getResourceId(index, c1011h.f10775a);
                    break;
                case 39:
                    c1012i.f10796P = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10796P);
                    break;
                case 40:
                    c1012i.f10795O = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10795O);
                    break;
                case 41:
                    c1012i.f10797Q = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10797Q);
                    break;
                case 42:
                    c1012i.f10798R = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10798R);
                    break;
                case 43:
                    c1014k.f10846c = typedArrayObtainStyledAttributes.getFloat(index, c1014k.f10846c);
                    break;
                case 44:
                    c1015l.f10857k = true;
                    c1015l.f10858l = typedArrayObtainStyledAttributes.getDimension(index, c1015l.f10858l);
                    break;
                case 45:
                    c1015l.f10850b = typedArrayObtainStyledAttributes.getFloat(index, c1015l.f10850b);
                    break;
                case 46:
                    c1015l.f10851c = typedArrayObtainStyledAttributes.getFloat(index, c1015l.f10851c);
                    break;
                case 47:
                    c1015l.f10852d = typedArrayObtainStyledAttributes.getFloat(index, c1015l.f10852d);
                    break;
                case 48:
                    c1015l.f10853e = typedArrayObtainStyledAttributes.getFloat(index, c1015l.f10853e);
                    break;
                case 49:
                    c1015l.f10854f = typedArrayObtainStyledAttributes.getDimension(index, c1015l.f10854f);
                    break;
                case 50:
                    c1015l.f10855g = typedArrayObtainStyledAttributes.getDimension(index, c1015l.f10855g);
                    break;
                case 51:
                    c1015l.h = typedArrayObtainStyledAttributes.getDimension(index, c1015l.h);
                    break;
                case 52:
                    c1015l.i = typedArrayObtainStyledAttributes.getDimension(index, c1015l.i);
                    break;
                case 53:
                    c1015l.f10856j = typedArrayObtainStyledAttributes.getDimension(index, c1015l.f10856j);
                    break;
                case 54:
                    c1012i.f10799S = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10799S);
                    break;
                case 55:
                    c1012i.f10800T = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10800T);
                    break;
                case 56:
                    c1012i.f10801U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10801U);
                    break;
                case 57:
                    c1012i.f10802V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10802V);
                    break;
                case 58:
                    c1012i.f10803W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10803W);
                    break;
                case 59:
                    c1012i.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.X);
                    break;
                case 60:
                    c1015l.f10849a = typedArrayObtainStyledAttributes.getFloat(index, c1015l.f10849a);
                    break;
                case 61:
                    c1012i.f10835w = f(typedArrayObtainStyledAttributes, index, c1012i.f10835w);
                    break;
                case 62:
                    c1012i.f10836x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10836x);
                    break;
                case 63:
                    c1012i.f10837y = typedArrayObtainStyledAttributes.getFloat(index, c1012i.f10837y);
                    break;
                case 64:
                    c1013j.f10840a = f(typedArrayObtainStyledAttributes, index, c1013j.f10840a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c1013j.getClass();
                        break;
                    } else {
                        String str = AbstractC0863a.f9666a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c1013j.getClass();
                        break;
                    }
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1013j.getClass();
                    break;
                case 67:
                    c1013j.f10843d = typedArrayObtainStyledAttributes.getFloat(index, c1013j.f10843d);
                    break;
                case 68:
                    c1014k.f10847d = typedArrayObtainStyledAttributes.getFloat(index, c1014k.f10847d);
                    break;
                case 69:
                    c1012i.f10804Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1012i.f10805Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c1012i.f10807a0 = typedArrayObtainStyledAttributes.getInt(index, c1012i.f10807a0);
                    break;
                case 73:
                    c1012i.f10809b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1012i.f10809b0);
                    break;
                case 74:
                    c1012i.f10815e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c1012i.f10821i0 = typedArrayObtainStyledAttributes.getBoolean(index, c1012i.f10821i0);
                    break;
                case 76:
                    c1013j.f10841b = typedArrayObtainStyledAttributes.getInt(index, c1013j.f10841b);
                    break;
                case 77:
                    c1012i.f10817f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1014k.f10845b = typedArrayObtainStyledAttributes.getInt(index, c1014k.f10845b);
                    break;
                case 79:
                    c1013j.f10842c = typedArrayObtainStyledAttributes.getFloat(index, c1013j.f10842c);
                    break;
                case 80:
                    c1012i.f10819g0 = typedArrayObtainStyledAttributes.getBoolean(index, c1012i.f10819g0);
                    break;
                case 81:
                    c1012i.f10820h0 = typedArrayObtainStyledAttributes.getBoolean(index, c1012i.f10820h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1011h;
    }

    public static int f(TypedArray typedArray, int i, int i5) {
        int resourceId = typedArray.getResourceId(i, i5);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        String resourceEntryName;
        C1016m c1016m = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c1016m.f10863c;
        HashSet hashSet = new HashSet(map2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1016m.f10862b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1011h c1011h = (C1011h) map2.get(Integer.valueOf(id));
                        if (childAt instanceof C1004a) {
                            c1011h.f10778d.f10811c0 = 1;
                        }
                        int i6 = c1011h.f10778d.f10811c0;
                        if (i6 != -1 && i6 == 1) {
                            C1004a c1004a = (C1004a) childAt;
                            c1004a.setId(id);
                            C1012i c1012i = c1011h.f10778d;
                            c1004a.setType(c1012i.f10807a0);
                            c1004a.setMargin(c1012i.f10809b0);
                            c1004a.setAllowsGoneWidget(c1012i.f10821i0);
                            int[] iArr = c1012i.f10813d0;
                            if (iArr != null) {
                                c1004a.setReferencedIds(iArr);
                            } else {
                                String str = c1012i.f10815e0;
                                if (str != null) {
                                    int[] iArrC = c(c1004a, str);
                                    c1012i.f10813d0 = iArrC;
                                    c1004a.setReferencedIds(iArrC);
                                }
                            }
                        }
                        C1008e c1008e = (C1008e) childAt.getLayoutParams();
                        c1008e.a();
                        c1011h.a(c1008e);
                        HashMap map3 = c1011h.f10780f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            C1005b c1005b = (C1005b) map3.get(str2);
                            String strB = AbstractC0854a.b("set", str2);
                            int i7 = childCount;
                            try {
                                switch (t.h.c(c1005b.f10691a)) {
                                    case 0:
                                        map = map3;
                                        cls.getMethod(strB, Integer.TYPE).invoke(childAt, Integer.valueOf(c1005b.f10692b));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(strB, Float.TYPE).invoke(childAt, Float.valueOf(c1005b.f10693c));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(strB, Integer.TYPE).invoke(childAt, Integer.valueOf(c1005b.f10696f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strB, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c1005b.f10696f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e5) {
                                            e = e5;
                                            StringBuilder sbO = B.a.o(" Custom Attribute \"", str2, "\" not found on ");
                                            sbO.append(cls.getName());
                                            Log.e("TransitionLayout", sbO.toString());
                                            e.printStackTrace();
                                            childCount = i7;
                                            map3 = map;
                                        } catch (NoSuchMethodException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strB);
                                            childCount = i7;
                                            map3 = map;
                                        } catch (InvocationTargetException e7) {
                                            e = e7;
                                            StringBuilder sbO2 = B.a.o(" Custom Attribute \"", str2, "\" not found on ");
                                            sbO2.append(cls.getName());
                                            Log.e("TransitionLayout", sbO2.toString());
                                            e.printStackTrace();
                                            childCount = i7;
                                            map3 = map;
                                        }
                                    case 4:
                                        cls.getMethod(strB, CharSequence.class).invoke(childAt, c1005b.f10694d);
                                        map = map3;
                                        break;
                                    case 5:
                                        cls.getMethod(strB, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1005b.f10695e));
                                        map = map3;
                                        break;
                                    case 6:
                                        cls.getMethod(strB, Float.TYPE).invoke(childAt, Float.valueOf(c1005b.f10693c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e8) {
                                e = e8;
                                map = map3;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                map = map3;
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                map = map3;
                            }
                            childCount = i7;
                            map3 = map;
                        }
                        i = childCount;
                        childAt.setLayoutParams(c1008e);
                        C1014k c1014k = c1011h.f10776b;
                        if (c1014k.f10845b == 0) {
                            childAt.setVisibility(c1014k.f10844a);
                        }
                        childAt.setAlpha(c1014k.f10846c);
                        C1015l c1015l = c1011h.f10779e;
                        childAt.setRotation(c1015l.f10849a);
                        childAt.setRotationX(c1015l.f10850b);
                        childAt.setRotationY(c1015l.f10851c);
                        childAt.setScaleX(c1015l.f10852d);
                        childAt.setScaleY(c1015l.f10853e);
                        if (!Float.isNaN(c1015l.f10854f)) {
                            childAt.setPivotX(c1015l.f10854f);
                        }
                        if (!Float.isNaN(c1015l.f10855g)) {
                            childAt.setPivotY(c1015l.f10855g);
                        }
                        childAt.setTranslationX(c1015l.h);
                        childAt.setTranslationY(c1015l.i);
                        childAt.setTranslationZ(c1015l.f10856j);
                        if (c1015l.f10857k) {
                            childAt.setElevation(c1015l.f10858l);
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i5++;
                c1016m = this;
                childCount = i;
            }
            i = childCount;
            i5++;
            c1016m = this;
            childCount = i;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1011h c1011h2 = (C1011h) map2.get(num);
            C1012i c1012i2 = c1011h2.f10778d;
            int i8 = c1012i2.f10811c0;
            if (i8 != -1 && i8 == 1) {
                Context context = constraintLayout.getContext();
                C1004a c1004a2 = new C1004a(context);
                c1004a2.f10697a = new int[32];
                c1004a2.f10702f = new HashMap();
                c1004a2.f10699c = context;
                C0951a c0951a = new C0951a();
                c0951a.f10208f0 = 0;
                c0951a.f10209g0 = true;
                c0951a.f10210h0 = 0;
                c1004a2.f10690m = c0951a;
                c1004a2.f10700d = c0951a;
                c1004a2.g();
                c1004a2.setVisibility(8);
                c1004a2.setId(num.intValue());
                int[] iArr2 = c1012i2.f10813d0;
                if (iArr2 != null) {
                    c1004a2.setReferencedIds(iArr2);
                } else {
                    String str3 = c1012i2.f10815e0;
                    if (str3 != null) {
                        int[] iArrC2 = c(c1004a2, str3);
                        c1012i2.f10813d0 = iArrC2;
                        c1004a2.setReferencedIds(iArrC2);
                    }
                }
                c1004a2.setType(c1012i2.f10807a0);
                c1004a2.setMargin(c1012i2.f10809b0);
                C1008e c1008eA = ConstraintLayout.a();
                c1004a2.g();
                c1011h2.a(c1008eA);
                constraintLayout.addView(c1004a2, c1008eA);
            }
            if (c1012i2.f10806a) {
                View c1017o = new C1017o(constraintLayout.getContext());
                c1017o.setId(num.intValue());
                C1008e c1008eA2 = ConstraintLayout.a();
                c1011h2.a(c1008eA2);
                constraintLayout.addView(c1017o, c1008eA2);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C1016m c1016m = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1016m.f10863c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C1008e c1008e = (C1008e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1016m.f10862b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1011h());
            }
            C1011h c1011h = (C1011h) map.get(Integer.valueOf(id));
            HashMap map2 = c1016m.f10861a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                C1005b c1005b = (C1005b) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new C1005b(c1005b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new C1005b(c1005b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                } catch (NoSuchMethodException e6) {
                    e6.printStackTrace();
                } catch (InvocationTargetException e7) {
                    e7.printStackTrace();
                }
            }
            c1011h.f10780f = map3;
            c1011h.f10775a = id;
            int i5 = c1008e.f10734d;
            C1012i c1012i = c1011h.f10778d;
            c1012i.f10818g = i5;
            c1012i.h = c1008e.f10736e;
            c1012i.i = c1008e.f10738f;
            c1012i.f10822j = c1008e.f10740g;
            c1012i.f10823k = c1008e.h;
            c1012i.f10824l = c1008e.i;
            c1012i.f10825m = c1008e.f10744j;
            c1012i.f10826n = c1008e.f10746k;
            c1012i.f10827o = c1008e.f10748l;
            c1012i.f10828p = c1008e.f10752p;
            c1012i.f10829q = c1008e.f10753q;
            c1012i.f10830r = c1008e.f10754r;
            c1012i.f10831s = c1008e.f10755s;
            c1012i.f10832t = c1008e.f10762z;
            c1012i.f10833u = c1008e.f10704A;
            c1012i.f10834v = c1008e.f10705B;
            c1012i.f10835w = c1008e.f10749m;
            c1012i.f10836x = c1008e.f10750n;
            c1012i.f10837y = c1008e.f10751o;
            c1012i.f10838z = c1008e.f10718P;
            c1012i.f10782A = c1008e.f10719Q;
            c1012i.f10783B = c1008e.f10720R;
            c1012i.f10816f = c1008e.f10732c;
            c1012i.f10812d = c1008e.f10728a;
            c1012i.f10814e = c1008e.f10730b;
            c1012i.f10808b = ((ViewGroup.MarginLayoutParams) c1008e).width;
            c1012i.f10810c = ((ViewGroup.MarginLayoutParams) c1008e).height;
            c1012i.f10784C = ((ViewGroup.MarginLayoutParams) c1008e).leftMargin;
            c1012i.f10785D = ((ViewGroup.MarginLayoutParams) c1008e).rightMargin;
            c1012i.f10786E = ((ViewGroup.MarginLayoutParams) c1008e).topMargin;
            c1012i.f10787F = ((ViewGroup.MarginLayoutParams) c1008e).bottomMargin;
            c1012i.f10795O = c1008e.f10708E;
            c1012i.f10796P = c1008e.f10707D;
            c1012i.f10798R = c1008e.G;
            c1012i.f10797Q = c1008e.f10709F;
            c1012i.f10819g0 = c1008e.f10721S;
            c1012i.f10820h0 = c1008e.f10722T;
            c1012i.f10799S = c1008e.f10710H;
            c1012i.f10800T = c1008e.f10711I;
            c1012i.f10801U = c1008e.f10714L;
            c1012i.f10802V = c1008e.f10715M;
            c1012i.f10803W = c1008e.f10712J;
            c1012i.X = c1008e.f10713K;
            c1012i.f10804Y = c1008e.f10716N;
            c1012i.f10805Z = c1008e.f10717O;
            c1012i.f10817f0 = c1008e.f10723U;
            c1012i.f10790J = c1008e.f10757u;
            c1012i.f10792L = c1008e.f10759w;
            c1012i.f10789I = c1008e.f10756t;
            c1012i.f10791K = c1008e.f10758v;
            c1012i.f10794N = c1008e.f10760x;
            c1012i.f10793M = c1008e.f10761y;
            c1012i.G = c1008e.getMarginEnd();
            c1012i.f10788H = c1008e.getMarginStart();
            int visibility = childAt.getVisibility();
            C1014k c1014k = c1011h.f10776b;
            c1014k.f10844a = visibility;
            c1014k.f10846c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C1015l c1015l = c1011h.f10779e;
            c1015l.f10849a = rotation;
            c1015l.f10850b = childAt.getRotationX();
            c1015l.f10851c = childAt.getRotationY();
            c1015l.f10852d = childAt.getScaleX();
            c1015l.f10853e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c1015l.f10854f = pivotX;
                c1015l.f10855g = pivotY;
            }
            c1015l.h = childAt.getTranslationX();
            c1015l.i = childAt.getTranslationY();
            c1015l.f10856j = childAt.getTranslationZ();
            if (c1015l.f10857k) {
                c1015l.f10858l = childAt.getElevation();
            }
            if (childAt instanceof C1004a) {
                C1004a c1004a = (C1004a) childAt;
                c1012i.f10821i0 = c1004a.f10690m.f10209g0;
                c1012i.f10813d0 = c1004a.getReferencedIds();
                c1012i.f10807a0 = c1004a.getType();
                c1012i.f10809b0 = c1004a.getMargin();
            }
            i++;
            c1016m = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1011h c1011hD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1011hD.f10778d.f10806a = true;
                    }
                    this.f10863c.put(Integer.valueOf(c1011hD.f10775a), c1011hD);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }
}
