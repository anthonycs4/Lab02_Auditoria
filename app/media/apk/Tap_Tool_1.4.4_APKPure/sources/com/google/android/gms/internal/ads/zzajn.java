package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzajn {
    public final zzaou zza;
    public final Object zzb;
    public final int zzc;
    public final zzapg[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzajn zzl;
    public zzaqa zzm;
    private final zzajy[] zzn;
    private final zzajz[] zzo;
    private final zzapz zzp;
    private final zzaow zzq;
    private zzaqa zzr;
    private final zzcfr zzs;

    public final boolean zza() {
        return this.zzj && (!this.zzk || this.zza.zzj() == Long.MIN_VALUE);
    }

    public final boolean zzb() throws zzajf {
        zzaqa zzd = this.zzp.zzd(this.zzo, this.zza.zzg());
        zzaqa zzaqaVar = this.zzr;
        if (zzaqaVar != null) {
            for (int i = 0; i < 2; i++) {
                if (zzd.zza(zzaqaVar, i)) {
                }
            }
            return false;
        }
        this.zzm = zzd;
        return true;
    }

    public final long zzc(long j, boolean z) {
        return zzd(j, false, new boolean[2]);
    }

    public final long zzd(long j, boolean z, boolean[] zArr) {
        zzapx zzapxVar = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zzB = this.zza.zzB(zzapxVar.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzapg[] zzapgVarArr = this.zzd;
            if (i2 >= 2) {
                this.zzs.zzb(this.zzn, this.zzm.zza, zzapxVar);
                return zzB;
            }
            if (zzapgVarArr[i2] != null) {
                zzaqu.zzd(zzapxVar.zza(i2) != null);
                this.zzk = true;
            } else {
                zzaqu.zzd(zzapxVar.zza(i2) == null);
            }
            i2++;
        }
    }

    public final void zze() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public zzajn(zzajy[] zzajyVarArr, zzajz[] zzajzVarArr, long j, zzapz zzapzVar, zzcfr zzcfrVar, zzaow zzaowVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzajyVarArr;
        this.zzo = zzajzVarArr;
        this.zzf = j;
        this.zzp = zzapzVar;
        this.zzs = zzcfrVar;
        this.zzq = zzaowVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i;
        this.zzg = i2;
        this.zzi = z;
        this.zzh = j2;
        this.zzd = new zzapg[2];
        this.zze = new boolean[2];
        this.zza = zzaowVar.zze(i2, zzcfrVar.zzl());
    }
}
