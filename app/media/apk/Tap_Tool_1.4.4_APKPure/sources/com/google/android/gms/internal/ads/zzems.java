package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzems implements zzeld<zzemt> {
    final zzflb zza;
    final String zzb;
    final zzcbp zzc;

    public zzems(zzcbp zzcbpVar, zzflb zzflbVar, String str, byte[] bArr) {
        this.zzc = zzcbpVar;
        this.zza = zzflbVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzemt> zza() {
        new zzcde();
        final zzfla zza = zzfks.zza(null);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdY)).booleanValue()) {
            zza = zzfks.zza(null);
        }
        final zzfla zza2 = zzfks.zza(null);
        return zzfks.zzn(zza, zza2).zza(new Callable(zza, zza2) { // from class: com.google.android.gms.internal.ads.zzemr
            private final zzfla zza;
            private final zzfla zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
                this.zzb = zza2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemt((String) this.zza.get(), (String) this.zzb.get());
            }
        }, zzccz.zza);
    }
}
