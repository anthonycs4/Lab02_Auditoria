package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcol implements zzfko<String> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcom zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcol(zzcom zzcomVar, String str) {
        this.zzb = zzcomVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzetu zzetuVar;
        zzeyk zzeykVar;
        zzete zzeteVar;
        zzess zzessVar;
        zzess zzessVar2;
        zzetuVar = this.zzb.zzh;
        zzeykVar = this.zzb.zzg;
        zzeteVar = this.zzb.zze;
        zzessVar = this.zzb.zzf;
        String str = this.zza;
        zzessVar2 = this.zzb.zzf;
        zzetuVar.zza(zzeykVar.zzb(zzeteVar, zzessVar, false, str, null, zzessVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        zzetu zzetuVar;
        zzeyk zzeykVar;
        zzete zzeteVar;
        zzess zzessVar;
        zzess zzessVar2;
        String str2 = str;
        zzetuVar = this.zzb.zzh;
        zzeykVar = this.zzb.zzg;
        zzeteVar = this.zzb.zze;
        zzessVar = this.zzb.zzf;
        String str3 = this.zza;
        zzessVar2 = this.zzb.zzf;
        zzetuVar.zza(zzeykVar.zzb(zzeteVar, zzessVar, false, str3, str2, zzessVar2.zzd));
    }
}
