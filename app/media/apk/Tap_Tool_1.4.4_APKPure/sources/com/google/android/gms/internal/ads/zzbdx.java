package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdx extends zzbnp {
    final /* synthetic */ zzbdy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbdx(zzbdy zzbdyVar, zzbdv zzbdvVar) {
        this.zza = zzbdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzb(List<zzbnj> list) throws RemoteException {
        InitializationStatus zzx;
        ArrayList arrayList;
        ArrayList arrayList2;
        zzbdy.zzq(this.zza, false);
        zzbdy.zzr(this.zza, true);
        zzbdy zzbdyVar = this.zza;
        zzx = zzbdy.zzx(list);
        arrayList = zzbdy.zza().zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzx);
        }
        arrayList2 = zzbdy.zza().zza;
        arrayList2.clear();
    }
}
