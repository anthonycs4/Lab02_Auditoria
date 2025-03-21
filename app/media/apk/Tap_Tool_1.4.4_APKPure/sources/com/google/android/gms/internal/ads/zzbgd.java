package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbgd {
    private final Map<String, zzbgc> zza = new HashMap();
    private final zzbgf zzb;

    public zzbgd(zzbgf zzbgfVar) {
        this.zzb = zzbgfVar;
    }

    public final void zza(String str, zzbgc zzbgcVar) {
        this.zza.put(str, zzbgcVar);
    }

    public final void zzb(String str, String str2, long j) {
        zzbgf zzbgfVar = this.zzb;
        zzbgc zzbgcVar = this.zza.get(str2);
        String[] strArr = {str};
        if (zzbgcVar != null) {
            zzbgfVar.zzb(zzbgcVar, j, strArr);
        }
        this.zza.put(str, new zzbgc(j, null, null));
    }

    public final zzbgf zzc() {
        return this.zzb;
    }
}
