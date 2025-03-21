package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcu implements MuteThisAdReason {
    private final String zza;
    private final zzbct zzb;

    public zzbcu(zzbct zzbctVar) {
        String str;
        this.zzb = zzbctVar;
        try {
            str = zzbctVar.zze();
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzbct zza() {
        return this.zzb;
    }
}
