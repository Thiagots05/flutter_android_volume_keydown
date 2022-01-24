package dev.darttools.flutter_android_volume_keydown;

import static android.view.KeyEvent.KEYCODE_VOLUME_DOWN;
import static android.view.KeyEvent.KEYCODE_VOLUME_UP;
import static android.view.KeyEvent.KEYCODE_HEADSETHOOK;
import static android.view.KeyEvent.KEYCODE_MEDIA_NEXT;

import static dev.darttools.flutter_android_volume_keydown.FlutterAndroidVolumeKeydownPlugin.eventSink;

import android.view.KeyEvent;

import java.io.Console;

import io.flutter.embedding.android.FlutterActivity;

public class FlutterAndroidVolumeKeydownActivity extends FlutterActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KEYCODE_VOLUME_DOWN && eventSink != null) {
            eventSink.success(1);
            return true;
        }
        if(keyCode == KEYCODE_VOLUME_UP && eventSink != null) {
            eventSink.success(2);
            return true;
        }
        if(keyCode == KEYCODE_HEADSETHOOK && eventSink != null) {
            eventSink.success(3);
            return true;
        }
        if(keyCode == KEYCODE_MEDIA_NEXT && eventSink != null) {
            eventSink.success(4);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
