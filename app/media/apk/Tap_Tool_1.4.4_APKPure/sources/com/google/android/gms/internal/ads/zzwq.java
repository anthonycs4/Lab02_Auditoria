package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwq {
    public static zzwo zza(zzps zzpsVar) throws IOException {
        byte[] bArr;
        zzahd zzahdVar = new zzahd(16);
        if (zzwp.zza(zzpsVar, zzahdVar).zza != 1380533830) {
            return null;
        }
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzh(zzahdVar.zzi(), 0, 4, false);
        zzahdVar.zzh(0);
        int zzv = zzahdVar.zzv();
        if (zzv != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(zzv);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        zzwp zza = zzwp.zza(zzpsVar, zzahdVar);
        while (zza.zza != 1718449184) {
            zzpoVar.zzj((int) zza.zzb, false);
            zza = zzwp.zza(zzpsVar, zzahdVar);
        }
        zzafs.zzd(zza.zzb >= 16);
        zzpoVar.zzh(zzahdVar.zzi(), 0, 16, false);
        zzahdVar.zzh(0);
        int zzp = zzahdVar.zzp();
        int zzp2 = zzahdVar.zzp();
        int zzC = zzahdVar.zzC();
        int zzC2 = zzahdVar.zzC();
        int zzp3 = zzahdVar.zzp();
        int zzp4 = zzahdVar.zzp();
        int i = ((int) zza.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzpoVar.zzh(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzaht.zzf;
        }
        return new zzwo(zzp, zzp2, zzC, zzC2, zzp3, zzp4, bArr);
    }
}
