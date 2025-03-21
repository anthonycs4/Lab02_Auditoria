package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaol implements Runnable {
    final /* synthetic */ zzaoo zza;
    final /* synthetic */ zzaoq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaol(zzaoq zzaoqVar, zzaoo zzaooVar) {
        this.zzb = zzaoqVar;
        this.zza = zzaooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zza.zza();
        sparseArray = this.zzb.zzn;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzb.zzn;
            ((zzapf) sparseArray2.valueAt(i)).zzg();
        }
    }
}
