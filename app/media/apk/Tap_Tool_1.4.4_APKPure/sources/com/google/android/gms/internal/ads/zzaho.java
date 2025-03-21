package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaho implements zzagf {
    private static final List<zzahn> zza = new ArrayList(50);
    private final Handler zzb;

    public zzaho(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzk(zzahn zzahnVar) {
        List<zzahn> list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzahnVar);
            }
        }
    }

    private static zzahn zzl() {
        zzahn zzahnVar;
        List<zzahn> list = zza;
        synchronized (list) {
            zzahnVar = list.isEmpty() ? new zzahn(null) : list.remove(list.size() - 1);
        }
        return zzahnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final boolean zza(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final zzage zzb(int i) {
        zzahn zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final zzage zzc(int i, Object obj) {
        zzahn zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final zzage zzd(int i, int i2, int i3) {
        zzahn zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, 0), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final boolean zze(zzage zzageVar) {
        return ((zzahn) zzageVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final boolean zzf(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final boolean zzg(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final void zzh(int i) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final void zzi(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final boolean zzj(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
