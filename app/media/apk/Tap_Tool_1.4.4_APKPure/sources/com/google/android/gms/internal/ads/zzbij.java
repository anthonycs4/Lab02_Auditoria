package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbij extends zzhr implements zzbik {
    public zzbij() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbik zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzbik) {
            return (zzbik) queryLocalInterface;
        }
        return new zzbii(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            zzhs.zzf(parcel2, zzb);
        } else if (i == 2) {
            Uri zzc = zzc();
            parcel2.writeNoException();
            zzhs.zze(parcel2, zzc);
        } else if (i == 3) {
            double zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeDouble(zzd);
        } else if (i == 4) {
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        } else if (i != 5) {
            return false;
        } else {
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }
}
