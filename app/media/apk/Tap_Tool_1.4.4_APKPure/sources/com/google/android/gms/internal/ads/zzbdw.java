package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdw extends zzbcw {
    private zzbdw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbcx
    public final void zze(@Nullable zzazm zzazmVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzbdy.zza().zzg;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzazmVar == null ? null : new AdInspectorError(zzazmVar.zza, zzazmVar.zzb, zzazmVar.zzc));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbdw(zzbdv zzbdvVar) {
    }
}
