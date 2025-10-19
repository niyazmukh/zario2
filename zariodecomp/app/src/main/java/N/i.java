package N;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\i.smali */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2531e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f2532f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f2533g;
    public static final i h;
    public static final i i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f2534j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f2535k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f2536l;

    /* renamed from: m, reason: collision with root package name */
    public static final i f2537m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2540c;

    /* renamed from: d, reason: collision with root package name */
    public final z f2541d;

    static {
        new i(1);
        new i(2);
        new i(4);
        new i(8);
        f2531e = new i(16);
        new i(32);
        new i(64);
        new i(128);
        new i(256, s.class);
        new i(512, s.class);
        new i(1024, t.class);
        new i(2048, t.class);
        f2532f = new i(4096);
        f2533g = new i(8192);
        new i(16384);
        new i(32768);
        new i(65536);
        new i(131072, x.class);
        h = new i(262144);
        i = new i(524288);
        f2534j = new i(1048576);
        new i(2097152, y.class);
        int i5 = Build.VERSION.SDK_INT;
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, v.class);
        f2535k = new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2536l = new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f2537m = new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, w.class);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, u.class);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new i(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new i(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new i(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new i(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new i(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new i(i5 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new i(i5 >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public i(int i5) {
        this(null, i5, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2538a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        Object obj2 = ((i) obj).f2538a;
        Object obj3 = this.f2538a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2538a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = o.d(this.f2539b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2538a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public i(int i5, Class cls) {
        this(null, i5, null, null, cls);
    }

    public i(Object obj, int i5, String str, z zVar, Class cls) {
        this.f2539b = i5;
        this.f2541d = zVar;
        if (obj == null) {
            this.f2538a = new AccessibilityNodeInfo.AccessibilityAction(i5, str);
        } else {
            this.f2538a = obj;
        }
        this.f2540c = cls;
    }
}
