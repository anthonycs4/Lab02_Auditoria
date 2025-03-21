package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahv {
    public final List<byte[]> zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzahv(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzahv zza(zzahd zzahdVar) throws zzkr {
        String str;
        int i;
        int i2;
        float f;
        try {
            zzahdVar.zzk(4);
            int zzn = (zzahdVar.zzn() & 3) + 1;
            if (zzn == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzn2 = zzahdVar.zzn() & 31;
            for (int i3 = 0; i3 < zzn2; i3++) {
                arrayList.add(zzb(zzahdVar));
            }
            int zzn3 = zzahdVar.zzn();
            for (int i4 = 0; i4 < zzn3; i4++) {
                arrayList.add(zzb(zzahdVar));
            }
            if (zzn2 > 0) {
                zzagu zzb = zzagv.zzb((byte[]) arrayList.get(0), zzn, ((byte[]) arrayList.get(0)).length);
                int i5 = zzb.zze;
                int i6 = zzb.zzf;
                float f2 = zzb.zzg;
                str = zzafu.zza(zzb.zza, zzb.zzb, zzb.zzc);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzahv(arrayList, zzn, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzkr("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzahd zzahdVar) {
        int zzo = zzahdVar.zzo();
        int zzg = zzahdVar.zzg();
        zzahdVar.zzk(zzo);
        return zzafu.zzc(zzahdVar.zzi(), zzg, zzo);
    }
}
