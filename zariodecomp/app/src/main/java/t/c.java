package T;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.U0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T\c.smali */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3125a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3126b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f3127c;

    /* renamed from: d, reason: collision with root package name */
    public int f3128d;

    /* renamed from: e, reason: collision with root package name */
    public a f3129e;

    /* renamed from: f, reason: collision with root package name */
    public b f3130f;

    /* renamed from: k, reason: collision with root package name */
    public d f3131k;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3127c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f3129e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f3130f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f3127c = cursor;
            if (cursor != null) {
                a aVar2 = this.f3129e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f3130f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f3128d = cursor.getColumnIndexOrThrow("_id");
                this.f3125a = true;
                notifyDataSetChanged();
            } else {
                this.f3128d = -1;
                this.f3125a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f3125a || (cursor = this.f3127c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3125a) {
            return null;
        }
        this.f3127c.moveToPosition(i);
        if (view == null) {
            U0 u02 = (U0) this;
            view = u02.f8509n.inflate(u02.f8508m, viewGroup, false);
        }
        a(view, this.f3127c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3131k == null) {
            d dVar = new d();
            dVar.f3132a = this;
            this.f3131k = dVar;
        }
        return this.f3131k;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f3125a || (cursor = this.f3127c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f3127c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f3125a && (cursor = this.f3127c) != null && cursor.moveToPosition(i)) {
            return this.f3127c.getLong(this.f3128d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3125a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3127c.moveToPosition(i)) {
            throw new IllegalStateException(B.a.g(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f3127c);
        return view;
    }
}
