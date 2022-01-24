import 'dart:async';

import 'package:flutter/services.dart';

class FlutterAndroidVolumeKeydown {
  static const EventChannel _channel =
      EventChannel('dart-tools.dev/flutter_android_volume_keydown');
  static dynamic meuEvento;
  static Stream<HardwareButton> stream = _channel.receiveBroadcastStream()
      // .cast<int>()
      .map((event) {
    print(event);
    switch (event) {
      case 1:
        return HardwareButton.volume_down;
      case 2:
        return HardwareButton.volume_up;
      case 3:
        return HardwareButton.hadset;
      default:
        return HardwareButton.next;
    }
  });
}

enum HardwareButton { volume_down, volume_up, hadset, next }
