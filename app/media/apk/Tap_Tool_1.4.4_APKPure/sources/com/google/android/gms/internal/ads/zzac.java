package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzac<T> implements Comparable<zzac<T>> {
    private final zzan zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzag zzf;
    private Integer zzg;
    private zzaf zzh;
    private boolean zzi;
    private zzl zzj;
    private zzab zzk;
    private final zzq zzl;

    public zzac(int i, String str, zzag zzagVar) {
        Uri parse;
        String host;
        this.zza = zzan.zza ? new zzan() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzagVar;
        this.zzl = new zzq();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzac) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        zzl();
        String str = this.zzc;
        String valueOf2 = String.valueOf(this.zzg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(concat).length() + 6 + String.valueOf(valueOf2).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzan.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        zzaf zzafVar = this.zzh;
        if (zzafVar != null) {
            zzafVar.zzc(this);
        }
        if (zzan.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaa(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(int i) {
        zzaf zzafVar = this.zzh;
        if (zzafVar != null) {
            zzafVar.zzd(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzac<?> zzf(zzaf zzafVar) {
        this.zzh = zzafVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzac<?> zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        String str = this.zzc;
        if (this.zzb != 0) {
            String num = Integer.toString(1);
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
            sb.append(num);
            sb.append('-');
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzac<?> zzj(zzl zzlVar) {
        this.zzj = zzlVar;
        return this;
    }

    public final zzl zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map<String, String> zzm() throws zzk {
        return Collections.emptyMap();
    }

    public byte[] zzn() throws zzk {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzai<T> zzr(zzy zzyVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzs(T t);

    public final void zzt(zzal zzalVar) {
        zzag zzagVar;
        synchronized (this.zze) {
            zzagVar = this.zzf;
        }
        if (zzagVar != null) {
            zzagVar.zza(zzalVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(zzab zzabVar) {
        synchronized (this.zze) {
            this.zzk = zzabVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv(zzai<?> zzaiVar) {
        zzab zzabVar;
        synchronized (this.zze) {
            zzabVar = this.zzk;
        }
        if (zzabVar != null) {
            zzabVar.zza(this, zzaiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzw() {
        zzab zzabVar;
        synchronized (this.zze) {
            zzabVar = this.zzk;
        }
        if (zzabVar != null) {
            zzabVar.zzb(this);
        }
    }

    public final zzq zzy() {
        return this.zzl;
    }
}
