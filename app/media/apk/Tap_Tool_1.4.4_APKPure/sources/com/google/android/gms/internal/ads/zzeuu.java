package com.google.android.gms.internal.ads;

import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeuu {
    private final int zzb;
    private final int zzc;
    private final LinkedList<zzeve<?>> zza = new LinkedList<>();
    private final zzevt zzd = new zzevt();

    public zzeuu(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() - this.zza.getFirst().zzd >= this.zzc) {
            this.zzd.zzc();
            this.zza.remove();
        }
    }

    public final boolean zza(zzeve<?> zzeveVar) {
        this.zzd.zza();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzeveVar);
        return true;
    }

    public final zzeve<?> zzb() {
        this.zzd.zza();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzeve<?> remove = this.zza.remove();
        if (remove != null) {
            this.zzd.zzb();
        }
        return remove;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzevs zzh() {
        return this.zzd.zzg();
    }
}
