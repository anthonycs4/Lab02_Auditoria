package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbki extends zzbjj {
    final /* synthetic */ zzbkk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbki(zzbkk zzbkkVar, zzbkh zzbkhVar) {
        this.zza = zzbkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjk
    public final void zze(zzbja zzbjaVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomTemplateAd zzf;
        onCustomClickListener = this.zza.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = this.zza.zzb;
        zzf = this.zza.zzf(zzbjaVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
