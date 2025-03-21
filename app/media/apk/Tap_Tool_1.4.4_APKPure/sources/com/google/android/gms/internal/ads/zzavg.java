package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavg {
    private final zzavm zza;
    private final zzawz zzb;
    private final boolean zzc;

    private zzavg() {
        this.zzb = zzaxa.zze();
        this.zzc = false;
        this.zza = new zzavm();
    }

    public static zzavg zza() {
        return new zzavg();
    }

    private final synchronized void zzd(zzavi zzaviVar) {
        zzawz zzawzVar = this.zzb;
        zzawzVar.zzd();
        List<String> zzd = zzbfq.zzd();
        ArrayList arrayList = new ArrayList();
        for (String str : zzd) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzawzVar.zzc(arrayList);
        zzavl zzavlVar = new zzavl(this.zza, this.zzb.zzah().zzao(), null);
        zzavlVar.zzb(zzaviVar.zza());
        zzavlVar.zza();
        String valueOf = String.valueOf(Integer.toString(zzaviVar.zza(), 10));
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zze(zzavi zzaviVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzf(zzaviVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(zzavi zzaviVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime()), Integer.valueOf(zzaviVar.zza()), Base64.encodeToString(this.zzb.zzah().zzao(), 3));
    }

    public final synchronized void zzb(zzavi zzaviVar) {
        if (this.zzc) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdf)).booleanValue()) {
                zze(zzaviVar);
            } else {
                zzd(zzaviVar);
            }
        }
    }

    public final synchronized void zzc(zzavf zzavfVar) {
        if (this.zzc) {
            try {
                zzavfVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public zzavg(zzavm zzavmVar) {
        this.zzb = zzaxa.zze();
        this.zza = zzavmVar;
        this.zzc = ((Boolean) zzbba.zzc().zzb(zzbfq.zzde)).booleanValue();
    }
}
