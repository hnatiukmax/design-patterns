package structural.proxy;

import structural.proxy.library.Video;
import structural.proxy.library.YoutubeLibrary;

import java.util.HashMap;
import java.util.Map;

/**
 * Proxy class for working with cache
 */
public class YoutubeLibraryCacheProxy implements YoutubeLibrary {

    private final YoutubeLibrary youtubeService;

    private final Map<String, Video> cacheAll = new HashMap<>();
    private Map<String, Video> cachePopular = new HashMap<>();

    public YoutubeLibraryCacheProxy(YoutubeLibrary youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    @Override
    public Map<String, Video> getPopularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.getPopularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
