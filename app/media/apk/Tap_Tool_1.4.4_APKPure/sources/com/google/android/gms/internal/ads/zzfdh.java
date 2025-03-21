package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdh {
    boolean zza;
    zzfdi zzb;

    public zzfdh(Context context, String str, String str2) {
        zzfdi zzfdiVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.ads.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfdiVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IClearcut");
                        if (queryLocalInterface instanceof zzfdi) {
                            zzfdiVar = (zzfdi) queryLocalInterface;
                        } else {
                            zzfdiVar = new zzfdi(instantiate);
                        }
                    }
                    this.zzb = zzfdiVar;
                    this.zzb.zzj(ObjectWrapper.wrap(context), str, null);
                    this.zza = true;
                } catch (Exception e) {
                    throw new zzfcj(e);
                }
            } catch (RemoteException | zzfcj | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
            }
        } catch (Exception e2) {
            throw new zzfcj(e2);
        }
    }

    public final zzfdg zza(byte[] bArr) {
        return new zzfdg(this, bArr, null);
    }
}
