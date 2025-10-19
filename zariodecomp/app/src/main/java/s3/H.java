package s3;

import android.util.Log;
import b3.C0295T;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\H.smali */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f9724a = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);

    @Override // s3.G
    public final void a(F f2) {
        if (Log.isLoggable("UsageIngestionTelemetry", 4)) {
            StringBuilder sb = new StringBuilder("=== USAGE INGESTION SUMMARY (Hybrid Filtering) ===\n");
            SimpleDateFormat simpleDateFormat = this.f9724a;
            String str = simpleDateFormat.format(new Date(f2.f9715a));
            kotlin.jvm.internal.i.d(str, "format(...)");
            String str2 = simpleDateFormat.format(new Date(f2.f9716b));
            kotlin.jvm.internal.i.d(str2, "format(...)");
            sb.append("Window: [" + str + " - " + str2 + "]\n");
            StringBuilder sb2 = new StringBuilder("Total Events Read: ");
            int i = f2.f9718d;
            sb2.append(i);
            sb2.append("\n");
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder("Events Emitted: ");
            int i5 = f2.f9719e;
            sb3.append(i5);
            sb3.append("\n");
            sb.append(sb3.toString());
            int i6 = i - i5;
            sb.append("Events Dropped: " + i6 + "\n");
            double d5 = i > 0 ? i6 / i : 0.0d;
            Locale locale = Locale.US;
            double d6 = 100;
            Object[] objArr = {Double.valueOf(d5 * d6)};
            int i7 = 1;
            sb.append("Drop Rate: " + String.format(locale, "%.1f%%", Arrays.copyOf(objArr, 1)) + "\n");
            sb.append("Null Package Drops: " + f2.h + "\n");
            sb.append("Unknown Type Drops: " + f2.i + "\n");
            sb.append("Suppressed Packages: " + f2.f9720f.size() + " types\n");
            sb.append("Suppressed Classes: " + f2.f9721g.size() + " types\n");
            sb.append("Note: Apps USING system components are now tracked (hybrid filtering active)\n");
            String string = sb.toString();
            kotlin.jvm.internal.i.d(string, "toString(...)");
            Log.i("UsageIngestionTelemetry", string);
            LinkedHashMap linkedHashMap = f2.f9723k;
            if (!linkedHashMap.isEmpty()) {
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((E) obj).a() > 0.1d) {
                        arrayList.add(obj);
                    }
                }
                List<E> listQ0 = L3.j.q0(20, L3.j.o0(new r(3), arrayList));
                if (!listQ0.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder("=== PACKAGES WITH HIGH DROP RATES ===\n");
                    for (E e5 : listQ0) {
                        sb4.append(e5.f9710a + ":\n");
                        sb4.append("  Total: " + e5.f9711b + ", Emitted: " + e5.f9713d + ", ");
                        sb4.append("Dropped: " + e5.f9712c + " (" + String.format(Locale.US, "%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(e5.a() * d6)}, i7)) + ")\n");
                        String strH0 = L3.j.h0(e5.f9714e.entrySet(), null, null, null, new C0295T(2), 31);
                        StringBuilder sb5 = new StringBuilder("  Reasons: ");
                        sb5.append(strH0);
                        sb5.append("\n");
                        sb4.append(sb5.toString());
                        i7 = 1;
                    }
                    String string2 = sb4.toString();
                    kotlin.jvm.internal.i.d(string2, "toString(...)");
                    Log.w("UsageIngestionTelemetry", string2);
                }
            }
            Set setM0 = L3.C.m0("com.twitter.android", "com.instagram.android", "com.facebook.katana", "com.snapchat.android", "com.tiktok", "com.whatsapp", "com.google.android.youtube", "com.android.chrome");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = f2.f9722j;
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (L3.j.c0(setM0, ((C) next).f9703b)) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                Log.i("UsageIngestionTelemetry", "=== HIGH-VALUE APP STATUS ===\nNo drops detected for social media apps (hybrid filtering working)");
            } else {
                StringBuilder sb6 = new StringBuilder("=== HIGH-VALUE APP DROPS (Social Media) ===\n");
                sb6.append("Found " + arrayList2.size() + " dropped events from important apps:\n");
                sb6.append("NOTE: With hybrid filtering, these should be minimal/zero\n");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    String str3 = ((C) next2).f9703b;
                    Object arrayList4 = linkedHashMap2.get(str3);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap2.put(str3, arrayList4);
                    }
                    ((List) arrayList4).add(next2);
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str4 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    sb6.append("\n" + str4 + ": " + list.size() + " drops\n");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Object obj2 : list) {
                        B b5 = ((C) obj2).f9707f;
                        Object arrayList5 = linkedHashMap3.get(b5);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap3.put(b5, arrayList5);
                        }
                        ((List) arrayList5).add(obj2);
                    }
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        B b6 = (B) entry2.getKey();
                        List list2 = (List) entry2.getValue();
                        sb6.append("  " + b6 + ": " + list2.size() + " events\n");
                        if (b6 == B.f9698c || b6 == B.f9699d) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                String str5 = ((C) it3.next()).f9705d;
                                if (str5 != null) {
                                    arrayList6.add(str5);
                                }
                            }
                            sb6.append("    Task Roots: " + L3.j.h0(L3.j.u0(L3.j.y0(arrayList6)), null, null, null, null, 63) + "\n");
                        }
                    }
                }
                String string3 = sb6.toString();
                kotlin.jvm.internal.i.d(string3, "toString(...)");
                Log.e("UsageIngestionTelemetry", string3);
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                B b7 = ((C) next3).f9707f;
                Object arrayList7 = linkedHashMap4.get(b7);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap4.put(b7, arrayList7);
                }
                ((List) arrayList7).add(next3);
            }
            StringBuilder sb7 = new StringBuilder("=== DETAILED DROP SAMPLES ===\n");
            Iterator it5 = linkedHashMap4.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it5.next();
                B b8 = (B) entry3.getKey();
                List list3 = (List) entry3.getValue();
                sb7.append(b8 + " (" + list3.size() + " total):\n");
                for (C c5 : L3.j.q0(5, list3)) {
                    String str6 = simpleDateFormat.format(new Date(c5.f9702a));
                    kotlin.jvm.internal.i.d(str6, "format(...)");
                    sb7.append("  " + str6 + " | ");
                    String str7 = c5.f9703b;
                    if (str7 == null) {
                        str7 = "null";
                    }
                    sb7.append("pkg=" + str7 + " | ");
                    sb7.append("type=" + c5.f9704c + " | ");
                    String str8 = "none";
                    String str9 = c5.f9705d;
                    if (str9 == null) {
                        str9 = "none";
                    }
                    Iterator it6 = it5;
                    sb7.append("taskRoot=" + str9 + " | ");
                    String str10 = c5.f9706e;
                    if (str10 != null) {
                        str8 = str10;
                    }
                    sb7.append("class=" + str8 + "\n");
                    it5 = it6;
                }
                Iterator it7 = it5;
                if (list3.size() > 5) {
                    sb7.append("  ... and " + (list3.size() - 5) + " more\n");
                }
                it5 = it7;
            }
            String string4 = sb7.toString();
            kotlin.jvm.internal.i.d(string4, "toString(...)");
            Log.d("UsageIngestionTelemetry", string4);
        }
    }
}
