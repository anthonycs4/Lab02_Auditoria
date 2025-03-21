package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzf extends zzbyk {
    private final String zza;
    private final int zzb;

    public zzbzf(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzbzf(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
