package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvw implements zzdap, zzazi, zzcwz, zzcwl {
    private final Context zza;
    private final zzetx zzb;
    private final zzete zzc;
    private final zzess zzd;
    private final zzdxo zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzbba.zzc().zzb(zzbfq.zzeT)).booleanValue();
    private final zzexv zzh;
    private final String zzi;

    public zzdvw(Context context, zzetx zzetxVar, zzete zzeteVar, zzess zzessVar, zzdxo zzdxoVar, zzexv zzexvVar, String str) {
        this.zza = context;
        this.zzb = zzetxVar;
        this.zzc = zzeteVar;
        this.zzd = zzessVar;
        this.zze = zzdxoVar;
        this.zzh = zzexvVar;
        this.zzi = str;
    }

    private final boolean zze() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    private final zzexu zzf(String str) {
        zzexu zza = zzexu.zza(str);
        zza.zzg(this.zzc, null);
        zza.zzi(this.zzd);
        zza.zzc("request_id", this.zzi);
        if (!this.zzd.zzs.isEmpty()) {
            zza.zzc("ancn", this.zzd.zzs.get(0));
        }
        if (this.zzd.zzad) {
            com.google.android.gms.ads.internal.zzs.zzc();
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.util.zzr.zzI(this.zza) ? "offline" : "online");
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        return zza;
    }

    private final void zzg(zzexu zzexuVar) {
        if (this.zzd.zzad) {
            this.zze.zze(new zzdxq(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zzb(zzexuVar), 2));
            return;
        }
        this.zzh.zza(zzexuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        if (this.zzd.zzad) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zza(zzazm zzazmVar) {
        zzazm zzazmVar2;
        if (this.zzg) {
            int i = zzazmVar.zza;
            String str = zzazmVar.zzb;
            if (zzazmVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzazmVar2 = zzazmVar.zzd) != null && !zzazmVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzazm zzazmVar3 = zzazmVar.zzd;
                i = zzazmVar3.zza;
                str = zzazmVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzexu zzf = zzf("ifts");
            zzf.zzc("reason", "adapter");
            if (i >= 0) {
                zzf.zzc("arec", String.valueOf(i));
            }
            if (zza != null) {
                zzf.zzc("areec", zza);
            }
            this.zzh.zza(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzb() {
        if (zze()) {
            this.zzh.zza(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        if (zze() || this.zzd.zzad) {
            zzg(zzf("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzc(zzdey zzdeyVar) {
        if (this.zzg) {
            zzexu zzf = zzf("ifts");
            zzf.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdeyVar.getMessage())) {
                zzf.zzc(NotificationCompat.CATEGORY_MESSAGE, zzdeyVar.getMessage());
            }
            this.zzh.zza(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzd() {
        if (this.zzg) {
            zzexv zzexvVar = this.zzh;
            zzexu zzf = zzf("ifts");
            zzf.zzc("reason", "blocked");
            zzexvVar.zza(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzk() {
        if (zze()) {
            this.zzh.zza(zzf("adapter_shown"));
        }
    }
}
