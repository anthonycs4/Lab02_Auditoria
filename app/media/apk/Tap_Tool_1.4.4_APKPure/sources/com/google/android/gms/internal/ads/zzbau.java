package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbau extends zzbax<zzbis> {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzbaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbau(zzbaw zzbawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzbawVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbis zza() {
        zzbaw.zzl(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzben();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbis zzb() throws RemoteException {
        zzbkg zzbkgVar;
        zzbkgVar = this.zzd.zzg;
        return zzbkgVar.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbis zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }
}
