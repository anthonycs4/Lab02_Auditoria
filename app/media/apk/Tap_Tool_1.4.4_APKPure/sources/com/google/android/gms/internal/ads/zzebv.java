package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebv implements zzdyi<zzdmb, zzeub, zzdzw> {
    private final Context zza;
    private final Executor zzb;
    private final zzdmg zzc;

    public zzebv(Context context, Executor executor, zzdmg zzdmgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp {
        try {
            zzetk zzetkVar = zzeteVar.zza.zza;
            if (zzetkVar.zzo.zza == 3) {
                zzdydVar.zzb.zzx(this.zza, zzetkVar.zzd, zzessVar.zzu.toString(), zzdydVar.zzc);
            } else {
                zzdydVar.zzb.zzv(this.zza, zzetkVar.zzd, zzessVar.zzu.toString(), zzdydVar.zzc);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(zzdydVar.zza);
            com.google.android.gms.ads.internal.util.zze.zzj(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzdmb zzb(zzete zzeteVar, zzess zzessVar, final zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp, zzebr {
        zzdmc zze = this.zzc.zze(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzdmd(new zzdez(zzdydVar) { // from class: com.google.android.gms.internal.ads.zzebu
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
                    ((zzeub) zzdydVar2.zzb).zzw(context);
                } catch (zzetp e) {
                    throw new zzdey(e.getCause());
                }
            }
        }));
        zze.zza().zzh(new zzcof(zzdydVar.zzb), this.zzb);
        zzdydVar.zzc.zzc(zze.zzm());
        return zze.zzh();
    }
}
