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
public final class zzazr extends RemoteCreator<zzbbv> {
    public zzazr() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbbv getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbbv) {
            return (zzbbv) queryLocalInterface;
        }
        return new zzbbv(iBinder);
    }

    public final zzbbu zza(Context context, zzazx zzazxVar, String str, zzbre zzbreVar, int i) {
        zzbbu zzbbsVar;
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), zzazxVar, str, zzbreVar, ModuleDescriptor.MODULE_VERSION, i);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbbu) {
                zzbbsVar = (zzbbu) queryLocalInterface;
            } else {
                zzbbsVar = new zzbbs(zze);
            }
            return zzbbsVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzccn.zze("Could not create remote AdManager.", e);
            return null;
        }
    }
}
