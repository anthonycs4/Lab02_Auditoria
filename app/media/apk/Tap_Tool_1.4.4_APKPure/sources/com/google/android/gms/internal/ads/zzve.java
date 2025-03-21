package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzve implements zzut {
    private final zzvu zza;
    private String zzb;
    private zzqq zzc;
    private zzvd zzd;
    private boolean zze;
    private long zzl;
    private long zzm;
    private final boolean[] zzf = new boolean[3];
    private final zzvi zzg = new zzvi(32, 128);
    private final zzvi zzh = new zzvi(33, 128);
    private final zzvi zzi = new zzvi(34, 128);
    private final zzvi zzj = new zzvi(39, 128);
    private final zzvi zzk = new zzvi(40, 128);
    private final zzahd zzn = new zzahd();

    public zzve(zzvu zzvuVar) {
        this.zza = zzvuVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzl = 0L;
        zzagv.zze(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        zzvd zzvdVar = this.zzd;
        if (zzvdVar != null) {
            zzvdVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzb = zzwfVar.zzc();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 2);
        this.zzc = zzbi;
        this.zzd = new zzvd(zzbi);
        this.zza.zza(zzpuVar, zzwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzahd r30) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zzd(com.google.android.gms.internal.ads.zzahd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }
}
