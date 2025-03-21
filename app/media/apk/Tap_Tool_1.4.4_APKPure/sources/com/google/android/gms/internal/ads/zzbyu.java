package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbyu extends zzhr implements zzbyv {
    public zzbyu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            zzf(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            zzg((zzazm) zzhs.zzc(parcel, zzazm.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
