package e0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e0\b.smali */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6824a;

    /* renamed from: b, reason: collision with root package name */
    public final X1.e f6825b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        X1.e eVar = new X1.e();
        super(inputConnection, false);
        this.f6824a = editText;
        this.f6825b = eVar;
        if (c0.i.f5356j != null) {
            c0.i iVarA = c0.i.a();
            if (iVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            c0.e eVar2 = iVarA.f5361e;
            eVar2.getClass();
            Bundle bundle = editorInfo.extras;
            d0.b bVar = (d0.b) eVar2.f5352c.f2858a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f2436d).getInt(iA + bVar.f2433a) : 0);
            Bundle bundle2 = editorInfo.extras;
            eVar2.f5350a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        Editable editableText = this.f6824a.getEditableText();
        this.f6825b.getClass();
        return X1.e.j(this, editableText, i, i5, false) || super.deleteSurroundingText(i, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        Editable editableText = this.f6824a.getEditableText();
        this.f6825b.getClass();
        return X1.e.j(this, editableText, i, i5, true) || super.deleteSurroundingTextInCodePoints(i, i5);
    }
}
