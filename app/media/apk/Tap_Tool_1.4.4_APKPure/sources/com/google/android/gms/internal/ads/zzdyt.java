package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyt implements zzdya<zzcpx> {
    private final zzcpr zza;
    private final Context zzb;
    private final zzdmy zzc;
    private final Executor zzd;

    public zzdyt(zzcpr zzcprVar, Context context, Executor executor, zzdmy zzdmyVar) {
        this.zzb = context;
        this.zza = zzcprVar;
        this.zzd = executor;
        this.zzc = zzdmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar = zzessVar.zzr;
        return (zzesxVar == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzcpx> zzb(final zzete zzeteVar, final zzess zzessVar) {
        return zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdyq
            private final zzdyt zza;
            private final zzete zzb;
            private final zzess zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzeteVar;
                this.zzc = zzessVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, obj);
            }
        }, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(zzete zzeteVar, zzess zzessVar, Object obj) throws Exception {
        zzazx zzb = zzeto.zzb(this.zzb, zzessVar.zzt);
        final zzcib zza = this.zzc.zza(zzb, zzessVar, zzeteVar.zzb.zzb);
        final zzcpk zze = this.zza.zze(new zzctc(zzeteVar, zzessVar, null), new zzcpl((View) zza, zza, zzeto.zzc(zzb), zzessVar.zzU, zzessVar.zzY, zzessVar.zzJ));
        zze.zzi().zzi(zza, false, null);
        zze.zzd().zzh(new zzcwz(zza) { // from class: com.google.android.gms.internal.ads.zzdyr
            private final zzcib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzcwz
            public final void zzbz() {
                zzcib zzcibVar = this.zza;
                if (zzcibVar.zzR() != null) {
                    zzcibVar.zzR().zzh();
                }
            }
        }, zzccz.zzf);
        zze.zzi();
        zzesx zzesxVar = zzessVar.zzr;
        return zzfks.zzj(zzdmx.zzj(zza, zzesxVar.zzb, zzesxVar.zza), new zzfei(zze) { // from class: com.google.android.gms.internal.ads.zzdys
            private final zzcpk zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zze;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj2) {
                return this.zza.zzh();
            }
        }, zzccz.zzf);
    }
}
