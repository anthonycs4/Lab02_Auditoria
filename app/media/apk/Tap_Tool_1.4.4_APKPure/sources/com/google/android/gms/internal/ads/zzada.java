package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzada extends zzadm {
    private boolean zzA;
    private zzfgz<String> zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private final SparseArray<Map<zzach, zzadc>> zzH;
    private final SparseBooleanArray zzI;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private zzfgz<String> zzu;
    private int zzv;
    private int zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    @Deprecated
    public zzada() {
        this.zzg = Integer.MAX_VALUE;
        this.zzh = Integer.MAX_VALUE;
        this.zzi = Integer.MAX_VALUE;
        this.zzj = Integer.MAX_VALUE;
        this.zzo = true;
        this.zzp = false;
        this.zzq = true;
        this.zzr = Integer.MAX_VALUE;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = true;
        this.zzu = zzfgz.zzi();
        this.zzv = Integer.MAX_VALUE;
        this.zzw = Integer.MAX_VALUE;
        this.zzx = true;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        this.zzB = zzfgz.zzi();
        this.zzC = false;
        this.zzD = false;
        this.zzE = true;
        this.zzF = false;
        this.zzG = true;
        this.zzH = new SparseArray<>();
        this.zzI = new SparseBooleanArray();
    }

    public final zzada zza(int i, boolean z) {
        if (this.zzI.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzI.put(i, true);
        } else {
            this.zzI.delete(i);
        }
        return this;
    }

    public final zzacz zzb() {
        return new zzacz(this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zza, this.zzb, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzA, this.zzB, this.zzc, this.zzd, this.zze, this.zzf, this.zzC, this.zzD, this.zzE, this.zzF, this.zzG, this.zzH, this.zzI);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzada(zzacz zzaczVar, zzacv zzacvVar) {
        super(zzaczVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zzg = zzaczVar.zzb;
        this.zzh = zzaczVar.zzc;
        this.zzi = zzaczVar.zzd;
        this.zzj = zzaczVar.zze;
        this.zzk = zzaczVar.zzf;
        this.zzl = zzaczVar.zzg;
        this.zzm = zzaczVar.zzh;
        this.zzn = zzaczVar.zzi;
        this.zzo = zzaczVar.zzj;
        this.zzp = zzaczVar.zzk;
        this.zzq = zzaczVar.zzl;
        this.zzr = zzaczVar.zzm;
        this.zzs = zzaczVar.zzn;
        this.zzt = zzaczVar.zzo;
        this.zzu = zzaczVar.zzp;
        this.zzv = zzaczVar.zzq;
        this.zzw = zzaczVar.zzr;
        this.zzx = zzaczVar.zzs;
        this.zzy = zzaczVar.zzt;
        this.zzz = zzaczVar.zzu;
        this.zzA = zzaczVar.zzv;
        this.zzB = zzaczVar.zzw;
        this.zzC = zzaczVar.zzx;
        this.zzD = zzaczVar.zzy;
        this.zzE = zzaczVar.zzz;
        this.zzF = zzaczVar.zzA;
        this.zzG = zzaczVar.zzB;
        sparseArray = zzaczVar.zzK;
        SparseArray<Map<zzach, zzadc>> sparseArray2 = new SparseArray<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzH = sparseArray2;
        sparseBooleanArray = zzaczVar.zzL;
        this.zzI = sparseBooleanArray.clone();
    }
}
