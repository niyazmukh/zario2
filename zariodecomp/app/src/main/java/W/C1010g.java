package w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\g.smali */
public final class C1010g {

    /* renamed from: a, reason: collision with root package name */
    public final float f10770a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10771b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10772c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10774e;

    public C1010g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f10770a = Float.NaN;
        this.f10771b = Float.NaN;
        this.f10772c = Float.NaN;
        this.f10773d = Float.NaN;
        this.f10774e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1019q.i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f10774e);
                this.f10774e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1016m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f10773d = typedArrayObtainStyledAttributes.getDimension(index, this.f10773d);
            } else if (index == 2) {
                this.f10771b = typedArrayObtainStyledAttributes.getDimension(index, this.f10771b);
            } else if (index == 3) {
                this.f10772c = typedArrayObtainStyledAttributes.getDimension(index, this.f10772c);
            } else if (index == 4) {
                this.f10770a = typedArrayObtainStyledAttributes.getDimension(index, this.f10770a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
