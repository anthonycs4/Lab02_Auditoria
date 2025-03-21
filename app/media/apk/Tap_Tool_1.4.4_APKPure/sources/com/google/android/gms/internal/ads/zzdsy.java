package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsy implements zzgdq<zzfla<String>> {
    private final zzgeb<zzfb> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzflb> zzc;

    public zzdsy(zzgeb<zzfb> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzflb> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzfb zzb = this.zza.zzb();
        final Context zza = ((zzeuo) this.zzb).zza();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzfla zzb2 = zzflbVar.zzb(new Callable(zzb, zza) { // from class: com.google.android.gms.internal.ads.zzdsx
            private final zzfb zza;
            private final Context zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
                this.zzb = zza;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfb zzfbVar = this.zza;
                return zzfbVar.zzb().zzj(this.zzb);
            }
        });
        zzgdw.zzb(zzb2);
        return zzb2;
    }
}
