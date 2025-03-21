package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzyk extends zzyv {
    public static final Parcelable.Creator<zzyk> CREATOR = new zzyj();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzyv[] zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyk(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzaht.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzyv[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzyv) parcel.readParcelable(zzyv.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyv, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyk zzykVar = (zzyk) obj;
            if (this.zzb == zzykVar.zzb && this.zzc == zzykVar.zzc && this.zzd == zzykVar.zzd && this.zze == zzykVar.zze && zzaht.zzc(this.zza, zzykVar.zza) && Arrays.equals(this.zzg, zzykVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzyv zzyvVar : this.zzg) {
            parcel.writeParcelable(zzyvVar, 0);
        }
    }

    public zzyk(String str, int i, int i2, long j, long j2, zzyv[] zzyvVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzyvVarArr;
    }
}
