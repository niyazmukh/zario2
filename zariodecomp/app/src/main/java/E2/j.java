package E2;

import N2.C0141e;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.C0526a;
import g.C0527b;
import g.C0529d;
import g.C0530e;
import g.DialogInterfaceC0531f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\j.smali */
public class j implements N.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1458a;

    /* renamed from: b, reason: collision with root package name */
    public int f1459b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1460c;

    public /* synthetic */ j(Object obj, int i, int i5) {
        this.f1458a = i5;
        this.f1459b = i;
        this.f1460c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, g.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public DialogInterfaceC0531f a() {
        C0527b c0527b = (C0527b) this.f1460c;
        ?? dialogInterfaceC0531f = new DialogInterfaceC0531f(c0527b.f7157a, this.f1459b);
        View view = c0527b.f7161e;
        C0530e c0530e = dialogInterfaceC0531f.f7201f;
        if (view != null) {
            c0530e.f7193u = view;
        } else {
            CharSequence charSequence = c0527b.f7160d;
            if (charSequence != null) {
                c0530e.f7178d = charSequence;
                TextView textView = c0530e.f7191s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0527b.f7159c;
            if (drawable != null) {
                c0530e.f7189q = drawable;
                ImageView imageView = c0530e.f7190r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0530e.f7190r.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0527b.f7162f;
        if (charSequence2 != null) {
            c0530e.f7179e = charSequence2;
            TextView textView2 = c0530e.f7192t;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0527b.f7163g;
        if (charSequence3 != null) {
            c0530e.b(-1, charSequence3, c0527b.h);
        }
        CharSequence charSequence4 = c0527b.i;
        if (charSequence4 != null) {
            c0530e.b(-2, charSequence4, null);
        }
        if (c0527b.f7165k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0527b.f7158b.inflate(c0530e.f7197y, (ViewGroup) null);
            int i = c0527b.f7167m ? c0530e.f7198z : c0530e.f7171A;
            Object obj = c0527b.f7165k;
            ?? c0529d = obj;
            if (obj == null) {
                c0529d = new C0529d(c0527b.f7157a, i, R.id.text1, null);
            }
            c0530e.f7194v = c0529d;
            c0530e.f7195w = c0527b.f7168n;
            if (c0527b.f7166l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0526a(c0527b, c0530e));
            }
            if (c0527b.f7167m) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0530e.f7180f = alertController$RecycleListView;
        }
        dialogInterfaceC0531f.setCancelable(true);
        dialogInterfaceC0531f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0531f.setOnCancelListener(null);
        dialogInterfaceC0531f.setOnDismissListener(null);
        k.m mVar = c0527b.f7164j;
        if (mVar != null) {
            dialogInterfaceC0531f.setOnKeyListener(mVar);
        }
        return dialogInterfaceC0531f;
    }

    public boolean b(int i) {
        return (this.f1459b & (1 << i)) != 0;
    }

    public void c(int i, int i5) {
        int[] iArr = (int[]) this.f1460c;
        if (i >= iArr.length) {
            return;
        }
        this.f1459b = (1 << i) | this.f1459b;
        iArr[i] = i5;
    }

    @Override // N.z
    public boolean d(View view) throws Resources.NotFoundException {
        ((BottomSheetBehavior) this.f1460c).B(this.f1459b);
        return true;
    }

    public String toString() {
        switch (this.f1458a) {
            case 0:
                return "ExistenceFilter{count=" + this.f1459b + ", unchangedNames=" + ((C0141e) this.f1460c) + '}';
            default:
                return super.toString();
        }
    }

    public j(int i) {
        this.f1458a = i;
        switch (i) {
            case 4:
                this.f1459b = 4;
                break;
            default:
                this.f1460c = new int[10];
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, DialogInterfaceC0531f.h(context, 0));
        this.f1458a = 5;
    }

    public j(Context context, int i) {
        this.f1458a = 5;
        this.f1460c = new C0527b(new ContextThemeWrapper(context, DialogInterfaceC0531f.h(context, i)));
        this.f1459b = i;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1458a = 2;
        this.f1460c = bottomSheetBehavior;
        this.f1459b = i;
    }
}
