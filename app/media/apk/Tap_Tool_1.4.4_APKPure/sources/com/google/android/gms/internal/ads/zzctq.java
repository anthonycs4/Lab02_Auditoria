package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzctq<T> {
    private final zzdtx zza;
    private final zzetk zzb;
    private final zzexl zzc;
    private final zzcnn zzd;
    private final zzebt<T> zze;
    private final zzdaz zzf;
    private final zzete zzg;
    private final zzduy zzh;
    private final zzcvn zzi;
    private final Executor zzj;
    private final zzdum zzk;
    private final zzdyf zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctq(zzdtx zzdtxVar, zzetk zzetkVar, zzexl zzexlVar, zzcnn zzcnnVar, zzebt<T> zzebtVar, zzdaz zzdazVar, zzete zzeteVar, zzduy zzduyVar, zzcvn zzcvnVar, Executor executor, zzdum zzdumVar, zzdyf zzdyfVar) {
        this.zza = zzdtxVar;
        this.zzb = zzetkVar;
        this.zzc = zzexlVar;
        this.zzd = zzcnnVar;
        this.zze = zzebtVar;
        this.zzf = zzdazVar;
        this.zzg = zzeteVar;
        this.zzh = zzduyVar;
        this.zzi = zzcvnVar;
        this.zzj = executor;
        this.zzk = zzdumVar;
        this.zzl = zzdyfVar;
    }

    public final zzfla<zzete> zza(zzfla<zzbxf> zzflaVar) {
        if (this.zzg != null) {
            zzexl zzexlVar = this.zzc;
            return zzeww.zza(zzfks.zza(this.zzg), zzexf.SERVER_TRANSACTION, zzexlVar).zzi();
        }
        com.google.android.gms.ads.internal.zzs.zzi().zzb();
        return this.zzc.zza(zzexf.SERVER_TRANSACTION, zzflaVar).zzc(zzctl.zzb(this.zzk)).zzi();
    }

    public final zzfla<T> zzc(zzfla<zzete> zzflaVar) {
        zzexc zzc = this.zzc.zza(zzexf.RENDERER, zzflaVar).zzb(new zzewp(this) { // from class: com.google.android.gms.internal.ads.zzctm
            private final zzctq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzewp
            public final Object zza(Object obj) {
                zzete zzeteVar = (zzete) obj;
                this.zza.zzi(zzeteVar);
                return zzeteVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzdI)).booleanValue()) {
            zzc = zzc.zzh(((Integer) zzbba.zzc().zzb(zzbfq.zzdJ)).intValue(), TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final zzdaz zzd() {
        return this.zzf;
    }

    public final zzfla<zzbxf> zze(final zzevc zzevcVar) {
        zzewr zzi = this.zzc.zza(zzexf.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzfjz(this, zzevcVar) { // from class: com.google.android.gms.internal.ads.zzctn
            private final zzctq zza;
            private final zzevc zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzevcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzh(this.zzb, (zzbxf) obj);
            }
        }).zzi();
        zzfks.zzp(zzi, new zzcto(this), this.zzj);
        return zzi;
    }

    public final zzfla<Void> zzf(zzbxf zzbxfVar) {
        zzewr zzi = this.zzc.zza(zzexf.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbxfVar)).zzi();
        zzfks.zzp(zzi, new zzctp(this), this.zzj);
        return zzi;
    }

    public final zzazm zzg(Throwable th) {
        return zzeuf.zzb(th, this.zzl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzh(zzevc zzevcVar, zzbxf zzbxfVar) throws Exception {
        zzbxfVar.zzi = zzevcVar;
        return this.zzh.zza(zzbxfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzete zzi(zzete zzeteVar) throws Exception {
        this.zzd.zza(zzeteVar);
        return zzeteVar;
    }

    public final zzfla<zzete> zzb() {
        zzazs zzazsVar = this.zzb.zzd;
        if (zzazsVar.zzx != null || zzazsVar.zzs != null) {
            zzexl zzexlVar = this.zzc;
            return zzeww.zza(this.zza.zza(), zzexf.SERVER_TRANSACTION, zzexlVar).zzi();
        }
        return zza(this.zzi.zzb());
    }
}
