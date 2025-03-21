package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqe {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzqd zzk;
    private final zzxu zzl;

    private zzqe(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzqd zzqdVar, zzxu zzxuVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzh(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzi(i7);
        this.zzj = j;
        this.zzk = zzqdVar;
        this.zzl = zzxuVar;
    }

    public zzqe(byte[] bArr, int i) {
        zzahc zzahcVar = new zzahc(bArr, bArr.length);
        zzahcVar.zzd(i * 8);
        this.zza = zzahcVar.zzh(16);
        this.zzb = zzahcVar.zzh(16);
        this.zzc = zzahcVar.zzh(24);
        this.zzd = zzahcVar.zzh(24);
        int zzh = zzahcVar.zzh(20);
        this.zze = zzh;
        this.zzf = zzh(zzh);
        this.zzg = zzahcVar.zzh(3) + 1;
        int zzh2 = zzahcVar.zzh(5) + 1;
        this.zzh = zzh2;
        this.zzi = zzi(zzh2);
        this.zzj = zzaht.zzK(zzahcVar.zzh(4), zzahcVar.zzh(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzi(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static zzxu zzj(List<String> list, List<zzya> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] zzt = zzaht.zzt(str, "=");
            if (zzt.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new zzyc(zzt[0], zzt[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzxu(arrayList);
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return zzaht.zzz((j * this.zze) / 1000000, 0L, this.zzj - 1);
    }

    public final zzjq zzc(byte[] bArr, zzxu zzxuVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzxu zzd = zzd(zzxuVar);
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj("audio/flac");
        zzjpVar.zzk(i);
        zzjpVar.zzw(this.zzg);
        zzjpVar.zzx(this.zze);
        zzjpVar.zzl(Collections.singletonList(bArr));
        zzjpVar.zzi(zzd);
        return zzjpVar.zzD();
    }

    public final zzxu zzd(zzxu zzxuVar) {
        zzxu zzxuVar2 = this.zzl;
        return zzxuVar2 == null ? zzxuVar : zzxuVar2.zzc(zzxuVar);
    }

    public final zzqe zze(zzqd zzqdVar) {
        return new zzqe(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzqdVar, this.zzl);
    }

    public final zzqe zzf(List<String> list) {
        return new zzqe(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzj(list, Collections.emptyList())));
    }

    public final zzqe zzg(List<zzya> list) {
        return new zzqe(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzj(Collections.emptyList(), list)));
    }
}
