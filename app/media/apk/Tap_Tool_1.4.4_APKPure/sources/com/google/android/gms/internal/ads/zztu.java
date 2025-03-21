package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztu extends zzue {
    private zzqe zza;
    private zztt zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    protected final long zzb(zzahd zzahdVar) {
        if (zzd(zzahdVar.zzi())) {
            int i = (zzahdVar.zzi()[2] & UByte.MAX_VALUE) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zzd = zzpz.zzd(zzahdVar, i);
                zzahdVar.zzh(0);
                return zzd;
            }
            zzahdVar.zzk(4);
            zzahdVar.zzH();
            int zzd2 = zzpz.zzd(zzahdVar, i);
            zzahdVar.zzh(0);
            return zzd2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzahd zzahdVar, long j, zzuc zzucVar) {
        byte[] zzi = zzahdVar.zzi();
        zzqe zzqeVar = this.zza;
        if (zzqeVar == null) {
            zzqe zzqeVar2 = new zzqe(zzi, 17);
            this.zza = zzqeVar2;
            zzucVar.zza = zzqeVar2.zzc(Arrays.copyOfRange(zzi, 9, zzahdVar.zze()), null);
            return true;
        } else if ((zzi[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzqd zzb = zzqb.zzb(zzahdVar);
            zzqe zze = zzqeVar.zze(zzb);
            this.zza = zze;
            this.zzb = new zztt(zze, zzb);
            return true;
        } else if (zzd(zzi)) {
            zztt zzttVar = this.zzb;
            if (zzttVar != null) {
                zzttVar.zzd(j);
                zzucVar.zzb = this.zzb;
            }
            Objects.requireNonNull(zzucVar.zza);
            return false;
        } else {
            return true;
        }
    }
}
