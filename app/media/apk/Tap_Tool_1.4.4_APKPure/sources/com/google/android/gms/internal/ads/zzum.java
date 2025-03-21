package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzum implements zzut {
    private final zzahc zza;
    private final zzahd zzb;
    private final String zzc;
    private String zzd;
    private zzqq zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private zzjq zzk;
    private int zzl;
    private long zzm;

    public zzum() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzd = zzwfVar.zzc();
        this.zze = zzpuVar.zzbi(zzwfVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzahd r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.zzd(com.google.android.gms.internal.ads.zzahd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    public zzum(String str) {
        zzahc zzahcVar = new zzahc(new byte[16], 16);
        this.zza = zzahcVar;
        this.zzb = new zzahd(zzahcVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzc = str;
    }
}
