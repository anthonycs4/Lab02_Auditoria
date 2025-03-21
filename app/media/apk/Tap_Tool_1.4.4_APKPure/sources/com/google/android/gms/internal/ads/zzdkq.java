package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdkq {
    private final zzetk zza;
    private final Executor zzb;
    private final zzdmy zzc;

    public zzdkq(zzetk zzetkVar, Executor executor, zzdmy zzdmyVar) {
        this.zza = zzetkVar;
        this.zzb = executor;
        this.zzc = zzdmyVar;
    }

    private final void zzh(zzcib zzcibVar) {
        zzcibVar.zzab("/video", zzblo.zzm);
        zzcibVar.zzab("/videoMeta", zzblo.zzn);
        zzcibVar.zzab("/precache", new zzcgt());
        zzcibVar.zzab("/delayPageLoaded", zzblo.zzq);
        zzcibVar.zzab("/instrument", zzblo.zzo);
        zzcibVar.zzab("/log", zzblo.zzh);
        zzcibVar.zzab("/videoClicked", zzblo.zzi);
        zzcibVar.zzR().zzE(true);
        zzcibVar.zzab("/click", zzblo.zzd);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcb)).booleanValue()) {
            zzcibVar.zzab("/getNativeAdViewSignals", zzblo.zzt);
        }
        if (this.zza.zzb != null) {
            zzcibVar.zzR().zzF(true);
            zzcibVar.zzab("/open", new zzbma(null, null, null, null, null));
        } else {
            zzcibVar.zzR().zzF(false);
        }
        if (com.google.android.gms.ads.internal.zzs.zzA().zzb(zzcibVar.getContext())) {
            zzcibVar.zzab("/logScionEvent", new zzblv(zzcibVar.getContext()));
        }
        zzcibVar.zzab("/canOpenApp", zzblo.zzb);
        zzcibVar.zzab("/canOpenURLs", zzblo.zza);
        zzcibVar.zzab("/canOpenIntents", zzblo.zzc);
    }

    public final zzfla<zzcib> zza(final JSONObject jSONObject) {
        return zzfks.zzi(zzfks.zzi(zzfks.zza(null), new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzdkh
            private final zzdkq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(obj);
            }
        }, this.zzb), new zzfjz(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdkf
            private final zzdkq zza;
            private final JSONObject zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzf(this.zzb, (zzcib) obj);
            }
        }, this.zzb);
    }

    public final zzfla<zzcib> zzb(final String str, final String str2, final zzess zzessVar, final zzesv zzesvVar, final zzazx zzazxVar) {
        return zzfks.zzi(zzfks.zza(null), new zzfjz(this, zzazxVar, zzessVar, zzesvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdkg
            private final zzdkq zza;
            private final zzazx zzb;
            private final zzess zzc;
            private final zzesv zzd;
            private final String zze;
            private final String zzf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzazxVar;
                this.zzc = zzessVar;
                this.zzd = zzesvVar;
                this.zze = str;
                this.zzf = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(Object obj) throws Exception {
        zzcib zza = this.zzc.zza(zzazx.zzb(), null, null);
        final zzcdd zza2 = zzcdd.zza(zza);
        zzh(zza);
        zza.zzR().zzx(new zzcjo(zza2) { // from class: com.google.android.gms.internal.ads.zzdki
            private final zzcdd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzcjo
            public final void zzb() {
                this.zza.zzb();
            }
        });
        zza.loadUrl((String) zzbba.zzc().zzb(zzbfq.zzca));
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzazx zzazxVar, zzess zzessVar, zzesv zzesvVar, String str, String str2, Object obj) throws Exception {
        final zzcib zza = this.zzc.zza(zzazxVar, zzessVar, zzesvVar);
        final zzcdd zza2 = zzcdd.zza(zza);
        zzh(zza);
        if (this.zza.zzb != null) {
            zza.zzaf(zzcjr.zze());
        } else {
            zza.zzR().zzG(true);
        }
        zza.zzR().zzw(new zzcjn(this, zza, zza2) { // from class: com.google.android.gms.internal.ads.zzdkj
            private final zzdkq zza;
            private final zzcib zzb;
            private final zzcdd zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
                this.zzc = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                this.zza.zze(this.zzb, this.zzc, z);
            }
        });
        zza.zzat(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcib zzcibVar, zzcdd zzcddVar, boolean z) {
        if (z) {
            if (this.zza.zza != null && zzcibVar.zzh() != null) {
                zzcibVar.zzh().zzc(this.zza.zza);
            }
            zzcddVar.zzb();
            return;
        }
        zzcddVar.zzd(new zzebr(1, "Html video Web View failed to load."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzf(JSONObject jSONObject, final zzcib zzcibVar) throws Exception {
        final zzcdd zza = zzcdd.zza(zzcibVar);
        if (this.zza.zzb != null) {
            zzcibVar.zzaf(zzcjr.zze());
        } else {
            zzcibVar.zzaf(zzcjr.zzd());
        }
        zzcibVar.zzR().zzw(new zzcjn(this, zzcibVar, zza) { // from class: com.google.android.gms.internal.ads.zzdkk
            private final zzdkq zza;
            private final zzcib zzb;
            private final zzcdd zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzcibVar;
                this.zzc = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                this.zza.zzg(this.zzb, this.zzc, z);
            }
        });
        zzcibVar.zzr("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcib zzcibVar, zzcdd zzcddVar, boolean z) {
        if (this.zza.zza != null && zzcibVar.zzh() != null) {
            zzcibVar.zzh().zzc(this.zza.zza);
        }
        zzcddVar.zzb();
    }
}
