package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeax implements zzdyi<zzdgu, zzeub, zzdzw> {
    private final Context zza;
    private final zzdfn zzb;
    private final Executor zzc;

    public zzeax(Context context, zzdfn zzdfnVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdfnVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzete zzeteVar, int i) {
        return zzeteVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp {
        zzetk zzetkVar = zzeteVar.zza.zza;
        zzdydVar.zzb.zzo(this.zza, zzeteVar.zza.zza.zzd, zzessVar.zzu.toString(), com.google.android.gms.ads.internal.util.zzbv.zzk(zzessVar.zzr), zzdydVar.zzc, zzetkVar.zzi, zzetkVar.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzdgu zzb(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp, zzebr {
        zzdgz zzab;
        zzbrp zzB = zzdydVar.zzb.zzB();
        zzbrq zzC = zzdydVar.zzb.zzC();
        zzbrt zzu = zzdydVar.zzb.zzu();
        if (zzu == null || !zzc(zzeteVar, 6)) {
            if (zzB == null || !zzc(zzeteVar, 6)) {
                if (zzB == null || !zzc(zzeteVar, 2)) {
                    if (zzC == null || !zzc(zzeteVar, 6)) {
                        if (zzC == null || !zzc(zzeteVar, 1)) {
                            throw new zzebr(1, "No native ad mappers");
                        }
                        zzab = zzdgz.zzab(zzC);
                    } else {
                        zzab = zzdgz.zzae(zzC);
                    }
                } else {
                    zzab = zzdgz.zzac(zzB);
                }
            } else {
                zzab = zzdgz.zzad(zzB);
            }
        } else {
            zzab = zzdgz.zzaa(zzu);
        }
        if (!zzeteVar.zza.zza.zzg.contains(Integer.toString(zzab.zzv()))) {
            throw new zzebr(1, "No corresponding native ad listener");
        }
        zzdhb zzd = this.zzb.zzd(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzdhl(zzab), new zzdiy(zzC, zzB, zzu, null));
        zzdydVar.zzc.zzc(zzd.zzf());
        zzd.zza().zzh(new zzcof(zzdydVar.zzb), this.zzc);
        return zzd.zzh();
    }
}
