package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzchd {
    private final zzaek zza = new zzaek(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zzj(false);
    }

    public final void zzb() {
        zzj(true);
    }

    public final void zzc() {
        zzj(true);
    }

    public final boolean zzd(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final boolean zze(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    public final synchronized void zzf(int i) {
        this.zzb = i * 1000;
    }

    public final synchronized void zzg(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zze = i * 1000;
    }

    final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }

    public final zzaek zzk() {
        return this.zza;
    }

    public final void zzl(zzlg[] zzlgVarArr, zzach zzachVar, zzacs[] zzacsVarArr) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzacsVarArr[i] != null) {
                this.zzf += zzlgVarArr[i].zza() != 1 ? 131072000 : 13107200;
            }
        }
        this.zza.zzb(this.zzf);
    }
}
