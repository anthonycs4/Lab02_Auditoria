package com.google.android.gms.internal.ads;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzib implements zzago {
    private final zzahk zza;
    private final zzia zzb;
    private zzlg zzc;
    private zzago zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzib(zzia zziaVar, zzaft zzaftVar) {
        this.zzb = zziaVar;
        this.zza = new zzahk(zzaftVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzlg zzlgVar) throws zzid {
        zzago zzagoVar;
        zzago zzd = zzlgVar.zzd();
        if (zzd == null || zzd == (zzagoVar = this.zzd)) {
            return;
        }
        if (zzagoVar == null) {
            this.zzd = zzd;
            this.zzc = zzlgVar;
            zzd.zzh(this.zza.zzi());
            return;
        }
        throw zzid.zzd(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public final void zze(zzlg zzlgVar) {
        if (zzlgVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        zzlg zzlgVar = this.zzc;
        if (zzlgVar == null || zzlgVar.zzM() || (!this.zzc.zzL() && (z || this.zzc.zzj()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzago zzagoVar = this.zzd;
            Objects.requireNonNull(zzagoVar);
            long zzg = zzagoVar.zzg();
            if (this.zze) {
                if (zzg < this.zza.zzg()) {
                    this.zza.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zza();
                    }
                }
            }
            this.zza.zzc(zzg);
            zzku zzi = zzagoVar.zzi();
            if (!zzi.equals(this.zza.zzi())) {
                this.zza.zzh(zzi);
                this.zzb.zza(zzi);
            }
        }
        if (this.zze) {
            return this.zza.zzg();
        }
        zzago zzagoVar2 = this.zzd;
        Objects.requireNonNull(zzagoVar2);
        return zzagoVar2.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final long zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzh(zzku zzkuVar) {
        zzago zzagoVar = this.zzd;
        if (zzagoVar != null) {
            zzagoVar.zzh(zzkuVar);
            zzkuVar = this.zzd.zzi();
        }
        this.zza.zzh(zzkuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final zzku zzi() {
        zzago zzagoVar = this.zzd;
        return zzagoVar != null ? zzagoVar.zzi() : this.zza.zzi();
    }
}
