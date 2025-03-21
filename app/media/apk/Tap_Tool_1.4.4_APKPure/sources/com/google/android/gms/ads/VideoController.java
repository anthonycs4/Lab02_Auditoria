package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzccn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzbdj zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                try {
                    zzbdjVar.zzg(z);
                } catch (RemoteException e) {
                    zzccn.zzg("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                try {
                    zzbdjVar.zzf();
                } catch (RemoteException e) {
                    zzccn.zzg("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                try {
                    zzbdjVar.zze();
                } catch (RemoteException e) {
                    zzccn.zzg("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                try {
                    zzbdjVar.zzl(new zzbex(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    zzccn.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar != null) {
                try {
                    zzbdjVar.zzq();
                } catch (RemoteException e) {
                    zzccn.zzg("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final void zza(zzbdj zzbdjVar) {
        synchronized (this.zza) {
            this.zzb = zzbdjVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final zzbdj zzb() {
        zzbdj zzbdjVar;
        synchronized (this.zza) {
            zzbdjVar = this.zzb;
        }
        return zzbdjVar;
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar == null) {
                return 0;
            }
            try {
                return zzbdjVar.zzi();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar == null) {
                return false;
            }
            try {
                return zzbdjVar.zzp();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar == null) {
                return false;
            }
            try {
                return zzbdjVar.zzn();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzbdj zzbdjVar = this.zzb;
            if (zzbdjVar == null) {
                return true;
            }
            try {
                return zzbdjVar.zzh();
            } catch (RemoteException e) {
                zzccn.zzg("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }
}
