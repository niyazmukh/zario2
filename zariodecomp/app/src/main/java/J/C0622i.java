package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f.AbstractC0489a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import k.o;
import l.AbstractC0692h0;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\i.smali */
public final class C0622i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f8017e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f8018f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8019a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8020b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8021c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8022d;

    static {
        Class[] clsArr = {Context.class};
        f8017e = clsArr;
        f8018f = clsArr;
    }

    public C0622i(Context context) {
        super(context);
        this.f8021c = context;
        Object[] objArr = {context};
        this.f8019a = objArr;
        this.f8020b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r42;
        int i;
        boolean z4;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    z4 = r42;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z6 && name2.equals(str)) {
                        z4 = r42;
                        z6 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            hVar.f7994b = 0;
                            hVar.f7995c = 0;
                            hVar.f7996d = 0;
                            hVar.f7997e = 0;
                            hVar.f7998f = r42;
                            hVar.f7999g = r42;
                        } else if (name2.equals("item")) {
                            if (!hVar.h) {
                                o oVar = hVar.f8016z;
                                if (oVar == null || !oVar.f8270a.hasSubMenu()) {
                                    hVar.h = r42;
                                    hVar.b(hVar.f7993a.add(hVar.f7994b, hVar.i, hVar.f8000j, hVar.f8001k));
                                } else {
                                    hVar.h = r42;
                                    hVar.b(hVar.f7993a.addSubMenu(hVar.f7994b, hVar.i, hVar.f8000j, hVar.f8001k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z4 = r42;
                            z5 = z4;
                        }
                        z4 = r42;
                    }
                }
                eventType = xmlResourceParser.next();
                r42 = z4;
                i = 2;
                z6 = z6;
            } else {
                if (!z6) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0622i c0622i = hVar.f7992E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c0622i.f8021c.obtainStyledAttributes(attributeSet, AbstractC0489a.f6975p);
                        hVar.f7994b = typedArrayObtainStyledAttributes.getResourceId(r42, 0);
                        hVar.f7995c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        hVar.f7996d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        hVar.f7997e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        hVar.f7998f = typedArrayObtainStyledAttributes.getBoolean(2, r42);
                        hVar.f7999g = typedArrayObtainStyledAttributes.getBoolean(0, r42);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0622i.f8021c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6976q);
                            hVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            hVar.f8000j = (typedArrayObtainStyledAttributes2.getInt(5, hVar.f7995c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, hVar.f7996d) & 65535);
                            hVar.f8001k = typedArrayObtainStyledAttributes2.getText(7);
                            hVar.f8002l = typedArrayObtainStyledAttributes2.getText(8);
                            hVar.f8003m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            hVar.f8004n = string == null ? (char) 0 : string.charAt(0);
                            hVar.f8005o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            hVar.f8006p = string2 == null ? (char) 0 : string2.charAt(0);
                            hVar.f8007q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                hVar.f8008r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                hVar.f8008r = hVar.f7997e;
                            }
                            hVar.f8009s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            hVar.f8010t = typedArrayObtainStyledAttributes2.getBoolean(4, hVar.f7998f);
                            hVar.f8011u = typedArrayObtainStyledAttributes2.getBoolean(1, hVar.f7999g);
                            hVar.f8012v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            hVar.f8015y = typedArrayObtainStyledAttributes2.getString(12);
                            hVar.f8013w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            hVar.f8014x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && hVar.f8013w == 0 && hVar.f8014x == null) {
                                hVar.f8016z = (o) hVar.a(string3, f8018f, c0622i.f8020b);
                            } else {
                                if (z7) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                hVar.f8016z = null;
                            }
                            hVar.f7988A = typedArrayObtainStyledAttributes2.getText(17);
                            hVar.f7989B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                hVar.f7991D = AbstractC0692h0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), hVar.f7991D);
                            } else {
                                hVar.f7991D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = B.l.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                hVar.f7990C = colorStateList;
                            } else {
                                hVar.f7990C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            hVar.h = false;
                            z4 = true;
                        } else if (name3.equals("menu")) {
                            z4 = true;
                            hVar.h = true;
                            SubMenu subMenuAddSubMenu = hVar.f7993a.addSubMenu(hVar.f7994b, hVar.i, hVar.f8000j, hVar.f8001k);
                            hVar.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z4 = true;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r42 = z4;
                        i = 2;
                        z6 = z6;
                    }
                }
                z4 = r42;
            }
            eventType = xmlResourceParser.next();
            r42 = z4;
            i = 2;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof k.l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f8021c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
