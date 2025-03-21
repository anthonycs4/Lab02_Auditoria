package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaav implements zzaah, zzaag {
    private final zzaah zza;
    private final long zzb;
    private zzaag zzc;

    public zzaav(zzaah zzaahVar, long j) {
        this.zza = zzaahVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(zzaag zzaagVar, long j) {
        this.zzc = zzaagVar;
        this.zza.zza(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzach zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzd(long j, boolean z) {
        this.zza.zzd(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
        this.zza.zze(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzf() {
        long zzf = this.zza.zzf();
        if (zzf == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        long zzg = this.zza.zzg();
        if (zzg == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzh(long j) {
        return this.zza.zzh(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzi(long j, zzlj zzljVar) {
        return this.zza.zzi(j - this.zzb, zzljVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        long zzk = this.zza.zzk();
        if (zzk == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzk + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        return this.zza.zzl(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final /* bridge */ /* synthetic */ void zzm(zzaah zzaahVar) {
        zzaag zzaagVar = this.zzc;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzp(zzacs[] zzacsVarArr, boolean[] zArr, zzabx[] zzabxVarArr, boolean[] zArr2, long j) {
        zzabx[] zzabxVarArr2 = new zzabx[zzabxVarArr.length];
        int i = 0;
        while (true) {
            zzabx zzabxVar = null;
            if (i >= zzabxVarArr.length) {
                break;
            }
            zzaaw zzaawVar = (zzaaw) zzabxVarArr[i];
            if (zzaawVar != null) {
                zzabxVar = zzaawVar.zza();
            }
            zzabxVarArr2[i] = zzabxVar;
            i++;
        }
        long zzp = this.zza.zzp(zzacsVarArr, zArr, zzabxVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzabxVarArr.length; i2++) {
            zzabx zzabxVar2 = zzabxVarArr2[i2];
            if (zzabxVar2 == null) {
                zzabxVarArr[i2] = null;
            } else {
                zzabx zzabxVar3 = zzabxVarArr[i2];
                if (zzabxVar3 == null || ((zzaaw) zzabxVar3).zza() != zzabxVar2) {
                    zzabxVarArr[i2] = new zzaaw(zzabxVar2, this.zzb);
                }
            }
        }
        return zzp + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void zzj(zzaah zzaahVar) {
        zzaag zzaagVar = this.zzc;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzj(this);
    }
}
