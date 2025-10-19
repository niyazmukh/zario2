package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import f.AbstractC0489a;
import java.lang.ref.WeakReference;
import m3.DialogInterfaceOnClickListenerC0748b;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\e.1.smali */
public final class C0530e {

    /* renamed from: A, reason: collision with root package name */
    public final int f7171A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f7172B;

    /* renamed from: C, reason: collision with root package name */
    public final HandlerC0528c f7173C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7175a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0531f f7176b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f7177c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f7178d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7179e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f7180f;

    /* renamed from: g, reason: collision with root package name */
    public Button f7181g;
    public CharSequence h;
    public Message i;

    /* renamed from: j, reason: collision with root package name */
    public Button f7182j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f7183k;

    /* renamed from: l, reason: collision with root package name */
    public Message f7184l;

    /* renamed from: m, reason: collision with root package name */
    public Button f7185m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7186n;

    /* renamed from: o, reason: collision with root package name */
    public Message f7187o;

    /* renamed from: p, reason: collision with root package name */
    public NestedScrollView f7188p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f7189q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f7190r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f7191s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f7192t;

    /* renamed from: u, reason: collision with root package name */
    public View f7193u;

    /* renamed from: v, reason: collision with root package name */
    public ListAdapter f7194v;

    /* renamed from: x, reason: collision with root package name */
    public final int f7196x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7197y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7198z;

    /* renamed from: w, reason: collision with root package name */
    public int f7195w = -1;

    /* renamed from: D, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f7174D = new com.google.android.material.datepicker.n(this, 1);

    public C0530e(Context context, DialogInterfaceC0531f dialogInterfaceC0531f, Window window) {
        this.f7175a = context;
        this.f7176b = dialogInterfaceC0531f;
        this.f7177c = window;
        HandlerC0528c handlerC0528c = new HandlerC0528c();
        handlerC0528c.f7170b = new WeakReference(dialogInterfaceC0531f);
        this.f7173C = handlerC0528c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0489a.f6966e, 2130903084, 0);
        this.f7196x = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f7197y = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f7198z = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f7171A = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f7172B = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0531f.e().g(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(int i, CharSequence charSequence, DialogInterfaceOnClickListenerC0748b dialogInterfaceOnClickListenerC0748b) {
        Message messageObtainMessage = dialogInterfaceOnClickListenerC0748b != null ? this.f7173C.obtainMessage(i, dialogInterfaceOnClickListenerC0748b) : null;
        if (i == -3) {
            this.f7186n = charSequence;
            this.f7187o = messageObtainMessage;
        } else if (i == -2) {
            this.f7183k = charSequence;
            this.f7184l = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.h = charSequence;
            this.i = messageObtainMessage;
        }
    }
}
