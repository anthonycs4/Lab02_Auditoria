package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzach implements Parcelable {
    public final int zzb;
    private final zzacf[] zzc;
    private int zzd;
    public static final zzach zza = new zzach(new zzacf[0]);
    public static final Parcelable.Creator<zzach> CREATOR = new zzacg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzach(Parcel parcel) {
        int readInt = parcel.readInt();
        this.zzb = readInt;
        this.zzc = new zzacf[readInt];
        for (int i = 0; i < this.zzb; i++) {
            this.zzc[i] = (zzacf) parcel.readParcelable(zzacf.class.getClassLoader());
        }
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
            zzach zzachVar = (zzach) obj;
            if (this.zzb == zzachVar.zzb && Arrays.equals(this.zzc, zzachVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
        for (int i2 = 0; i2 < this.zzb; i2++) {
            parcel.writeParcelable(this.zzc[i2], 0);
        }
    }

    public final zzacf zza(int i) {
        return this.zzc[i];
    }

    public final int zzb(zzacf zzacfVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzacfVar) {
                return i;
            }
        }
        return -1;
    }

    public zzach(zzacf... zzacfVarArr) {
        this.zzc = zzacfVarArr;
        this.zzb = zzacfVarArr.length;
    }
}
