package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwp {
    public final int zza;
    public final long zzb;

    private zzwp(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzwp zza(zzps zzpsVar, zzahd zzahdVar) throws IOException {
        ((zzpo) zzpsVar).zzh(zzahdVar.zzi(), 0, 8, false);
        zzahdVar.zzh(0);
        return new zzwp(zzahdVar.zzv(), zzahdVar.zzu());
    }
}
