package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgah {
    private final ArrayDeque<zzfxj> zza = new ArrayDeque<>();

    private zzgah() {
    }

    public static /* synthetic */ zzfxj zza(zzgah zzgahVar, zzfxj zzfxjVar, zzfxj zzfxjVar2) {
        zzgahVar.zzb(zzfxjVar);
        zzgahVar.zzb(zzfxjVar2);
        zzfxj pop = zzgahVar.zza.pop();
        while (!zzgahVar.zza.isEmpty()) {
            pop = new zzgaj(zzgahVar.zza.pop(), pop, null);
        }
        return pop;
    }

    private final void zzb(zzfxj zzfxjVar) {
        zzfxj zzfxjVar2;
        zzfxj zzfxjVar3;
        if (zzfxjVar.zzg()) {
            int zzc = zzc(zzfxjVar.zzc());
            int zzh = zzgaj.zzh(zzc + 1);
            if (this.zza.isEmpty() || this.zza.peek().zzc() >= zzh) {
                this.zza.push(zzfxjVar);
                return;
            }
            int zzh2 = zzgaj.zzh(zzc);
            zzfxj pop = this.zza.pop();
            while (!this.zza.isEmpty() && this.zza.peek().zzc() < zzh2) {
                pop = new zzgaj(this.zza.pop(), pop, null);
            }
            zzgaj zzgajVar = new zzgaj(pop, zzfxjVar, null);
            while (!this.zza.isEmpty()) {
                if (this.zza.peek().zzc() >= zzgaj.zzh(zzc(zzgajVar.zzc()) + 1)) {
                    break;
                }
                zzgajVar = new zzgaj(this.zza.pop(), zzgajVar, null);
            }
            this.zza.push(zzgajVar);
        } else if (zzfxjVar instanceof zzgaj) {
            zzgaj zzgajVar2 = (zzgaj) zzfxjVar;
            zzfxjVar2 = zzgajVar2.zzd;
            zzb(zzfxjVar2);
            zzfxjVar3 = zzgajVar2.zze;
            zzb(zzfxjVar3);
        } else {
            String valueOf = String.valueOf(zzfxjVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgaj.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzgah(zzgag zzgagVar) {
    }
}
