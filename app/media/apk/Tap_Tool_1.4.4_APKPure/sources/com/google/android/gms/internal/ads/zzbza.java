package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbza {
    public static final zzbyo zza(Context context, String str, zzbre zzbreVar) {
        zzbyo zzbymVar;
        try {
            IBinder zze = ((zzbys) zzccr.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbyz.zza)).zze(ObjectWrapper.wrap(context), str, zzbreVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbyo) {
                zzbymVar = (zzbyo) queryLocalInterface;
            } else {
                zzbymVar = new zzbym(zze);
            }
            return zzbymVar;
        } catch (RemoteException | zzccq e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
