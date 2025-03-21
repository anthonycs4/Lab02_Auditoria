package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkg extends RemoteCreator<zzbit> {
    public zzbkg() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbit getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbit) {
            return (zzbit) queryLocalInterface;
        }
        return new zzbit(iBinder);
    }

    public final zzbis zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbis zzbiqVar;
        try {
            IBinder zze = getRemoteCreatorInstance(view.getContext()).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbis) {
                zzbiqVar = (zzbis) queryLocalInterface;
            } else {
                zzbiqVar = new zzbiq(zze);
            }
            return zzbiqVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzccn.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
