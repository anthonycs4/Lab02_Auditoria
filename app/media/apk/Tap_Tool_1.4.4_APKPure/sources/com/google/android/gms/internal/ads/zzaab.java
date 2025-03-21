package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaab implements zzaah, zzaag {
    public final zzaaj zza;
    private final long zzb;
    private zzaal zzc;
    private zzaah zzd;
    private zzaag zze;
    private long zzf = -9223372036854775807L;
    private final zzaek zzg;

    public zzaab(zzaaj zzaajVar, zzaek zzaekVar, long j, byte[] bArr) {
        this.zza = zzaajVar;
        this.zzg = zzaekVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(zzaag zzaagVar, long j) {
        this.zze = zzaagVar;
        zzaah zzaahVar = this.zzd;
        if (zzaahVar != null) {
            zzaahVar.zza(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() throws IOException {
        try {
            zzaah zzaahVar = this.zzd;
            if (zzaahVar != null) {
                zzaahVar.zzb();
                return;
            }
            zzaal zzaalVar = this.zzc;
            if (zzaalVar != null) {
                zzaalVar.zzt();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzach zzc() {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzd(long j, boolean z) {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        zzaahVar.zzd(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        zzaahVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzf() {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzh(long j) {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzh(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzi(long j, zzlj zzljVar) {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzi(j, zzljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void zzj(zzaah zzaahVar) {
        zzaag zzaagVar = this.zze;
        int i = zzaht.zza;
        zzaagVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        zzaah zzaahVar = this.zzd;
        return zzaahVar != null && zzaahVar.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final /* bridge */ /* synthetic */ void zzm(zzaah zzaahVar) {
        zzaag zzaagVar = this.zze;
        int i = zzaht.zza;
        zzaagVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        zzaah zzaahVar = this.zzd;
        return zzaahVar != null && zzaahVar.zzn();
    }

    public final long zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzp(zzacs[] zzacsVarArr, boolean[] zArr, zzabx[] zzabxVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzaah zzaahVar = this.zzd;
        int i = zzaht.zza;
        return zzaahVar.zzp(zzacsVarArr, zArr, zzabxVarArr, zArr2, j2);
    }

    public final void zzq(long j) {
        this.zzf = j;
    }

    public final long zzr() {
        return this.zzf;
    }

    public final void zzs(zzaal zzaalVar) {
        zzafs.zzd(this.zzc == null);
        this.zzc = zzaalVar;
    }

    public final void zzu() {
        zzaah zzaahVar = this.zzd;
        if (zzaahVar != null) {
            zzaal zzaalVar = this.zzc;
            Objects.requireNonNull(zzaalVar);
            zzaalVar.zzz(zzaahVar);
        }
    }

    public final void zzt(zzaaj zzaajVar) {
        long zzv = zzv(this.zzb);
        zzaal zzaalVar = this.zzc;
        Objects.requireNonNull(zzaalVar);
        zzaah zzB = zzaalVar.zzB(zzaajVar, this.zzg, zzv);
        this.zzd = zzB;
        if (this.zze != null) {
            zzB.zza(this, zzv);
        }
    }
}
