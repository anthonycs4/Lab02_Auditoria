package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzagl<T> {
    private final zzaft zza;
    private final zzagf zzb;
    private final zzagj<T> zzc;
    private final CopyOnWriteArraySet<zzagk<T>> zzd;
    private final ArrayDeque<Runnable> zze;
    private final ArrayDeque<Runnable> zzf;
    private boolean zzg;

    public zzagl(Looper looper, zzaft zzaftVar, zzagj<T> zzagjVar) {
        CopyOnWriteArraySet<zzagk<T>> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.zza = zzaftVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzagjVar;
        this.zze = new ArrayDeque<>();
        this.zzf = new ArrayDeque<>();
        this.zzb = zzaftVar.zza(looper, new Handler.Callback(this) { // from class: com.google.android.gms.internal.ads.zzagg
            private final zzagl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                this.zza.zzf(message);
                return true;
            }
        });
    }

    public final void zza(T t) {
        if (this.zzg) {
            return;
        }
        this.zzd.add(new zzagk<>(t));
    }

    public final void zzb(T t) {
        Iterator<zzagk<T>> it = this.zzd.iterator();
        while (it.hasNext()) {
            zzagk<T> next = it.next();
            if (next.zza.equals(t)) {
                next.zza(this.zzc);
                this.zzd.remove(next);
            }
        }
    }

    public final void zzc(final int i, final zzagi<T> zzagiVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable(copyOnWriteArraySet, i, zzagiVar) { // from class: com.google.android.gms.internal.ads.zzagh
            private final CopyOnWriteArraySet zza;
            private final int zzb;
            private final zzagi zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = copyOnWriteArraySet;
                this.zzb = i;
                this.zzc = zzagiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = this.zza;
                int i2 = this.zzb;
                zzagi zzagiVar2 = this.zzc;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzagk) it.next()).zzb(i2, zzagiVar2);
                }
            }
        });
    }

    public final void zzd() {
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zza(0)) {
            this.zzb.zzb(0).zza();
        }
        boolean isEmpty = this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.zze.isEmpty()) {
            this.zze.peekFirst().run();
            this.zze.removeFirst();
        }
    }

    public final void zze() {
        Iterator<zzagk<T>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zza(this.zzc);
        }
        this.zzd.clear();
        this.zzg = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ boolean zzf(Message message) {
        if (message.what == 0) {
            Iterator<zzagk<T>> it = this.zzd.iterator();
            while (it.hasNext()) {
                it.next().zzc(this.zzc);
                if (this.zzb.zza(0)) {
                    break;
                }
            }
        } else if (message.what == 1) {
            zzc(message.arg1, (zzagi) message.obj);
            zzd();
            zze();
        }
        return true;
    }
}
