package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeib implements zzeld<zzeic> {
    private final zzflb zza;
    private final zzdnq zzb;
    private final String zzc;
    private final zzetk zzd;

    public zzeib(zzflb zzflbVar, zzdnq zzdnqVar, zzetk zzetkVar, String str) {
        this.zza = zzflbVar;
        this.zzb = zzdnqVar;
        this.zzd = zzetkVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeic> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeia
            private final zzeib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeic zzb() throws Exception {
        return new zzeic(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zzc());
    }
}
