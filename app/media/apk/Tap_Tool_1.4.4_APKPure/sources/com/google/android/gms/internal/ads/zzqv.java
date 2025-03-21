package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqv {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzqs zzb(zzahd zzahdVar, boolean z, boolean z2) throws zzkr {
        if (z) {
            zzc(3, zzahdVar, false);
        }
        String zzE = zzahdVar.zzE((int) zzahdVar.zzu(), zzfeg.zzc);
        int length = zzE.length();
        long zzu = zzahdVar.zzu();
        String[] strArr = new String[(int) zzu];
        int i = length + 15;
        for (int i2 = 0; i2 < zzu; i2++) {
            String zzE2 = zzahdVar.zzE((int) zzahdVar.zzu(), zzfeg.zzc);
            strArr[i2] = zzE2;
            i = i + 4 + zzE2.length();
        }
        if (!z2 || (zzahdVar.zzn() & 1) != 0) {
            return new zzqs(zzE, strArr, i + 1);
        }
        throw new zzkr("framing bit expected to be set");
    }

    public static boolean zzc(int i, zzahd zzahdVar, boolean z) throws zzkr {
        if (zzahdVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzahdVar.zzd();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(zzd);
            throw new zzkr(sb.toString());
        } else if (zzahdVar.zzn() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new zzkr(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (zzahdVar.zzn() == 118 && zzahdVar.zzn() == 111 && zzahdVar.zzn() == 114 && zzahdVar.zzn() == 98 && zzahdVar.zzn() == 105 && zzahdVar.zzn() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new zzkr("expected characters 'vorbis'");
        }
    }
}
