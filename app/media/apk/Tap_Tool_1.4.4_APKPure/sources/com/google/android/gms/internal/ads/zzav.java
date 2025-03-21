package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzav {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List<zzu> zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzav(java.lang.String r14, com.google.android.gms.internal.ads.zzl r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List<com.google.android.gms.internal.ads.zzu> r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzu r11 = new com.google.android.gms.internal.ads.zzu
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzav.<init>(java.lang.String, com.google.android.gms.internal.ads.zzl):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzav zza(zzaw zzawVar) throws IOException {
        if (zzay.zzi(zzawVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzay.zzm(zzawVar);
        String zzm2 = zzay.zzm(zzawVar);
        long zzk = zzay.zzk(zzawVar);
        long zzk2 = zzay.zzk(zzawVar);
        long zzk3 = zzay.zzk(zzawVar);
        long zzk4 = zzay.zzk(zzawVar);
        int zzi = zzay.zzi(zzawVar);
        if (zzi < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new IOException(sb.toString());
        }
        List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new zzu(zzay.zzm(zzawVar).intern(), zzay.zzm(zzawVar).intern()));
        }
        return new zzav(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

    private zzav(String str, String str2, long j, long j2, long j3, long j4, List<zzu> list) {
        this.zzb = str;
        this.zzc = true == RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
