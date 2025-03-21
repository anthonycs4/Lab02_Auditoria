package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvb {
    private final zzqq zza;
    private final zzahe zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray<zzagu> zzb = new SparseArray<>();
    private final SparseArray<zzagt> zzc = new SparseArray<>();
    private final zzva zzi = new zzva(null);
    private final zzva zzj = new zzva(null);
    private boolean zzk = false;

    public zzvb(zzqq zzqqVar, boolean z, boolean z2) {
        this.zza = zzqqVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzahe(bArr, 0, 0);
    }

    public final void zza(zzagu zzaguVar) {
        this.zzb.append(zzaguVar.zzd, zzaguVar);
    }

    public final void zzb(zzagt zzagtVar) {
        this.zzc.append(zzagtVar.zza, zzagtVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j, int i, long j2) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
    }

    public final boolean zze(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j2 = this.zzg;
                boolean z4 = this.zzn;
                long j3 = this.zzl;
                this.zza.zzd(this.zzm, z4 ? 1 : 0, (int) (j2 - j3), i + ((int) (j - j2)), null);
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z5 = this.zzn;
        int i2 = this.zzf;
        if (i2 == 5 || (z2 && i2 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzn = z6;
        return z6;
    }
}
