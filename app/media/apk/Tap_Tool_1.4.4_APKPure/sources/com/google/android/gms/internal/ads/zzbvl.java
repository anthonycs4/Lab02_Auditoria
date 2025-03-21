package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbvl extends RemoteCreator<zzbvp> {
    public zzbvl() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbvp getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbvp) {
            return (zzbvp) queryLocalInterface;
        }
        return new zzbvp(iBinder);
    }

    public final zzbvo zza(Activity activity) {
        zzbvo zzbvmVar;
        try {
            IBinder zze = getRemoteCreatorInstance(activity).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbvo) {
                zzbvmVar = (zzbvo) queryLocalInterface;
            } else {
                zzbvmVar = new zzbvm(zze);
            }
            return zzbvmVar;
        } catch (RemoteException e) {
            zzccn.zzj("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzccn.zzj("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
