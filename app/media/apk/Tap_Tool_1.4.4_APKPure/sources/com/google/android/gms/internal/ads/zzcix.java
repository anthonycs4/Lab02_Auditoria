package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcix extends zzbdi {
    private final zzceu zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzbdm zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbjo zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcix(zzceu zzceuVar, float f, boolean z, boolean z2) {
        this.zza = zzceuVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzccz.zze.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzciv
            private final zzcix zza;
            private final Map zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu(this.zzb);
            }
        });
    }

    private final void zzx(final int i, final int i2, final boolean z, final boolean z2) {
        zzccz.zze.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzciw
            private final zzcix zza;
            private final int zzb;
            private final int zzc;
            private final boolean zzd;
            private final boolean zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = i2;
                this.zzd = z;
                this.zze = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzt(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    public final void zzc(zzbey zzbeyVar) {
        boolean z = zzbeyVar.zza;
        boolean z2 = zzbeyVar.zzb;
        boolean z3 = zzbeyVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzg(boolean z) {
        zzw(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzh() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final int zzi() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzl(zzbdm zzbdmVar) {
        synchronized (this.zzb) {
            this.zzf = zzbdmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzn() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final zzbdm zzo() throws RemoteException {
        zzbdm zzbdmVar;
        synchronized (this.zzb) {
            zzbdmVar = this.zzf;
        }
        return zzbdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final boolean zzp() {
        boolean z;
        boolean zzn = zzn();
        synchronized (this.zzb) {
            z = false;
            if (!zzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzx(i, 3, z, z);
    }

    public final void zzs(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            this.zzj = f;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbjo zzbjoVar = this.zzn;
                if (zzbjoVar != null) {
                    zzbjoVar.zze();
                }
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
            }
        }
        zzx(i2, i, z3, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        zzbdm zzbdmVar;
        zzbdm zzbdmVar2;
        zzbdm zzbdmVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            this.zzg = (z5 || z3) ? true : true;
            if (z3) {
                try {
                    zzbdm zzbdmVar4 = this.zzf;
                    if (zzbdmVar4 != null) {
                        zzbdmVar4.zze();
                    }
                } catch (RemoteException e) {
                    zzccn.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzbdmVar3 = this.zzf) != null) {
                zzbdmVar3.zzf();
            }
            if (z7 && (zzbdmVar2 = this.zzf) != null) {
                zzbdmVar2.zzg();
            }
            if (z8) {
                zzbdm zzbdmVar5 = this.zzf;
                if (zzbdmVar5 != null) {
                    zzbdmVar5.zzh();
                }
                this.zza.zzA();
            }
            if (z != z2 && (zzbdmVar = this.zzf) != null) {
                zzbdmVar.zzi(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final void zzv(zzbjo zzbjoVar) {
        synchronized (this.zzb) {
            this.zzn = zzbjoVar;
        }
    }
}
