package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvg implements zzut {
    private final String zza;
    private final zzahd zzb;
    private final zzahc zzc;
    private zzqq zzd;
    private String zze;
    private zzjq zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzvg(String str) {
        this.zza = str;
        zzahd zzahdVar = new zzahd(1024);
        this.zzb = zzahdVar;
        byte[] zzi = zzahdVar.zzi();
        this.zzc = new zzahc(zzi, zzi.length);
    }

    private final int zzf(zzahc zzahcVar) throws zzkr {
        int zzb = zzahcVar.zzb();
        zzlt zzb2 = zzlu.zzb(zzahcVar, true);
        this.zzu = zzb2.zzc;
        this.zzr = zzb2.zza;
        this.zzt = zzb2.zzb;
        return zzb - zzahcVar.zzb();
    }

    private static long zzg(zzahc zzahcVar) {
        return zzahcVar.zzh((zzahcVar.zzh(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzg = 0;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzd = zzpuVar.zzbi(zzwfVar.zzb(), 1);
        this.zze = zzwfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzk = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r13.zzl == false) goto L102;
     */
    @Override // com.google.android.gms.internal.ads.zzut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzahd r14) throws com.google.android.gms.internal.ads.zzkr {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvg.zzd(com.google.android.gms.internal.ads.zzahd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }
}
