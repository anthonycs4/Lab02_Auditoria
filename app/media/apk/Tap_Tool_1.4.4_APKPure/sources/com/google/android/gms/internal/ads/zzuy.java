package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzuy implements zzut {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzwi zzb;
    private final zzahd zzc;
    private final boolean[] zzd;
    private final zzuw zze;
    private final zzvi zzf;
    private zzux zzg;
    private long zzh;
    private String zzi;
    private zzqq zzj;
    private boolean zzk;
    private long zzl;

    public zzuy() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        zzagv.zze(this.zzd);
        this.zze.zza();
        zzux zzuxVar = this.zzg;
        if (zzuxVar != null) {
            zzuxVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzi = zzwfVar.zzc();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 2);
        this.zzj = zzbi;
        this.zzg = new zzux(zzbi);
        this.zzb.zza(zzpuVar, zzwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzahd r19) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuy.zzd(com.google.android.gms.internal.ads.zzahd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuy(zzwi zzwiVar) {
        this.zzb = zzwiVar;
        this.zzd = new boolean[4];
        this.zze = new zzuw(128);
        this.zzf = new zzvi(178, 128);
        this.zzc = new zzahd();
    }
}
