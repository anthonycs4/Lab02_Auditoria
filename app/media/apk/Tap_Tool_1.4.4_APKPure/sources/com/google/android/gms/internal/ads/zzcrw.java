package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcrw extends zzcqo {
    private final zzbjx zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcrw(zzcsm zzcsmVar, zzbjx zzbjxVar, Runnable runnable, Executor executor) {
        super(zzcsmVar);
        this.zzc = zzbjxVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcsn
    public final void zzQ() {
        final AtomicReference atomicReference = new AtomicReference(this.zzd);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.zzcru
            private final AtomicReference zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.zza.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.zze.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.zzcrv
            private final zzcrw zza;
            private final Runnable zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final View zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final void zzb(ViewGroup viewGroup, zzazx zzazxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzbdj zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzest zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzest zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final int zzg() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final void zzh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
