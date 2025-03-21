package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzclu implements zzdqu {
    final /* synthetic */ zzcmk zza;
    private Context zzb;
    private zzbmk zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclu(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqu
    public final zzdqv zza() {
        zzgdw.zzc(this.zzb, Context.class);
        zzgdw.zzc(this.zzc, zzbmk.class);
        return new zzclx(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqu
    public final /* bridge */ /* synthetic */ zzdqu zzb(zzbmk zzbmkVar) {
        Objects.requireNonNull(zzbmkVar);
        this.zzc = zzbmkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqu
    public final /* bridge */ /* synthetic */ zzdqu zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }
}
