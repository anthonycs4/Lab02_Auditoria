package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatm {
    private final int zza;
    private final zzatj zzb = new zzato();

    public zzatm(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzatl zzatlVar = new zzatl();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzatk(this));
        for (String str : split) {
            String[] zzb = zzatn.zzb(str, false);
            if (zzb.length != 0) {
                zzatr.zza(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzatlVar.zzb.write(this.zzb.zza(((zzatq) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzatlVar.toString();
    }
}
