package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsv {
    public static int zza(AdRequest.ErrorCode errorCode) {
        AdRequest.ErrorCode errorCode2 = AdRequest.ErrorCode.INVALID_REQUEST;
        AdRequest.Gender gender = AdRequest.Gender.UNKNOWN;
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return ordinal != 2 ? 0 : 2;
            }
            return 3;
        }
        return 1;
    }

    public static MediationAdRequest zzb(zzazs zzazsVar, boolean z) {
        AdRequest.Gender gender;
        List<String> list = zzazsVar.zze;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzazsVar.zzb);
        int i = zzazsVar.zzd;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i == 2) {
            gender = AdRequest.Gender.FEMALE;
        } else {
            gender = AdRequest.Gender.UNKNOWN;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzazsVar.zzk);
    }
}
