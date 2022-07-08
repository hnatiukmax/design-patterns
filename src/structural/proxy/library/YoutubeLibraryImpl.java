package structural.proxy.library;

import java.util.Map;

public class YoutubeLibraryImpl implements YoutubeLibrary {

    private final String YOUTUBE_URL = "http://www.youtube.com/";

    @Override
    public Video getVideo(String videoId) {
        connectToServer(YOUTUBE_URL + videoId);
        return getSomeVideo(videoId);
    }

    @Override
    public Map<String, Video> getPopularVideos() {
        connectToServer(YOUTUBE_URL);
        return getRandomVideos();
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");

        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!" + "\n");
        return video;
    }

    private Map<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");

        Map<String, Video> videos = Map.of(
                "catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"),
                "mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"),
                "dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"),
                "dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"),
                "3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi")
        );

        System.out.println("Done!" + "\n");
        return videos;
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... ");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connected!" + "\n");
    }
}
