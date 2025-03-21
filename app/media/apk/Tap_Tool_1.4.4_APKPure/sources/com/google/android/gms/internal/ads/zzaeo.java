package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaeo implements zzaef {
    private final Context zza;
    private final List<zzafp> zzb = new ArrayList();
    private final zzaef zzc;
    private zzaef zzd;
    private zzaef zze;
    private zzaef zzf;
    private zzaef zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzaef zzk;

    public zzaeo(Context context, zzaef zzaefVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzaefVar;
    }

    private final zzaef zzg() {
        if (this.zze == null) {
            zzadt zzadtVar = new zzadt(this.zza);
            this.zze = zzadtVar;
            zzh(zzadtVar);
        }
        return this.zze;
    }

    private final void zzh(zzaef zzaefVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzaefVar.zzb(this.zzb.get(i));
        }
    }

    private static final void zzi(zzaef zzaefVar, zzafp zzafpVar) {
        if (zzaefVar != null) {
            zzaefVar.zzb(zzafpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws IOException {
        zzaef zzaefVar;
        zzafs.zzd(this.zzk == null);
        String scheme = zzaejVar.zza.getScheme();
        if (zzaht.zzb(zzaejVar.zza)) {
            String path = zzaejVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzaev zzaevVar = new zzaev();
                    this.zzd = zzaevVar;
                    zzh(zzaevVar);
                }
                this.zzk = this.zzd;
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzaeb zzaebVar = new zzaeb(this.zza);
                this.zzf = zzaebVar;
                zzh(zzaebVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzaef zzaefVar2 = (zzaef) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzaefVar2;
                    zzh(zzaefVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzafr zzafrVar = new zzafr(2000);
                this.zzh = zzafrVar;
                zzh(zzafrVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzaed zzaedVar = new zzaed();
                this.zzi = zzaedVar;
                zzh(zzaedVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzafn zzafnVar = new zzafn(this.zza);
                    this.zzj = zzafnVar;
                    zzh(zzafnVar);
                }
                zzaefVar = this.zzj;
            } else {
                zzaefVar = this.zzc;
            }
            this.zzk = zzaefVar;
        }
        return this.zzk.zzc(zzaejVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        zzaef zzaefVar = this.zzk;
        if (zzaefVar == null) {
            return null;
        }
        return zzaefVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Map<String, List<String>> zze() {
        zzaef zzaefVar = this.zzk;
        return zzaefVar == null ? Collections.emptyMap() : zzaefVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws IOException {
        zzaef zzaefVar = this.zzk;
        if (zzaefVar != null) {
            try {
                zzaefVar.zzf();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzaef zzaefVar = this.zzk;
        Objects.requireNonNull(zzaefVar);
        return zzaefVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb(zzafp zzafpVar) {
        Objects.requireNonNull(zzafpVar);
        this.zzc.zzb(zzafpVar);
        this.zzb.add(zzafpVar);
        zzi(this.zzd, zzafpVar);
        zzi(this.zze, zzafpVar);
        zzi(this.zzf, zzafpVar);
        zzi(this.zzg, zzafpVar);
        zzi(this.zzh, zzafpVar);
        zzi(this.zzi, zzafpVar);
        zzi(this.zzj, zzafpVar);
    }
}
