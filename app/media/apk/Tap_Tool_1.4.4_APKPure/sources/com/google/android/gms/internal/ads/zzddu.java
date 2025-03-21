package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzddu extends zzcsn {
    private final Context zzc;
    private final WeakReference<zzcib> zzd;
    private final zzdco zze;
    private final zzdez zzf;
    private final zzcth zzg;
    private final zzfbm zzh;
    private final zzcws zzi;
    private boolean zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddu(zzcsm zzcsmVar, Context context, @Nullable zzcib zzcibVar, zzdco zzdcoVar, zzdez zzdezVar, zzcth zzcthVar, zzfbm zzfbmVar, zzcws zzcwsVar) {
        super(zzcsmVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference<>(zzcibVar);
        this.zze = zzdcoVar;
        this.zzf = zzdezVar;
        this.zzg = zzcthVar;
        this.zzh = zzfbmVar;
        this.zzi = zzcwsVar;
    }

    public final void finalize() throws Throwable {
        try {
            zzcib zzcibVar = this.zzd.get();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeQ)).booleanValue()) {
                if (!this.zzj && zzcibVar != null) {
                    zzccz.zze.execute(zzddt.zza(zzcibVar));
                }
            } else if (zzcibVar != null) {
                zzcibVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzc();
            if (com.google.android.gms.ads.internal.util.zzr.zzJ(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzd();
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzas)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (!this.zzj) {
            this.zze.zza();
            Activity activity2 = activity;
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z, activity2);
                this.zze.zzb();
                this.zzj = true;
                return true;
            } catch (zzdey e) {
                this.zzi.zzc(e);
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzf();
    }
}
