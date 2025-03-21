package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdoz implements zzdap, zzazi, zzcwz, zzcwl {
    private final Context zza;
    private final zzetx zzb;
    private final zzdpn zzc;
    private final zzete zzd;
    private final zzess zze;
    private final zzdxo zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzbba.zzc().zzb(zzbfq.zzeT)).booleanValue();

    public zzdoz(Context context, zzetx zzetxVar, zzdpn zzdpnVar, zzete zzeteVar, zzess zzessVar, zzdxo zzdxoVar) {
        this.zza = context;
        this.zzb = zzetxVar;
        this.zzc = zzdpnVar;
        this.zzd = zzeteVar;
        this.zze = zzessVar;
        this.zzf = zzdxoVar;
    }

    private final boolean zze() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) zzbba.zzc().zzb(zzbfq.zzaY);
                    com.google.android.gms.ads.internal.zzs.zzc();
                    String zzv = com.google.android.gms.ads.internal.util.zzr.zzv(this.zza);
                    boolean z = false;
                    if (str != null && zzv != null) {
                        try {
                            z = Pattern.matches(str, zzv);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    private final zzdpm zzf(String str) {
        zzdpm zza = this.zzc.zza();
        zza.zza(this.zzd.zzb.zzb);
        zza.zzb(this.zze);
        zza.zzc("action", str);
        if (!this.zze.zzs.isEmpty()) {
            zza.zzc("ancn", this.zze.zzs.get(0));
        }
        if (this.zze.zzad) {
            com.google.android.gms.ads.internal.zzs.zzc();
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.util.zzr.zzI(this.zza) ? "offline" : "online");
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        return zza;
    }

    private final void zzg(zzdpm zzdpmVar) {
        if (this.zze.zzad) {
            this.zzf.zze(new zzdxq(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdpmVar.zze(), 2));
            return;
        }
        zzdpmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        if (this.zze.zzad) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zza(zzazm zzazmVar) {
        zzazm zzazmVar2;
        if (this.zzh) {
            zzdpm zzf = zzf("ifts");
            zzf.zzc("reason", "adapter");
            int i = zzazmVar.zza;
            String str = zzazmVar.zzb;
            if (zzazmVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzazmVar2 = zzazmVar.zzd) != null && !zzazmVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzazm zzazmVar3 = zzazmVar.zzd;
                i = zzazmVar3.zza;
                str = zzazmVar3.zzb;
            }
            if (i >= 0) {
                zzf.zzc("arec", String.valueOf(i));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzf.zzc("areec", zza);
            }
            zzf.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzb() {
        if (zze()) {
            zzf("adapter_impression").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        if (zze() || this.zze.zzad) {
            zzg(zzf("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzc(zzdey zzdeyVar) {
        if (this.zzh) {
            zzdpm zzf = zzf("ifts");
            zzf.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdeyVar.getMessage())) {
                zzf.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdeyVar.getMessage());
            }
            zzf.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzd() {
        if (this.zzh) {
            zzdpm zzf = zzf("ifts");
            zzf.zzc("reason", "blocked");
            zzf.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzk() {
        if (zze()) {
            zzf("adapter_shown").zzd();
        }
    }
}
