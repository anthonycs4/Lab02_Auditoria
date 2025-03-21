package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeuw implements zzeuv {
    private final ConcurrentHashMap<zzevf, zzeuu> zza;
    private final zzevc zzb;
    private final zzeuy zzc = new zzeuy();

    public zzeuw(zzevc zzevcVar) {
        this.zza = new ConcurrentHashMap<>(zzevcVar.zzd);
        this.zzb = zzevcVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzevc> creator = zzevc.CREATOR;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzex)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry<zzevf, zzeuu> entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = entry.getValue().zzc(); zzc < this.zzb.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    public final synchronized zzeve<?> zza(zzevf zzevfVar) {
        zzeve<?> zzeveVar;
        zzeuu zzeuuVar = this.zza.get(zzevfVar);
        if (zzeuuVar != null) {
            zzeveVar = zzeuuVar.zzb();
            if (zzeveVar == null) {
                this.zzc.zzb();
            }
            zzevs zzh = zzeuuVar.zzh();
            if (zzeveVar != null) {
                zzavv zza = zzawd.zza();
                zzavt zza2 = zzavu.zza();
                zza2.zza(zzavy.IN_MEMORY);
                zzavz zza3 = zzawa.zza();
                zza3.zza(zzh.zza);
                zza3.zzb(zzh.zzb);
                zza2.zzb(zza3);
                zza.zza(zza2);
                zzeveVar.zza.zzd().zzk(zza.zzah());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzeveVar = null;
        }
        return zzeveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    public final synchronized boolean zzb(zzevf zzevfVar, zzeve<?> zzeveVar) {
        boolean zza;
        zzeuu zzeuuVar = this.zza.get(zzevfVar);
        zzeveVar.zzd = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
        if (zzeuuVar == null) {
            zzevc zzevcVar = this.zzb;
            zzeuuVar = new zzeuu(zzevcVar.zzd, zzevcVar.zze * 1000);
            int size = this.zza.size();
            zzevc zzevcVar2 = this.zzb;
            if (size == zzevcVar2.zzc) {
                int i = zzevcVar2.zzg;
                int i2 = i - 1;
                zzevf zzevfVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = LongCompanionObject.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry<zzevf, zzeuu> entry : this.zza.entrySet()) {
                        if (entry.getValue().zzd() < j) {
                            j = entry.getValue().zzd();
                            zzevfVar2 = entry.getKey();
                        }
                    }
                    if (zzevfVar2 != null) {
                        this.zza.remove(zzevfVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry<zzevf, zzeuu> entry2 : this.zza.entrySet()) {
                        if (entry2.getValue().zze() < j) {
                            j = entry2.getValue().zze();
                            zzevfVar2 = entry2.getKey();
                        }
                    }
                    if (zzevfVar2 != null) {
                        this.zza.remove(zzevfVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry<zzevf, zzeuu> entry3 : this.zza.entrySet()) {
                        if (entry3.getValue().zzf() < i3) {
                            i3 = entry3.getValue().zzf();
                            zzevfVar2 = entry3.getKey();
                        }
                    }
                    if (zzevfVar2 != null) {
                        this.zza.remove(zzevfVar2);
                    }
                }
                this.zzc.zzd();
            }
            this.zza.put(zzevfVar, zzeuuVar);
            this.zzc.zzc();
        }
        zza = zzeuuVar.zza(zzeveVar);
        this.zzc.zze();
        zzeux zzf = this.zzc.zzf();
        zzevs zzh = zzeuuVar.zzh();
        if (zzeveVar != null) {
            zzavv zza2 = zzawd.zza();
            zzavt zza3 = zzavu.zza();
            zza3.zza(zzavy.IN_MEMORY);
            zzawb zza4 = zzawc.zza();
            zza4.zza(zzf.zza);
            zza4.zzb(zzf.zzb);
            zza4.zzc(zzh.zzb);
            zza3.zzc(zza4);
            zza2.zza(zza3);
            zzeveVar.zza.zzd().zzl(zza2.zzah());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    public final synchronized boolean zzc(zzevf zzevfVar) {
        zzeuu zzeuuVar = this.zza.get(zzevfVar);
        if (zzeuuVar != null) {
            return zzeuuVar.zzc() < this.zzb.zzd;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    @Deprecated
    public final zzevf zzd(zzazs zzazsVar, String str, zzbad zzbadVar) {
        return new zzevg(zzazsVar, str, new zzbxj(this.zzb.zza).zza().zzk, this.zzb.zzf, zzbadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    public final zzevc zze() {
        return this.zzb;
    }
}
