package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcmf implements zzdmf {
    final /* synthetic */ zzcmk zza;
    private zzdbh zzb;
    private zzcvt zzc;
    private zzete zzd;
    private zzeqp zze;
    private zzepr zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmf(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    /* renamed from: zza */
    public final zzdmg zzf() {
        zzgdw.zzc(this.zzb, zzdbh.class);
        zzgdw.zzc(this.zzc, zzcvt.class);
        return new zzcmh(this.zza, new zzcts(), new zzeui(), new zzcvb(), new zzdqa(), this.zzb, this.zzc, new zzeum(), this.zzd, this.zze, this.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdmf
    public final /* bridge */ /* synthetic */ zzdmf zzb(zzcvt zzcvtVar) {
        this.zzc = zzcvtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmf
    public final /* bridge */ /* synthetic */ zzdmf zzc(zzdbh zzdbhVar) {
        this.zzb = zzdbhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzdmg> zzg(zzepr zzeprVar) {
        this.zzf = zzeprVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzdmg> zzh(zzeqp zzeqpVar) {
        this.zze = zzeqpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzdmg> zzi(zzete zzeteVar) {
        this.zzd = zzeteVar;
        return this;
    }
}
