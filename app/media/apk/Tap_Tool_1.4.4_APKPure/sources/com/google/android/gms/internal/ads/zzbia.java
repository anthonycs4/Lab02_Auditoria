package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbia extends zzhq implements zzbic {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final String zzb() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final List<zzbik> zzc() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList zzg = zzhs.zzg(zzbo);
        zzbo.recycle();
        return zzg;
    }
}
