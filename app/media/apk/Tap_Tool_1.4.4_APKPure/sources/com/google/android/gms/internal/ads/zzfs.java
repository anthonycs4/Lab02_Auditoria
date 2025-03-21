package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfs implements zzfde {
    private final zzfbd zza;
    private final zzfbu zzb;
    private final zzgf zzc;
    private final zzfr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfs(zzfbd zzfbdVar, zzfbu zzfbuVar, zzgf zzgfVar, zzfr zzfrVar) {
        this.zza = zzfbdVar;
        this.zzb = zzfbuVar;
        this.zzc = zzgfVar;
        this.zzd = zzfrVar;
    }

    private final Map<String, Object> zze() {
        HashMap hashMap = new HashMap();
        zzdc zzc = this.zzb.zzc();
        hashMap.put("v", this.zza.zza());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzc.zzc());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final Map<String, Object> zzb() {
        Map<String, Object> zze = zze();
        zzdc zzb = this.zzb.zzb();
        zze.put("gai", Boolean.valueOf(this.zza.zzb()));
        zze.put("did", zzb.zzd());
        zze.put("dst", Integer.valueOf(zzb.zze().zza()));
        zze.put("doo", Boolean.valueOf(zzb.zzf()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final Map<String, Object> zzc() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final Map<String, Object> zzd() {
        Map<String, Object> zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zzc()));
        return zze;
    }
}
