package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzebg<AdT> implements zzdya<AdT> {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        return !TextUtils.isEmpty(zzessVar.zzu.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<AdT> zzb(zzete zzeteVar, zzess zzessVar) {
        String optString = zzessVar.zzu.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zzetk zzetkVar = zzeteVar.zza.zza;
        zzetj zzetjVar = new zzetj();
        zzetjVar.zzt(zzetkVar);
        zzetjVar.zzf(optString);
        Bundle zzd = zzd(zzetkVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzessVar.zzu.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzessVar.zzu.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzessVar.zzC.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzessVar.zzC.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzazs zzazsVar = zzetkVar.zzd;
        zzetjVar.zza(new zzazs(zzazsVar.zza, zzazsVar.zzb, zzd2, zzazsVar.zzd, zzazsVar.zze, zzazsVar.zzf, zzazsVar.zzg, zzazsVar.zzh, zzazsVar.zzi, zzazsVar.zzj, zzazsVar.zzk, zzazsVar.zzl, zzd, zzazsVar.zzn, zzazsVar.zzo, zzazsVar.zzp, zzazsVar.zzq, zzazsVar.zzr, zzazsVar.zzs, zzazsVar.zzt, zzazsVar.zzu, zzazsVar.zzv, zzazsVar.zzw, zzazsVar.zzx));
        zzetk zzu = zzetjVar.zzu();
        Bundle bundle = new Bundle();
        zzesv zzesvVar = zzeteVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzesvVar.zza));
        bundle2.putInt("refresh_interval", zzesvVar.zzc);
        bundle2.putString("gws_query_id", zzesvVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzeteVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzessVar.zzv);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzessVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzessVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzessVar.zzo));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzessVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzessVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzessVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzessVar.zzi));
        bundle3.putString("transaction_id", zzessVar.zzj);
        bundle3.putString("valid_from_timestamp", zzessVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzessVar.zzK);
        if (zzessVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzessVar.zzl.zzb);
            bundle4.putString("rb_type", zzessVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzu, bundle);
    }

    protected abstract zzfla<AdT> zzc(zzetk zzetkVar, Bundle bundle);
}
