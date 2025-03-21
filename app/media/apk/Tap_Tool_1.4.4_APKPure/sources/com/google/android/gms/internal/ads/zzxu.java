package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzxu implements Parcelable {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzxs();
    private final zzxt[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxu(Parcel parcel) {
        this.zza = new zzxt[parcel.readInt()];
        int i = 0;
        while (true) {
            zzxt[] zzxtVarArr = this.zza;
            if (i >= zzxtVarArr.length) {
                return;
            }
            zzxtVarArr[i] = (zzxt) parcel.readParcelable(zzxt.class.getClassLoader());
            i++;
        }
    }

    public zzxu(zzxt... zzxtVarArr) {
        this.zza = zzxtVarArr;
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
        return Arrays.equals(this.zza, ((zzxu) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.zza));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzxt zzxtVar : this.zza) {
            parcel.writeParcelable(zzxtVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzxt zzb(int i) {
        return this.zza[i];
    }

    public final zzxu zzc(zzxu zzxuVar) {
        return zzxuVar == null ? this : zzd(zzxuVar.zza);
    }

    public final zzxu zzd(zzxt... zzxtVarArr) {
        return zzxtVarArr.length == 0 ? this : new zzxu((zzxt[]) zzaht.zzg(this.zza, zzxtVarArr));
    }

    public zzxu(List<? extends zzxt> list) {
        this.zza = (zzxt[]) list.toArray(new zzxt[0]);
    }
}
