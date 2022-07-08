package structural.proxy;

import structural.proxy.library.Video;
import structural.proxy.library.YoutubeLibrary;

import java.util.Map;

public class YoutubeDownloader {

    private final YoutubeLibrary youtubeLibrary;

    public YoutubeDownloader(YoutubeLibrary youtubeLibrary) {
        this.youtubeLibrary = youtubeLibrary;
    }

    public void renderVideo(String videoId) {
        Video video = youtubeLibrary.getVideo(videoId);
        System.out.println("Video page: (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println(">>\n");
    }

    public void renderPopularVideo() {
        Map<String, Video> list = youtubeLibrary.getPopularVideos();
        System.out.println("Most popular videos on YouTube: (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println(">>\n");
    }
}
