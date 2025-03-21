package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdjg implements zzfei<zzy, Bitmap> {
    final /* synthetic */ double zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzdjh zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjg(zzdjh zzdjhVar, double d, boolean z) {
        this.zzc = zzdjhVar;
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final /* bridge */ /* synthetic */ Bitmap apply(zzy zzyVar) {
        return zzdjh.zzb(this.zzc, zzyVar.zzb, this.zza, this.zzb);
    }
}
