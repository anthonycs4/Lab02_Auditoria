package com.google.android.gms.internal.ads;

import java.util.Comparator;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfxb implements Comparator<zzfxj> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzfxj zzfxjVar, zzfxj zzfxjVar2) {
        zzfxj zzfxjVar3 = zzfxjVar;
        zzfxj zzfxjVar4 = zzfxjVar2;
        zzfxe it = zzfxjVar3.iterator();
        zzfxe it2 = zzfxjVar4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = Integer.compare(it.zza() & UByte.MAX_VALUE, it2.zza() & UByte.MAX_VALUE);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzfxjVar3.zzc(), zzfxjVar4.zzc());
    }
}
