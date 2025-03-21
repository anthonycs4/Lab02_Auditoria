package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbxa extends zzhr implements zzbxb {
    public zzbxa() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((ParcelFileDescriptor) zzhs.zzc(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzf((com.google.android.gms.ads.internal.util.zzbb) zzhs.zzc(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
