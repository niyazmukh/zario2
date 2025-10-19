package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\b.smali */
public final class C1005b {

    /* renamed from: a, reason: collision with root package name */
    public int f10691a;

    /* renamed from: b, reason: collision with root package name */
    public int f10692b;

    /* renamed from: c, reason: collision with root package name */
    public float f10693c;

    /* renamed from: d, reason: collision with root package name */
    public String f10694d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10695e;

    /* renamed from: f, reason: collision with root package name */
    public int f10696f;

    public C1005b(C1005b c1005b, Object obj) {
        c1005b.getClass();
        this.f10691a = c1005b.f10691a;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1019q.f10866c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        Object string2 = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i6 = 3;
                if (index == 3) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i6 = 4;
                    if (index == 2) {
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i6 = 5;
                            if (index == 5) {
                                string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else if (index == 6) {
                                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                i = 1;
                            } else if (index == 8) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                            }
                        }
                        i = 7;
                    }
                }
                i = i6;
            }
        }
        if (string != null && string2 != null) {
            C1005b c1005b = new C1005b();
            c1005b.f10691a = i;
            c1005b.b(string2);
            map.put(string, c1005b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (t.h.c(this.f10691a)) {
            case 0:
                this.f10692b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f10693c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f10696f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f10694d = (String) obj;
                break;
            case 5:
                this.f10695e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f10693c = ((Float) obj).floatValue();
                break;
        }
    }
}
