package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbd extends zzaq {
    public zzbd() {
    }

    public zzbd(zzbc zzbcVar, SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzu> zza(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new zzu(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}
