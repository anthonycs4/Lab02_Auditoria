package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzatk implements Comparator<zzatq> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatk(zzatm zzatmVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzatq zzatqVar, zzatq zzatqVar2) {
        zzatq zzatqVar3 = zzatqVar;
        zzatq zzatqVar4 = zzatqVar2;
        int i = zzatqVar3.zzc - zzatqVar4.zzc;
        return i != 0 ? i : (int) (zzatqVar3.zza - zzatqVar4.zza);
    }
}
