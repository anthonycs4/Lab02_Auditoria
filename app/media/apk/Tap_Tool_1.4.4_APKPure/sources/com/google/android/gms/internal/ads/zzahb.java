package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahb {
    private static zzahb zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<zzagy>> zzc = new CopyOnWriteArrayList<>();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzahb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzagz(this, null), intentFilter);
    }

    public static synchronized zzahb zza(Context context) {
        zzahb zzahbVar;
        synchronized (zzahb.class) {
            if (zza == null) {
                zza = new zzahb(context);
            }
            zzahbVar = zza;
        }
        return zzahbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzahb zzahbVar, int i) {
        synchronized (zzahbVar.zzd) {
            if (zzahbVar.zze == i) {
                return;
            }
            zzahbVar.zze = i;
            Iterator<WeakReference<zzagy>> it = zzahbVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference<zzagy> next = it.next();
                zzagy zzagyVar = next.get();
                if (zzagyVar != null) {
                    zzagyVar.zza(i);
                } else {
                    zzahbVar.zzc.remove(next);
                }
            }
        }
    }

    public final void zzb(final zzagy zzagyVar) {
        Iterator<WeakReference<zzagy>> it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference<zzagy> next = it.next();
            if (next.get() == null) {
                this.zzc.remove(next);
            }
        }
        this.zzc.add(new WeakReference<>(zzagyVar));
        this.zzb.post(new Runnable(this, zzagyVar) { // from class: com.google.android.gms.internal.ads.zzagw
            private final zzahb zza;
            private final zzagy zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzagyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzb.zza(this.zza.zzc());
            }
        });
    }

    public final int zzc() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }
}
