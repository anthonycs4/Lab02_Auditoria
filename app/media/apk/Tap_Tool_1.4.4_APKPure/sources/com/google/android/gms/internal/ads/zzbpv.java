package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbpv {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbqe zzc;
    private zzbqe zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbqe zza(Context context, zzcct zzcctVar) {
        zzbqe zzbqeVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbqe(zzc(context), zzcctVar, zzbhk.zzb.zze());
            }
            zzbqeVar = this.zzd;
        }
        return zzbqeVar;
    }

    public final zzbqe zzb(Context context, zzcct zzcctVar) {
        zzbqe zzbqeVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbqe(zzc(context), zzcctVar, (String) zzbba.zzc().zzb(zzbfq.zza));
            }
            zzbqeVar = this.zzc;
        }
        return zzbqeVar;
    }
}
