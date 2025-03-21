package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzms {
    private final Handler zza;
    private final zzmt zzb;

    public zzms(Handler handler, zzmt zzmtVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzmtVar;
    }

    public final void zza(final zzoi zzoiVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzoiVar) { // from class: com.google.android.gms.internal.ads.zzmi
                private final zzms zza;
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
            handler.post(new Runnable(this, str, j, j2) { // from class: com.google.android.gms.internal.ads.zzmj
                private final zzms zza;
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
            handler.post(new Runnable(this, zzjqVar, zzomVar) { // from class: com.google.android.gms.internal.ads.zzmk
                private final zzms zza;
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
                    this.zza.zzk(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, j) { // from class: com.google.android.gms.internal.ads.zzml
                private final zzms zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzmm
                private final zzms zza;

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

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzmn
                private final zzms zza;
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

    public final void zzg(final zzoi zzoiVar) {
        zzoiVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzoiVar) { // from class: com.google.android.gms.internal.ads.zzmo
                private final zzms zza;
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

    public final void zzh(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzmp
                private final zzms zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzaht.zza;
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzmq
                private final zzms zza;
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

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzmr
                private final zzms zza;
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
    public final /* synthetic */ void zzk(zzjq zzjqVar, zzom zzomVar) {
        int i = zzaht.zza;
        this.zzb.zzh(zzjqVar, zzomVar);
    }
}
