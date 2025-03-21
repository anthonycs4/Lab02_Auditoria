package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfag {
    private final HashMap<View, String> zza = new HashMap<>();
    private final HashMap<View, zzfaf> zzb = new HashMap<>();
    private final HashMap<String, View> zzc = new HashMap<>();
    private final HashSet<View> zzd = new HashSet<>();
    private final HashSet<String> zze = new HashSet<>();
    private final HashSet<String> zzf = new HashSet<>();
    private final HashMap<String, String> zzg = new HashMap<>();
    private boolean zzh;

    public final HashSet<String> zza() {
        return this.zze;
    }

    public final HashSet<String> zzb() {
        return this.zzf;
    }

    public final String zzc(String str) {
        return this.zzg.get(str);
    }

    public final void zzd() {
        zzezk zza = zzezk.zza();
        if (zza != null) {
            for (zzeyz zzeyzVar : zza.zzf()) {
                View zzj = zzeyzVar.zzj();
                if (zzeyzVar.zzk()) {
                    String zzi = zzeyzVar.zzi();
                    if (zzj != null) {
                        String str = null;
                        if (zzj.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = zzj;
                            while (true) {
                                if (view != null) {
                                    String zzb = zzfae.zzb(view);
                                    if (zzb != null) {
                                        str = zzb;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                } else {
                                    this.zzd.addAll(hashSet);
                                    break;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.zze.add(zzi);
                            this.zza.put(zzj, zzi);
                            for (zzezn zzeznVar : zzeyzVar.zzg()) {
                                View view2 = (View) zzeznVar.zza().get();
                                if (view2 != null) {
                                    zzfaf zzfafVar = this.zzb.get(view2);
                                    if (zzfafVar != null) {
                                        zzfafVar.zza(zzeyzVar.zzi());
                                    } else {
                                        this.zzb.put(view2, new zzfaf(zzeznVar, zzeyzVar.zzi()));
                                    }
                                }
                            }
                        } else {
                            this.zzf.add(zzi);
                            this.zzc.put(zzi, zzj);
                            this.zzg.put(zzi, str);
                        }
                    } else {
                        this.zzf.add(zzi);
                        this.zzg.put(zzi, "noAdView");
                    }
                }
            }
        }
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzh = false;
    }

    public final void zzf() {
        this.zzh = true;
    }

    public final String zzg(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final View zzh(String str) {
        return this.zzc.get(str);
    }

    public final zzfaf zzi(View view) {
        zzfaf zzfafVar = this.zzb.get(view);
        if (zzfafVar != null) {
            this.zzb.remove(view);
        }
        return zzfafVar;
    }

    public final int zzj(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzh ? 2 : 3;
    }
}
