package structural.proxy.library;

import java.util.Map;

public interface YoutubeLibrary {

    Video getVideo(String videoId);

    Map<String, Video> getPopularVideos();
}
