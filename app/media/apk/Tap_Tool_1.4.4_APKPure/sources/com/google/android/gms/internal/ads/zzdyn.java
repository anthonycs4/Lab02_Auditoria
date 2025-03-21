package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyn implements zzdya<zzcqh> {
    private final zzcqc zza;
    private final Context zzb;
    private final zzdmy zzc;
    private final zzetk zzd;
    private final Executor zze;
    private final zzcct zzf;
    private final zzbls zzg;
    private final boolean zzh = ((Boolean) zzbba.zzc().zzb(zzbfq.zzfT)).booleanValue();

    public zzdyn(zzcqc zzcqcVar, Context context, Executor executor, zzdmy zzdmyVar, zzetk zzetkVar, zzcct zzcctVar, zzbls zzblsVar) {
        this.zzb = context;
        this.zza = zzcqcVar;
        this.zze = executor;
        this.zzc = zzdmyVar;
        this.zzd = zzetkVar;
        this.zzf = zzcctVar;
        this.zzg = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar = zzessVar.zzr;
        return (zzesxVar == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzcqh> zzb(final zzete zzeteVar, final zzess zzessVar) {
        final zzdnc zzdncVar = new zzdnc();
        zzfla<zzcqh> zzi = zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzessVar, zzeteVar, zzdncVar) { // from class: com.google.android.gms.internal.ads.zzdyj
            private final zzdyn zza;
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
        zzi.zze(zzdyk.zza(zzdncVar), this.zze);
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(final zzess zzessVar, zzete zzeteVar, zzdnc zzdncVar, Object obj) throws Exception {
        final zzcib zza = this.zzc.zza(this.zzd.zze, zzessVar, zzeteVar.zzb.zzb);
        zza.zzav(zzessVar.zzQ);
        zzdncVar.zza(this.zzb, (View) zza);
        zzcde zzcdeVar = new zzcde();
        final zzcpz zze = this.zza.zze(new zzctc(zzeteVar, zzessVar, null), new zzddy(new zzdyp(this.zzf, zzcdeVar, zzessVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcqa(zzessVar.zzU));
        zze.zzi().zzi(zza, false, this.zzh ? this.zzg : null);
        zzcdeVar.zzc(zze);
        zze.zzd().zzh(new zzcwz(zza) { // from class: com.google.android.gms.internal.ads.zzdyl
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
        return zzfks.zzj(zzdmx.zzj(zza, zzesxVar.zzb, zzesxVar.zza), new zzfei(this, zza, zzessVar, zze) { // from class: com.google.android.gms.internal.ads.zzdym
            private final zzdyn zza;
            private final zzcib zzb;
            private final zzess zzc;
            private final zzcpz zzd;

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
                zzcpz zzcpzVar = this.zzd;
                if (zzessVar2.zzH) {
                    zzcibVar.zzau();
                }
                zzcibVar.zzL();
                zzcibVar.onPause();
                return zzcpzVar.zzh();
            }
        }, this.zze);
    }
}
