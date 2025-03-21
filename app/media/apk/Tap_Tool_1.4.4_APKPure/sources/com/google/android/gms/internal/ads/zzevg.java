package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevg implements zzevf {
    private final Object[] zza;

    public zzevg(zzazs zzazsVar, String str, int i, String str2, zzbad zzbadVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzazsVar.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzazsVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzazsVar.zzc.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzazsVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzazsVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzazsVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzazsVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzazsVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzazsVar.zzi);
        }
        if (hashSet.contains("location")) {
            Location location = zzazsVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzazsVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzazsVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzazsVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzazsVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzazsVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzazsVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzazsVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzazsVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzazsVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzbadVar != null) {
                arrayList.add(Integer.valueOf(zzbadVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zza((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final boolean equals(Object obj) {
        if (obj instanceof zzevg) {
            return Arrays.equals(this.zza, ((zzevg) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zza);
        String arrays = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
