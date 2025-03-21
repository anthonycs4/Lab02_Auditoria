package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdrb implements zzdql {
    private final long zza;
    private final String zzb;
    private final zzdqq zzc;
    private final zzesj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrb(long j, Context context, zzdqq zzdqqVar, zzcjz zzcjzVar, String str) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzdqqVar;
        zzesl zzt = zzcjzVar.zzt();
        zzt.zzc(context);
        zzt.zzb(str);
        this.zzd = zzt.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zza(zzazs zzazsVar) {
        try {
            this.zzd.zzc(zzazsVar, new zzdqz(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zzb() {
        try {
            this.zzd.zze(new zzdra(this));
            this.zzd.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zzc() {
    }
}
