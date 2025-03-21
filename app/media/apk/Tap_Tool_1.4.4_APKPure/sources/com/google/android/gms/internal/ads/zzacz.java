package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacz extends zzadn {
    public final boolean zzA;
    public final boolean zzB;
    private final SparseArray<Map<zzach, zzadc>> zzK;
    private final SparseBooleanArray zzL;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final boolean zzo;
    public final zzfgz<String> zzp;
    public final int zzq;
    public final int zzr;
    public final boolean zzs;
    public final boolean zzt;
    public final boolean zzu;
    public final boolean zzv;
    public final zzfgz<String> zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;
    public static final zzacz zza = new zzada().zzb();
    public static final Parcelable.Creator<zzacz> CREATOR = new zzacy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, zzfgz<String> zzfgzVar, zzfgz<String> zzfgzVar2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, zzfgz<String> zzfgzVar3, zzfgz<String> zzfgzVar4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<zzach, zzadc>> sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(zzfgzVar2, i11, zzfgzVar4, i14, z9, i15);
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = z;
        this.zzk = z2;
        this.zzl = z3;
        this.zzm = i9;
        this.zzn = i10;
        this.zzo = z4;
        this.zzp = zzfgzVar;
        this.zzq = i12;
        this.zzr = i13;
        this.zzs = z5;
        this.zzt = z6;
        this.zzu = z7;
        this.zzv = z8;
        this.zzw = zzfgzVar3;
        this.zzx = z10;
        this.zzy = z11;
        this.zzz = z12;
        this.zzA = z13;
        this.zzB = z14;
        this.zzK = sparseArray;
        this.zzL = sparseBooleanArray;
    }

    @Override // com.google.android.gms.internal.ads.zzadn, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacz zzaczVar = (zzacz) obj;
            if (super.equals(obj) && this.zzb == zzaczVar.zzb && this.zzc == zzaczVar.zzc && this.zzd == zzaczVar.zzd && this.zze == zzaczVar.zze && this.zzf == zzaczVar.zzf && this.zzg == zzaczVar.zzg && this.zzh == zzaczVar.zzh && this.zzi == zzaczVar.zzi && this.zzj == zzaczVar.zzj && this.zzk == zzaczVar.zzk && this.zzl == zzaczVar.zzl && this.zzo == zzaczVar.zzo && this.zzm == zzaczVar.zzm && this.zzn == zzaczVar.zzn && this.zzp.equals(zzaczVar.zzp) && this.zzq == zzaczVar.zzq && this.zzr == zzaczVar.zzr && this.zzs == zzaczVar.zzs && this.zzt == zzaczVar.zzt && this.zzu == zzaczVar.zzu && this.zzv == zzaczVar.zzv && this.zzw.equals(zzaczVar.zzw) && this.zzx == zzaczVar.zzx && this.zzy == zzaczVar.zzy && this.zzz == zzaczVar.zzz && this.zzA == zzaczVar.zzA && this.zzB == zzaczVar.zzB) {
                SparseBooleanArray sparseBooleanArray = this.zzL;
                SparseBooleanArray sparseBooleanArray2 = zzaczVar.zzL;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray<Map<zzach, zzadc>> sparseArray = this.zzK;
                            SparseArray<Map<zzach, zzadc>> sparseArray2 = zzaczVar.zzK;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map<zzach, zzadc> valueAt = sparseArray.valueAt(i2);
                                        Map<zzach, zzadc> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<zzach, zzadc> entry : valueAt.entrySet()) {
                                                zzach key = entry.getKey();
                                                if (valueAt2.containsKey(key)) {
                                                    if (!zzaht.zzc(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.zzb) * 31) + this.zzc) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzk ? 1 : 0)) * 31) + (this.zzl ? 1 : 0)) * 31) + (this.zzo ? 1 : 0)) * 31) + this.zzm) * 31) + this.zzn) * 31) + this.zzp.hashCode()) * 31) + this.zzq) * 31) + this.zzr) * 31) + (this.zzs ? 1 : 0)) * 31) + (this.zzt ? 1 : 0)) * 31) + (this.zzu ? 1 : 0)) * 31) + (this.zzv ? 1 : 0)) * 31) + this.zzw.hashCode()) * 31) + (this.zzx ? 1 : 0)) * 31) + (this.zzy ? 1 : 0)) * 31) + (this.zzz ? 1 : 0)) * 31) + (this.zzA ? 1 : 0)) * 31) + (this.zzB ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzh);
        parcel.writeInt(this.zzi);
        zzaht.zzo(parcel, this.zzj);
        zzaht.zzo(parcel, this.zzk);
        zzaht.zzo(parcel, this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeInt(this.zzn);
        zzaht.zzo(parcel, this.zzo);
        parcel.writeList(this.zzp);
        parcel.writeInt(this.zzq);
        parcel.writeInt(this.zzr);
        zzaht.zzo(parcel, this.zzs);
        zzaht.zzo(parcel, this.zzt);
        zzaht.zzo(parcel, this.zzu);
        zzaht.zzo(parcel, this.zzv);
        parcel.writeList(this.zzw);
        zzaht.zzo(parcel, this.zzx);
        zzaht.zzo(parcel, this.zzy);
        zzaht.zzo(parcel, this.zzz);
        zzaht.zzo(parcel, this.zzA);
        zzaht.zzo(parcel, this.zzB);
        SparseArray<Map<zzach, zzadc>> sparseArray = this.zzK;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map<zzach, zzadc> valueAt = sparseArray.valueAt(i2);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<zzach, zzadc> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.zzL);
    }

    public final boolean zza(int i) {
        return this.zzL.get(i);
    }

    public final boolean zzb(int i, zzach zzachVar) {
        Map<zzach, zzadc> map = this.zzK.get(i);
        return map != null && map.containsKey(zzachVar);
    }

    public final zzadc zzc(int i, zzach zzachVar) {
        Map<zzach, zzadc> map = this.zzK.get(i);
        if (map != null) {
            return map.get(zzachVar);
        }
        return null;
    }

    public final zzada zzd() {
        return new zzada(this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacz(Parcel parcel) {
        super(parcel);
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.readInt();
        this.zzi = parcel.readInt();
        this.zzj = zzaht.zzn(parcel);
        this.zzk = zzaht.zzn(parcel);
        this.zzl = zzaht.zzn(parcel);
        this.zzm = parcel.readInt();
        this.zzn = parcel.readInt();
        this.zzo = zzaht.zzn(parcel);
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.zzp = zzfgz.zzp(arrayList);
        this.zzq = parcel.readInt();
        this.zzr = parcel.readInt();
        this.zzs = zzaht.zzn(parcel);
        this.zzt = zzaht.zzn(parcel);
        this.zzu = zzaht.zzn(parcel);
        this.zzv = zzaht.zzn(parcel);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.zzw = zzfgz.zzp(arrayList2);
        this.zzx = zzaht.zzn(parcel);
        this.zzy = zzaht.zzn(parcel);
        this.zzz = zzaht.zzn(parcel);
        this.zzA = zzaht.zzn(parcel);
        this.zzB = zzaht.zzn(parcel);
        int readInt = parcel.readInt();
        SparseArray<Map<zzach, zzadc>> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                zzach zzachVar = (zzach) parcel.readParcelable(zzach.class.getClassLoader());
                Objects.requireNonNull(zzachVar);
                hashMap.put(zzachVar, (zzadc) parcel.readParcelable(zzadc.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.zzK = sparseArray;
        this.zzL = parcel.readSparseBooleanArray();
    }
}
