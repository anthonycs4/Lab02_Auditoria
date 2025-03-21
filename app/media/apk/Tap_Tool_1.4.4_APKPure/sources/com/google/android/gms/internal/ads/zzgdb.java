package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzgdb implements Iterator<zzbp>, Closeable, zzbq {
    private static final zzbp zza = new zzgda("eof ");
    private static final zzgdi zzb = zzgdi.zzb(zzgdb.class);
    protected zzbm zzc;
    protected zzgdc zzd;
    zzbp zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List<zzbp> zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzbp zzbpVar = this.zze;
        if (zzbpVar == zza) {
            return false;
        }
        if (zzbpVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zzh.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public final List<zzbp> zzd() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgdh(this.zzh, this);
    }

    public final void zze(zzgdc zzgdcVar, long j, zzbm zzbmVar) throws IOException {
        this.zzd = zzgdcVar;
        this.zzf = zzgdcVar.zzc();
        zzgdcVar.zzd(zzgdcVar.zzc() + j);
        this.zzg = zzgdcVar.zzc();
        this.zzc = zzbmVar;
    }

    @Override // java.util.Iterator
    /* renamed from: zzf */
    public final zzbp next() {
        zzbp zzb2;
        zzbp zzbpVar = this.zze;
        if (zzbpVar != null && zzbpVar != zza) {
            this.zze = null;
            return zzbpVar;
        }
        zzgdc zzgdcVar = this.zzd;
        if (zzgdcVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgdcVar) {
                this.zzd.zzd(this.zzf);
                zzb2 = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzc();
            }
            return zzb2;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
