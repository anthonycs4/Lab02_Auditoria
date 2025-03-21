package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcli implements zzcpq {
    final /* synthetic */ zzcmk zza;
    private zzdbh zzb;
    private zzcvt zzc;
    private zzete zzd;
    private zzeqp zze;
    private zzepr zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcli(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final /* bridge */ /* synthetic */ zzcpq zza(zzcvt zzcvtVar) {
        this.zzc = zzcvtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final /* bridge */ /* synthetic */ zzcpq zzb(zzdbh zzdbhVar) {
        this.zzb = zzdbhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcpr zzf() {
        zzgdw.zzc(this.zzb, zzdbh.class);
        zzgdw.zzc(this.zzc, zzcvt.class);
        return new zzclk(this.zza, new zzcts(), new zzeui(), new zzcvb(), new zzdqa(), this.zzb, this.zzc, new zzeum(), this.zzd, this.zze, this.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzcpr> zzg(zzepr zzeprVar) {
        this.zzf = zzeprVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzcpr> zzh(zzeqp zzeqpVar) {
        this.zze = zzeqpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final /* bridge */ /* synthetic */ zzcvp<zzcpr> zzi(zzete zzeteVar) {
        this.zzd = zzeteVar;
        return this;
    }
}
