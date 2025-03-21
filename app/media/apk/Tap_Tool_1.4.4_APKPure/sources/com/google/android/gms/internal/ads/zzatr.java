package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzatr {
    public static void zza(String[] strArr, int i, int i2, PriorityQueue<zzatq> priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzb(i, zze, zzc(strArr, 0, 6), 6, priorityQueue);
        long zzd = zzd(16785407L, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            zze = ((((((zze + 1073807359) - ((((zzatn.zza(strArr[i3 - 1]) + 2147483647L) % 1073807359) * zzd) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzatn.zza(strArr[i3 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            zzb(i, zze, zzc(strArr, i3, 6), length2, priorityQueue);
            i3++;
        }
    }

    static void zzb(int i, long j, String str, int i2, PriorityQueue<zzatq> priorityQueue) {
        zzatq zzatqVar = new zzatq(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().zzc <= zzatqVar.zzc && priorityQueue.peek().zza <= zzatqVar.zza)) && !priorityQueue.contains(zzatqVar)) {
            priorityQueue.add(zzatqVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    static String zzc(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            com.google.android.gms.ads.internal.util.zze.zzf("Unable to construct shingle");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    static long zzd(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? zzd((j * j) % 1073807359, i >> 1) : j * (zzd((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzatn.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzatn.zza(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
