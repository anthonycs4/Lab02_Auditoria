package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzjq implements Parcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjo();
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final Class zzE;
    private int zzF;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final String zzi;
    public final zzxu zzj;
    public final String zzk;
    public final String zzl;
    public final int zzm;
    public final List<byte[]> zzn;
    public final zzor zzo;
    public final long zzp;
    public final int zzq;
    public final int zzr;
    public final float zzs;
    public final int zzt;
    public final float zzu;
    public final byte[] zzv;
    public final int zzw;
    public final zzahx zzx;
    public final int zzy;
    public final int zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjq(Parcel parcel) {
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        int readInt = parcel.readInt();
        this.zzf = readInt;
        int readInt2 = parcel.readInt();
        this.zzg = readInt2;
        this.zzh = readInt2 != -1 ? readInt2 : readInt;
        this.zzi = parcel.readString();
        this.zzj = (zzxu) parcel.readParcelable(zzxu.class.getClassLoader());
        this.zzk = parcel.readString();
        this.zzl = parcel.readString();
        this.zzm = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.zzn = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            List<byte[]> list = this.zzn;
            byte[] createByteArray = parcel.createByteArray();
            Objects.requireNonNull(createByteArray);
            list.add(createByteArray);
        }
        zzor zzorVar = (zzor) parcel.readParcelable(zzor.class.getClassLoader());
        this.zzo = zzorVar;
        this.zzp = parcel.readLong();
        this.zzq = parcel.readInt();
        this.zzr = parcel.readInt();
        this.zzs = parcel.readFloat();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readFloat();
        this.zzv = zzaht.zzn(parcel) ? parcel.createByteArray() : null;
        this.zzw = parcel.readInt();
        this.zzx = (zzahx) parcel.readParcelable(zzahx.class.getClassLoader());
        this.zzy = parcel.readInt();
        this.zzz = parcel.readInt();
        this.zzA = parcel.readInt();
        this.zzB = parcel.readInt();
        this.zzC = parcel.readInt();
        this.zzD = parcel.readInt();
        this.zzE = zzorVar != null ? zzpd.class : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjq zzjqVar = (zzjq) obj;
            int i2 = this.zzF;
            if ((i2 == 0 || (i = zzjqVar.zzF) == 0 || i2 == i) && this.zzd == zzjqVar.zzd && this.zze == zzjqVar.zze && this.zzf == zzjqVar.zzf && this.zzg == zzjqVar.zzg && this.zzm == zzjqVar.zzm && this.zzp == zzjqVar.zzp && this.zzq == zzjqVar.zzq && this.zzr == zzjqVar.zzr && this.zzt == zzjqVar.zzt && this.zzw == zzjqVar.zzw && this.zzy == zzjqVar.zzy && this.zzz == zzjqVar.zzz && this.zzA == zzjqVar.zzA && this.zzB == zzjqVar.zzB && this.zzC == zzjqVar.zzC && this.zzD == zzjqVar.zzD && Float.compare(this.zzs, zzjqVar.zzs) == 0 && Float.compare(this.zzu, zzjqVar.zzu) == 0 && zzaht.zzc(this.zzE, zzjqVar.zzE) && zzaht.zzc(this.zza, zzjqVar.zza) && zzaht.zzc(this.zzb, zzjqVar.zzb) && zzaht.zzc(this.zzi, zzjqVar.zzi) && zzaht.zzc(this.zzk, zzjqVar.zzk) && zzaht.zzc(this.zzl, zzjqVar.zzl) && zzaht.zzc(this.zzc, zzjqVar.zzc) && Arrays.equals(this.zzv, zzjqVar.zzv) && zzaht.zzc(this.zzj, zzjqVar.zzj) && zzaht.zzc(this.zzx, zzjqVar.zzx) && zzaht.zzc(this.zzo, zzjqVar.zzo) && zzd(zzjqVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzF;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zzb;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.zzc;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31;
            String str4 = this.zzi;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzxu zzxuVar = this.zzj;
            int hashCode5 = (hashCode4 + (zzxuVar == null ? 0 : zzxuVar.hashCode())) * 31;
            String str5 = this.zzk;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.zzl;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.zzm) * 31) + ((int) this.zzp)) * 31) + this.zzq) * 31) + this.zzr) * 31) + Float.floatToIntBits(this.zzs)) * 31) + this.zzt) * 31) + Float.floatToIntBits(this.zzu)) * 31) + this.zzw) * 31) + this.zzy) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31;
            Class cls = this.zzE;
            int hashCode8 = hashCode7 + (cls != null ? cls.hashCode() : 0);
            this.zzF = hashCode8;
            return hashCode8;
        }
        return i;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzk;
        String str4 = this.zzl;
        String str5 = this.zzi;
        int i = this.zzh;
        String str6 = this.zzc;
        int i2 = this.zzq;
        int i3 = this.zzr;
        float f = this.zzs;
        int i4 = this.zzy;
        int i5 = this.zzz;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeString(this.zzi);
        parcel.writeParcelable(this.zzj, 0);
        parcel.writeString(this.zzk);
        parcel.writeString(this.zzl);
        parcel.writeInt(this.zzm);
        int size = this.zzn.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzn.get(i2));
        }
        parcel.writeParcelable(this.zzo, 0);
        parcel.writeLong(this.zzp);
        parcel.writeInt(this.zzq);
        parcel.writeInt(this.zzr);
        parcel.writeFloat(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeFloat(this.zzu);
        zzaht.zzo(parcel, this.zzv != null);
        byte[] bArr = this.zzv;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzw);
        parcel.writeParcelable(this.zzx, i);
        parcel.writeInt(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeInt(this.zzA);
        parcel.writeInt(this.zzB);
        parcel.writeInt(this.zzC);
        parcel.writeInt(this.zzD);
    }

    public final zzjp zza() {
        return new zzjp(this, null);
    }

    public final zzjq zzb(Class cls) {
        zzjp zzjpVar = new zzjp(this, null);
        zzjpVar.zzC(cls);
        return new zzjq(zzjpVar);
    }

    public final int zzc() {
        int i;
        int i2 = this.zzq;
        if (i2 == -1 || (i = this.zzr) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean zzd(zzjq zzjqVar) {
        if (this.zzn.size() == zzjqVar.zzn.size()) {
            for (int i = 0; i < this.zzn.size(); i++) {
                if (!Arrays.equals(this.zzn.get(i), zzjqVar.zzn.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private zzjq(zzjp zzjpVar) {
        this.zza = zzjp.zzE(zzjpVar);
        this.zzb = zzjp.zzF(zzjpVar);
        this.zzc = zzaht.zzp(zzjp.zzG(zzjpVar));
        this.zzd = zzjp.zzH(zzjpVar);
        this.zze = zzjp.zzI(zzjpVar);
        int zzJ = zzjp.zzJ(zzjpVar);
        this.zzf = zzJ;
        int zzK = zzjp.zzK(zzjpVar);
        this.zzg = zzK;
        this.zzh = zzK != -1 ? zzK : zzJ;
        this.zzi = zzjp.zzL(zzjpVar);
        this.zzj = zzjp.zzM(zzjpVar);
        this.zzk = zzjp.zzN(zzjpVar);
        this.zzl = zzjp.zzO(zzjpVar);
        this.zzm = zzjp.zzP(zzjpVar);
        this.zzn = zzjp.zzQ(zzjpVar) == null ? Collections.emptyList() : zzjp.zzQ(zzjpVar);
        zzor zzR = zzjp.zzR(zzjpVar);
        this.zzo = zzR;
        this.zzp = zzjp.zzS(zzjpVar);
        this.zzq = zzjp.zzT(zzjpVar);
        this.zzr = zzjp.zzU(zzjpVar);
        this.zzs = zzjp.zzV(zzjpVar);
        this.zzt = zzjp.zzW(zzjpVar) == -1 ? 0 : zzjp.zzW(zzjpVar);
        this.zzu = zzjp.zzX(zzjpVar) == -1.0f ? 1.0f : zzjp.zzX(zzjpVar);
        this.zzv = zzjp.zzY(zzjpVar);
        this.zzw = zzjp.zzZ(zzjpVar);
        this.zzx = zzjp.zzaa(zzjpVar);
        this.zzy = zzjp.zzab(zzjpVar);
        this.zzz = zzjp.zzac(zzjpVar);
        this.zzA = zzjp.zzad(zzjpVar);
        this.zzB = zzjp.zzae(zzjpVar) == -1 ? 0 : zzjp.zzae(zzjpVar);
        this.zzC = zzjp.zzaf(zzjpVar) != -1 ? zzjp.zzaf(zzjpVar) : 0;
        this.zzD = zzjp.zzag(zzjpVar);
        this.zzE = (zzjp.zzah(zzjpVar) != null || zzR == null) ? zzjp.zzah(zzjpVar) : zzpd.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjq(zzjp zzjpVar, zzjo zzjoVar) {
        this(zzjpVar);
    }
}
