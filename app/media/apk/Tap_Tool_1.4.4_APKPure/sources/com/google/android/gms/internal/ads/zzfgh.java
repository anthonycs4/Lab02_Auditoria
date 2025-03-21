package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgh extends zzffw {
    final /* synthetic */ zzfgj zza;
    @NullableDecl
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgh(zzfgj zzfgjVar, int i) {
        this.zza = zzfgjVar;
        this.zzb = zzfgjVar.zzb[i];
        this.zzc = i;
    }

    private final void zza() {
        int zzr;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfeo.zza(this.zzb, this.zza.zzb[this.zzc])) {
            zzr = this.zza.zzr(this.zzb);
            this.zzc = zzr;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    @NullableDecl
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    @NullableDecl
    public final Object getValue() {
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return this.zza.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzffw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzc = this.zza.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
