package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcos {
    private final String zza;
    private final zzbqn zzb;
    private final Executor zzc;
    private zzcox zzd;
    private final zzblp<Object> zze = new zzcop(this);
    private final zzblp<Object> zzf = new zzcor(this);

    public zzcos(String str, zzbqn zzbqnVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbqnVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zze(zzcos zzcosVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcosVar.zza);
    }

    public final void zza(zzcox zzcoxVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcoxVar;
    }

    public final void zzb(zzcib zzcibVar) {
        zzcibVar.zzab("/updateActiveView", this.zze);
        zzcibVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcib zzcibVar) {
        zzcibVar.zzac("/updateActiveView", this.zze);
        zzcibVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }
}
