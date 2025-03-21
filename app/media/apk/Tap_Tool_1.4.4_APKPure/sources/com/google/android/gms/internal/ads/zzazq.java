package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazq extends RemoteCreator<zzbbr> {
    public zzazq() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbbr getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbbr) {
            return (zzbbr) queryLocalInterface;
        }
        return new zzbbr(iBinder);
    }

    public final zzbbq zza(Context context, String str, zzbre zzbreVar) {
        zzbbq zzbboVar;
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), str, zzbreVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbbq) {
                zzbboVar = (zzbbq) queryLocalInterface;
            } else {
                zzbboVar = new zzbbo(zze);
            }
            return zzbboVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzccn.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
