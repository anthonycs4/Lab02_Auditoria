package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznv extends zzwz implements zzago {
    private final Context zzb;
    private final zzms zzc;
    private final zzmz zzd;
    private int zze;
    private boolean zzf;
    private zzjq zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzlf zzl;

    public zznv(Context context, zzwu zzwuVar, zzxb zzxbVar, boolean z, Handler handler, zzmt zzmtVar, zzmz zzmzVar) {
        super(1, zzwuVar, zzxbVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzmzVar;
        this.zzc = new zzms(handler, zzmtVar);
        zzmzVar.zza(new zznu(this, null));
    }

    private final void zzaA() {
        long zzd = this.zzd.zzd(zzM());
        if (zzd != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzd = Math.max(this.zzh, zzd);
            }
            this.zzh = zzd;
            this.zzj = false;
        }
    }

    private final int zzaz(zzwx zzwxVar, zzjq zzjqVar) {
        if (!"OMX.google.raw.decoder".equals(zzwxVar.zza) || zzaht.zza >= 24 || (zzaht.zza == 23 && zzaht.zzW(this.zzb))) {
            return zzjqVar.zzm;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzA() {
        try {
            super.zzA();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzw();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzw();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlg, com.google.android.gms.internal.ads.zzlh
    public final String zzJ() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzlg
    public final boolean zzL() {
        return this.zzd.zzk() || super.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzlg
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final int zzO(zzxb zzxbVar, zzjq zzjqVar) throws zzxi {
        if (zzags.zza(zzjqVar.zzl)) {
            int i = zzaht.zza >= 21 ? 32 : 0;
            Class cls = zzjqVar.zzE;
            boolean zzax = zzax(zzjqVar);
            if (zzax && this.zzd.zzb(zzjqVar) && (cls == null || zzxn.zza() != null)) {
                return i | 12;
            }
            if ((!"audio/raw".equals(zzjqVar.zzl) || this.zzd.zzb(zzjqVar)) && this.zzd.zzb(zzaht.zzM(2, zzjqVar.zzy, zzjqVar.zzz))) {
                List<zzwx> zzP = zzP(zzxbVar, zzjqVar, false);
                if (zzP.isEmpty()) {
                    return 1;
                }
                if (zzax) {
                    zzwx zzwxVar = zzP.get(0);
                    boolean zzc = zzwxVar.zzc(zzjqVar);
                    int i2 = 8;
                    if (zzc && zzwxVar.zzd(zzjqVar)) {
                        i2 = 16;
                    }
                    return (true != zzc ? 3 : 4) | i2 | i;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final List<zzwx> zzP(zzxb zzxbVar, zzjq zzjqVar, boolean z) throws zzxi {
        zzwx zza;
        String str = zzjqVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.zzd.zzb(zzjqVar) || (zza = zzxn.zza()) == null) {
            List<zzwx> zzd = zzxn.zzd(zzxn.zzc(str, false, false), zzjqVar);
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList = new ArrayList(zzd);
                arrayList.addAll(zzxn.zzc("audio/eac3", false, false));
                zzd = arrayList;
            }
            return Collections.unmodifiableList(zzd);
        }
        return Collections.singletonList(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final boolean zzQ(zzjq zzjqVar) {
        return this.zzd.zzb(zzjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final zzom zzR(zzwx zzwxVar, zzjq zzjqVar, zzjq zzjqVar2) {
        int i;
        int i2;
        zzom zze = zzwxVar.zze(zzjqVar, zzjqVar2);
        int i3 = zze.zze;
        if (zzaz(zzwxVar, zzjqVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzwxVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zze.zzd;
            i2 = 0;
        }
        return new zzom(str, zzjqVar, zzjqVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final float zzS(float f, zzjq zzjqVar, zzjq[] zzjqVarArr) {
        int i = -1;
        for (zzjq zzjqVar2 : zzjqVarArr) {
            int i2 = zzjqVar2.zzz;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzT(String str, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzU(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzV(Exception exc) {
        zzagm.zzb("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz
    public final zzom zzW(zzjr zzjrVar) throws zzid {
        zzom zzW = super.zzW(zzjrVar);
        this.zzc.zzc(zzjrVar.zza, zzW);
        return zzW;
    }

    public final void zzY() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzZ(zzol zzolVar) {
        if (!this.zzi || zzolVar.zzb()) {
            return;
        }
        if (Math.abs(zzolVar.zzd - this.zzh) > 500000) {
            this.zzh = zzolVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzaa() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzae(zzwx zzwxVar, zzxr zzxrVar, zzjq zzjqVar, MediaCrypto mediaCrypto, float f) {
        zzjq[] zzC = zzC();
        int zzaz = zzaz(zzwxVar, zzjqVar);
        if (zzC.length != 1) {
            for (zzjq zzjqVar2 : zzC) {
                if (zzwxVar.zze(zzjqVar, zzjqVar2).zzd != 0) {
                    zzaz = Math.max(zzaz, zzaz(zzwxVar, zzjqVar2));
                }
            }
        }
        this.zze = zzaz;
        this.zzf = zzaht.zza < 24 && "OMX.SEC.aac.dec".equals(zzwxVar.zza) && "samsung".equals(zzaht.zzc) && (zzaht.zzb.startsWith("zeroflte") || zzaht.zzb.startsWith("herolte") || zzaht.zzb.startsWith("heroqlte"));
        String str = zzwxVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzjqVar.zzy);
        mediaFormat.setInteger("sample-rate", zzjqVar.zzz);
        zzagp.zza(mediaFormat, zzjqVar.zzn);
        zzagp.zzb(mediaFormat, "max-input-size", i);
        if (zzaht.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzaht.zza != 23 || (!"ZTE B2017G".equals(zzaht.zzd) && !"AXON 7 mini".equals(zzaht.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzaht.zza <= 28 && "audio/ac4".equals(zzjqVar.zzl)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzaht.zza >= 24 && this.zzd.zzc(zzaht.zzM(4, zzjqVar.zzy, zzjqVar.zzz)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        zzxrVar.zza(mediaFormat, null, null, 0);
        this.zzg = (!"audio/raw".equals(zzwxVar.zzb) || "audio/raw".equals(zzjqVar.zzl)) ? null : null;
    }

    @Override // com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlg
    public final zzago zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final long zzg() {
        if (zze() == 2) {
            zzaA();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzh(zzku zzkuVar) {
        this.zzd.zzl(zzkuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final zzku zzi() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhv, com.google.android.gms.internal.ads.zzlc
    public final void zzt(int i, Object obj) throws zzid {
        if (i == 2) {
            this.zzd.zzt(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzo((zzmd) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.zzd.zzn(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.zzd.zzp(((Integer) obj).intValue());
                    return;
                case 103:
                    this.zzl = (zzlf) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzq((zzne) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzu(boolean z, boolean z2) throws zzid {
        super.zzu(z, z2);
        this.zzc.zza(this.zza);
        if (zzD().zzb) {
            this.zzd.zzr();
        } else {
            this.zzd.zzs();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzw(long j, boolean z) throws zzid {
        super.zzw(j, z);
        this.zzd.zzv();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    protected final void zzx() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    protected final void zzy() {
        zzaA();
        this.zzd.zzu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzhv
    public final void zzz() {
        this.zzk = true;
        try {
            this.zzd.zzv();
            try {
                super.zzz();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzz();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzab() throws zzid {
        try {
            this.zzd.zzi();
        } catch (zzmy e) {
            throw zzE(e, e.zzb, e.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final boolean zzaf(long j, long j2, zzxr zzxrVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzjq zzjqVar) throws zzid {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zzxrVar);
            zzxrVar.zzj(i, false);
            return true;
        } else if (z) {
            if (zzxrVar != null) {
                zzxrVar.zzj(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (this.zzd.zzh(byteBuffer, j3, i3)) {
                    if (zzxrVar != null) {
                        zzxrVar.zzj(i, false);
                    }
                    this.zza.zze += i3;
                    return true;
                }
                return false;
            } catch (zzmv e) {
                throw zzE(e, e.zzb, false);
            } catch (zzmy e2) {
                throw zzE(e2, zzjqVar, e2.zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    protected final void zzX(zzjq zzjqVar, MediaFormat mediaFormat) throws zzid {
        int i;
        int i2;
        zzjq zzjqVar2 = this.zzg;
        int[] iArr = null;
        if (zzjqVar2 != null) {
            zzjqVar = zzjqVar2;
        } else if (zzay() != null) {
            if ("audio/raw".equals(zzjqVar.zzl)) {
                i = zzjqVar.zzA;
            } else if (zzaht.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = zzaht.zzN(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = "audio/raw".equals(zzjqVar.zzl) ? zzjqVar.zzA : 2;
                }
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzjp zzjpVar = new zzjp();
            zzjpVar.zzj("audio/raw");
            zzjpVar.zzy(i);
            zzjpVar.zzz(zzjqVar.zzB);
            zzjpVar.zzA(zzjqVar.zzC);
            zzjpVar.zzw(mediaFormat.getInteger("channel-count"));
            zzjpVar.zzx(mediaFormat.getInteger("sample-rate"));
            zzjq zzD = zzjpVar.zzD();
            if (this.zzf && zzD.zzy == 6 && (i2 = zzjqVar.zzy) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzjqVar.zzy; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzjqVar = zzD;
        }
        try {
            this.zzd.zze(zzjqVar, 0, iArr);
        } catch (zzmu e) {
            throw zzE(e, e.zza, false);
        }
    }
}
