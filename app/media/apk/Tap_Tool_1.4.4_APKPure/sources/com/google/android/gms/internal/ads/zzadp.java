package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzadp {
    private zzado zza;
    private zzadx zzb;

    public abstract void zzi(Object obj);

    public abstract zzadq zzj(zzlh[] zzlhVarArr, zzach zzachVar, zzaaj zzaajVar, zzlq zzlqVar) throws zzid;

    public final void zzk(zzado zzadoVar, zzadx zzadxVar) {
        this.zza = zzadoVar;
        this.zzb = zzadxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl() {
        zzado zzadoVar = this.zza;
        if (zzadoVar != null) {
            zzadoVar.zzk();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzadx zzm() {
        zzadx zzadxVar = this.zzb;
        Objects.requireNonNull(zzadxVar);
        return zzadxVar;
    }
}
