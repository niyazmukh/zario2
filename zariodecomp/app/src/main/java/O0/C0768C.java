package o0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\C.smali */
public final class C0768C {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f9003c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9004a;

    /* renamed from: b, reason: collision with root package name */
    public final O f9005b;

    public C0768C(Context context, O navigatorProvider) {
        kotlin.jvm.internal.i.e(navigatorProvider, "navigatorProvider");
        this.f9004a = context;
        this.f9005b = navigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o0.C0783f c(android.content.res.TypedArray r27, android.content.res.Resources r28, int r29) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0768C.c(android.content.res.TypedArray, android.content.res.Resources, int):o0.f");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x024c, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0.x a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0768C.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):o0.x");
    }

    public final z b(int i) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f9004a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        kotlin.jvm.internal.i.d(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e5);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        kotlin.jvm.internal.i.d(attrs, "attrs");
        x xVarA = a(resources, xml, attrs, i);
        if (xVarA instanceof z) {
            return (z) xVarA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
