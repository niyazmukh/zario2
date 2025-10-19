package com.niyaz.zario.worker;

import J0.h;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressUpdate.smali */
public abstract class WorkProgressUpdate {

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressUpdate$Cancelled.smali */
    public static final class Cancelled extends WorkProgressUpdate {
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressUpdate$Failed.smali */
    public static final class Failed extends WorkProgressUpdate {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressUpdate$Running.smali */
    public static final class Running extends WorkProgressUpdate {
        private final h progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Running(h progress) {
            super(null);
            i.e(progress, "progress");
            this.progress = progress;
        }

        public static /* synthetic */ Running copy$default(Running running, h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                hVar = running.progress;
            }
            return running.copy(hVar);
        }

        public final h component1() {
            return this.progress;
        }

        public final Running copy(h progress) {
            i.e(progress, "progress");
            return new Running(progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Running) && i.a(this.progress, ((Running) obj).progress);
        }

        public final h getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return this.progress.hashCode();
        }

        public String toString() {
            return "Running(progress=" + this.progress + ")";
        }
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressUpdate$Succeeded.smali */
    public static final class Succeeded extends WorkProgressUpdate {
        private final h output;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(h output) {
            super(null);
            i.e(output, "output");
            this.output = output;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                hVar = succeeded.output;
            }
            return succeeded.copy(hVar);
        }

        public final h component1() {
            return this.output;
        }

        public final Succeeded copy(h output) {
            i.e(output, "output");
            return new Succeeded(output);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Succeeded) && i.a(this.output, ((Succeeded) obj).output);
        }

        public final h getOutput() {
            return this.output;
        }

        public int hashCode() {
            return this.output.hashCode();
        }

        public String toString() {
            return "Succeeded(output=" + this.output + ")";
        }
    }

    public /* synthetic */ WorkProgressUpdate(e eVar) {
        this();
    }

    private WorkProgressUpdate() {
    }
}
