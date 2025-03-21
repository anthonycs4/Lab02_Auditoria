package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwb implements zzpr {
    public static final zzpx zza = zzvy.zza;
    private final List<zzahq> zzb;
    private final zzahd zzc;
    private final SparseIntArray zzd;
    private final zzwe zze;
    private final SparseArray<zzwg> zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzvx zzi;
    private zzvw zzj;
    private zzpu zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzwb() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzb(zzwb zzwbVar) {
        int i = zzwbVar.zzl;
        zzwbVar.zzl = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzn(zzwb zzwbVar, int i) {
        zzwbVar.zzl = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzo(zzwb zzwbVar, boolean z) {
        zzwbVar.zzm = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzps r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzahd r0 = r6.zzc
            byte[] r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzpo r7 = (com.google.android.gms.internal.ads.zzpo) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzh(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zze(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwb.zzd(com.google.android.gms.internal.ads.zzps):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzk = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        zzvw zzvwVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzahq zzahqVar = this.zzb.get(i);
            if (zzahqVar.zzc() == -9223372036854775807L || (zzahqVar.zzc() != 0 && zzahqVar.zza() != j2)) {
                zzahqVar.zzd(j2);
            }
        }
        if (j2 != 0 && (zzvwVar = this.zzj) != null) {
            zzvwVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            this.zzf.valueAt(i2).zzb();
        }
        this.zzp = 0;
    }

    public zzwb(int i) {
        this(1, 0, 112800);
    }

    public zzwb(int i, int i2, int i3) {
        zzahq zzahqVar = new zzahq(0L);
        this.zze = new zzuq(0);
        this.zzb = Collections.singletonList(zzahqVar);
        this.zzc = new zzahd(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray<zzwg> sparseArray = new SparseArray<>();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzvx(112800);
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzf.put(sparseArray2.keyAt(i4), (zzwg) sparseArray2.valueAt(i4));
        }
        this.zzf.put(0, new zzvt(new zzvz(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r2 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r19, com.google.android.gms.internal.ads.zzqj r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwb.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }
}
