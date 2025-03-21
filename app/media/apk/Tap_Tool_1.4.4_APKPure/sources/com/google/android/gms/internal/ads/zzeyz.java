package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyz extends zzeyv {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzeyx zzb;
    private final zzeyw zzc;
    private zzfau zze;
    private zzezx zzf;
    private final List<zzezn> zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyz(zzeyw zzeywVar, zzeyx zzeyxVar) {
        this.zzc = zzeywVar;
        this.zzb = zzeyxVar;
        zzl(null);
        if (zzeyxVar.zzj() == zzeyy.HTML || zzeyxVar.zzj() == zzeyy.JAVASCRIPT) {
            this.zzf = new zzezy(zzeyxVar.zzg());
        } else {
            this.zzf = new zzfaa(zzeyxVar.zzf(), null);
        }
        this.zzf.zza();
        zzezk.zza().zzb(this);
        zzezq.zza().zzb(this.zzf.zzd(), zzeywVar.zzc());
    }

    private final void zzl(View view) {
        this.zze = new zzfau(view);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final void zza() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzezk.zza().zzc(this);
        this.zzf.zzj(zzezr.zza().zzf());
        this.zzf.zzh(this, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final void zzb(View view) {
        if (this.zzh || zzj() == view) {
            return;
        }
        zzl(view);
        this.zzf.zzk();
        Collection<zzeyz> zze = zzezk.zza().zze();
        if (zze == null || zze.size() <= 0) {
            return;
        }
        for (zzeyz zzeyzVar : zze) {
            if (zzeyzVar != this && zzeyzVar.zzj() == view) {
                zzeyzVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzezq.zza().zzd(this.zzf.zzd());
        zzezk.zza().zzd(this);
        this.zzf.zzb();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final void zzd(View view, zzezb zzezbVar, String str) {
        zzezn zzeznVar;
        if (this.zzh) {
            return;
        }
        if (str == null || (str.length() <= 50 && zza.matcher(str).matches())) {
            Iterator<zzezn> it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzeznVar = null;
                    break;
                }
                zzeznVar = it.next();
                if (zzeznVar.zza().get() == view) {
                    break;
                }
            }
            if (zzeznVar == null) {
                this.zzd.add(new zzezn(view, zzezbVar, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    @Deprecated
    public final void zze(View view) {
        zzd(view, zzezb.OTHER, null);
    }

    public final List<zzezn> zzg() {
        return this.zzd;
    }

    public final zzezx zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final View zzj() {
        return (View) this.zze.get();
    }

    public final boolean zzk() {
        return this.zzg && !this.zzh;
    }
}
