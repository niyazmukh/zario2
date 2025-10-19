package E3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import w.AbstractC1019q;
import w.C1016m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\k.smali */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1571b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1572c;

    public k(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f1572c = new ArrayList();
        this.f1571b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1019q.f10870g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1570a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1570a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1571b);
                this.f1571b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1016m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public k() {
        this.f1572c = new k[256];
        this.f1570a = 0;
        this.f1571b = 0;
    }

    public k(int i, int i5) {
        this.f1572c = null;
        this.f1570a = i;
        int i6 = i5 & 7;
        this.f1571b = i6 == 0 ? 8 : i6;
    }
}
