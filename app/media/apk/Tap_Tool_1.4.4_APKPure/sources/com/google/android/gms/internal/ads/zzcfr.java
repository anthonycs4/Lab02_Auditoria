package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcfr {
    private final zzaqh zza = new zzaqh(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zzk(false);
    }

    public final void zzb(zzajy[] zzajyVarArr, zzapl zzaplVar, zzapx zzapxVar) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzapxVar.zza(i) != null) {
                this.zzf += zzarj.zzq(zzajyVarArr[i].zza());
            }
        }
        this.zza.zzb(this.zzf);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final synchronized boolean zze(long j, boolean z) {
        long j2;
        j2 = z ? this.zze : this.zzd;
        return j2 <= 0 || j >= j2;
    }

    public final synchronized boolean zzf(long j) {
        boolean z;
        z = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final synchronized void zzg(int i) {
        this.zzb = i * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzj(int i) {
        this.zze = i * 1000;
    }

    final void zzk(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }

    public final zzaqh zzl() {
        return this.zza;
    }
}
