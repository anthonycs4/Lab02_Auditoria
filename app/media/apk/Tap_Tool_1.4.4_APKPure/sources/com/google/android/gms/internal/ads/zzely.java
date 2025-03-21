package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzely implements zzeld<zzelz> {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcbr zzd;

    public zzely(zzcbr zzcbrVar, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcbrVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelz> zza() {
        return zzfks.zzg(zzfks.zzj(zzfks.zza(this.zzb), zzelw.zza, this.zza), Throwable.class, new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzelx
            private final zzely zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzb((Throwable) obj);
            }
        }, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(Throwable th) throws Exception {
        return zzfks.zza(new zzelz(this.zzb));
    }
}
