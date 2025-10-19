package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.AbstractC0489a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\app\AlertController$RecycleListView.smali */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4112b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6979t);
        this.f4112b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f4111a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
