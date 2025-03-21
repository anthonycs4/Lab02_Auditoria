package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepd implements zzfko<zzcqo> {
    final /* synthetic */ zzeft zza;
    final /* synthetic */ zzcrl zzb;
    final /* synthetic */ zzepe zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepd(zzepe zzepeVar, zzeft zzeftVar, zzcrl zzcrlVar) {
        this.zzc = zzepeVar;
        this.zza = zzeftVar;
        this.zzb = zzcrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzcyt zzcytVar;
        Executor executor;
        final zzazm zzg = this.zzb.zzb().zzg(th);
        synchronized (this.zzc) {
            zzepe.zzk(this.zzc, null);
            this.zzb.zza().zzbM(zzg);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzft)).booleanValue()) {
                executor = this.zzc.zzb;
                executor.execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzepc
                    private final zzepd zza;
                    private final zzazm zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzg;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzefe zzefeVar;
                        zzepd zzepdVar = this.zza;
                        zzazm zzazmVar = this.zzb;
                        zzefeVar = zzepdVar.zzc.zzd;
                        zzefeVar.zzbM(zzazmVar);
                    }
                });
            }
            zzcytVar = this.zzc.zzh;
            zzcytVar.zzd(60);
            zzeua.zza(zzg.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcqo zzcqoVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzcyt zzcytVar;
        Executor executor;
        zzefe zzefeVar;
        zzefe zzefeVar2;
        zzefi zzefiVar;
        zzcqo zzcqoVar2 = zzcqoVar;
        synchronized (this.zzc) {
            zzepe.zzk(this.zzc, null);
            viewGroup = this.zzc.zzf;
            viewGroup.removeAllViews();
            if (zzcqoVar2.zza() != null) {
                ViewParent parent = zzcqoVar2.zza().getParent();
                if (parent instanceof ViewGroup) {
                    String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (zzcqoVar2.zzm() != null) {
                        str = zzcqoVar2.zzm().zze();
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                    ((ViewGroup) parent).removeView(zzcqoVar2.zza());
                }
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzft)).booleanValue()) {
                zzdac zzo = zzcqoVar2.zzo();
                zzefeVar2 = this.zzc.zzd;
                zzo.zza(zzefeVar2);
                zzefiVar = this.zzc.zze;
                zzo.zzb(zzefiVar);
            }
            viewGroup2 = this.zzc.zzf;
            viewGroup2.addView(zzcqoVar2.zza());
            this.zza.zzb(zzcqoVar2);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzft)).booleanValue()) {
                executor = this.zzc.zzb;
                zzefeVar = this.zzc.zzd;
                zzefeVar.getClass();
                executor.execute(zzepb.zza(zzefeVar));
            }
            zzcytVar = this.zzc.zzh;
            zzcytVar.zzd(zzcqoVar2.zzg());
        }
    }
}
