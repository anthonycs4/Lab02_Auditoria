package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbwd {
    private static zzcbj zzd;
    private final Context zza;
    private final AdFormat zzb;
    private final zzbdq zzc;

    public zzbwd(Context context, AdFormat adFormat, zzbdq zzbdqVar) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzbdqVar;
    }

    public static zzcbj zza(Context context) {
        zzcbj zzcbjVar;
        synchronized (zzbwd.class) {
            if (zzd == null) {
                zzd = zzbay.zzb().zzh(context, new zzbrb());
            }
            zzcbjVar = zzd;
        }
        return zzcbjVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzazs zza;
        zzcbj zza2 = zza(this.zza);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        if (this.zzc != null) {
            zza = zzazw.zza.zza(this.zza, this.zzc);
        } else {
            zza = new zzazt().zza();
        }
        try {
            zza2.zze(wrap, new zzcbn(null, this.zzb.name(), null, zza), new zzbwc(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
