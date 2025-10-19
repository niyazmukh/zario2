package l;

import M.C0120e;
import M.InterfaceC0119d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\C.smali */
public abstract class C {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0119d iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                iVar = new h1.i(clipData, 3);
            } else {
                C0120e c0120e = new C0120e();
                c0120e.f2380b = clipData;
                c0120e.f2381c = 3;
                iVar = c0120e;
            }
            M.S.e(textView, iVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0119d iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new h1.i(clipData, 3);
        } else {
            C0120e c0120e = new C0120e();
            c0120e.f2380b = clipData;
            c0120e.f2381c = 3;
            iVar = c0120e;
        }
        M.S.e(view, iVar.build());
        return true;
    }
}
