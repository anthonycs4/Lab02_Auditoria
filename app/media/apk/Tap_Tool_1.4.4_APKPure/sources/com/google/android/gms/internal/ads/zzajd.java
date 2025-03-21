package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzajd implements zzajy, zzajz {
    private final int zza;
    private zzaka zzb;
    private int zzc;
    private int zzd;
    private zzapg zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzajd(int i) {
        this.zza = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzA(zzaju zzajuVar, zzalm zzalmVar, boolean z) {
        int zzc = this.zze.zzc(zzajuVar, zzalmVar, z);
        if (zzc == -4) {
            if (zzalmVar.zzc()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzalmVar.zzc += this.zzf;
        } else if (zzc == -5) {
            zzajt zzajtVar = zzajuVar.zza;
            long j = zzajtVar.zzw;
            if (j != LongCompanionObject.MAX_VALUE) {
                zzajuVar.zza = new zzajt(zzajtVar.zza, zzajtVar.zze, zzajtVar.zzf, zzajtVar.zzc, zzajtVar.zzb, zzajtVar.zzg, zzajtVar.zzj, zzajtVar.zzk, zzajtVar.zzl, zzajtVar.zzm, zzajtVar.zzn, zzajtVar.zzp, zzajtVar.zzo, zzajtVar.zzq, zzajtVar.zzr, zzajtVar.zzs, zzajtVar.zzt, zzajtVar.zzu, zzajtVar.zzv, zzajtVar.zzx, zzajtVar.zzy, zzajtVar.zzz, j + this.zzf, zzajtVar.zzh, zzajtVar.zzi, zzajtVar.zzd);
                return -5;
            }
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB(long j) {
        this.zze.zzd(j - this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzajy, com.google.android.gms.internal.ads.zzajz
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzajz zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public zzaqy zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzf(zzaka zzakaVar, zzajt[] zzajtVarArr, zzapg zzapgVar, long j, boolean z, long j2) throws zzajf {
        zzaqu.zzd(this.zzd == 0);
        this.zzb = zzakaVar;
        this.zzd = 1;
        zzs(z);
        zzh(zzajtVarArr, zzapgVar, j2);
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzg() throws zzajf {
        zzaqu.zzd(this.zzd == 1);
        this.zzd = 2;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzh(zzajt[] zzajtVarArr, zzapg zzapgVar, long j) throws zzajf {
        zzaqu.zzd(!this.zzh);
        this.zze = zzapgVar;
        this.zzg = false;
        this.zzf = j;
        zzt(zzajtVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final zzapg zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final boolean zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzk() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final boolean zzl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzm() throws IOException {
        this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzn(long j) throws zzajf {
        this.zzh = false;
        this.zzg = false;
        zzu(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzo() throws zzajf {
        zzaqu.zzd(this.zzd == 2);
        this.zzd = 1;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzp() {
        zzaqu.zzd(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public int zzq() throws zzajf {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    public void zzr(int i, Object obj) throws zzajf {
    }

    protected void zzs(boolean z) throws zzajf {
    }

    protected void zzt(zzajt[] zzajtVarArr, long j) throws zzajf {
    }

    protected void zzu(long j, boolean z) throws zzajf {
        throw null;
    }

    protected void zzv() throws zzajf {
    }

    protected void zzw() throws zzajf {
    }

    protected void zzx() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaka zzy() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzz() {
        return this.zzc;
    }
}
