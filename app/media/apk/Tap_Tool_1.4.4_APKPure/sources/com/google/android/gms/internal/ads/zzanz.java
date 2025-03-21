package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzanz implements Parcelable {
    public static final Parcelable.Creator<zzanz> CREATOR = new zzanx();
    private final zzany[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanz(Parcel parcel) {
        this.zza = new zzany[parcel.readInt()];
        int i = 0;
        while (true) {
            zzany[] zzanyVarArr = this.zza;
            if (i >= zzanyVarArr.length) {
                return;
            }
            zzanyVarArr[i] = (zzany) parcel.readParcelable(zzany.class.getClassLoader());
            i++;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzanz) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzany zzanyVar : this.zza) {
            parcel.writeParcelable(zzanyVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzany zzb(int i) {
        return this.zza[i];
    }

    public zzanz(List<? extends zzany> list) {
        zzany[] zzanyVarArr = new zzany[list.size()];
        this.zza = zzanyVarArr;
        list.toArray(zzanyVarArr);
    }
}
