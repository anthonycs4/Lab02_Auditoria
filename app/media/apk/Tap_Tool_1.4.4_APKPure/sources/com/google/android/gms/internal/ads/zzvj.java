package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvj implements zzvs {
    private zzjq zza;
    private zzahq zzb;
    private zzqq zzc;

    public zzvj(String str) {
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj(str);
        this.zza = zzjpVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzahq zzahqVar, zzpu zzpuVar, zzwf zzwfVar) {
        this.zzb = zzahqVar;
        zzwfVar.zza();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 5);
        this.zzc = zzbi;
        zzbi.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzb(zzahd zzahdVar) {
        zzafs.zzf(this.zzb);
        int i = zzaht.zza;
        long zzc = this.zzb.zzc();
        if (zzc == -9223372036854775807L) {
            return;
        }
        zzjq zzjqVar = this.zza;
        if (zzc != zzjqVar.zzp) {
            zzjp zza = zzjqVar.zza();
            zza.zzn(zzc);
            zzjq zzD = zza.zzD();
            this.zza = zzD;
            this.zzc.zza(zzD);
        }
        int zzd = zzahdVar.zzd();
        zzqo.zzb(this.zzc, zzahdVar, zzd);
        this.zzc.zzd(this.zzb.zzb(), 1, zzd, 0, null);
    }
}
