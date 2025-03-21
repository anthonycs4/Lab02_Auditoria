package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgn extends zzhg {
    public zzgn(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        super(zzfyVar, "+CBbXHi/+XdLnSyDhFU51JgiFyDr7i+oHe/ECeOut7QI1M4VCznQFAAROBrz4y9r", "uLz42FqWno2hsY6OwcAoAZ4P+BVsWg+PIwU6Rmo8Y88=", zzcnVar, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzr = this.zzb.zzr();
        if (zzr == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzr.getInfo();
            String zza = zzgb.zza(info.getId());
            if (zza != null) {
                synchronized (this.zze) {
                    this.zze.zzX(zza);
                    this.zze.zzZ(info.isLimitAdTrackingEnabled());
                    this.zze.zzY(zzct.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzb();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zzb.zzh()) {
            synchronized (this.zze) {
                this.zze.zzX((String) this.zzf.invoke(null, this.zzb.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final Void zzb() throws Exception {
        if (this.zzb.zzc()) {
            super.zzb();
            return null;
        }
        if (this.zzb.zzh()) {
            zzc();
        }
        return null;
    }
}
