package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegh implements zzelc<Bundle> {
    final zzetk zza;
    private final long zzb;

    public zzegh(zzetk zzetkVar, long j) {
        Preconditions.checkNotNull(zzetkVar, "the targeting must not be null");
        this.zza = zzetkVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzazs zzazsVar = this.zza.zzd;
        bundle2.putInt("http_timeout_millis", zzazsVar.zzw);
        bundle2.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        bundle2.putLong("start_signals_timestamp", this.zzb);
        zzetw.zzb(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzazsVar.zzb)), zzazsVar.zzb != -1);
        zzetw.zzf(bundle2, "extras", zzazsVar.zzc);
        zzetw.zzc(bundle2, "cust_gender", Integer.valueOf(zzazsVar.zzd), zzazsVar.zzd != -1);
        zzetw.zzg(bundle2, "kw", zzazsVar.zze);
        zzetw.zzc(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzazsVar.zzg), zzazsVar.zzg != -1);
        if (zzazsVar.zzf) {
            bundle2.putBoolean("test_request", true);
        }
        zzetw.zzc(bundle2, "d_imp_hdr", 1, zzazsVar.zza >= 2 && zzazsVar.zzh);
        String str = zzazsVar.zzi;
        zzetw.zzb(bundle2, "ppid", str, zzazsVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzazsVar.zzk;
        if (location != null) {
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", valueOf.floatValue());
            bundle3.putLong("lat", valueOf3.longValue());
            bundle3.putLong("long", valueOf4.longValue());
            bundle3.putLong("time", valueOf2.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        zzetw.zze(bundle2, ImagesContract.URL, zzazsVar.zzl);
        zzetw.zzg(bundle2, "neighboring_content_urls", zzazsVar.zzv);
        zzetw.zzf(bundle2, "custom_targeting", zzazsVar.zzn);
        zzetw.zzg(bundle2, "category_exclusions", zzazsVar.zzo);
        zzetw.zze(bundle2, "request_agent", zzazsVar.zzp);
        zzetw.zze(bundle2, "request_pkg", zzazsVar.zzq);
        zzetw.zzd(bundle2, "is_designed_for_families", Boolean.valueOf(zzazsVar.zzr), zzazsVar.zza >= 7);
        if (zzazsVar.zza >= 8) {
            zzetw.zzc(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzazsVar.zzt), zzazsVar.zzt != -1);
            zzetw.zze(bundle2, "max_ad_content_rating", zzazsVar.zzu);
        }
    }
}
