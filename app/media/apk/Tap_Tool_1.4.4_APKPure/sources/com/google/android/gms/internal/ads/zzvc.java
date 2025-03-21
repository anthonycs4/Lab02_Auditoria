package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvc implements zzut {
    private final zzvu zza;
    private long zze;
    private String zzg;
    private zzqq zzh;
    private zzvb zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzvi zzb = new zzvi(7, 128);
    private final zzvi zzc = new zzvi(8, 128);
    private final zzvi zzd = new zzvi(6, 128);
    private final zzahd zzm = new zzahd();

    public zzvc(zzvu zzvuVar, boolean z, boolean z2) {
        this.zza = zzvuVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zzd(bArr, i, i2);
            this.zzc.zzd(bArr, i, i2);
        }
        this.zzd.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zze = 0L;
        this.zzl = false;
        zzagv.zze(this.zzf);
        this.zzb.zza();
        this.zzc.zza();
        this.zzd.zza();
        zzvb zzvbVar = this.zzi;
        if (zzvbVar != null) {
            zzvbVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzg = zzwfVar.zzc();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 2);
        this.zzh = zzbi;
        this.zzi = new zzvb(zzbi, false, false);
        this.zza.zza(zzpuVar, zzwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzk = j;
        this.zzl |= (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzahd r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvc.zzd(com.google.android.gms.internal.ads.zzahd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }
}
