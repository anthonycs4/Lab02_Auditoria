package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzl implements zzdyi<zzcqo, zzbtl, zzdzw> {
    private final Context zza;
    private final zzcrl zzb;
    private View zzc;
    private zzbrn zzd;

    public zzdzl(Context context, zzcrl zzcrlVar) {
        this.zza = context;
        this.zzb = zzcrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp {
        try {
            zzdydVar.zzb.zzo(zzessVar.zzT);
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() || !zzessVar.zzab) {
                zzdydVar.zzb.zzi(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzdzk(this, zzdydVar, null), zzdydVar.zzc, zzeteVar.zza.zza.zze);
            } else {
                zzdydVar.zzb.zzq(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzdzk(this, zzdydVar, null), zzdydVar.zzc, zzeteVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzetp(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzcqo zzb(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp, zzebr {
        View view;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() && zzessVar.zzab) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzetp(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfks.zzi(zzfks.zza(null), new zzfjz(this, view, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdzi
                            private final zzdzl zza;
                            private final View zzb;
                            private final zzess zzc;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                                this.zzb = view;
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
        } else {
            view = this.zzc;
        }
        zzcqp zzd = this.zzb.zzd(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzcqv(view, null, new zzcsl(zzdydVar) { // from class: com.google.android.gms.internal.ads.zzdzh
            private final zzdyd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzdydVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcsl
            public final zzbdj zza() {
                try {
                    return ((zzbtl) this.zza.zzb).zzh();
                } catch (RemoteException e3) {
                    throw new zzetp(e3);
                }
            }
        }, zzessVar.zzt.get(0)));
        zzd.zzj().zza(view);
        zzdydVar.zzc.zzc(zzd.zzg());
        return zzd.zzh();
    }

    public final /* synthetic */ zzfla zzc(View view, zzess zzessVar, Object obj) throws Exception {
        return zzfks.zza(zzcsc.zza(this.zza, view, zzessVar));
    }
}
