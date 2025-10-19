package l;

import A2.C0004d;
import M.C0120e;
import M.C0122g;
import M.InterfaceC0119d;
import M.InterfaceC0132t;
import N2.AbstractC0156x;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\t.1.smali */
public class C0713t extends EditText implements InterfaceC0132t {

    /* renamed from: a, reason: collision with root package name */
    public final A2.T f8693a;

    /* renamed from: b, reason: collision with root package name */
    public final W f8694b;

    /* renamed from: c, reason: collision with root package name */
    public final Q.s f8695c;

    /* renamed from: d, reason: collision with root package name */
    public final C0724z f8696d;

    /* renamed from: e, reason: collision with root package name */
    public C0711s f8697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903438);
        W0.a(context);
        V0.a(getContext(), this);
        A2.T t4 = new A2.T(this);
        this.f8693a = t4;
        t4.z(attributeSet, 2130903438);
        W w4 = new W(this);
        this.f8694b = w4;
        w4.f(attributeSet, 2130903438);
        w4.b();
        this.f8695c = new Q.s();
        C0724z c0724z = new C0724z(this);
        this.f8696d = c0724z;
        c0724z.d(attributeSet, 2130903438);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerC = c0724z.c(keyListener);
        if (keyListenerC == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerC);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0711s getSuperCaller() {
        if (this.f8697e == null) {
            this.f8697e = new C0711s(this);
        }
        return this.f8697e;
    }

    @Override // M.InterfaceC0132t
    public final C0122g a(C0122g c0122g) {
        return this.f8695c.a(this, c0122g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            t4.l();
        }
        W w4 = this.f8694b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            return t4.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            return t4.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8694b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8694b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8694b.getClass();
        W.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0156x.R(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrC = M.S.c(this)) != null) {
            editorInfo.contentMimeTypes = strArrC;
            inputConnectionOnCreateInputConnection = new P.b(inputConnectionOnCreateInputConnection, new C0004d(this, 7));
        }
        return this.f8696d.e(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && M.S.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = C.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0119d iVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 || M.S.c(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i5 >= 31) {
                iVar = new h1.i(primaryClip, 1);
            } else {
                C0120e c0120e = new C0120e();
                c0120e.f2380b = primaryClip;
                c0120e.f2381c = 1;
                iVar = c0120e;
            }
            iVar.s(i == 16908322 ? 0 : 1);
            M.S.e(this, iVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            t4.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            t4.C(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8694b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w4 = this.f8694b;
        if (w4 != null) {
            w4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f8696d.f(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8696d.c(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            t4.I(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A2.T t4 = this.f8693a;
        if (t4 != null) {
            t4.J(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w4 = this.f8694b;
        w4.i(colorStateList);
        w4.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w4 = this.f8694b;
        w4.j(mode);
        w4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        W w4 = this.f8694b;
        if (w4 != null) {
            w4.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
