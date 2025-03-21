package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavm {
    zzajb zza;
    boolean zzb;

    public zzavm() {
    }

    public zzavm(Context context) {
        zzbfq.zza(context);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzde)).booleanValue()) {
            try {
                this.zza = (zzajb) zzccr.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzavj.zza);
                ObjectWrapper.wrap(context);
                this.zza.zze(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzb = true;
            } catch (RemoteException | zzccq | NullPointerException unused) {
                zzccn.zzd("Cannot dynamite load clearcut");
            }
        }
    }
}
