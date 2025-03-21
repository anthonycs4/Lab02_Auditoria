package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzor implements Comparator<zzoq>, Parcelable {
    public static final Parcelable.Creator<zzor> CREATOR = new zzoo();
    public final String zza;
    private final zzoq[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzor(Parcel parcel) {
        this.zza = parcel.readString();
        zzoq[] zzoqVarArr = (zzoq[]) zzaht.zzd((zzoq[]) parcel.createTypedArray(zzoq.CREATOR));
        this.zzb = zzoqVarArr;
        int length = zzoqVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzoq zzoqVar, zzoq zzoqVar2) {
        zzoq zzoqVar3 = zzoqVar;
        zzoq zzoqVar4 = zzoqVar2;
        if (zzhx.zza.equals(zzoqVar3.zza)) {
            return !zzhx.zza.equals(zzoqVar4.zza) ? 1 : 0;
        }
        return zzoqVar3.zza.compareTo(zzoqVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzor zzorVar = (zzor) obj;
            if (zzaht.zzc(this.zza, zzorVar.zza) && Arrays.equals(this.zzb, zzorVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzb);
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzor zza(String str) {
        return zzaht.zzc(this.zza, str) ? this : new zzor(str, false, this.zzb);
    }

    private zzor(String str, boolean z, zzoq... zzoqVarArr) {
        this.zza = str;
        zzoqVarArr = z ? (zzoq[]) zzoqVarArr.clone() : zzoqVarArr;
        this.zzb = zzoqVarArr;
        int length = zzoqVarArr.length;
        Arrays.sort(zzoqVarArr, this);
    }

    public zzor(String str, zzoq... zzoqVarArr) {
        this(null, true, zzoqVarArr);
    }

    public zzor(List<zzoq> list) {
        this(null, false, (zzoq[]) list.toArray(new zzoq[0]));
    }
}
