package structural;

import structural.adapter.example2.AudiRS;
import structural.adapter.example2.Movable;
import structural.adapter.example2.MovableKMHAdapter;
import structural.facade.VideoConversionFacade;
import structural.facade.library.CodecType;
import structural.proxy.YoutubeDownloader;
import structural.proxy.YoutubeLibraryCacheProxy;
import structural.proxy.library.YoutubeLibrary;
import structural.proxy.library.YoutubeLibraryImpl;

import java.io.File;

public class Sample {
}

/**
 * Consider a scenario in which there is an app that's developed in the US which returns the top speed
 * of luxury cars in miles per hour (MPH). Now we need to use the same app for our client in the UK
 * that wants the same results but in kilometers per hour (km/h).
 */
class Adapter {

    public static void main(String[] args) {
        //Example 2
        Movable movable = new AudiRS();
        Movable adapter = new MovableKMHAdapter(movable);
        printSpeedInKMPH(adapter);
    }

    private static void printSpeedInKMPH(Movable movable) {
        System.out.println("Speed in KM = " + movable.getMaxSpeed());
    }
}

class Proxy {

    public static void main(String[] args) {
        YoutubeLibrary standardYoutubeLibrary = new YoutubeLibraryImpl();
        YoutubeLibrary proxyLibrary = new YoutubeLibraryCacheProxy(standardYoutubeLibrary);

        YoutubeDownloader downloader = new YoutubeDownloader(proxyLibrary);

        downloader.renderVideo("video_id_1");
        downloader.renderPopularVideo();
    }
}

class Facade {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", CodecType.MP4);
    }
}

