package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzecs implements zzdyi<zzdmb, zzeub, zzdzx> {
    private final Context zza;
    private final Executor zzb;
    private final zzdmg zzc;

    public zzecs(Context context, Executor executor, zzdmg zzdmgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzx> zzdydVar) {
        try {
            zzdydVar.zzb.zzl(zzeteVar.zza.zza.zzd, zzessVar.zzu.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzdydVar.zza);
            com.google.android.gms.ads.internal.util.zze.zzj(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzx> zzdydVar) throws zzetp {
        if (!zzdydVar.zzb.zzn()) {
            zzdydVar.zzc.zzd(new zzecq(this, zzeteVar, zzessVar, zzdydVar));
            zzdydVar.zzb.zzk(this.zza, zzeteVar.zza.zza.zzd, null, zzdydVar.zzc, zzessVar.zzu.toString());
            return;
        }
        zze(zzeteVar, zzessVar, zzdydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzdmb zzb(zzete zzeteVar, zzess zzessVar, final zzdyd<zzeub, zzdzx> zzdydVar) throws zzetp, zzebr {
        zzdmc zze = this.zzc.zze(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzdmd(new zzdez(zzdydVar) { // from class: com.google.android.gms.internal.ads.zzeco
            private final zzdyd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzdydVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z, Context context) {
                zzdyd zzdydVar2 = this.zza;
                try {
                    ((zzeub) zzdydVar2.zzb).zzs(z);
                    ((zzeub) zzdydVar2.zzb).zzm();
                } catch (zzetp e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Cannot show rewarded video.", e);
                    throw new zzdey(e.getCause());
                }
            }
        }));
        zze.zza().zzh(new zzcof(zzdydVar.zzb), this.zzb);
        zzcxm zzb = zze.zzb();
        zzcwf zzc = zze.zzc();
        zzdydVar.zzc.zzc(new zzecr(this, zze.zzi(), zzc, zzb, zze.zzk()));
        return zze.zzh();
    }
}
