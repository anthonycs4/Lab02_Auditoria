package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdmb extends zzcsn {
    private final Context zzc;
    private final WeakReference<zzcib> zzd;
    private final zzdez zze;
    private final zzdco zzf;
    private final zzcws zzg;
    private final zzcxz zzh;
    private final zzcth zzi;
    private final zzbyl zzj;
    private final zzfbm zzk;
    private boolean zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmb(zzcsm zzcsmVar, Context context, zzcib zzcibVar, zzdez zzdezVar, zzdco zzdcoVar, zzcws zzcwsVar, zzcxz zzcxzVar, zzcth zzcthVar, zzess zzessVar, zzfbm zzfbmVar) {
        super(zzcsmVar);
        this.zzl = false;
        this.zzc = context;
        this.zze = zzdezVar;
        this.zzd = new WeakReference<>(zzcibVar);
        this.zzf = zzdcoVar;
        this.zzg = zzcwsVar;
        this.zzh = zzcxzVar;
        this.zzi = zzcthVar;
        this.zzk = zzfbmVar;
        zzbyh zzbyhVar = zzessVar.zzl;
        this.zzj = new zzbzf(zzbyhVar != null ? zzbyhVar.zza : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzbyhVar != null ? zzbyhVar.zzb : 1);
    }

    public final void finalize() throws Throwable {
        try {
            zzcib zzcibVar = this.zzd.get();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeQ)).booleanValue()) {
                if (!this.zzl && zzcibVar != null) {
                    zzccz.zze.execute(zzdma.zza(zzcibVar));
                }
            } else if (zzcibVar != null) {
                zzcibVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean zza(boolean z, Activity activity) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzc();
            if (com.google.android.gms.ads.internal.util.zzr.zzJ(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzd();
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzas)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.zze.zzi("The rewarded ad have been showed.");
            this.zzg.zza(zzeuf.zzd(10, null, null));
            return false;
        }
        this.zzl = true;
        this.zzf.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2);
            this.zzf.zzb();
            return true;
        } catch (zzdey e) {
            this.zzg.zzc(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final zzbyl zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzf();
    }

    public final boolean zzf() {
        zzcib zzcibVar = this.zzd.get();
        return (zzcibVar == null || zzcibVar.zzaA()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }
}
