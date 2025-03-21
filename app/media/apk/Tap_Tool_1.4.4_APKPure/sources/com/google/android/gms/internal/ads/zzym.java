package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzym extends zzyv {
    public static final Parcelable.Creator<zzym> CREATOR = new zzyl();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzyv[] zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzym(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzaht.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzaht.zzd(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzyv[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzyv) parcel.readParcelable(zzyv.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzym zzymVar = (zzym) obj;
            if (this.zzb == zzymVar.zzb && this.zzc == zzymVar.zzc && zzaht.zzc(this.zza, zzymVar.zza) && Arrays.equals(this.zzd, zzymVar.zzd) && Arrays.equals(this.zze, zzymVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzyv zzyvVar : this.zze) {
            parcel.writeParcelable(zzyvVar, 0);
        }
    }

    public zzym(String str, boolean z, boolean z2, String[] strArr, zzyv[] zzyvVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzyvVarArr;
    }
}
