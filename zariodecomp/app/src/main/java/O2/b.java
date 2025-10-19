package O2;

import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O2\b.smali */
public final class b extends IOException {
    public /* synthetic */ b(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
