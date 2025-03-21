package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfxp implements zzgaf {
    private final zzfxo zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfxp(zzfxo zzfxoVar) {
        zzfyw.zzb(zzfxoVar, "input");
        this.zza = zzfxoVar;
        zzfxoVar.zzb = this;
    }

    private final void zzP(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzfyy.zzi();
        }
    }

    private final <T> T zzQ(zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        zzfxo zzfxoVar;
        int zzo = this.zza.zzo();
        zzfxo zzfxoVar2 = this.zza;
        if (zzfxoVar2.zza >= 100) {
            throw new zzfyy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzz = zzfxoVar2.zzz(zzo);
        T zza = zzgakVar.zza();
        this.zza.zza++;
        zzgakVar.zzf(zza, this, zzfxyVar);
        zzgakVar.zzj(zza);
        this.zza.zzb(0);
        zzfxoVar.zza--;
        this.zza.zzA(zzz);
        return zza;
    }

    private final <T> T zzR(zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T zza = zzgakVar.zza();
            zzgakVar.zzf(zza, this, zzfxyVar);
            zzgakVar.zzj(zza);
            if (this.zzb == this.zzc) {
                return zza;
            }
            throw zzfyy.zzk();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzS(int i) throws IOException {
        if (this.zza.zzC() != i) {
            throw zzfyy.zzd();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzfyy.zzk();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzfyy.zzk();
        }
    }

    public static zzfxp zza(zzfxo zzfxoVar) {
        zzfxp zzfxpVar = zzfxoVar.zzb;
        return zzfxpVar != null ? zzfxpVar : new zzfxp(zzfxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzA(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfzjVar.zzg(this.zza.zzg());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfzjVar.zzg(this.zza.zzg());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzg()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Long.valueOf(this.zza.zzg()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzB(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfynVar.zzh(this.zza.zzh());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfynVar.zzh(this.zza.zzh());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzC(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzfzjVar.zzg(this.zza.zzi());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzo = this.zza.zzo();
                zzU(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    zzfzjVar.zzg(this.zza.zzi());
                } while (this.zza.zzC() < zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzi()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzU(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                list.add(Long.valueOf(this.zza.zzi()));
            } while (this.zza.zzC() < zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzD(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (!(list instanceof zzfyn)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzo = this.zza.zzo();
                zzT(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzC() < zzC);
                return;
            } else if (i != 5) {
                throw zzfyy.zzi();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfyn zzfynVar = (zzfyn) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzT(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                zzfynVar.zzh(this.zza.zzj());
            } while (this.zza.zzC() < zzC2);
        } else if (i2 != 5) {
            throw zzfyy.zzi();
        } else {
            do {
                zzfynVar.zzh(this.zza.zzj());
                if (this.zza.zzB()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzE(List<Boolean> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfwy) {
            zzfwy zzfwyVar = (zzfwy) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfwyVar.zzd(this.zza.zzk());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfwyVar.zzd(this.zza.zzk());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzk()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Boolean.valueOf(this.zza.zzk()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgaf
    public final <T> void zzG(List<T> list, zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzfyy.zzi();
        }
        do {
            list.add(zzQ(zzgakVar, zzfxyVar));
            if (this.zza.zzB() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgaf
    public final <T> void zzH(List<T> list, zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzfyy.zzi();
        }
        do {
            list.add(zzR(zzgakVar, zzfxyVar));
            if (this.zza.zzB() || this.zzd != 0) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzI(List<zzfxj> list) throws IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw zzfyy.zzi();
        }
        do {
            list.add(zzq());
            if (this.zza.zzB()) {
                return;
            }
            zza = this.zza.zza();
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzJ(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfynVar.zzh(this.zza.zzo());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfynVar.zzh(this.zza.zzo());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzo()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Integer.valueOf(this.zza.zzo()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzK(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfynVar.zzh(this.zza.zzp());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfynVar.zzh(this.zza.zzp());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzp()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Integer.valueOf(this.zza.zzp()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzL(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (!(list instanceof zzfyn)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzo = this.zza.zzo();
                zzT(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    list.add(Integer.valueOf(this.zza.zzq()));
                } while (this.zza.zzC() < zzC);
                return;
            } else if (i != 5) {
                throw zzfyy.zzi();
            } else {
                do {
                    list.add(Integer.valueOf(this.zza.zzq()));
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfyn zzfynVar = (zzfyn) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzT(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                zzfynVar.zzh(this.zza.zzq());
            } while (this.zza.zzC() < zzC2);
        } else if (i2 != 5) {
            throw zzfyy.zzi();
        } else {
            do {
                zzfynVar.zzh(this.zza.zzq());
                if (this.zza.zzB()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzM(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzfzjVar.zzg(this.zza.zzr());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzo = this.zza.zzo();
                zzU(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    zzfzjVar.zzg(this.zza.zzr());
                } while (this.zza.zzC() < zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzr()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzU(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                list.add(Long.valueOf(this.zza.zzr()));
            } while (this.zza.zzC() < zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzN(List<Integer> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfyn) {
            zzfyn zzfynVar = (zzfyn) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfynVar.zzh(this.zza.zzs());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfynVar.zzh(this.zza.zzs());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzs()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Integer.valueOf(this.zza.zzs()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzO(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfzjVar.zzg(this.zza.zzt());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfzjVar.zzg(this.zza.zzt());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Long.valueOf(this.zza.zzt()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzb() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zza();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final boolean zzd() throws IOException {
        int i;
        if (this.zza.zzB() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final double zze() throws IOException {
        zzP(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final float zzf() throws IOException {
        zzP(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final long zzg() throws IOException {
        zzP(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final long zzh() throws IOException {
        zzP(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzi() throws IOException {
        zzP(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final long zzj() throws IOException {
        zzP(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzk() throws IOException {
        zzP(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final boolean zzl() throws IOException {
        zzP(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final String zzm() throws IOException {
        zzP(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final String zzn() throws IOException {
        zzP(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final <T> T zzo(zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        zzP(2);
        return (T) zzQ(zzgakVar, zzfxyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final <T> T zzp(zzgak<T> zzgakVar, zzfxy zzfxyVar) throws IOException {
        zzP(3);
        return (T) zzR(zzgakVar, zzfxyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final zzfxj zzq() throws IOException {
        zzP(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzr() throws IOException {
        zzP(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzs() throws IOException {
        zzP(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzt() throws IOException {
        zzP(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final long zzu() throws IOException {
        zzP(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final int zzv() throws IOException {
        zzP(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final long zzw() throws IOException {
        zzP(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzx(List<Double> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfxv) {
            zzfxv zzfxvVar = (zzfxv) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzfxvVar.zzd(this.zza.zzd());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzo = this.zza.zzo();
                zzU(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    zzfxvVar.zzd(this.zza.zzd());
                } while (this.zza.zzC() < zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zzd()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzU(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                list.add(Double.valueOf(this.zza.zzd()));
            } while (this.zza.zzC() < zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzy(List<Float> list) throws IOException {
        int zza;
        int zza2;
        if (!(list instanceof zzfyf)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zzo = this.zza.zzo();
                zzT(zzo);
                int zzC = this.zza.zzC() + zzo;
                do {
                    list.add(Float.valueOf(this.zza.zze()));
                } while (this.zza.zzC() < zzC);
                return;
            } else if (i != 5) {
                throw zzfyy.zzi();
            } else {
                do {
                    list.add(Float.valueOf(this.zza.zze()));
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza = this.zza.zza();
                } while (zza == this.zzb);
                this.zzd = zza;
                return;
            }
        }
        zzfyf zzfyfVar = (zzfyf) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzo2 = this.zza.zzo();
            zzT(zzo2);
            int zzC2 = this.zza.zzC() + zzo2;
            do {
                zzfyfVar.zzd(this.zza.zze());
            } while (this.zza.zzC() < zzC2);
        } else if (i2 != 5) {
            throw zzfyy.zzi();
        } else {
            do {
                zzfyfVar.zzd(this.zza.zze());
                if (this.zza.zzB()) {
                    return;
                }
                zza2 = this.zza.zza();
            } while (zza2 == this.zzb);
            this.zzd = zza2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final void zzz(List<Long> list) throws IOException {
        int zza;
        int zza2;
        if (list instanceof zzfzj) {
            zzfzj zzfzjVar = (zzfzj) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfzjVar.zzg(this.zza.zzf());
                    if (this.zza.zzB()) {
                        return;
                    }
                    zza2 = this.zza.zza();
                } while (zza2 == this.zzb);
                this.zzd = zza2;
                return;
            } else if (i == 2) {
                int zzC = this.zza.zzC() + this.zza.zzo();
                do {
                    zzfzjVar.zzg(this.zza.zzf());
                } while (this.zza.zzC() < zzC);
                zzS(zzC);
                return;
            } else {
                throw zzfyy.zzi();
            }
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzf()));
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
        } else if (i2 == 2) {
            int zzC2 = this.zza.zzC() + this.zza.zzo();
            do {
                list.add(Long.valueOf(this.zza.zzf()));
            } while (this.zza.zzC() < zzC2);
            zzS(zzC2);
        } else {
            throw zzfyy.zzi();
        }
    }

    public final void zzF(List<String> list, boolean z) throws IOException {
        int zza;
        int zza2;
        if ((this.zzb & 7) != 2) {
            throw zzfyy.zzi();
        }
        if (!(list instanceof zzfze) || z) {
            do {
                list.add(z ? zzn() : zzm());
                if (this.zza.zzB()) {
                    return;
                }
                zza = this.zza.zza();
            } while (zza == this.zzb);
            this.zzd = zza;
            return;
        }
        zzfze zzfzeVar = (zzfze) list;
        do {
            zzfzeVar.zzf(zzq());
            if (this.zza.zzB()) {
                return;
            }
            zza2 = this.zza.zza();
        } while (zza2 == this.zzb);
        this.zzd = zza2;
    }
}
