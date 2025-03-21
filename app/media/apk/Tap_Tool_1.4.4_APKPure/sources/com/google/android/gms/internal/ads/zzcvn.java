package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvn {
    private final zzexl zza;
    private final zzcct zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List<String> zze;
    private final PackageInfo zzf;
    private final zzgdk<zzfla<String>> zzg;
    private final String zzh;
    private final zzelg<Bundle> zzi;

    public zzcvn(zzexl zzexlVar, zzcct zzcctVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzgdk<zzfla<String>> zzgdkVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzelg<Bundle> zzelgVar) {
        this.zza = zzexlVar;
        this.zzb = zzcctVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgdkVar;
        this.zzh = str2;
        this.zzi = zzelgVar;
    }

    public final zzfla<Bundle> zza() {
        zzexl zzexlVar = this.zza;
        return zzeww.zza(this.zzi.zza(new Bundle()), zzexf.SIGNALS, zzexlVar).zzi();
    }

    public final zzfla<zzbxf> zzb() {
        final zzfla<Bundle> zza = zza();
        return this.zza.zzb(zzexf.REQUEST_PARCEL, zza, this.zzg.zzb()).zza(new Callable(this, zza) { // from class: com.google.android.gms.internal.ads.zzcvm
            private final zzcvn zza;
            private final zzfla zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zza;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(this.zzb);
            }
        }).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbxf zzc(zzfla zzflaVar) throws Exception {
        return new zzbxf((Bundle) zzflaVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg.zzb().get(), this.zzh, null, null);
    }
}
