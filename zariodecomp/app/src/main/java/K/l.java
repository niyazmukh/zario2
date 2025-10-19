package k;

import M.U;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\l.smali */
public class l implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f8217y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f8218a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f8219b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8220c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8221d;

    /* renamed from: e, reason: collision with root package name */
    public j f8222e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8223f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8224g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f8225j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8226k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f8228m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f8229n;

    /* renamed from: o, reason: collision with root package name */
    public View f8230o;

    /* renamed from: v, reason: collision with root package name */
    public n f8237v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8239x;

    /* renamed from: l, reason: collision with root package name */
    public int f8227l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8231p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8232q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8233r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8234s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f8235t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f8236u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f8238w = false;

    public l(Context context) {
        boolean z4 = false;
        this.f8218a = context;
        Resources resources = context.getResources();
        this.f8219b = resources;
        this.f8223f = new ArrayList();
        this.f8224g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f8225j = new ArrayList();
        this.f8226k = true;
        if (resources.getConfiguration().keyboard != 1 && U.b(ViewConfiguration.get(context))) {
            z4 = true;
        }
        this.f8221d = z4;
    }

    public final n a(int i, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f8217y[i8] << 16) | (65535 & i6);
        n nVar = new n(this, i, i5, i6, i9, charSequence, this.f8227l);
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f8249d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f8218a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i, i5, i6, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f8252g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f8236u.add(new WeakReference(yVar));
        yVar.g(context, this);
        this.f8226k = true;
    }

    public final void c(boolean z4) {
        if (this.f8234s) {
            return;
        }
        this.f8234s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z4);
            }
        }
        this.f8234s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f8237v;
        if (nVar != null) {
            d(nVar);
        }
        this.f8223f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f8229n = null;
        this.f8228m = null;
        this.f8230o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f8237v == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE = yVar.e(nVar);
                    if (zE) {
                        break;
                    }
                }
            }
            v();
            if (zE) {
                this.f8237v = null;
            }
        }
        return zE;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f8222e;
        return jVar != null && jVar.f(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zC = yVar.c(nVar);
                if (zC) {
                    break;
                }
            }
        }
        v();
        if (zC) {
            this.f8237v = nVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.f8246a == i) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f8258o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f8235t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            char c5 = zN ? nVar.f8253j : nVar.h;
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (zN && c5 == '\b' && i == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f8223f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f8223f;
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                n nVar = (n) arrayList2.get(i5);
                if (nVar.hasSubMenu()) {
                    nVar.f8258o.h(arrayList, i, keyEvent);
                }
                char c5 = zN ? nVar.f8253j : nVar.h;
                if ((modifiers & 69647) == ((zN ? nVar.f8254k : nVar.i) & 69647) && c5 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c5 == cArr[0] || c5 == cArr[2] || (zN && c5 == '\b' && i == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f8239x) {
            return true;
        }
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f8226k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zH = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zH |= yVar.h();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f8225j;
            if (zH) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    n nVar = (n) arrayListL.get(i);
                    if (nVar.f()) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f8226k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z4 = this.h;
        ArrayList arrayList = this.f8224g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f8223f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList2.get(i);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.h = false;
        this.f8226k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f8238w;
    }

    public boolean n() {
        return this.f8220c;
    }

    public boolean o() {
        return this.f8221d;
    }

    public final void p(boolean z4) {
        if (this.f8231p) {
            this.f8232q = true;
            if (z4) {
                this.f8233r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.h = true;
            this.f8226k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i5) {
        return q(findItem(i), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i5) {
        n nVarG = g(i, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, k.y r8, int r9) {
        /*
            r6 = this;
            k.n r7 = (k.n) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f8259p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            k.l r1 = r7.f8257n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f8252g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f8218a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            k.o r1 = r7.f8243A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f8270a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            k.o r3 = r7.f8243A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f8270a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            k.E r9 = new k.E
            android.content.Context r5 = r6.f8218a
            r9.<init>(r5, r6, r7)
            r7.f8258o = r9
            java.lang.CharSequence r5 = r7.f8250e
            r9.setHeaderTitle(r5)
        L90:
            k.E r7 = r7.f8258o
            if (r4 == 0) goto L9e
            k.s r9 = r3.f8271b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f8270a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f8236u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.d(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            k.y r4 = (k.y) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.d(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.q(android.view.MenuItem, k.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8236u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((n) arrayList.get(i6)).f8247b == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((n) arrayList.get(i6)).f8247b != i) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f8223f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i5 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((n) arrayList.get(i5)).f8246a == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f8223f;
            if (i5 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i5);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f8223f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0641E) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z5) {
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.f8247b == i) {
                nVar.f8267x = (nVar.f8267x & (-5)) | (z5 ? 4 : 0);
                nVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f8238w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.f8247b == i) {
                nVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        ArrayList arrayList = this.f8223f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.f8247b == i) {
                int i6 = nVar.f8267x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                nVar.f8267x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f8220c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8223f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f8223f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0641E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f8230o = view;
            this.f8228m = null;
            this.f8229n = null;
        } else {
            if (i > 0) {
                this.f8228m = this.f8219b.getText(i);
            } else if (charSequence != null) {
                this.f8228m = charSequence;
            }
            if (i5 > 0) {
                this.f8229n = B.l.getDrawable(this.f8218a, i5);
            } else if (drawable != null) {
                this.f8229n = drawable;
            }
            this.f8230o = null;
        }
        p(false);
    }

    public final void v() {
        this.f8231p = false;
        if (this.f8232q) {
            this.f8232q = false;
            p(this.f8233r);
        }
    }

    public final void w() {
        if (this.f8231p) {
            return;
        }
        this.f8231p = true;
        this.f8232q = false;
        this.f8233r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f8219b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f8219b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, CharSequence charSequence) {
        return a(i, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, CharSequence charSequence) {
        n nVarA = a(i, i5, i6, charSequence);
        SubMenuC0641E subMenuC0641E = new SubMenuC0641E(this.f8218a, this, nVarA);
        nVarA.f8258o = subMenuC0641E;
        subMenuC0641E.setHeaderTitle(nVarA.f8250e);
        return subMenuC0641E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i5, int i6, int i7) {
        return a(i, i5, i6, this.f8219b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i5, int i6, int i7) {
        return addSubMenu(i, i5, i6, this.f8219b.getString(i7));
    }
}
