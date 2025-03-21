package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzb implements zzdya<zzcqo> {
    private final zzcrl zza;
    private final Context zzb;
    private final zzdmy zzc;
    private final zzetk zzd;
    private final Executor zze;
    private final zzfei<zzess, com.google.android.gms.ads.internal.util.zzau> zzf;

    public zzdzb(zzcrl zzcrlVar, Context context, Executor executor, zzdmy zzdmyVar, zzetk zzetkVar, zzfei<zzess, com.google.android.gms.ads.internal.util.zzau> zzfeiVar) {
        this.zzb = context;
        this.zza = zzcrlVar;
        this.zze = executor;
        this.zzc = zzdmyVar;
        this.zzd = zzetkVar;
        this.zzf = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar = zzessVar.zzr;
        return (zzesxVar == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<zzcqo> zzb(final zzete zzeteVar, final zzess zzessVar) {
        return zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzeteVar, zzessVar) { // from class: com.google.android.gms.internal.ads.zzdyv
            private final zzdzb zza;
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
                return this.zza.zzd(this.zzb, this.zzc, obj);
            }
        }, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcib zzcibVar) {
        zzcibVar.zzL();
        zzcix zzh = zzcibVar.zzh();
        zzbey zzbeyVar = this.zzd.zza;
        if (zzbeyVar == null || zzh == null) {
            return;
        }
        zzh.zzc(zzbeyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzete zzeteVar, zzess zzessVar, Object obj) throws Exception {
        View zzdnbVar;
        zzazx zzb = zzeto.zzb(this.zzb, zzessVar.zzt);
        final zzcib zza = this.zzc.zza(zzb, zzessVar, zzeteVar.zzb.zzb);
        zza.zzav(zzessVar.zzQ);
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() || !zzessVar.zzab) {
            zzdnbVar = new zzdnb(this.zzb, (View) zza, this.zzf.apply(zzessVar));
        } else {
            zzdnbVar = zzcsc.zza(this.zzb, (View) zza, zzessVar);
        }
        final zzcqp zzd = this.zza.zzd(new zzctc(zzeteVar, zzessVar, null), new zzcqv(zzdnbVar, zza, zzdyw.zzb(zza), zzeto.zzc(zzb)));
        zzd.zzi().zzi(zza, false, null);
        zzd.zzd().zzh(new zzcwz(zza) { // from class: com.google.android.gms.internal.ads.zzdyx
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
        zzd.zzi();
        zzesx zzesxVar = zzessVar.zzr;
        zzfla<?> zzj = zzdmx.zzj(zza, zzesxVar.zzb, zzesxVar.zza);
        if (zzessVar.zzH) {
            zzj.zze(zzdyy.zza(zza), this.zze);
        }
        zzj.zze(new Runnable(this, zza) { // from class: com.google.android.gms.internal.ads.zzdyz
            private final zzdzb zza;
            private final zzcib zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb);
            }
        }, this.zze);
        return zzfks.zzj(zzj, new zzfei(zzd) { // from class: com.google.android.gms.internal.ads.zzdza
            private final zzcqp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzd;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj2) {
                return this.zza.zzh();
            }
        }, zzccz.zzf);
    }
}
