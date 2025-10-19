package M;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0713t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\S.smali */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2363a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2364b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0134w f2365c;

    /* renamed from: d, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0136y f2366d;

    static {
        new AtomicInteger(1);
        f2363a = null;
        f2364b = new int[]{2131230737, 2131230738, 2131230749, 2131230760, 2131230763, 2131230764, 2131230765, 2131230766, 2131230767, 2131230768, 2131230739, 2131230740, 2131230741, 2131230742, 2131230743, 2131230744, 2131230745, 2131230746, 2131230747, 2131230748, 2131230750, 2131230751, 2131230752, 2131230753, 2131230754, 2131230755, 2131230756, 2131230757, 2131230758, 2131230759, 2131230761, 2131230762};
        f2365c = new C0134w();
        f2366d = new ViewTreeObserverOnGlobalLayoutListenerC0136y();
    }

    public static X a(View view) {
        if (f2363a == null) {
            f2363a = new WeakHashMap();
        }
        X x3 = (X) f2363a.get(view);
        if (x3 != null) {
            return x3;
        }
        X x4 = new X(view);
        f2363a.put(view, x4);
        return x4;
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131231207);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131231207, arrayList2);
        return arrayList2;
    }

    public static String[] c(C0713t c0713t) {
        return Build.VERSION.SDK_INT >= 31 ? O.a(c0713t) : (String[]) c0713t.getTag(2131231213);
    }

    public static void d(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = L.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (E.a(view) != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                E.g(accessibilityEventObtain, i);
                if (z4) {
                    accessibilityEventObtain.getText().add(L.b(view));
                    if (B.c(view) == 0) {
                        B.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        E.e(view.getParent(), view, view, i);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            E.g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(L.b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0122g e(View view, C0122g c0122g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0122g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return O.b(view, c0122g);
        }
        InterfaceC0131s interfaceC0131s = (InterfaceC0131s) view.getTag(2131231212);
        InterfaceC0132t interfaceC0132t = f2365c;
        if (interfaceC0131s == null) {
            if (view instanceof InterfaceC0132t) {
                interfaceC0132t = (InterfaceC0132t) view;
            }
            return interfaceC0132t.a(c0122g);
        }
        C0122g c0122gA = ((Q.s) interfaceC0131s).a(view, c0122g);
        if (c0122gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0132t) {
            interfaceC0132t = (InterfaceC0132t) view;
        }
        return interfaceC0132t.a(c0122gA);
    }

    public static void f(View view, int i) {
        ArrayList arrayListB = b(view);
        for (int i5 = 0; i5 < arrayListB.size(); i5++) {
            if (((N.i) arrayListB.get(i5)).a() == i) {
                arrayListB.remove(i5);
                return;
            }
        }
    }

    public static void g(View view, N.i iVar, N.z zVar) {
        N.i iVar2 = new N.i(null, iVar.f2539b, null, zVar, iVar.f2540c);
        View.AccessibilityDelegate accessibilityDelegateA = M.a(view);
        C0118c c0118c = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof C0116a ? ((C0116a) accessibilityDelegateA).f2368a : new C0118c(accessibilityDelegateA);
        if (c0118c == null) {
            c0118c = new C0118c();
        }
        h(view, c0118c);
        f(view, iVar2.a());
        b(view).add(iVar2);
        d(view, 0);
    }

    public static void h(View view, C0118c c0118c) {
        if (c0118c == null && (M.a(view) instanceof C0116a)) {
            c0118c = new C0118c();
        }
        if (B.c(view) == 0) {
            B.s(view, 1);
        }
        view.setAccessibilityDelegate(c0118c == null ? null : c0118c.f2376b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C0135x(2131231210, CharSequence.class, 8, 28, 0).f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0136y viewTreeObserverOnGlobalLayoutListenerC0136y = f2366d;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0136y.f2432a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0136y);
            B.o(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC0136y);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0136y.f2432a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0136y);
            if (E.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0136y);
            }
        }
    }
}
