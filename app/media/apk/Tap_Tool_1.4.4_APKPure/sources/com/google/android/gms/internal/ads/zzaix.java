package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaix {
    private final Handler zza;
    private final zzaiy zzb;

    public zzaix(Handler handler, zzaiy zzaiyVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzaiyVar;
    }

    public final void zza(final zzoi zzoiVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzoiVar) { // from class: com.google.android.gms.internal.ads.zzain
                private final zzaix zza;
                private final zzoi zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzoiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str, j, j2) { // from class: com.google.android.gms.internal.ads.zzaio
                private final zzaix zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zzc(final zzjq zzjqVar, final zzom zzomVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzjqVar, zzomVar) { // from class: com.google.android.gms.internal.ads.zzaip
                private final zzaix zza;
                private final zzjq zzb;
                private final zzom zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzjqVar;
                    this.zzc = zzomVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, i, j) { // from class: com.google.android.gms.internal.ads.zzaiq
                private final zzaix zza;
                private final int zzb;
                private final long zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = i;
                    this.zzc = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, j, i) { // from class: com.google.android.gms.internal.ads.zzair
                private final zzaix zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = zzaht.zza;
                }
            });
        }
    }

    public final void zzf(final int i, final int i2, final int i3, final float f) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, i, i2, i3, f) { // from class: com.google.android.gms.internal.ads.zzais
                private final zzaix zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final float zze;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = i;
                    this.zzc = i2;
                    this.zzd = i3;
                    this.zze = f;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(this.zzb, this.zzc, this.zzd, this.zze);
                }
            });
        }
    }

    public final void zzg(final Surface surface) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable(this, surface, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzait
                private final zzaix zza;
                private final Surface zzb;
                private final long zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = surface;
                    this.zzc = elapsedRealtime;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaiu
                private final zzaix zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zzi(final zzoi zzoiVar) {
        zzoiVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzoiVar) { // from class: com.google.android.gms.internal.ads.zzaiv
                private final zzaix zza;
                private final zzoi zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzoiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzb.zza();
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzaiw
                private final zzaix zza;
                private final Exception zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Surface surface, long j) {
        zzaiy zzaiyVar = this.zzb;
        int i = zzaht.zza;
        zzaiyVar.zzl(surface);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(int i, int i2, int i3, float f) {
        zzaiy zzaiyVar = this.zzb;
        int i4 = zzaht.zza;
        zzaiyVar.zzk(i, i2, i3, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(int i, long j) {
        zzaiy zzaiyVar = this.zzb;
        int i2 = zzaht.zza;
        zzaiyVar.zzj(i, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzjq zzjqVar, zzom zzomVar) {
        int i = zzaht.zza;
        this.zzb.zzi(zzjqVar, zzomVar);
    }
}
