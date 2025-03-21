package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbfr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbgs.zzd("gad:dynamite_module:experiment_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        zzc(arrayList, zzbhb.zza);
        zzc(arrayList, zzbhb.zzb);
        zzc(arrayList, zzbhb.zzc);
        zzc(arrayList, zzbhb.zzd);
        zzc(arrayList, zzbhb.zze);
        zzc(arrayList, zzbhb.zzk);
        zzc(arrayList, zzbhb.zzf);
        zzc(arrayList, zzbhb.zzg);
        zzc(arrayList, zzbhb.zzh);
        zzc(arrayList, zzbhb.zzi);
        zzc(arrayList, zzbhb.zzj);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbhl.zza);
        return arrayList;
    }

    private static void zzc(List<String> list, zzbgs<String> zzbgsVar) {
        String zze = zzbgsVar.zze();
        if (TextUtils.isEmpty(zze)) {
            return;
        }
        list.add(zze);
    }
}
