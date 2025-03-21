package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgt implements zzasi {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgt(zzdgu zzdguVar, String str) {
        this.zzb = zzdguVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        Map map;
        zzdit zzditVar;
        zzdit zzditVar2;
        zzdit zzditVar3;
        if (zzashVar.zzj) {
            map = this.zzb.zzx;
            map.put(this.zza, true);
            zzdgu zzdguVar = this.zzb;
            zzditVar = zzdguVar.zzn;
            View zzbI = zzditVar.zzbI();
            zzditVar2 = this.zzb.zzn;
            Map<String, WeakReference<View>> zzj = zzditVar2.zzj();
            zzditVar3 = this.zzb.zzn;
            zzdguVar.zzp(zzbI, zzj, zzditVar3.zzk(), true);
        }
    }
}
