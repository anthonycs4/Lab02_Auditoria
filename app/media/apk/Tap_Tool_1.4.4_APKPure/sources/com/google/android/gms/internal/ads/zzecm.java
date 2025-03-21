package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzecm implements zzdya<zzdmb> {
    private final Context zza;
    private final zzdmy zzb;
    private final zzdmg zzc;
    private final zzetk zzd;
    private final Executor zze;
    private final zzcct zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) zzbba.zzc().zzb(zzbfq.zzfT)).booleanValue();

    public zzecm(Context context, zzcct zzcctVar, zzetk zzetkVar, Executor executor, zzdmg zzdmgVar, zzdmy zzdmyVar, zzbls zzblsVar) {
        this.zza = context;
        this.zzd = zzetkVar;
        this.zzc = zzdmgVar;
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
    public final zzfla<zzdmb> zzb(final zzete zzeteVar, final zzess zzessVar) {
        final zzdnc zzdncVar = new zzdnc();
        zzfla<zzdmb> zzi = zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzessVar, zzeteVar, zzdncVar) { // from class: com.google.android.gms.internal.ads.zzece
            private final zzecm zza;
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
        zzi.zze(zzecf.zza(zzdncVar), this.zze);
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(final zzess zzessVar, zzete zzeteVar, zzdnc zzdncVar, Object obj) throws Exception {
        final zzcib zza = this.zzb.zza(this.zzd.zze, zzessVar, zzeteVar.zzb.zzb);
        zza.zzav(zzessVar.zzQ);
        zzdncVar.zza(this.zza, (View) zza);
        zzcde zzcdeVar = new zzcde();
        final zzdmc zze = this.zzc.zze(new zzctc(zzeteVar, zzessVar, null), new zzdmd(new zzecl(this.zza, this.zzb, this.zzd, this.zzf, zzessVar, zzcdeVar, zza, this.zzg, this.zzh, null), zza));
        zzcdeVar.zzc(zze);
        zzbmf.zzb(zza, zze.zzk());
        zze.zzd().zzh(new zzcwz(zza) { // from class: com.google.android.gms.internal.ads.zzecg
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
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzesx zzesxVar = zzessVar.zzr;
        return zzfks.zzj(zzdmx.zzj(zza, zzesxVar.zzb, zzesxVar.zza), new zzfei(this, zza, zzessVar, zze) { // from class: com.google.android.gms.internal.ads.zzech
            private final zzecm zza;
            private final zzcib zzb;
            private final zzess zzc;
            private final zzdmc zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
                this.zzc = zzessVar;
                this.zzd = zze;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj2) {
                zzcib zzcibVar = this.zzb;
                zzess zzessVar2 = this.zzc;
                zzdmc zzdmcVar = this.zzd;
                if (zzessVar2.zzH) {
                    zzcibVar.zzau();
                }
                zzcibVar.zzL();
                zzcibVar.onPause();
                return zzdmcVar.zzh();
            }
        }, this.zze);
    }
}
