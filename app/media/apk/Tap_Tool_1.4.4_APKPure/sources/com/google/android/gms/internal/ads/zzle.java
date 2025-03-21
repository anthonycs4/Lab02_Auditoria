package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzle extends zzht {
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzlq[] zzg;
    private final Object[] zzh;
    private final HashMap<Object, Integer> zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zzle(Collection collection, Collection<? extends zzkk> collection2, zzaca zzacaVar) {
        super(false, collection2, null);
        int i = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzlq[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap<>();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzkk zzkkVar = (zzkk) it.next();
            this.zzg[i3] = zzkkVar.zzb();
            this.zzf[i3] = i;
            this.zze[i3] = i2;
            i += this.zzg[i3].zzr();
            i2 += this.zzg[i3].zzs();
            this.zzh[i3] = zzkkVar.zza();
            this.zzi.put(this.zzh[i3], Integer.valueOf(i3));
            i3++;
        }
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzj(int i) {
        return zzaht.zzD(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzk(int i) {
        return zzaht.zzD(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzl(Object obj) {
        Integer num = this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final zzlq zzm(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzn(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzo(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final Object zzp(int i) {
        return this.zzh[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<zzlq> zzq() {
        return Arrays.asList(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzs() {
        return this.zzd;
    }
}
