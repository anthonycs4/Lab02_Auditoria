package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcok implements zzfko<String> {
    final /* synthetic */ zzcom zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcok(zzcom zzcomVar) {
        this.zza = zzcomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        zzetu zzetuVar;
        zzeyk zzeykVar;
        zzete zzeteVar;
        zzess zzessVar;
        zzess zzessVar2;
        Context context;
        String str2 = str;
        zzetuVar = this.zza.zzh;
        zzeykVar = this.zza.zzg;
        zzeteVar = this.zza.zze;
        zzessVar = this.zza.zzf;
        zzessVar2 = this.zza.zzf;
        List<String> zzb = zzeykVar.zzb(zzeteVar, zzessVar, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, str2, zzessVar2.zzc);
        com.google.android.gms.ads.internal.zzs.zzc();
        context = this.zza.zza;
        zzetuVar.zzb(zzb, true == com.google.android.gms.ads.internal.util.zzr.zzI(context) ? 2 : 1);
    }
}
