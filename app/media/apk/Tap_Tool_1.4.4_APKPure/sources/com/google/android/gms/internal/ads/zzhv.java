package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzhv implements zzlg, zzlh {
    private final int zza;
    private zzli zzc;
    private int zzd;
    private int zze;
    private zzabx zzf;
    private zzjq[] zzg;
    private long zzh;
    private boolean zzj;
    private boolean zzk;
    private final zzjr zzb = new zzjr();
    private long zzi = Long.MIN_VALUE;

    public zzhv(int i) {
        this.zza = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjr zzB() {
        zzjr zzjrVar = this.zzb;
        zzjrVar.zzb = null;
        zzjrVar.zza = null;
        return zzjrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjq[] zzC() {
        zzjq[] zzjqVarArr = this.zzg;
        Objects.requireNonNull(zzjqVarArr);
        return zzjqVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzli zzD() {
        zzli zzliVar = this.zzc;
        Objects.requireNonNull(zzliVar);
        return zzliVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzid zzE(Throwable th, zzjq zzjqVar, boolean z) {
        int i;
        if (zzjqVar != null && !this.zzk) {
            this.zzk = true;
            try {
                int zzN = zzN(zzjqVar) & 7;
                this.zzk = false;
                i = zzN;
            } catch (zzid unused) {
                this.zzk = false;
            } catch (Throwable th2) {
                this.zzk = false;
                throw th2;
            }
            return zzid.zzc(th, zzJ(), this.zzd, zzjqVar, i, z);
        }
        i = 4;
        return zzid.zzc(th, zzJ(), this.zzd, zzjqVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public void zzI(float f, float f2) throws zzid {
    }

    @Override // com.google.android.gms.internal.ads.zzlg, com.google.android.gms.internal.ads.zzlh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzlh zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzbf() throws zzid {
        zzafs.zzd(this.zze == 1);
        this.zze = 2;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzbg(zzjq[] zzjqVarArr, zzabx zzabxVar, long j, long j2) throws zzid {
        zzafs.zzd(!this.zzj);
        this.zzf = zzabxVar;
        this.zzi = j2;
        this.zzg = zzjqVarArr;
        this.zzh = j2;
        zzv(zzjqVarArr, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzabx zzbh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzc(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public zzago zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzf(zzli zzliVar, zzjq[] zzjqVarArr, zzabx zzabxVar, long j, boolean z, boolean z2, long j2, long j3) throws zzid {
        zzafs.zzd(this.zze == 0);
        this.zzc = zzliVar;
        this.zze = 1;
        zzu(z, z2);
        zzbg(zzjqVarArr, zzabxVar, j2, j3);
        zzw(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzj() {
        return this.zzi == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final long zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzl() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzm() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzo(long j) throws zzid {
        this.zzj = false;
        this.zzi = j;
        zzw(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzp() {
        zzafs.zzd(this.zze == 2);
        this.zze = 1;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzq() {
        zzafs.zzd(this.zze == 1);
        zzjr zzjrVar = this.zzb;
        zzjrVar.zzb = null;
        zzjrVar.zza = null;
        this.zze = 0;
        this.zzf = null;
        this.zzg = null;
        this.zzj = false;
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzr() {
        zzafs.zzd(this.zze == 0);
        zzjr zzjrVar = this.zzb;
        zzjrVar.zzb = null;
        zzjrVar.zza = null;
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public int zzs() throws zzid {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public void zzt(int i, Object obj) throws zzid {
    }

    protected void zzu(boolean z, boolean z2) throws zzid {
    }

    protected void zzv(zzjq[] zzjqVarArr, long j, long j2) throws zzid {
        throw null;
    }

    protected void zzw(long j, boolean z) throws zzid {
        throw null;
    }

    protected void zzx() throws zzid {
    }

    protected void zzy() {
    }

    protected void zzz() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzG(long j) {
        zzabx zzabxVar = this.zzf;
        Objects.requireNonNull(zzabxVar);
        return zzabxVar.zze(j - this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzH() {
        if (zzj()) {
            return this.zzj;
        }
        zzabx zzabxVar = this.zzf;
        Objects.requireNonNull(zzabxVar);
        return zzabxVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzn() throws IOException {
        zzabx zzabxVar = this.zzf;
        Objects.requireNonNull(zzabxVar);
        zzabxVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzF(zzjr zzjrVar, zzol zzolVar, int i) {
        zzabx zzabxVar = this.zzf;
        Objects.requireNonNull(zzabxVar);
        int zzd = zzabxVar.zzd(zzjrVar, zzolVar, i);
        if (zzd == -4) {
            if (zzolVar.zzc()) {
                this.zzi = Long.MIN_VALUE;
                return this.zzj ? -4 : -3;
            }
            long j = zzolVar.zzd + this.zzh;
            zzolVar.zzd = j;
            this.zzi = Math.max(this.zzi, j);
        } else if (zzd == -5) {
            zzjq zzjqVar = zzjrVar.zza;
            Objects.requireNonNull(zzjqVar);
            if (zzjqVar.zzp != LongCompanionObject.MAX_VALUE) {
                zzjp zzjpVar = new zzjp(zzjqVar, null);
                zzjpVar.zzn(zzjqVar.zzp + this.zzh);
                zzjrVar.zza = new zzjq(zzjpVar, null);
                return -5;
            }
        }
        return zzd;
    }
}
