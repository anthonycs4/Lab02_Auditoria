package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedi implements zzdya<zzcqo> {
    private final Context zza;
    private final zzcrl zzb;
    private final zzbgl zzc;
    private final zzflb zzd;
    private final zzexl zze;

    public zzedi(Context context, zzcrl zzcrlVar, zzexl zzexlVar, zzflb zzflbVar, zzbgl zzbglVar) {
        this.zza = context;
        this.zzb = zzcrlVar;
        this.zze = zzexlVar;
        this.zzd = zzflbVar;
        this.zzc = zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar;
        return (this.zzc == null || (zzesxVar = zzessVar.zzr) == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzcqo> zzb(zzete zzeteVar, zzess zzessVar) {
        zzcqp zzd = this.zzb.zzd(new zzctc(zzeteVar, zzessVar, null), new zzedg(this, new View(this.zza), null, zzede.zza, zzessVar.zzt.get(0)));
        zzedh zzk = zzd.zzk();
        zzesx zzesxVar = zzessVar.zzr;
        final zzbgg zzbggVar = new zzbgg(zzk, zzesxVar.zzb, zzesxVar.zza);
        zzexl zzexlVar = this.zze;
        return zzeww.zzd(new zzewq(this, zzbggVar) { // from class: com.google.android.gms.internal.ads.zzedf
            private final zzedi zza;
            private final zzbgg zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbggVar;
            }

            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zza() {
                this.zza.zzc(this.zzb);
            }
        }, this.zzd, zzexf.CUSTOM_RENDER_SYN, zzexlVar).zzj(zzexf.CUSTOM_RENDER_ACK).zze(zzfks.zza(zzd.zzh())).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbgg zzbggVar) throws Exception {
        this.zzc.zze(zzbggVar);
    }
}
