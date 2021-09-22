package com.atividades.lp3;

import com.atividades.lp3.models.Download;
import com.atividades.lp3.models.DownloadCounter;

public class Application {

    public static void main(String[] args) {
        System.out.println("Start Download");

        int size = 20;

        Download download = new Download(size);
        download.start();

        DownloadCounter downloadCounter = new DownloadCounter(download);
        downloadCounter.start();

        System.out.println("Finished Thread - MAIN");
    }
}
