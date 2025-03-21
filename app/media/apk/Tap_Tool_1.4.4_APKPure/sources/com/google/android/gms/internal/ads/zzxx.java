package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzxx implements zzxt {
    public static final Parcelable.Creator<zzxx> CREATOR;
    private static final zzjq zzf;
    private static final zzjq zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj("application/id3");
        zzf = zzjpVar.zzD();
        zzjp zzjpVar2 = new zzjp();
        zzjpVar2.zzj("application/x-scte35");
        zzg = zzjpVar2.zzD();
        CREATOR = new zzxw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxx(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzaht.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzaht.zzd(parcel.createByteArray());
    }

    public zzxx(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
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
            zzxx zzxxVar = (zzxx) obj;
            if (this.zzc == zzxxVar.zzc && this.zzd == zzxxVar.zzd && zzaht.zzc(this.zza, zzxxVar.zza) && zzaht.zzc(this.zzb, zzxxVar.zzb) && Arrays.equals(this.zze, zzxxVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.zzb;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.zzc;
            long j2 = this.zzd;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.zza;
        long j = this.zzd;
        long j2 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }
}
