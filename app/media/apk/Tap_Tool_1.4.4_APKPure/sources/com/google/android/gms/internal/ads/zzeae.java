package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeae implements zzdya<zzddu> {
    private final Context zza;
    private final zzdmy zzb;
    private final zzder zzc;
    private final zzetk zzd;
    private final Executor zze;
    private final zzcct zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) zzbba.zzc().zzb(zzbfq.zzfT)).booleanValue();

    public zzeae(Context context, zzcct zzcctVar, zzetk zzetkVar, Executor executor, zzder zzderVar, zzdmy zzdmyVar, zzbls zzblsVar) {
        this.zza = context;
        this.zzd = zzetkVar;
        this.zzc = zzderVar;
        this.zze = executor;
        this.zzf = zzcctVar;
        this.zzb = zzdmyVar;
        this.zzg = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar = zzessVar.zzr;
        return (zzesxVar == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzddu> zzb(final zzete zzeteVar, final zzess zzessVar) {
        final zzdnc zzdncVar = new zzdnc();
        zzfla<zzddu> zzi = zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzessVar, zzeteVar, zzdncVar) { // from class: com.google.android.gms.internal.ads.zzdzy
            private final zzeae zza;
            private final zzess zzb;
            private final zzete zzc;
            private final zzdnc zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzessVar;
                this.zzc = zzeteVar;
                this.zzd = zzdncVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
            }
        }, this.zze);
        zzi.zze(zzdzz.zza(zzdncVar), this.zze);
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(final zzess zzessVar, zzete zzeteVar, zzdnc zzdncVar, Object obj) throws Exception {
        final zzcib zza = this.zzb.zza(this.zzd.zze, zzessVar, zzeteVar.zzb.zzb);
        zza.zzav(zzessVar.zzQ);
        zzdncVar.zza(this.zza, (View) zza);
        zzcde zzcdeVar = new zzcde();
        final zzddv zzc = this.zzc.zzc(new zzctc(zzeteVar, zzessVar, null), new zzddy(new zzead(this.zza, this.zzf, zzcdeVar, zzessVar, zza, this.zzd, this.zzh, this.zzg, null), zza));
        zzcdeVar.zzc(zzc);
        zzc.zzd().zzh(new zzcwz(zza) { // from class: com.google.android.gms.internal.ads.zzeaa
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
        zzc.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zzc.zzk();
        zzesx zzesxVar = zzessVar.zzr;
        return zzfks.zzj(zzdmx.zzj(zza, zzesxVar.zzb, zzesxVar.zza), new zzfei(this, zza, zzessVar, zzc) { // from class: com.google.android.gms.internal.ads.zzeab
            private final zzeae zza;
            private final zzcib zzb;
            private final zzess zzc;
            private final zzddv zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
                this.zzc = zzessVar;
                this.zzd = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj2) {
                zzcib zzcibVar = this.zzb;
                zzess zzessVar2 = this.zzc;
                zzddv zzddvVar = this.zzd;
                if (zzessVar2.zzH) {
                    zzcibVar.zzau();
                }
                zzcibVar.zzL();
                zzcibVar.onPause();
                return zzddvVar.zzh();
            }
        }, this.zze);
    }
}
