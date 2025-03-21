package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzadn implements Parcelable {
    public static final Parcelable.Creator<zzadn> CREATOR;
    public static final zzadn zzC;
    @Deprecated
    public static final zzadn zzD;
    public final zzfgz<String> zzE;
    public final int zzF;
    public final zzfgz<String> zzG;
    public final int zzH;
    public final boolean zzI;
    public final int zzJ;

    static {
        zzadm zzadmVar = new zzadm();
        zzadn zzadnVar = new zzadn(zzadmVar.zza, zzadmVar.zzb, zzadmVar.zzc, zzadmVar.zzd, zzadmVar.zze, zzadmVar.zzf);
        zzC = zzadnVar;
        zzD = zzadnVar;
        CREATOR = new zzadl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadn(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.zzE = zzfgz.zzp(arrayList);
        this.zzF = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.zzG = zzfgz.zzp(arrayList2);
        this.zzH = parcel.readInt();
        this.zzI = zzaht.zzn(parcel);
        this.zzJ = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadn(zzfgz<String> zzfgzVar, int i, zzfgz<String> zzfgzVar2, int i2, boolean z, int i3) {
        this.zzE = zzfgzVar;
        this.zzF = i;
        this.zzG = zzfgzVar2;
        this.zzH = i2;
        this.zzI = z;
        this.zzJ = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadn zzadnVar = (zzadn) obj;
            if (this.zzE.equals(zzadnVar.zzE) && this.zzF == zzadnVar.zzF && this.zzG.equals(zzadnVar.zzG) && this.zzH == zzadnVar.zzH && this.zzI == zzadnVar.zzI && this.zzJ == zzadnVar.zzJ) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.zzE.hashCode() + 31) * 31) + this.zzF) * 31) + this.zzG.hashCode()) * 31) + this.zzH) * 31) + (this.zzI ? 1 : 0)) * 31) + this.zzJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zzE);
        parcel.writeInt(this.zzF);
        parcel.writeList(this.zzG);
        parcel.writeInt(this.zzH);
        zzaht.zzo(parcel, this.zzI);
        parcel.writeInt(this.zzJ);
    }
}
