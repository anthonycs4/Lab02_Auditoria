package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegb implements zzefu<zzcsn> {
    private final zzetj zza;
    private final zzcjz zzb;
    private final Context zzc;
    private final zzefr zzd;
    private zzctb zze;

    public zzegb(zzcjz zzcjzVar, Context context, zzefr zzefrVar, zzetj zzetjVar) {
        this.zzb = zzcjzVar;
        this.zzc = context;
        this.zzd = zzefrVar;
        this.zza = zzetjVar;
        zzetjVar.zzs(zzefrVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zza(zzazs zzazsVar, String str, zzefs zzefsVar, zzeft<? super zzcsn> zzeftVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzK(this.zzc) && zzazsVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzefw
                private final zzegb zza;

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
        } else if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzefx
                private final zzegb zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
            return false;
        } else {
            zzeua.zzb(this.zzc, zzazsVar.zzf);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzazsVar.zzf) {
                this.zzb.zzz().zzc(true);
            }
            int i = ((zzefv) zzefsVar).zza;
            zzetj zzetjVar = this.zza;
            zzetjVar.zza(zzazsVar);
            zzetjVar.zzk(i);
            zzetk zzu = zzetjVar.zzu();
            if (zzu.zzn != null) {
                this.zzd.zzc().zzo(zzu.zzn);
            }
            zzdfm zzr = this.zzb.zzr();
            zzcvs zzcvsVar = new zzcvs();
            zzcvsVar.zza(this.zzc);
            zzcvsVar.zzb(zzu);
            zzr.zzd(zzcvsVar.zzd());
            zzdbg zzdbgVar = new zzdbg();
            zzdbgVar.zze(this.zzd.zzc(), this.zzb.zze());
            zzr.zze(zzdbgVar.zzm());
            zzr.zzc(this.zzd.zzb());
            zzr.zzb(new zzcql(null));
            zzdfn zza = zzr.zza();
            this.zzb.zzy().zza(1);
            zzflb zzflbVar = zzccz.zza;
            zzgdw.zzb(zzflbVar);
            ScheduledExecutorService zzf = this.zzb.zzf();
            zzctq<zzcsu> zza2 = zza.zza();
            zzctb zzctbVar = new zzctb(zzflbVar, zzf, zza2.zzc(zza2.zzb()));
            this.zze = zzctbVar;
            zzctbVar.zza(new zzega(this, zzeftVar, zza));
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zzb() {
        zzctb zzctbVar = this.zze;
        return zzctbVar != null && zzctbVar.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzbM(zzeuf.zzd(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzbM(zzeuf.zzd(4, null, null));
    }
}
