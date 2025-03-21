package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzccn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbvo zza;

    private final void zza() {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            try {
                zzbvoVar.zzs();
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzm(i, i2, intent);
            }
        } catch (Exception e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                if (!zzbvoVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbvo zzbvoVar2 = this.zza;
            if (zzbvoVar2 != null) {
                zzbvoVar2.zze();
            }
        } catch (RemoteException e2) {
            zzccn.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbvo zzg = zzbay.zzb().zzg(this);
        this.zza = zzg;
        if (zzg != null) {
            try {
                zzg.zzh(bundle);
                return;
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
                finish();
                return;
            }
        }
        zzccn.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzq();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzl();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzi();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzk();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzj();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzp();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbvo zzbvoVar = this.zza;
            if (zzbvoVar != null) {
                zzbvoVar.zzf();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
