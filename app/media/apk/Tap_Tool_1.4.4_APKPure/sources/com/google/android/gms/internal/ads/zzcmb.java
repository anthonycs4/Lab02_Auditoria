package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcmb implements zzeqz {
    final /* synthetic */ zzcmk zza;
    private Context zzb;
    private String zzc;
    private zzazx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmb(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqz
    public final zzera zza() {
        zzgdw.zzc(this.zzb, Context.class);
        zzgdw.zzc(this.zzc, String.class);
        zzgdw.zzc(this.zzd, zzazx.class);
        return new zzcmc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeqz
    public final /* bridge */ /* synthetic */ zzeqz zzb(zzazx zzazxVar) {
        Objects.requireNonNull(zzazxVar);
        this.zzd = zzazxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeqz
    public final /* bridge */ /* synthetic */ zzeqz zzc(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeqz
    public final /* bridge */ /* synthetic */ zzeqz zzd(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }
}
