package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzf implements zzdyi<zzcqo, zzeub, zzdzw> {
    private final Context zza;
    private final zzcrl zzb;
    private final Executor zzc;

    public zzdzf(Context context, zzcrl zzcrlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcrlVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp {
        zzazx zzb;
        zzazx zzazxVar = zzeteVar.zza.zza.zze;
        if (zzazxVar.zzn) {
            zzb = new zzazx(this.zza, com.google.android.gms.ads.zza.zzb(zzazxVar.zze, zzazxVar.zzb));
        } else {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() || !zzessVar.zzab) {
                zzb = zzeto.zzb(this.zza, zzessVar.zzt);
            } else {
                zzb = new zzazx(this.zza, com.google.android.gms.ads.zza.zzc(zzazxVar.zze, zzazxVar.zzb));
            }
        }
        zzazx zzazxVar2 = zzb;
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() || !zzessVar.zzab) {
            zzdydVar.zzb.zzg(this.zza, zzazxVar2, zzeteVar.zza.zza.zzd, zzessVar.zzu.toString(), com.google.android.gms.ads.internal.util.zzbv.zzk(zzessVar.zzr), zzdydVar.zzc);
        } else {
            zzdydVar.zzb.zzb(this.zza, zzazxVar2, zzeteVar.zza.zza.zzd, zzessVar.zzu.toString(), com.google.android.gms.ads.internal.util.zzbv.zzk(zzessVar.zzr), zzdydVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzcqo zzb(zzete zzeteVar, final zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp, zzebr {
        final View zza;
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() || !zzessVar.zzab) {
            zza = zzdydVar.zzb.zza();
        } else {
            zzbrn zzc = zzdydVar.zzb.zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzetp(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzetp(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfks.zzi(zzfks.zza(null), new zzfjz(this, zza, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdze
                            private final zzdzf zza;
                            private final View zzb;
                            private final zzess zzc;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                                this.zzb = zza;
                                this.zzc = zzessVar;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfjz
                            public final zzfla zza(Object obj) {
                                return this.zza.zzc(this.zzb, this.zzc, obj);
                            }
                        }, zzccz.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzetp(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzetp(e2);
            }
        }
        zzcqp zzd = this.zzb.zzd(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzcqv(zza, null, zzdzd.zzb(zzdydVar.zzb), zzessVar.zzt.get(0)));
        zzd.zzj().zza(zza);
        zzd.zza().zzh(new zzcof(zzdydVar.zzb), this.zzc);
        zzdydVar.zzc.zzc(zzd.zzf());
        return zzd.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(View view, zzess zzessVar, Object obj) throws Exception {
        return zzfks.zza(zzcsc.zza(this.zza, view, zzessVar));
    }
}
