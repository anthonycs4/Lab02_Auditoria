package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwa extends zzbdf {
    private final String zza;
    private final String zzb;
    private final List<zzbab> zzc;
    private final long zzd;
    private final String zze;

    public zzcwa(zzess zzessVar, String str, zzdyf zzdyfVar, zzesv zzesvVar) {
        String str2 = null;
        this.zzb = zzessVar == null ? null : zzessVar.zzV;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = zzessVar.zzu.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str2 != null ? str2 : str;
        this.zzc = zzdyfVar.zze();
        this.zzd = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() / 1000;
        this.zze = (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgl)).booleanValue() || zzesvVar == null || TextUtils.isEmpty(zzesvVar.zzh)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzesvVar.zzh;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final List<zzbab> zzg() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfC)).booleanValue()) {
            return this.zzc;
        }
        return null;
    }
}
