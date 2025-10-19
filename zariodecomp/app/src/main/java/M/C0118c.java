package M;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: M.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\c.1.smali */
public class C0118c {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2374c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final C0116a f2376b;

    public C0118c() {
        this(f2374c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2375a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public g1.i b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = AbstractC0117b.a(this.f2375a, view);
        if (accessibilityNodeProviderA != null) {
            return new g1.i(accessibilityNodeProviderA, 9);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2375a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, N.o oVar) {
        this.f2375a.onInitializeAccessibilityNodeInfo(view, oVar.f2543a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2375a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2375a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zB;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(2131231207);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= listEmptyList.size()) {
                break;
            }
            N.i iVar = (N.i) listEmptyList.get(i5);
            if (iVar.a() == i) {
                N.z zVar = iVar.f2541d;
                if (zVar != null) {
                    Class cls = iVar.f2540c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e5) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                        }
                    }
                    zB = zVar.d(view);
                }
            } else {
                i5++;
            }
        }
        zB = false;
        if (!zB) {
            zB = AbstractC0117b.b(this.f2375a, view, i, bundle);
        }
        if (zB || i != 2131230736 || bundle == null) {
            return zB;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131231208);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        return z4;
    }

    public void h(View view, int i) {
        this.f2375a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2375a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0118c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2375a = accessibilityDelegate;
        this.f2376b = new C0116a(this);
    }
}
