package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdzk extends zzbsy {
    final /* synthetic */ zzdzl zza;
    private final zzdyd<zzbtl, zzdzw> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdzk(zzdzl zzdzlVar, zzdyd zzdydVar, zzdzj zzdzjVar) {
        this.zza = zzdzlVar;
        this.zzb = zzdydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdzl.zzd(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        this.zzb.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(String str) throws RemoteException {
        this.zzb.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        this.zzb.zzc.zzx(zzazmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(zzbrn zzbrnVar) throws RemoteException {
        zzdzl.zze(this.zza, zzbrnVar);
        this.zzb.zzc.zzj();
    }
}
