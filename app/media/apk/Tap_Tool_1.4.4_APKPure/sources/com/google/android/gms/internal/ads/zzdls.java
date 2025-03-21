package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdls<T> implements zzblp<Object> {
    final /* synthetic */ zzdlt zza;
    private final WeakReference<T> zzb;
    private final String zzc;
    private final zzblp<T> zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdls(zzdlt zzdltVar, WeakReference weakReference, String str, zzblp zzblpVar, zzdlj zzdljVar) {
        this.zza = zzdltVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzblpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzb.get();
        if (t == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(t, map);
        }
    }
}
