package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadc implements Parcelable {
    public static final Parcelable.Creator<zzadc> CREATOR = new zzadb();
    public final int zza;
    public final int[] zzb;
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadc(Parcel parcel) {
        this.zza = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.zzb = iArr;
        parcel.readIntArray(iArr);
        this.zzc = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadc zzadcVar = (zzadc) obj;
            if (this.zza == zzadcVar.zza && Arrays.equals(this.zzb, zzadcVar.zzb) && this.zzc == zzadcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb.length);
        parcel.writeIntArray(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
