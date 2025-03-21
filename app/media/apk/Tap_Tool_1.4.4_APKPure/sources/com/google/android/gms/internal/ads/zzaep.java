package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaep implements zzaee {
    private final Context zza;
    private final zzaee zzb;

    public zzaep(Context context, String str, zzafp zzafpVar) {
        zzaer zzaerVar = new zzaer();
        zzaerVar.zzb(null);
        this.zza = context.getApplicationContext();
        this.zzb = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaee
    public final /* bridge */ /* synthetic */ zzaef zza() {
        return new zzaeo(this.zza, ((zzaer) this.zzb).zza());
    }
}
