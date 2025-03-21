package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaaz extends zzzt<Integer> {
    private static final zzkd zza;
    private final zzaal[] zzb;
    private final zzlq[] zzc;
    private final ArrayList<zzaal> zzd;
    private final Map<Object, Long> zze;
    private final zzfhz<Object, zzzp> zzf;
    private int zzg;
    private long[][] zzh;
    private zzaay zzi;
    private final zzzv zzj;

    static {
        zzjw zzjwVar = new zzjw();
        zzjwVar.zza("MergingMediaSource");
        zza = zzjwVar.zzc();
    }

    public zzaaz(boolean z, boolean z2, zzaal... zzaalVarArr) {
        zzzv zzzvVar = new zzzv();
        this.zzb = zzaalVarArr;
        this.zzj = zzzvVar;
        this.zzd = new ArrayList<>(Arrays.asList(zzaalVarArr));
        this.zzg = -1;
        this.zzc = new zzlq[zzaalVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfig.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaah zzB(zzaaj zzaajVar, zzaek zzaekVar, long j) {
        int length = this.zzb.length;
        zzaah[] zzaahVarArr = new zzaah[length];
        int zzh = this.zzc[0].zzh(zzaajVar.zza);
        for (int i = 0; i < length; i++) {
            zzaahVarArr[i] = this.zzb[i].zzB(zzaajVar.zzc(this.zzc[i].zzi(zzh)), zzaekVar, j - this.zzh[zzh][i]);
        }
        return new zzaax(this.zzj, this.zzh[zzh], zzaahVarArr, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzm
    public final void zza(zzafp zzafpVar) {
        super.zza(zzafpVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzv(Integer.valueOf(i), this.zzb[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzm
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ void zzu(Integer num, zzaal zzaalVar, zzlq zzlqVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzlqVar.zzs();
            this.zzg = i;
        } else {
            int zzs = zzlqVar.zzs();
            int i2 = this.zzg;
            if (zzs != i2) {
                this.zzi = new zzaay(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i, this.zzc.length);
        }
        this.zzd.remove(zzaalVar);
        this.zzc[num.intValue()] = zzlqVar;
        if (this.zzd.isEmpty()) {
            zze(this.zzc[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzzt
    public final /* bridge */ /* synthetic */ zzaaj zzw(Integer num, zzaaj zzaajVar) {
        if (num.intValue() == 0) {
            return zzaajVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzkd zzy() {
        zzaal[] zzaalVarArr = this.zzb;
        return zzaalVarArr.length > 0 ? zzaalVarArr[0].zzy() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzz(zzaah zzaahVar) {
        zzaax zzaaxVar = (zzaax) zzaahVar;
        int i = 0;
        while (true) {
            zzaal[] zzaalVarArr = this.zzb;
            if (i >= zzaalVarArr.length) {
                return;
            }
            zzaalVarArr[i].zzz(zzaaxVar.zzo(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzaal
    public final void zzt() throws IOException {
        zzaay zzaayVar = this.zzi;
        if (zzaayVar != null) {
            throw zzaayVar;
        }
        super.zzt();
    }
}
