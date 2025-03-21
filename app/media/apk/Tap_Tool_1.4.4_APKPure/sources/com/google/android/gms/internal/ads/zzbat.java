package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbat extends zzbax<zzbio> {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzbaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbat(zzbaw zzbawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzbawVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbio zza() {
        zzbaw.zzl(this.zzc, "native_ad_view_delegate");
        return new zzbem();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbio zzb() throws RemoteException {
        zzbkf zzbkfVar;
        zzbkfVar = this.zzd.zzd;
        return zzbkfVar.zza(this.zzc, this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbio zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }
}
