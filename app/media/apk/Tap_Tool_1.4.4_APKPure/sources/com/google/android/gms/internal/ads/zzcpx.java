package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpx extends zzcsn {
    private final View zzc;
    private final zzcib zzd;
    private final zzest zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcpp zzi;
    private zzauf zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpx(zzcsm zzcsmVar, View view, zzcib zzcibVar, zzest zzestVar, int i, boolean z, boolean z2, zzcpp zzcppVar) {
        super(zzcsmVar);
        this.zzc = view;
        this.zzd = zzcibVar;
        this.zze = zzestVar;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcppVar;
    }

    public final zzest zza() {
        return zzeto.zza(this.zzb.zzq, this.zze);
    }

    public final View zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzd.zzR() != null && this.zzd.zzR().zzc();
    }

    public final boolean zzg() {
        return this.zzd.zzT();
    }

    public final void zzh(zzatv zzatvVar) {
        this.zzd.zzax(zzatvVar);
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    public final void zzj(zzauf zzaufVar) {
        this.zzj = zzaufVar;
    }

    public final zzauf zzk() {
        return this.zzj;
    }
}
