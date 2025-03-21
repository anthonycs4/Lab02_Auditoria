package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazw {
    public static final zzazw zza = new zzazw();

    protected zzazw() {
    }

    public final zzazs zza(Context context, zzbdq zzbdqVar) {
        Context context2;
        List list;
        zzazk zzazkVar;
        String str;
        Date zza2 = zzbdqVar.zza();
        long time = zza2 != null ? zza2.getTime() : -1L;
        String zzb = zzbdqVar.zzb();
        int zzd = zzbdqVar.zzd();
        Set<String> zze = zzbdqVar.zze();
        if (zze.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(zze));
            context2 = context;
        }
        boolean zzm = zzbdqVar.zzm(context2);
        Location zzf = zzbdqVar.zzf();
        Bundle zzh = zzbdqVar.zzh(AdMobAdapter.class);
        AdInfo zzt = zzbdqVar.zzt();
        if (zzt != null) {
            QueryInfo queryInfo = zzt.getQueryInfo();
            zzazkVar = new zzazk(zzbdqVar.zzt().getAdString(), queryInfo != null ? queryInfo.zza().zzd() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            zzazkVar = null;
        }
        String zzj = zzbdqVar.zzj();
        SearchAdRequest zzl = zzbdqVar.zzl();
        zzbeu zzbeuVar = zzl != null ? new zzbeu(zzl) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbay.zza();
            str = zzccg.zzl(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzs = zzbdqVar.zzs();
        RequestConfiguration zzm2 = zzbdy.zza().zzm();
        return new zzazs(8, time, zzh, zzd, list, zzm, Math.max(zzbdqVar.zzp(), zzm2.getTagForChildDirectedTreatment()), false, zzj, zzbeuVar, zzf, zzb, zzbdqVar.zzo(), zzbdqVar.zzq(), Collections.unmodifiableList(new ArrayList(zzbdqVar.zzr())), zzbdqVar.zzk(), str, zzs, zzazkVar, Math.max(-1, zzm2.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, zzm2.getMaxAdContentRating()), zzazv.zza), zzbdqVar.zzc(), zzbdqVar.zzv(), zzbdqVar.zzu());
    }
}
