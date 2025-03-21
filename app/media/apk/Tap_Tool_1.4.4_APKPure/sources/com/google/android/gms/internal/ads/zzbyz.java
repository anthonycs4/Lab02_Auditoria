package com.google.android.gms.internal.ads;

import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbyz implements zzccp {
    static final zzccp zza = new zzbyz();

    private zzbyz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzccp
    public final Object zza(Object obj) {
        if (obj == 0) {
            return null;
        }
        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzbys) {
            return (zzbys) queryLocalInterface;
        }
        return new zzbys(obj);
    }
}
