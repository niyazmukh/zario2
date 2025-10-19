package l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\c0.1.smali */
public final class C0682c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8557a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f8558b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f8559c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f8560d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8561e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f8562f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8563g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0682c0(TextView textView) {
        this.f8563g = textView;
        this.h = textView.getContext();
        new C0678a0();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        return !(this.f8563g instanceof C0713t);
    }
}
