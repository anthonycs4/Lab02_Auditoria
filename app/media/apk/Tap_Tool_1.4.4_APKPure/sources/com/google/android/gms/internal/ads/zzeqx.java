package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqx implements zzefu<zzddu> {
    private final Context zza;
    private final Executor zzb;
    private final zzcjz zzc;
    private final zzefe zzd;
    private final zzerw zze;
    private zzbgl zzf;
    private final zzetj zzg;
    private zzfla<zzddu> zzh;

    public zzeqx(Context context, Executor executor, zzcjz zzcjzVar, zzefe zzefeVar, zzerw zzerwVar, zzetj zzetjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjzVar;
        this.zzd = zzefeVar;
        this.zzg = zzetjVar;
        this.zze = zzerwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfla zze(zzeqx zzeqxVar, zzfla zzflaVar) {
        zzeqxVar.zzh = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zza(zzazs zzazsVar, String str, zzefs zzefsVar, zzeft<? super zzddu> zzeftVar) {
        zzder zza;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeqr
                private final zzeqx zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
            return false;
        } else if (zzb()) {
            return false;
        } else {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzazsVar.zzf) {
                this.zzc.zzz().zzc(true);
            }
            zzazx zzazxVar = ((zzeqq) zzefsVar).zza;
            zzetj zzetjVar = this.zzg;
            zzetjVar.zzf(str);
            zzetjVar.zzc(zzazxVar);
            zzetjVar.zza(zzazsVar);
            zzetk zzu = zzetjVar.zzu();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfv)).booleanValue()) {
                zzdeq zzp = this.zzc.zzp();
                zzcvs zzcvsVar = new zzcvs();
                zzcvsVar.zza(this.zza);
                zzcvsVar.zzb(zzu);
                zzp.zzc(zzcvsVar.zzd());
                zzdbg zzdbgVar = new zzdbg();
                zzdbgVar.zzl(this.zzd, this.zzb);
                zzdbgVar.zze(this.zzd, this.zzb);
                zzp.zzd(zzdbgVar.zzm());
                zzp.zzb(new zzedp(this.zzf));
                zza = zzp.zza();
            } else {
                zzdbg zzdbgVar2 = new zzdbg();
                zzerw zzerwVar = this.zze;
                if (zzerwVar != null) {
                    zzdbgVar2.zza(zzerwVar, this.zzb);
                    zzdbgVar2.zzb(this.zze, this.zzb);
                    zzdbgVar2.zzc(this.zze, this.zzb);
                }
                zzdeq zzp2 = this.zzc.zzp();
                zzcvs zzcvsVar2 = new zzcvs();
                zzcvsVar2.zza(this.zza);
                zzcvsVar2.zzb(zzu);
                zzp2.zzc(zzcvsVar2.zzd());
                zzdbgVar2.zzl(this.zzd, this.zzb);
                zzdbgVar2.zza(this.zzd, this.zzb);
                zzdbgVar2.zzb(this.zzd, this.zzb);
                zzdbgVar2.zzc(this.zzd, this.zzb);
                zzdbgVar2.zzf(this.zzd, this.zzb);
                zzdbgVar2.zze(this.zzd, this.zzb);
                zzdbgVar2.zzj(this.zzd, this.zzb);
                zzdbgVar2.zzd(this.zzd, this.zzb);
                zzp2.zzd(zzdbgVar2.zzm());
                zzp2.zzb(new zzedp(this.zzf));
                zza = zzp2.zza();
            }
            zzctq<zzddu> zzb = zza.zzb();
            zzfla<zzddu> zzc = zzb.zzc(zzb.zzb());
            this.zzh = zzc;
            zzfks.zzp(zzc, new zzeqw(this, zzeftVar, zza), this.zzb);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zzb() {
        zzfla<zzddu> zzflaVar = this.zzh;
        return (zzflaVar == null || zzflaVar.isDone()) ? false : true;
    }

    public final void zzc(zzbgl zzbglVar) {
        this.zzf = zzbglVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd.zzbM(zzeuf.zzd(6, null, null));
    }
}
