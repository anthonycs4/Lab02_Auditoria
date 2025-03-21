package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcll implements zzenw {
    final /* synthetic */ zzcmk zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcll(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenw
    public final zzenx zza() {
        zzgdw.zzc(this.zzb, Context.class);
        zzgdw.zzc(this.zzc, String.class);
        return new zzclm(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzenw
    public final /* bridge */ /* synthetic */ zzenw zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzenw
    public final /* bridge */ /* synthetic */ zzenw zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }
}
