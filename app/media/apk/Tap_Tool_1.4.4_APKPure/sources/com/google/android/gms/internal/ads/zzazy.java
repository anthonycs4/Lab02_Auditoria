package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazy implements Parcelable.Creator<zzazx> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzazx createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzazx[] zzazxVarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    zzazxVarArr = (zzazx[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzazx.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 14:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzazx(str, i, i2, z, i3, i4, zzazxVarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzazx[] newArray(int i) {
        return new zzazx[i];
    }
}
