package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzrh extends zzrj {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzrh() {
        super(new zzpq());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzahd zzahdVar) {
        return Double.valueOf(Double.longBitsToDouble(zzahdVar.zzx()));
    }

    private static String zzh(zzahd zzahdVar) {
        int zzo = zzahdVar.zzo();
        int zzg = zzahdVar.zzg();
        zzahdVar.zzk(zzo);
        return new String(zzahdVar.zzi(), zzg, zzo);
    }

    private static HashMap<String, Object> zzi(zzahd zzahdVar) {
        int zzB = zzahdVar.zzB();
        HashMap<String, Object> hashMap = new HashMap<>(zzB);
        for (int i = 0; i < zzB; i++) {
            String zzh = zzh(zzahdVar);
            Object zzj = zzj(zzahdVar, zzahdVar.zzn());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zza(zzahd zzahdVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final boolean zzb(zzahd zzahdVar, long j) {
        if (zzahdVar.zzn() == 2 && "onMetaData".equals(zzh(zzahdVar)) && zzahdVar.zzn() == 8) {
            HashMap<String, Object> zzi = zzi(zzahdVar);
            Object obj = zzi.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }

    private static Object zzj(zzahd zzahdVar, int i) {
        if (i == 0) {
            return zzg(zzahdVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzahdVar.zzn() == 1);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzahdVar).doubleValue());
                        zzahdVar.zzk(2);
                        return date;
                    }
                    int zzB = zzahdVar.zzB();
                    ArrayList arrayList = new ArrayList(zzB);
                    for (int i2 = 0; i2 < zzB; i2++) {
                        Object zzj = zzj(zzahdVar, zzahdVar.zzn());
                        if (zzj != null) {
                            arrayList.add(zzj);
                        }
                    }
                    return arrayList;
                }
                return zzi(zzahdVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzh = zzh(zzahdVar);
                int zzn = zzahdVar.zzn();
                if (zzn == 9) {
                    return hashMap;
                }
                Object zzj2 = zzj(zzahdVar, zzn);
                if (zzj2 != null) {
                    hashMap.put(zzh, zzj2);
                }
            }
        } else {
            return zzh(zzahdVar);
        }
    }
}
