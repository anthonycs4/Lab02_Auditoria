package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkq {
    private final zzkp zzd;
    private boolean zzi;
    private zzafp zzj;
    private zzaca zzk = new zzaca(0);
    private final IdentityHashMap<zzaah, zzko> zzb = new IdentityHashMap<>();
    private final Map<Object, zzko> zzc = new HashMap();
    private final List<zzko> zza = new ArrayList();
    private final zzaas zze = new zzaas();
    private final zzou zzf = new zzou();
    private final HashMap<zzko, zzkn> zzg = new HashMap<>();
    private final Set<zzko> zzh = new HashSet();

    public zzkq(zzkp zzkpVar, zzlr zzlrVar, Handler handler) {
        this.zzd = zzkpVar;
    }

    private final void zzp() {
        Iterator<zzko> it = this.zzh.iterator();
        while (it.hasNext()) {
            zzko next = it.next();
            if (next.zzc.isEmpty()) {
                zzq(next);
                it.remove();
            }
        }
    }

    private final void zzq(zzko zzkoVar) {
        zzkn zzknVar = this.zzg.get(zzkoVar);
        if (zzknVar != null) {
            zzknVar.zza.zzp(zzknVar.zzb);
        }
    }

    private final void zzr(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzko remove = this.zza.remove(i2);
            this.zzc.remove(remove.zzb);
            zzs(i2, -remove.zza.zzx().zzr());
            remove.zze = true;
            if (this.zzi) {
                zzu(remove);
            }
        }
    }

    private final void zzs(int i, int i2) {
        while (i < this.zza.size()) {
            this.zza.get(i).zzd += i2;
            i++;
        }
    }

    private final void zzt(zzko zzkoVar) {
        zzaae zzaaeVar = zzkoVar.zza;
        zzaak zzaakVar = new zzaak(this) { // from class: com.google.android.gms.internal.ads.zzkl
            private final zzkq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaak
            public final void zza(zzaal zzaalVar, zzlq zzlqVar) {
                this.zza.zzg(zzaalVar, zzlqVar);
            }
        };
        zzkm zzkmVar = new zzkm(this, zzkoVar);
        this.zzg.put(zzkoVar, new zzkn(zzaaeVar, zzaakVar, zzkmVar));
        zzaaeVar.zzk(new Handler(zzaht.zzk(), null), zzkmVar);
        zzaaeVar.zzm(new Handler(zzaht.zzk(), null), zzkmVar);
        zzaaeVar.zzn(zzaakVar, this.zzj);
    }

    private final void zzu(zzko zzkoVar) {
        if (zzkoVar.zze && zzkoVar.zzc.isEmpty()) {
            zzkn remove = this.zzg.remove(zzkoVar);
            Objects.requireNonNull(remove);
            remove.zza.zzq(remove.zzb);
            remove.zza.zzl(remove.zzc);
            this.zzh.remove(zzkoVar);
        }
    }

    public final boolean zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final void zzc(zzafp zzafpVar) {
        zzafs.zzd(!this.zzi);
        this.zzj = zzafpVar;
        for (int i = 0; i < this.zza.size(); i++) {
            zzko zzkoVar = this.zza.get(i);
            zzt(zzkoVar);
            this.zzh.add(zzkoVar);
        }
        this.zzi = true;
    }

    public final void zzd(zzaah zzaahVar) {
        zzko remove = this.zzb.remove(zzaahVar);
        Objects.requireNonNull(remove);
        remove.zza.zzz(zzaahVar);
        remove.zzc.remove(((zzaab) zzaahVar).zza);
        if (!this.zzb.isEmpty()) {
            zzp();
        }
        zzu(remove);
    }

    public final void zze() {
        for (zzkn zzknVar : this.zzg.values()) {
            try {
                zzknVar.zza.zzq(zzknVar.zzb);
            } catch (RuntimeException e) {
                zzagm.zzb("MediaSourceList", "Failed to release child source.", e);
            }
            zzknVar.zza.zzl(zzknVar.zzc);
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzi = false;
    }

    public final zzlq zzf() {
        if (this.zza.isEmpty()) {
            return zzlq.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzko zzkoVar = this.zza.get(i2);
            zzkoVar.zzd = i;
            i += zzkoVar.zza.zzx().zzr();
        }
        return new zzle(this.zza, this.zzk, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzaal zzaalVar, zzlq zzlqVar) {
        this.zzd.zzi();
    }

    public final zzlq zzj(List<zzko> list, zzaca zzacaVar) {
        zzr(0, this.zza.size());
        return zzk(this.zza.size(), list, zzacaVar);
    }

    public final zzlq zzk(int i, List<zzko> list, zzaca zzacaVar) {
        if (!list.isEmpty()) {
            this.zzk = zzacaVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzko zzkoVar = list.get(i2 - i);
                if (i2 > 0) {
                    zzko zzkoVar2 = this.zza.get(i2 - 1);
                    zzkoVar.zzc(zzkoVar2.zzd + zzkoVar2.zza.zzx().zzr());
                } else {
                    zzkoVar.zzc(0);
                }
                zzs(i2, zzkoVar.zza.zzx().zzr());
                this.zza.add(i2, zzkoVar);
                this.zzc.put(zzkoVar.zzb, zzkoVar);
                if (this.zzi) {
                    zzt(zzkoVar);
                    if (this.zzb.isEmpty()) {
                        this.zzh.add(zzkoVar);
                    } else {
                        zzq(zzkoVar);
                    }
                }
            }
        }
        return zzf();
    }

    public final zzlq zzl(int i, int i2, zzaca zzacaVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzb()) {
            z = true;
        }
        zzafs.zza(z);
        this.zzk = zzacaVar;
        zzr(i, i2);
        return zzf();
    }

    public final zzlq zzm(int i, int i2, int i3, zzaca zzacaVar) {
        zzafs.zza(zzb() >= 0);
        this.zzk = null;
        return zzf();
    }

    public final zzlq zzn(zzaca zzacaVar) {
        int zzb = zzb();
        if (zzacaVar.zza() != zzb) {
            zzacaVar = zzacaVar.zzh().zzf(0, zzb);
        }
        this.zzk = zzacaVar;
        return zzf();
    }

    public final zzaah zzo(zzaaj zzaajVar, zzaek zzaekVar, long j) {
        Object obj = ((Pair) zzaajVar.zza).first;
        zzaaj zzc = zzaajVar.zzc(((Pair) zzaajVar.zza).second);
        zzko zzkoVar = this.zzc.get(obj);
        Objects.requireNonNull(zzkoVar);
        this.zzh.add(zzkoVar);
        zzkn zzknVar = this.zzg.get(zzkoVar);
        if (zzknVar != null) {
            zzknVar.zza.zzo(zzknVar.zzb);
        }
        zzkoVar.zzc.add(zzc);
        zzaab zzB = zzkoVar.zza.zzB(zzc, zzaekVar, j);
        this.zzb.put(zzB, zzkoVar);
        zzp();
        return zzB;
    }
}
