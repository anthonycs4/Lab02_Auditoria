package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbch extends zzhr implements zzbci {
    public zzbch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((zzazm) zzhs.zzc(parcel, zzazm.CREATOR));
        } else if (i == 2) {
            zzc();
        } else if (i == 3) {
            zzd();
        } else if (i != 4) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
